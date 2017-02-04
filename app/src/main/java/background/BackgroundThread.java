package background;

import android.content.AsyncTaskLoader;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class BackgroundThread extends AsyncTaskLoader<ArrayList<String>> {

	// Sends messages from other applications or from the system itself
    //https://www.tutorialspoint.com/android/android_broadcast_receivers.htm
	Receiver receiver;

	public static final String StringLoader_RELOAD ="BackgroundThread.RELOAD";

	private final String[] links = {"https://developer-paragon.epicgames.com/v1/heroes/complete", "https://developer-paragon.epicgames.com/v1/cards/complete", "https://www.epicgames.com/paragon/en-US/news"};


    // keeps a log of the data in case it needs to be accessed again
    ArrayList<String> oldData = new ArrayList<String>();

    BackgroundThreadHelper helper = new BackgroundThreadHelper();

	public BackgroundThread(Context context) {
		super(context);
    }



	@Override
	protected void onStartLoading() {
		receiver = new Receiver(this);

		IntentFilter filter = new IntentFilter();
		filter.addAction(StringLoader_RELOAD);
		getContext().registerReceiver(receiver, filter);
		if(!oldData.isEmpty()){
			super.deliverResult(oldData);
		}

		forceLoad();
		super.onStartLoading();
	}


	@Override
	public ArrayList<String> loadInBackground() {

//        InputStream inputStream = null;
        ArrayList<String> array = new ArrayList<String>();

        getData("heroes", links[0]);
        getData("cards", links[1]);
//        getNews("news", links[2]);

		return array;
	}

    public void getNews(String type, String link)	{
        String text ="";

        try {
            Document doc = Jsoup.connect(link).get();
//			Log.d("Getting News", doc.toString());

			Element elements = (Element) doc.getElementById("text/javascript").dataNodes();
//			text = doc.getElementById("text/javascript").dataNodes().toString();
			Log.d("example", text);
			writeToFile(text, "news");
        } catch(Exception e)   {
            e.printStackTrace();
        }
    }

    private void getData(String type, String link) {
        ArrayList<String> array = new ArrayList<String>();

        connectToURL(link);
        String input = URLtoString();
        closeConnection();
        array.add(input);

        // Convert response URLtoString using String Builder + write to file
        writeToFile(input, type);
    }


    @Override
	public void deliverResult(ArrayList<String> data) {
		oldData = data;
		String lab = "";
		if(isStarted()){
			super.deliverResult(data);
		}
	}
	
	@Override
	protected void onReset() {
		getContext().unregisterReceiver(receiver);
		this.stopLoading();
		super.onReset();
	}

	public class Receiver extends BroadcastReceiver {

		BackgroundThread loader;

		public Receiver(BackgroundThread loader) {
			this.loader = loader;
		}

		@Override
		public void onReceive(Context context, Intent intent) {
			loader.onContentChanged();
		}

	};

	public void writeToFile(String result, String fileName) {

		Log.d("Writing JSON to file ", fileName);

		try {
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(getContext().openFileOutput(fileName+".txt", Context.MODE_PRIVATE));
			outputStreamWriter.write(result);
			outputStreamWriter.close();

			Log.d(fileName, "Completed" );
		}
		catch(Exception e){
			Log.d("File Writing Error", ""+ e);
		}
	}

	/**
	 * Establishes a connection with the URL with set parameters
	 */
	HttpURLConnection connect = null; // made global

	public void connectToURL(String link) {

		try {
			Thread.sleep(2000);
			URL url = new URL(link);
//            URL url = new URL(helper.loadURL().URLtoString());
			connect = (HttpURLConnection) url.openConnection();

			Log.d("Connecting to URL", url.toString());

			connect.setRequestMethod("GET");
			connect.setReadTimeout(10000);
			connect.setConnectTimeout(15000);
			connect.setRequestProperty("Accept", "application/json");
			connect.setRequestProperty("X-Epic-ApiKey", "ec645e76023146329ce4319bd6ac9a2b");

			int responseCode = connect.getResponseCode();
			String response = Integer.toString(responseCode);

			Log.d("HTTP Response Code", response);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates String from the global HttpURLConnection variable
	 * @return
	 */
	public String URLtoString() {
		String input = "";

		try {
			String results = "";

			InputStream inputStream = connect.getInputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
			StringBuilder stringBuilder = new StringBuilder();

			while ((results = bufferedReader.readLine()) != null)
			{
				stringBuilder.append(results + "\n");
			}

			connect.getInputStream().close();
			connect.disconnect();

			input = stringBuilder.toString();
		} catch (Exception e){
			Log.e("StringBuilding", "Error converting result " + e.toString());
		}

		return input;
	}

	public void closeConnection()	{
		connect.disconnect();
	}
}
