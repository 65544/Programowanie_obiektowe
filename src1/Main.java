import java.util.Random;
import java.util.Scanner;


public class Main {
    static int [] tab = new int[10];
    static Random random = new Random();
    public static void main(String[] args) {

        Losowanie();
        //Suma();
        //Srednia();
        //coDrugi();
        //Zad3();
        //Zad4();
        //Zad5();
        //Zad6();
        Zad7();
    }

    public static void Losowanie() {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(50) - 25;
            System.out.println(tab[i]);
        }
    }
    /*

public static void Suma(){
   int suma = 0;
    for (int i:tab) {
        suma+=i;
    }
    System.out.println("Suma: "+suma);
}
public static void Srednia(){
    int srednia=0;
    for (int i = 0; i < tab.length ; i++) {
        srednia+=tab[i];

    }
    srednia = srednia/tab.length;
    System.out.println("Srednia: "+srednia);
}


public static void coDrugi(){
    for (int i = 0; i < tab.length ;i++) {
        if (i%2==0)
            System.out.println(i+" = "+tab[i]);
    }
}

public static void Zad3(){
    String[] slowa = {"Ala ","ma ","kota."};
    for (String i:slowa) {
        System.out.println(i.toUpperCase());
    }
}


    public static void Zad4(){
        String[] slowa = new String[6];
        System.out.println("Podaj "+slowa.length + " slow: ");

        for (int i = 1; i < slowa.length ; i++) {
            System.out.print((i)+ " slowo: ");
            slowa[i] = getString();
        }

        for (int i = slowa.length-1; i >=0 ; i--) {
            for (int j = slowa[i].length()-1; j >=0 ; j--) {
                System.out.print(slowa[i].charAt(j));
            }
            System.out.println(

            );
        }
    }



    public static void Zad5()
    {
        int[] liczby = new int[8];
        int x = 0;
        System.out.println("Podaj "+liczby.length + " liczb: ");

        for (int i = 0; i < liczby.length; i++) {
            System.out.print((i+1)+" liczba: ");
            liczby[i]=getInt();

        }

        for (int i = 0; i < liczby.length ; i++) {
            for (int j = 0; j < liczby.length-1; j++) {
                if (liczby[j] > liczby[j+1]){
                    x = liczby[j];
                    liczby[j] = liczby[j+1];
                    liczby[j+1] = x;}
            }
        }

        for (int i = 0; i < liczby.length ; i++) {
            System.out.println(liczby[i]);
        }
    }
    

    public static void Zad6()
    {
        int[] liczby = new int[5];
        int x = 1;
        System.out.println("Podaj "+liczby.length + " liczb: ");

        for (int i = 0; i < liczby.length; i++) {
            System.out.print((i+1)+" liczba: ");
            liczby[i]=getInt();
        }
        for (int i = 0; i < liczby.length ; i++) {
            System.out.print("["+liczby[i]+"]"+" ");
            x = 1;
            for (int j = 1; j <= liczby[i] ; j++) {
                x=x*j;
            }
            System.out.println(x);
        }
    }
    */

    public static void Zad7()
    {
    String string1[] = new String[3];
    String string2[] = new String[3];
    string1[0] = "Ala ";
    string1[1] = "ma ";
    string1[2] = "kota";
    string2[0] = "Ala ";
    string2[1] = "ma ";
    string2[2] = "kota";
        System.out.println(string1[0]+string1[1]+string1[2]);
        System.out.println(string2[0]+string2[1]+string2[2]);

        for (int i = 0; i < string1.length; i++) {
            for (int j = 0; j < string1[i].length(); j++) {
                if (string1[i].charAt(j)==string2[i].charAt(j))
                    System.out.println((j+1)+" litera "+(i+1)+" słowa jest taka sama!");
                else System.out.println((j+1)+" litera "+(i+1)+" słowa się nie zgadza :(");
            }
        }

    }

    public static String getString(){
        return new Scanner(System.in).next();
    }

    public static int getInt()
    {
        return new Scanner(System.in).nextInt();
    }
}



