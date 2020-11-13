package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Potegowanie {
    public static void main(String[] args) {
        double liczba_pierwsza = 2.0;
        int liczba_druga = 5;
        double wynik = Math.pow(liczba_pierwsza, liczba_druga);
        System.out.println("Liczba " + liczba_pierwsza + " podniesiona do potęgi " + liczba_druga + " to " + wynik );
    }
}

class Dodawanie {
    public static void main(String[] args ){
        double liczba_pierwsza = 5.3;
        int liczba_druga = 2;
        double wynik = liczba_pierwsza + liczba_druga;
        System.out.println("Wynik dodawnia liczby " + liczba_pierwsza + " i liczby " + liczba_druga + " to " + wynik );
    }
}

class Odejmowanie {
    public static void main(String[] args ){
        double liczba_pierwsza = 24.3;
        int liczba_druga = 9;
        double wynik = liczba_pierwsza - liczba_druga;
        System.out.println("Wynik odejmowania liczby " + liczba_pierwsza + " i liczby " + liczba_druga + " to " + wynik );
    }
}

class Mnozenie {
    public static void main(String[] args ){
        double liczba_pierwsza = 60.3;
        int liczba_druga = 2;
        double wynik = liczba_pierwsza * liczba_druga;
        System.out.println("Wynik możenia liczby " + liczba_pierwsza + " i liczby " + liczba_druga + " to " + wynik );
    }
}


