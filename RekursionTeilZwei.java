public class RekursionTeilZwei {

    public static void main(String... args){
        System.out.println(summeRekursiv(1, 4, 6));
        System.out.println(summeLoop(1, 4, 6));
    }

    //-- Rekursiv
    public static int summeRekursiv(int a, int b, int c){
        a = summeRekursiv(a, b);
        a = summeRekursiv(a, c);
        return a;
    }
    private static int summeRekursiv(int a, int b){
        if(b > 0){
            ++a;
            --b;
            return summeRekursiv(a, b);
        }
        return a;
    }

    //-- Loop
    public static int summeLoop(int a, int b, int c){
        while(b > 0 || c > 0){
            if(b > 0){
                ++a;
                --b;
            }
            if(c > 0){
                ++a;
                --c;
            }
        }
        return a;
    }


}
