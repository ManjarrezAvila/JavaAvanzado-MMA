/** Java program to demonstrate how to
* implement nesting classes in a Java program
* about the relation ship between Album - Song 
* where Song will be a class that is only used 
* in Album since the definition of this is a 
* collection of Song’s
*/

class Album {
    private String name;
    private String author;
    private int year;
    private Song[] songs;

    public Album(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void setAlbum(String[] names, int[] durations) {
        Song[] songs = new Song[names.length];
        for (int i = 0; i < names.length; i++) {
            songs[i] = new Song(names[i], durations[i]);
        }
        this.songs = songs;
    }

    private String getAlbum() {
        StringBuilder sb = new StringBuilder();
        for (Song song : songs) {
            sb.append(song);
        }
        return sb.toString();
    }

    public String toString() {
        return "\nALBUM: " + name +
                "\nAUTHOR: " + author +
                "\nYEAR: " + year +
                "\n\n::SONGS::\n" + getAlbum();
    }


    private static class Song {

        private String name;
        private int duration;

        private Song(String name, int duration) {
            this.name = name;
            this.duration = duration;
        }

        public String toString() {
            return "\nName: " + name +
                    "\nDuration: " + duration + " sec.\n";
        }
    }
}
