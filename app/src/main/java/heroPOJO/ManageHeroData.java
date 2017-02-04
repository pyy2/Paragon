package heroPOJO;

import java.util.List;

/**
 * Created by Ashu on 12/08/15.
 */
public class ManageHeroData {

    private List<HeroData> heroData;
    private LinksEntity links;
    private String link_template;

    public void setMovies(List<HeroData> movies) {
        this.heroData = movies;
    }

    public List<HeroData> getMovies() {
        return heroData;
    }

    public static class HeroData {
        /**
         * alternate_ids : {"imdb":"2381249"}
         * critics_consensus :
         * runtime : 132
         * links : {"alternate":"http://www.rottentomatoes.com/m/mission_impossible_rogue_nation/","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771357161/reviews.json","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771357161/cast.json","self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771357161.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771357161/similar.json"}
         * release_dates : {"theater":"2015-07-31"}
         * id : 771357161
         * title : Mission: Impossible Rogue Nation
         * synopsis : With the IMF disbanded, and Ethan (Tom Cruise) out in the cold, the team now faces off against a network of highly skilled special agents, the Syndicate. These highly trained operatives are hellbent on creating a new world order through an escalating series of terrorist attacks. Ethan gathers his team and joins forces with disavowed British agent Ilsa Faust (Rebecca Ferguson), who may or may not be a member of this rogue nation, as the group faces their most impossible mission yet.
         * abridged_cast : [{"id":"162652763","name":"Tom Cruise","characters":["Ethan Hunt"]},{"id":"309973652","name":"Jeremy Renner","characters":["William Brandt"]},{"id":"162693220","name":"Ving Rhames","characters":["Luther Strickell"]},{"id":"162684057","name":"Simon Pegg","characters":["Benji"]},{"id":"771471104","name":"Rebecca Ferguson","characters":["Ilsa Faust"]}]
         * year : 2015
         * mpaa_rating : PG-13
         * posters : {"thumbnail":"http://resizing.flixster.com/gbCU2qc5Edq9j-eJWBL9VN0BmZA=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/07/11190760_ori.jpg","detailed":"http://resizing.flixster.com/gbCU2qc5Edq9j-eJWBL9VN0BmZA=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/07/11190760_ori.jpg","original":"http://resizing.flixster.com/gbCU2qc5Edq9j-eJWBL9VN0BmZA=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/07/11190760_ori.jpg","profile":"http://resizing.flixster.com/gbCU2qc5Edq9j-eJWBL9VN0BmZA=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/07/11190760_ori.jpg"}
         * ratings : {"critics_score":92,"critics_rating":"Certified Fresh","audience_score":91,"audience_rating":"Upright"}
         */
        private AlternateIdsEntity alternate_ids;
        private String critics_consensus;
        private int runtime;
        private LinksEntity links;
        private ReleaseDatesEntity release_dates;
        private String id;
        private String title;
        private String synopsis;
        private List<AbridgedCastEntity> abridged_cast;
        private int year;
        private String mpaa_rating;
        private PostersEntity posters;
        private RatingsEntity ratings;

        public void setAlternate_ids(AlternateIdsEntity alternate_ids) {
            this.alternate_ids = alternate_ids;
        }

        public void setCritics_consensus(String critics_consensus) {
            this.critics_consensus = critics_consensus;
        }

        public void setRuntime(int runtime) {
            this.runtime = runtime;
        }

        public void setLinks(LinksEntity links) {
            this.links = links;
        }

        public void setRelease_dates(ReleaseDatesEntity release_dates) {
            this.release_dates = release_dates;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

        public void setAbridged_cast(List<AbridgedCastEntity> abridged_cast) {
            this.abridged_cast = abridged_cast;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setMpaa_rating(String mpaa_rating) {
            this.mpaa_rating = mpaa_rating;
        }

        public void setPosters(PostersEntity posters) {
            this.posters = posters;
        }

        public void setRatings(RatingsEntity ratings) {
            this.ratings = ratings;
        }

        public AlternateIdsEntity getAlternate_ids() {
            return alternate_ids;
        }

        public String getCritics_consensus() {
            return critics_consensus;
        }

        public int getRuntime() {
            return runtime;
        }

        public LinksEntity getLinks() {
            return links;
        }

        public ReleaseDatesEntity getRelease_dates() {
            return release_dates;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getSynopsis() {
            return synopsis;
        }

        public List<AbridgedCastEntity> getAbridged_cast() {
            return abridged_cast;
        }

        public int getYear() {
            return year;
        }

        public String getMpaa_rating() {
            return mpaa_rating;
        }

        public PostersEntity getPosters() {
            return posters;
        }

        public RatingsEntity getRatings() {
            return ratings;
        }

        public static class AlternateIdsEntity {
            /**
             * imdb : 2381249
             */
            private String imdb;

            public void setImdb(String imdb) {
                this.imdb = imdb;
            }

            public String getImdb() {
                return imdb;
            }
        }

        public static class LinksEntity {
            /**
             * alternate : http://www.rottentomatoes.com/m/mission_impossible_rogue_nation/
             * reviews : http://api.rottentomatoes.com/api/public/v1.0/movies/771357161/reviews.json
             * cast : http://api.rottentomatoes.com/api/public/v1.0/movies/771357161/cast.json
             * self : http://api.rottentomatoes.com/api/public/v1.0/movies/771357161.json
             * similar : http://api.rottentomatoes.com/api/public/v1.0/movies/771357161/similar.json
             */
            private String alternate;
            private String reviews;
            private String cast;
            private String self;
            private String similar;

            public void setAlternate(String alternate) {
                this.alternate = alternate;
            }

            public void setReviews(String reviews) {
                this.reviews = reviews;
            }

            public void setCast(String cast) {
                this.cast = cast;
            }

            public void setSelf(String self) {
                this.self = self;
            }

            public void setSimilar(String similar) {
                this.similar = similar;
            }

            public String getAlternate() {
                return alternate;
            }

            public String getReviews() {
                return reviews;
            }

            public String getCast() {
                return cast;
            }

            public String getSelf() {
                return self;
            }

            public String getSimilar() {
                return similar;
            }
        }

        public static class ReleaseDatesEntity {
            /**
             * theater : 2015-07-31
             */
            private String theater;

            public void setTheater(String theater) {
                this.theater = theater;
            }

            public String getTheater() {
                return theater;
            }
        }

        public static class AbridgedCastEntity {
            /**
             * id : 162652763
             * name : Tom Cruise
             * characters : ["Ethan Hunt"]
             */
            private String id;
            private String name;
            private List<String> characters;

            public void setId(String id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setCharacters(List<String> characters) {
                this.characters = characters;
            }

            public String getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public List<String> getCharacters() {
                return characters;
            }
        }

        public static class PostersEntity {
            /**
             * thumbnail : http://resizing.flixster.com/gbCU2qc5Edq9j-eJWBL9VN0BmZA=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/07/11190760_ori.jpg
             * detailed : http://resizing.flixster.com/gbCU2qc5Edq9j-eJWBL9VN0BmZA=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/07/11190760_ori.jpg
             * original : http://resizing.flixster.com/gbCU2qc5Edq9j-eJWBL9VN0BmZA=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/07/11190760_ori.jpg
             * profile : http://resizing.flixster.com/gbCU2qc5Edq9j-eJWBL9VN0BmZA=/52x81/dkpu1ddg7pbsk.cloudfront.net/movie/11/19/07/11190760_ori.jpg
             */
            private String thumbnail;
            private String detailed;
            private String original;
            private String profile;

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public void setDetailed(String detailed) {
                this.detailed = detailed;
            }

            public void setOriginal(String original) {
                this.original = original;
            }

            public void setProfile(String profile) {
                this.profile = profile;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public String getDetailed() {
                return detailed;
            }

            public String getOriginal() {
                return original;
            }

            public String getProfile() {
                return profile;
            }
        }

        public static class RatingsEntity {
            /**
             * critics_score : 92
             * critics_rating : Certified Fresh
             * audience_score : 91
             * audience_rating : Upright
             */
            private int critics_score;
            private String critics_rating;
            private int audience_score;
            private String audience_rating;

            public void setCritics_score(int critics_score) {
                this.critics_score = critics_score;
            }

            public void setCritics_rating(String critics_rating) {
                this.critics_rating = critics_rating;
            }

            public void setAudience_score(int audience_score) {
                this.audience_score = audience_score;
            }

            public void setAudience_rating(String audience_rating) {
                this.audience_rating = audience_rating;
            }

            public int getCritics_score() {
                return critics_score;
            }

            public String getCritics_rating() {
                return critics_rating;
            }

            public int getAudience_score() {
                return audience_score;
            }

            public String getAudience_rating() {
                return audience_rating;
            }
        }
    }

    public static class LinksEntity {
        /**
         * alternate : http://www.rottentomatoes.com/movie/box-office/
         * self : http://api.rottentomatoes.com/api/public/v1.0/lists/movies/box_office.json?limit=10&country=us
         */
        private String alternate;
        private String self;

        public void setAlternate(String alternate) {
            this.alternate = alternate;
        }

        public void setSelf(String self) {
            this.self = self;
        }

        public String getAlternate() {
            return alternate;
        }

        public String getSelf() {
            return self;
        }
    }
}
