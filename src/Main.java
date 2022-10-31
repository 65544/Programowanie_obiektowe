import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(getImie());
        System.out.println(getWiek());
        //Obliczenia(4,2);
        //System.out.println(;Parzysta(4));
        //System.out.println(PodzielnaPrzez15(30));
        //System.out.println(DoSzescianu(2));


        //-------------------------
        //Zadanie1_lab3();
        //Zadanie2_lab3();
        //Zadanie3_lab3();
        //Zadanie4_lab3();
        //System.out.println(Zadanie5_lab3());
        //System.out.println(Zadanie7_lab1());
        System.out.println(Zadanie6_lab1(9));
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    // Zadanie 1

    public static String getImie(){
        return "Adam";
    }
    public static int getWiek(){
        return 23;
    }
    /*
    // Zadanie 2
    public static void Obliczenia(double a, double b){

        System.out.println("Suma: "+a+" + "+b+" = "+(a+b));
        System.out.println("Róznica: "+a+" - "+b+" = "+(a-b));
        System.out.println("Iloczyn: "+a+" * "+b+" = "+(a*b));

    }
    // Zadanie 3

    public static boolean Parzysta(int a){
        if (a%2==0) return true;
        return false;
    }

    // Zadanie 4

    public static boolean PodzielnaPrzez15 (int a){
        if (a%15==0) return true;
        return false;
    }

    // Zadanie 5

    public static int DoSzescianu (int a){
        return (a*a*a);
    }





    public static void Zadanie1_lab3(){
        int LiczbaPkt, suma=0, ile=0;
        System.out.println("Podaj liczbę studentów: ");
        int n=getInt();
        if (n>0){

            while (n>0){
                System.out.println("Podaj liczbę pkt 0 - 40");
                LiczbaPkt=getInt();
                if(LiczbaPkt>=0 && LiczbaPkt<=40){
                    suma+=LiczbaPkt;
                    n--;
                    ile++;
                }continue;
            }
            System.out.println("Suma: "+suma);
            System.out.println("Srednia: "+(double)(suma/ile));

        }else System.out.println("W grupie musi być conajmniej 1 osoba");
    }*/

    public static void Zadanie2_lab3(){
        int n=10, liczba, ujemne=0, dodatnie=0, sumauj=0, sumadod=0;
        while(n>0)
        {

            System.out.println("Podaj liczbę: ");
            liczba=getInt();
            if(liczba >= 0){
                sumadod+=liczba;
                n--;
                dodatnie++;
            }
            else {
                sumauj+=liczba;
                n--;
                ujemne++;
            }

        }
        System.out.println("Liczba dodatnich liczb: "+dodatnie);
        System.out.println("Suma dodatnich liczb: "+sumadod);
        System.out.println("Liczba ujemnych liczb: "+ujemne);
        System.out.println("Suma ujemnych liczb: "+sumauj);
    }
    public static void Zadanie3_lab3(){
        int n, suma=0;
        System.out.printf("Podaj liczbę liczb w ciągu: ");
        n=getInt();

        while(n>0)
        {
            Random rand = new Random();
            int liczba = rand.nextInt();
            System.out.println(liczba);
            if (liczba>=0) suma+=liczba;
            n--;

        }
        System.out.println("Suma dodatnich liczb w ciągu: "+suma);
    }

    public static void  Zadanie4_lab3()
    {
        int n, suma=0;
        System.out.printf("Podaj liczbę liczb w ciągu: ");
        n=getInt();

        while(n>0)
        {
            Random rand = new Random();
            int liczba = rand.nextInt(56)-10;
            System.out.println(liczba);
            if (liczba>=0) suma+=liczba;
            n--;

        }
        System.out.println("Suma dodatnich liczb w ciągu: "+suma);
    }

    public static boolean Zadanie5_lab3()
    {
        System.out.println("Podaj swoją frazę do sprawdzenia: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        for (int i=0; i < s.length() / 2; i++)
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        return true;
    }

        public static boolean Zadanie7_lab1()
        {
            Random rand = new Random();
            System.out.println("Podaj zakres liczbowy (wartości muszą być dodatnie): ");
            System.out.printf("Od: ");
            int a = getInt();
            while (a<=0) {
                System.out.println("Podaj dolną wartość zakresu ponownie: ");
                a = getInt();
            }
            System.out.printf("Do: ");
            int b = getInt();
            while (b<=0) {
                System.out.println("Podaj górną wartość zakresu ponownie: ");
                b = getInt();
            }
            int x = rand.nextInt(b-a+1)+a;
            int y = rand.nextInt(b-a+1)+a;
            int z = rand.nextInt(b-a+1)+a;
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            if(((x*x)+(y*y)==(z*z)) || ((z*z)+(y*y)==(x*x)) || ((x*x)+(z*z)==(y*y)))
                return true;

            return false;
        }



    public static double Zadanie6_lab1 (double a){
        return (Math.sqrt(a));
    }
        }



