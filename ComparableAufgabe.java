import java.util.Arrays;

public class ComparableAufgabe {

    public static void main(String... args){
        Buch[] buecher = new Buch[]{
                new Buch("1", "Arbenit Kamberi", 200, 2019),
                new Buch("2", "Silvan Bauer", 230, 2010),
                new Buch("3", "George Rowlands", 240, 2018),
                new Buch("4", "Arbenit Kamberi", 234, 2009),
                new Buch("4", "Patrick Scheidegger", 150, 2015),
                new Buch("6", "Arbenit Kamberi", 210, 2019),
                new Buch("5", "Stefan Ulrich", 450, 2009),
                new Buch("6", "Arbenit Kamberi", 140, 2018)
        };
        Arrays.sort(buecher);
        System.out.println(Arrays.toString(buecher));
    }

    public static class Buch implements Comparable<Buch>{

        private String titel;
        private String autor;
        private int anzSeiten;
        private int erscheinungsjahr;

        public Buch(String titel, String autor, int anzSeiten, int erscheinungsjahr){
            this.titel = titel;
            this.autor = autor;
            this.anzSeiten = anzSeiten;
            this.erscheinungsjahr = erscheinungsjahr;
        }

        @Override
        public int compareTo(Buch o) {
            if(autor.equals(o.autor)){
                if(o.erscheinungsjahr < erscheinungsjahr){
                    return -1;
                }
                else if(o.erscheinungsjahr == erscheinungsjahr){
                    return 0;
                }
                return 1;
            }
            return autor.compareTo(o.autor);
        }

        @Override
        public String toString(){
            return "Buch(titel: " + titel + "; autor: " + autor + "; anzSeiten: " + anzSeiten + "; erscheinungsjahr: " + erscheinungsjahr + ")";
        }
    }
}
