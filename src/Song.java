public class Song {
        private String title;
        private String singer;
        private double duration;


        public Song(String title, String singer, double duration) {
            this.title = title;
            this.singer = singer;
            this.duration = duration;
        }


        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return singer;
        }

        public double getDuration() {
            return duration;
        }


        public void setTitle (String title) {
            this.title = title;
        }

        public void setSinger(String singer) {
            this.singer = singer;
        }

        public void setDuration(double duration) {
            this.duration = duration;
        }


        @Override
        public String toString() {
            return "Song: " + title + ", Singer: " + singer + ", Duration: " + duration + " minutes";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Song song = (Song) obj;
            return title.equals(song.title) && singer.equals(song.singer);
        }
    }

