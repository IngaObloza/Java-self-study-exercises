// - poniżej znajdują się moje rozwiązania ćwiczeń z podręcznika "Nauka programowania
// w języku Java", autor: Przemysław Kruglej.
// - ćwiczenia są podstawowe, stąd umieszczenie ich w jednym pliku i pod jedną klasą (ogólnie ćwiczenia).
// - dla uruchomienia poszczególnych rozwiązań należy odkomentować samo rozwiązanie znajdujące się pod treścią zadania.
import java.util.Scanner;

public class SelfStudyExercisesJava {
    public static void main(String[] args) {

// ZADANIE 5.13.7 Choinka
// Napisz program, który pobierze od użytkownika jedną liczbę całkowitą. Następnie, program
// powinien wypisać na ekran choinkę ze znaków *, gdzie w ostatniej linii będzie liczba gwiazdek
// podana przez użytkownika, a w każdej powyższej o dwie gwiazdki mniej, niż w poniższej.
// Przykład pierwszy – użytkownik podał liczbę 5, efekt wyświetlony na ekranie:
// ODPOWIEDŹ:
//
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę gwiazdek, które chcesz widzieć u podstawy swojej choinki.");
        int gwiazdkiwPodstawie = in.nextInt();

        int gwiazdkiuSzczytu;
        int liczbaSpacji;
        int gwiazdkiwRzedzie;

        gwiazdkiuSzczytu = gwiazdkiwPodstawie % 2 == 0 ? 2 : 1;


        for (gwiazdkiwRzedzie = gwiazdkiuSzczytu; gwiazdkiwRzedzie <= gwiazdkiwPodstawie; gwiazdkiwRzedzie += 2){

            liczbaSpacji = (gwiazdkiwPodstawie - gwiazdkiwRzedzie) / 2; // wyśrodkowanie gwiazdek

            for (int ileGwiazdekLubSpacji = 1; ileGwiazdekLubSpacji <= gwiazdkiwRzedzie + liczbaSpacji; ileGwiazdekLubSpacji++){
                System.out.print(ileGwiazdekLubSpacji <= liczbaSpacji ? " " : "*");
            }
            System.out.println();
        }
    }
}

// ZADANIE 5.13.6 Kalkulator
// Napisz program, który będzie pobierał od użytkownika liczby i działania do wykonania na nich.
// Program powinien wypisywać wynik po każdym działaniu. Możliwe działania to:
// • * mnożenie,
// • / dzielenie,
// • - odejmowanie,
// • + dodawanie.
// Jeżeli podane zostanie inne działanie, lub podana zostanie liczba 0 jako dzielnik podczas dzielenia,
// program powinien wypisać stosowny komunikat i ponownie pobrać od użytkownika dane.
// Na początku, program powinien pobrać od użytkownika dwie liczby i działanie do wykonania na
// nich. Za każdy kolejnym razem, program powinien pobierać od użytkownika już tylko jedną liczbę
// i działanie, po czym powinien wykonać podane działanie na poprzednim wyniku i podanej liczbie.
// Dla przykładu:
// 1. Program pobiera najpierw dwie liczby od użytkownika: 10 i 15, oraz działanie: dodawanie.
// 2. Program dodaje do siebie liczby i wypisuje wynik 25 na ekran.
// 3. Program pyta, czy użytkownik chce wykonać kolejne działanie.
// a) Jeżeli nie, program kończy działanie.
// b) Jeżeli tak, to program pobiera jedną liczbę i działanie, np. 2 i mnożenie. Program mnoży
// poprzedni wynik działania – czyli 25 * 2 i wypisuje wynik 50 na ekran. Wracamy do
// punktu 3. i ponownie pytamy o chęć dalszych kalkulacji.
// ODPOWIEDŹ:

//        Scanner in = new Scanner(System.in);
//        double userNumber1;
//        double userNumber2;
//        double userNumber3;
//        char userOperation;
//        double firstOperationResult = 0;
//        boolean whetherRepeat = true;
//        String userAnswerWhetherToContinue;
//
//        do {
//            System.out.println("Podaj pierwszą liczbę");
//            userNumber1 = in.nextDouble();
//            System.out.println("Podaj drugą liczbę");
//            userNumber2 = in.nextDouble();
//            System.out.println("Podaj działanie, jakie chcesz wykonać [ *, /, -, + ]");
//            userOperation = in.next().charAt(0);
//
//            if (userOperation == '*') {
//                firstOperationResult = userNumber1 * userNumber2;
//            } else if (userOperation == '/') {
//                if (userNumber2 == 0) {
//                    System.out.println("Nie możesz dzielić przez 0. Podaj dane ponownie.");
//                    continue;
//                } else {
//                    firstOperationResult = userNumber1 / userNumber2;
//                }
//            } else if (userOperation == '-') {
//                firstOperationResult = userNumber1 - userNumber2;
//            } else if (userOperation == '+') {
//                firstOperationResult = userNumber1 + userNumber2;
//            } else {
//                System.out.println("Podałeś niewłaściwe działanie. Podaj dane ponownie.");
//                continue;
//            }
//            whetherRepeat = false;
//
//        } while (whetherRepeat);
//
//        System.out.println(firstOperationResult);
//
//        System.out.println("Dotychczasowy wynik, to: " + firstOperationResult +
//                "\nCzy chcesz wykonać kolejne działanie [wpisz: t lub n]?");
//        userAnswerWhetherToContinue = in.next();
//        if (userAnswerWhetherToContinue.equals("t")) {
//
//            while (true) {
//
//                System.out.println("Podaj kolejną liczbę");
//                userNumber3 = in.nextDouble();
//
//                System.out.println("Podaj działanie, jakie chcesz wykonać [ *, /, -, + ]");
//                userOperation = in.next().charAt(0);
//
//                if (userOperation == '*') {
//                    firstOperationResult *= userNumber3;
//                    //firstOperationResult = firstOperationResult * userNumber3;
//                } else if (userOperation == '/') {
//                    if (userNumber3 == 0) {
//                        System.out.println("Nie możesz dzielić przez 0. Podaj dane ponownie.");
//                        continue;
//                    } else {
//                        firstOperationResult /= userNumber3;
//                    }
//                } else if (userOperation == '-') {
//                    firstOperationResult -= userNumber3;
//                } else if (userOperation == '+') {
//                    firstOperationResult += userNumber3;
//                } else {
//                    System.out.println("Podałeś niewłaściwe działanie. Podaj dane ponownie.");
//                    continue;
//                }
//                System.out.println("Dotychczasowy wynik, to: " + firstOperationResult +
//                        "\nCzy chcesz wykonać kolejne działanie [wpisz: t lub n]?");
//                userAnswerWhetherToContinue = in.next();
//                if (userAnswerWhetherToContinue.equals("n")) {
//                    break;
//                }
//            }
//        }
//        System.out.println("Ostateczny wynik to: " + firstOperationResult);
//    }
//}


// ZADANIE 5.13.5 Zagnieżdżone pętle
// Napisz program z dwoma pętlami (jedna zagnieżdżona w drugiej), każda z pętli powinna iterować
// od 1 do 10.
// 1. Pętla główna powinna pomijać swoje iteracje za pomocą instrukcji continue, gdy jej
// zmienna jest nieparzysta.
// 2. Pętla zagnieżdżona powinna wypisywać wartość swojej zmiennej. Następnie, gdy zmienna
// pętli zagnieżdżonej jest większa od zmiennej pętli głównej, pętla zagnieżdżona powinna
// spowodować, że przejdziemy do kolejnej iteracji pętli głównej (w tym przypadku skorzystaj
// z etykiety i instrukcji continue).
// ODPOWIEDŹ:

//        main_loop:
//        for (int i = 1; i <= 10; i++){
//            if (i % 2 != 0) {
//            continue;
//        }
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(j + ", ");
//                if (j > i){
//                    continue main_loop;
//                }
//            }
//        }
//    }
//}


// ZADANIE 5.13.4 Wypisz największą liczbę z podanych
// Napisz program, który z liczb podanych przez użytkownika wypisze największą. Program po
// pobraniu każdej liczby powinien pytać, czy użytkownik chce podać kolejną liczbę. Po podaniu
// liczb, program powinien wypisać największą z nich.
// ODPOWIEDŹ:

//        double userNumber;
//        double largestNumber;
//        String userAnswer;
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Podaj liczbę.");
//        largestNumber = in.nextDouble();
//
//        do {
//            System.out.println("Czy chcesz podać kolejną liczbę [napisz t lub n]? ");
//            userAnswer = in.next();
//            userAnswer = userAnswer.toLowerCase();
//
//            if (userAnswer.equals("n")){
//                break;
//            }
//            System.out.println("Podaj nastepną liczbę.");
//            userNumber = in.nextDouble();
//
//            if (userNumber > largestNumber){
//                largestNumber = userNumber;
//            }
//
//        } while (userAnswer.equals("t"));
//        System.out.println("Największa z podanych przez Ciebie liczb, to: " + largestNumber + ",");
//    }
//}


// ZADANIE 5.13.3 Palindrom
// Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest palindromem.
// Palindrom to słowo, które jest takie samo czytane od początku i od końca, np. kajak.
// ODPOWIEDŹ:

//        System.out.println("Podaj słowo:");
//        Scanner in = new Scanner(System.in);
//        String userWord = in.nextLine();
//        userWord = userWord.toLowerCase();
//
//        int x = userWord.length();
//        System.out.println("ilość znaków w słowie " + userWord + ": " + x);
//
//        boolean whetherPalindrome = true;
//        char odkonca;
//        char odpoczatku;
//
//        for (int i = userWord.length() - 1,iBegiining = 0 ; i >= 0 && iBegiining < userWord.length(); i--, iBegiining++) {
//
//            odkonca = userWord.charAt(i);
//            //System.out.print(odkonca + ", ");
//
//            odpoczatku = userWord.charAt(iBegiining);
//            //System.out.print(odpoczatku + ". ");
//
//            if (odkonca == odpoczatku) {
//                    whetherPalindrome = true;
//                } else {
//                    whetherPalindrome = false;
//                }
//            }
//        System.out.println();
//        System.out.println("czy wybrane przez Ciebie słowo (" + userWord + ") jest palindromem? " + whetherPalindrome);
//    }
//}


// ZADANIE 5.13.2 Policz silnię
// Napisz program, który policzy i wypisze silnię liczby, którą poda użytkownik. Silnia to iloczyn
// kolejnych liczb całkowitych od 1 do danej liczby, np. silnia 5 to 1 * 2 * 3 * 4 * 5, czyli 120.
// Silnia liczby 0 to 1.
// ODPOWIEDŹ:
//        Scanner in = new Scanner(System.in);
//        int userNumber;
//        int factorial = 1;
//        do {
//            System.out.println("Podaj liczbę, której silnię chcesz obliczyć.");
//            userNumber = in.nextInt();
//
//            if (userNumber < 0) {
//                System.out.println("Podqaj liczbę większą od 0.");
//            }
//        } while (userNumber < 0);
//
//        System.out.println("twój wybór to liczba: " + userNumber);
//
//        glowna_petla:
//        for (int multiplier = 1; multiplier <= userNumber; multiplier++) {
//            System.out.print("multiplier " + multiplier +", " ); // czemu nie drukuje, przy userNumber == 0
//
//            if (userNumber == 0) {
//                factorial = 1;
//                break glowna_petla;
//            }
//
//            factorial *= multiplier;
//            System.out.print("factorial " + factorial + ", ");
//            System.out.println();
//        }
//
//        System.out.println("Silnia podanej przez ciebie liczby (" + userNumber + "), wynosi: " + factorial);
//    }
//}


// ZADANIE 5.13.1 While i liczby od 1 do 10
// Napisz program z użyciem pętli while, który wypisuje wszystkie liczby od 1 do 10 (włącznie),
// oddzielone przecinkami, poza liczbą 10, po której nie powinno być przecinka.
// ODPOWIEDŹ:

//        int x = 1;
//        while (x <=10) {
//            if (x < 10) {
//                System.out.print(x + ", ");
//            } else {
//                System.out.print(x);
//            }
//            x++;
//        }
//    }
//}


//ZADANIE (notatki) X.1 - powtórz poniższy program przy zastosowaniu pętli for.

//        System.out.println("Podaj ile gwiazdek wypisaś: ");
//        Scanner in = new Scanner(System.in);
//        int userNumberOfStars = in.nextInt();
//
//        //(instrukcja_inicjalizująca; warunek; intrukcja_kroku)
//        for (int x = 0; x < userNumberOfStars; x++ ){
//            System.out.print("*");
//        }
//    }
//}


// ZADANIE (notatki) X - wypisz na ekran, w jednej linii, tyle gwiazdek ile zaczyczy sobie urzytkownik.
//        System.out.println("Podaj ile gwiazdek wypisać. ");
//        Scanner in = new Scanner(System.in);
//        int userNumberOfStars = in.nextInt();
//
//        while (userNumberOfStars > 0) { // działaj dopóki podana liczba jest większa od 0.
//            System.out.print("*");
//            userNumberOfStars--;
//        }
//    }
//}

//-------------------------------------------------
// ZADANIA 4.15 (IV Conditional Statements in Java)

// ZADANIE 4.15.8 Czy rok przestępny
// Napisz program, który pobierze od użytkownika rok i odpowie na pytanie, czy podany rok jest
// rokiem przestępnym, czy nie. Wskazówka: rok jest rokiem przestępnym, jeżeli:
// • dzieli się przez 4 i nie dzieli się przez 100
// lub
// • dzieli się przez 400.
// ODPOWIEDŹ:

//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj rok (urzyj tylko cyfr). ");
//        int userYear = in.nextInt();
//
//        boolean leapYear;
//        leapYear = userYear % 4 == 0 && userYear % 100 != 0 || userYear % 100 == 0;
//        String whetherUserYearIsLeapYear = leapYear ? "Podany rok jest rokiem przestępnym." : "Podany rok nie jest rokiem przestępnym.";
//        System.out.println(whetherUserYearIsLeapYear);
//    }
//}


// ZADANIE 4.15.7 Czy pełnoletni
// Napisz program, który pobiera wiek od użytkownika. Zapisz w zmiennej typu boolean informację,
// czy użytkownik jest pełnoletni, czy nie. Skorzystaj z trój-argumentowego operatora warunkowego.
// Wypisz wynik zdefiniowanej zmiennej typu boolean na ekran
// ODPOWIEDŹ:

//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj swój wiek (użyj tylko cyfr). ");
//        int userAge = in.nextInt();
//        int adultAge = 18;
//        boolean whetherAdult = userAge >= adultAge;
//        String whetherUserIsAdult = whetherAdult ? "Urzytkownik jest pełnoletni" : "Urzytkownik nie jest pełnoletni";
//        System.out.println(whetherUserIsAdult);
//
//        // uzwględnij błąd przy podaniu cyfry mniejszej od 0 i większej od 150.
//        String whetherUserIsAdult2 = whetherAdult && userAge >= 0 && userAge <= 150 ?
//                "Urzytkownik jest pełnoletni" : (userAge < 0 || userAge > 150 ?
//                "Podałeś niewłaściwą cyfrę" : "Urzytkownik nie jest pełnoletni");
//        System.out.println(whetherUserIsAdult2);
//    }
//}


// ZADANIE 4.15.6 Sprawdź imię
// Napisz program, który pobierze od użytkownika jego imię i odpowie na pytanie, czy jego imię jest
// takie samo, jak Twoje (załóżmy, że użytkownik podaje swoje imię bez polskich znaków).
// Uwaga! Pamiętaj, aby skorzystać z metody equals typu String zamiast porównywać stringi za
// pomocą operatora == !
// ODPOWIEDŹ:

//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj proszę swoje imię (bez polskich znaków i z dużej litery).");
//        String userName = in.nextLine();
//
//        String myName = "Inga";
//        String messageYes = "Cześć Inga! Nazyam się tak samo jak ty :] ";
//        String messageNot = "Cześć! " + userName + " Ja nazywam się " + myName;
//
//        //1 sposób
//        String whetherNamesakes = userName.equals(myName) ? messageYes : messageNot;
//        System.out.println(whetherNamesakes);
//
//        // 2 sposób
//        if (userName.equals(myName)) {
//            System.out.println(messageYes);
//        } else {
//            System.out.println(messageNot);
//        }
//    }
//}


// ZADANIE: 4.15.5 Zamień liczbę na nazwę miesiąca
// Napisz program, który pobierze od użytkownika numer miesiąca i wypisze jego nazwę, lub
// komunikat "Nieprawidlowy numer miesiaca", jeżeli podany numer będzie spoza zakresu
// 1..12. Skorzystaj z instrukcji switch
// ODPOWIEDŹ:

//        Scanner in = new Scanner(System.in);
//        System.out.println("podaj numer miesiąca: ");
//        int monthNumber = in.nextInt();
//
//        switch (monthNumber) {
//            case 1:
//                System.out.println("styczeń");
//                break;
//            case 2:
//                System.out.println("luty");
//                break;
//            case 3:
//                System.out.println("marzec");
//                break;
//            case 4:
//                System.out.println("kwiecień");
//                break;
//            case 5:
//                System.out.println("maj");
//                break;
//            case 6:
//                System.out.println("czerwiec");
//                break;
//            case 7:
//                System.out.println("lipiec");
//                break;
//            case 8:
//                System.out.println("siepień");
//                break;
//            case 9:
//                System.out.println("wrzesień");
//                break;
//            case 10:
//                System.out.println("październik");
//                break;
//            case 11:
//                System.out.println("listopad");
//                break;
//            case 12:
//                System.out.println("grudzień");
//                break;
//            default:
//                System.out.println("Nieprawidłowy numer miesiąca.");
//        }
//    }
//}


// ZADANIE 4.15.4 Wypisz największą z trzech liczb
// Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich
// ODPOWIEDŹ (czy da się zrobić to krócej? wróc do zadania):

//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj pierwszą liczbę: ");
//        double userNumber1 = in.nextDouble(); // dlaczego przy double równe nie są równe?
//
//        System.out.println("Podaj drugą liczbę: ");
//        double userNumber2 = in.nextDouble();
//
//        System.out.println("Podaj trzecią liczbę: ");
//        double userNumber3 = in.nextDouble();
//
//        String whichGreater = "największa z podanych liczb, to: ";
//        String a = "Dwie z podanych liczb są największe: ";
//        String b = "Wszystkie liczby są sobie równe: ";
//        boolean x = userNumber1 == userNumber2 && userNumber1 > userNumber3;
//        boolean y = userNumber1 == userNumber3 && userNumber1 > userNumber2;
//        boolean z = userNumber2 == userNumber3 && userNumber2 > userNumber1;
//        boolean q = userNumber1 == userNumber3 && userNumber1 == userNumber2;
//
//
//        if (userNumber1 > userNumber2 && userNumber1 > userNumber3) {
//            System.out.println(whichGreater + userNumber1);
//        } else if (userNumber2 > userNumber1 && userNumber2 > userNumber3){
//            System.out.println(whichGreater + userNumber2);
//        } else if (userNumber3 > userNumber1 && userNumber3 > userNumber2) {
//            System.out.println(whichGreater + userNumber3);
//        } else {
//            if (x){
//                System.out.println(a + userNumber1 + " i " + userNumber2);
//            } else if (y) {
//                System.out.println(a + userNumber1 + " i " + userNumber3);
//            } else if (z) {
//                System.out.println(a + userNumber2 + " i " + userNumber3);
//            } else {
//                System.out.println(b);
//            }
//        }
//    }
//}


// ZADANIE 4.15.3 Wypisz największą z dwóch liczb
// Napisz program, który pobierze od użytkownika dwie liczby i wypisze największą z nich.
// ODPOWIEDŹ:
//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj pierwszą liczbę: ");
//        double userNumber1 = in.nextDouble(); // dlaczego przy double równe nie są równe?
//        System.out.println("Podaj drugą liczbę: ");
//        double userNumber2 = in.nextDouble();
//
//        String x = userNumber1 + " jest większa niż " + userNumber2;
//        String y = userNumber2 + " jest większa niż " + userNumber1;
//        String z = userNumber1 + " jest równa " + userNumber2;
//
//        // 1 sposób (trójargumentowy operator logiczny - Ternary conditional operator ?:
//        String whichGreater = userNumber1 > userNumber2 ? x : (userNumber2 > userNumber1 ? y : z);
//        System.out.println(whichGreater);
//
//        // 2 sposób (instrukcja warunkowa)
//        if (userNumber1 > userNumber2) {
//            System.out.println(userNumber1 + " jest większa niż " + userNumber2);
//        } else if (userNumber1 == userNumber2){
//            System.out.println(userNumber1 + " jest równa " + userNumber2);
//        } else {
//            System.out.println(userNumber2 + " jest większa niż " + userNumber1);
//        }
//    }
//}


// ZADANIE 4.15.2 Czy można zbudować trójkąt
// Napisz program, który wczyta od użytkownika trzy liczby i odpowie na pytanie, czy można
// z nich zbudować trójkąt (suma każdych dwóch boków powinna być większa od trzeciego boku).
// ODPOWIEDŹ:

//        Scanner in = new Scanner (System.in);
//        System.out.println("podaj długość pierwszebo boku trójkąta: ");
//        Double side1 = in.nextDouble();
//        System.out.println("podaj długość drugiego boku trójkąta: ");
//        Double side2 = in.nextDouble();
//        System.out.println("podaj długość trzeciego boku trójkąta: ");
//        Double side3 = in.nextDouble();
//
//        Boolean whetherPositive = side1 > 0 && side2 > 0 && side3 > 0;
//        if (whetherPositive && (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2)) {
//            System.out.println("Można zbudować trójkąt.");
//        } else {
//            System.out.println("Nie można zbudować trójkąta.");
//        }
//    }
//}


// ZADANIE: 4.15.1 Czy liczba podzielna przez trzy
// apisz program, który wczyta od użytkownika liczbę i wypisze, czy jest podzielna bez reszty przez
// 3. Skorzystaj z operatora reszty z dzielenia – jeżeli reszta z dzielenia jest równa 0, to liczba jest
// podzielna przez 3.
// Odpowiedź:


//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj dowolną liczbę całkowitą.");
//        int userNumber = in.nextInt();
//
//        boolean whetherDivisibleBy3 = userNumber % 3 == 0;
//        String divisible = "podana liczba jest podzielna przez trzy.";
//        String indivisible = "podana liczba nie jest podzielna przez trzy.";
//
//        System.out.println(whetherDivisibleBy3 ? divisible : indivisible);
//    }
//}


//// ZADANIE X - oblicz pole dowolnego prostokąta, który nie jest kwadratem (operatory warunkowe i instrukcje warunkowe):
//        Scanner in = new Scanner(System.in);
//        System.out.println("podaj długość krótszego boku.");
//        double shorterSide = in.nextDouble();
//
//        System.out.println("podaj długość dłuższego boku");
//        double longerSide = in.nextDouble();
//
////        if (shorterSide == longerSide || shorterSide <= 0 || longerSide <= 0) {
////            System.out.println("nieprawidłowe dane.");
////        } else {
////            System.out.println("pole prostokąta = " + shorterSide * longerSide);
////        }
//        // lub dla instrukcji warunkowej - inaczej sformułowane warunki. :
//        if (shorterSide != longerSide && shorterSide > 0 && longerSide >= 0) {
//            System.out.println("pole prostokąta = " + shorterSide * longerSide);
//        } else {
//            System.out.println("nieprawidłowe dane.");
//        }
//
//
//        //Scanner in = new Scanner(System.in); //1.0 sposób
//        //System.out.println("podaj długość krótszego boku.");
//        //String name = in.nextLine(); // 1.0 sposób
//
//        //Scanner scanner = new Scanner(System.in); // 1.1 sposób
//        //System.out.println("Jaką liczbę wylosowałem? Podaj liczbę od 1 do 10. ");
//        //byte number1 = scanner.nextByte(); // 1.1 sposób
//        //String name = scanner.nextLine(); //1.1 sposób
//
//        //double shorterSide = getDouble (); // 2 spoób + metoda na końcu
//
//
//    }
//    //public static int getDouble () { // 2 sposób scanner - metoda
//    //    return new Scanner(System.in).nextInt();
//    //}
//}
//
//// KONIEC ZADANIA X


