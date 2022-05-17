import java.util.Random;
import java.util.Scanner;

public class GraInga {
    public static void main(String[] args) {
        System.out.println("\n\nFajnie, że jesteś :]! Może najpierw Ja się przedstawię :]" +
                "\nJestem pierwszą, prościutką grą, napisaną przez Ingę w języku Java. " +
                "\nBardzo chciałabym się sprawdzić w praktyce.. pomożesz? " +
                "\nJakie są moje zasady? Już tłumaczę :]. " +
                "\nJa losuję numer od 1 do 10, " +
                "\nTy masz dwie szanse, żeby odgadnąć numer, który wylosowałam. " +
                "\nNie martw się! Dam Ci podpowiedż po pierwszej wykorzystanej szansie! " +
                "\nJakie są podpowiedzi? Możesz napotkać kilka - niżej przeczytasz, co mniej więcej każda z nich podpowiada: " +
                "\n 1] Gorąco! Za wysoko... (jesteś blisko! Dobra odpowiedź jest tylko o jeden w dół.)" + // nie powinnam aż tak podpowiadać, ale zależy mi na sprawdzeniu funkcjonalności (test UX).
                "\n 2] Gorąco! Za nisko... (jesteś blisko! Dobra odpowiedź jest tylko o jeden w górę.)" + // nie powinnam aż tak podpowiadać, ale zależy mi na sprawdzeniu funkcjonalności (test UX) - mormalnie w opisie można tego nie ujmować lub zapisać tylko możliwe odpowiedzi.
                "\n 3] Zimno! Za nisko... (jesteś daleko! Dobra odpowiedź jest najmniej pięć liczb w górę.)" +
                "\n 4] Zimno! Za wysoko... (jesteś daleko! Dobra odpowiedź jest najmniej pięć liczb w dół.)" +
                "\n 5] Za zimno oraz Za wysoko... to już odgadnij sam/a ;] \n Ach! jest jeszcze jeden komunikat: \"liczba poza zakresem\". " +
                "Pojawi się, kiedy wybierzesz < 0 lub > 10, ale też nie wybierzesz liczby >128 i nie wybierzesz liczvy < -129 (są poza zakresem typu byte)." +
                " Tracisz wtedy szansę. \n\nCo jeszcze musisz wiedzieć?\nNa koniec gry zapytam Cię o opinię. " +
                "\nJeśli chcesz, możesz też zagrać jeszcze raz. Zasady się nie zmienią, wylosuję jednak Nową liczbę, nie wyświetlę też ponownie powyższych podpowiedzi. " +
                "\n\nJeszcze ogromna prośba do Ciebie, zanim zaczniemy... jestem Case Sensitive więc proszę wpisuj swój wybór (litery i sformułowania) tak jak o to proszę. " +
                "\n(wiem, że da się mnie zepsuć wpisując - inne niż polecone - znaki (np przy wybrze numeru 8/ lub wpisując liczbę większą niż 127 lub mniejszą niż -128; " +
                "Przy wyborach:tak, nie, tak sobie itp - wpisując słowa z wykorzystaniem dużych liter lub dopowiedzeń np.: tak, ale już skończ pierdolić." +
                "\ngenaralnie - zastosuj się, proszę do moich poleceń dotyczącycg tego jakimi literami coś wpisać i jak powinny być sformułowane." +
                "\nW niedalekiej przyszłości będzie większa elastyczność w tym temacie. Daj mi chwilkę...:]");

        //zmienne potrzebne później

        Scanner in = new Scanner(System.in);
        String answerCon = null; // do do...while / nie rozumiem po co null ale jak było po prostu: String answerCon; to nie działało.
        String score;

        System.out.print("\n\nTwoja kolej :]! Jak się nazywsz? ");
        String name = in.nextLine();
        System.out.println("Hej, " + name + "! Chcesz zagrać w grę? \nNapisz proszę małymi literami: tak lub nie.");
        String hi = in.nextLine();



        if (hi.equals("tak")) { // zaczyna grę, jeśli "tak".

            do {
// 1 sposób z import java.util.Random; generate random numbers between defined range
//                int min = 1;
//                int max = 10;
//                Random random = new Random();
//                int randomNumber = random.nextInt(max + min) + min; // i tak wylosowało 11...

// 2 sposób z import java.util.Random; - generate random numbers between defined range
//      Random random = new Random();
//
//      for(int i = 1; i <=10; i++) {   ---> a (i = 2; i <= 11)?
//      int randomNumber = random.nextInt((10 - 1) + 1) + 1;

// 3 spoób (metoda na końcu) (bez import java.util.Random;) - generate random numbers between defined range
                int randomNumber = getRandomInteger(10, 1);

                System.out.println(randomNumber); // mogę wyłączyć jak nie będę chciała, żeby użytkownik widział liczbę.

// Scanner - pobieranie danych od użytkownika.
                Scanner scanner = new Scanner(System.in);
                System.out.println("Jaką liczbę wylosowałem? Podaj liczbę od 1 do 10. ");
                byte number1 = scanner.nextByte();
                System.out.println("pierwszy Twój wybór: " + number1);

//  Uwagi do sformułowań:
//  UX - zimno, za wysoko podobnie jest z: gorąco, za nisko - miesza się użytkownikowi -
//  zimno, nisko kojarzone jest z wartością ujemną, gorąco, wysoko z dodatnią.

                String hot = "Gorąco! ";
                String high = "Za wysoko...";
                String cold = "Zimno! ";
                String low = " Za nisko...";
                String win = "Trafiona! \nGratulecje!";

                String fin = " Niestety nie udało się :[";
                String over = "\nGame is over!";

                String out = "liczba poza zakresem, szansa stracona!";
                String s = " ";

                if (number1 <= 0 || number1 >= 11) { // String out = "liczba poza zakresem, szansa stracona!";
                    System.out.println(out);


                } else if (number1 == randomNumber) {
                    System.out.println(win.toUpperCase());

                } else if (number1 > randomNumber) {

                    if (Math.abs(number1 - randomNumber) == 1) { // Math.abs(); oblicza wartość bezwzględną.
//          Tu zamiast sformułowania: (number2 == randomNumber + 1)

                        System.out.println(hot + s + high);
                    } else if (Math.abs(number1 - randomNumber) >= 5) { // Math.abs(); oblicza wartość bezwzględną.
//          Tu zamiast sformułowania: (number2 >= randomNumber + 5)
                        System.out.print(cold + s + high);
                    } else {
                        System.out.print(high);
                    }
                } else if (number1 < randomNumber) {

                    if (Math.abs(number1 - randomNumber) == 1) { // do tego te liczby bezwzględne
                        System.out.println(hot + low);
                    } else if (Math.abs(number1 - randomNumber) >= 5) {
                        System.out.print(cold + low);
                    } else {
                        System.out.print(low);
                    }
                }
// 2 losowanie, jeśli liczba nie trafiona za pierwszym razem:
                if (number1 == randomNumber) {
                    System.out.println("Trafiłeś za pierwszym razem!\nWygrałeś!\n".toUpperCase() + over);

                } else {
                    System.out.println("Masz drugą szansę. \nJaką liczbę wylosowałem? Podaj liczbę od 1 do 10...");
                    byte number2 = scanner.nextByte();
                    System.out.println("drugi Twój wybór: " + number2);

                    if (number2 <= 0 || number2 >= 11) {
                        System.out.println(out + over);

                    } else if (number2 == randomNumber) {
                        System.out.println(win.toUpperCase() + over);

                    } else if (number2 > randomNumber) {

                        if (Math.abs(number2 - randomNumber) == 1) { // do tego te liczby bezwzględne
                            System.out.println(hot + s + high + fin + over);
                        } else if (Math.abs(number2 - randomNumber) >= 5) {
                            System.out.print(cold + s + high + fin + over);
                        } else {
                            System.out.print(high + fin + over);
                        }
                    } else if (number2 < randomNumber) {

                        if (Math.abs(number2 - randomNumber) == 1) { // l. bezwzględne zamiast (number2 == randomNumber - 1)
                            System.out.println(hot + low + fin + over);
                        } else if (Math.abs(number2 - randomNumber) >= 5) { // l. bezwzględne zamiast (number2 <= randomNumber - 5)
                            System.out.print(cold + low + fin + over);
                        } else {
                            System.out.print(low);
                        }
                    }
                }
// Czy Ci się podobało? Napisz opinię. Zaczynamy jeszcze raz?:
                System.out.print("\nPodobało ci się?" + "\nWpisz proszę małymi literami: tak, nie lub tak sobie...");

                String answer = in.nextLine();

                System.out.println("Twoja odpowiedź: " + answer);

                String yes = "tak";
                String no = "nie";
                String maybe = "tak sobie";
                String thanksG = "\nDziękuję za wspólną grę!";
                String thanksO = "Dziękuję za Twoją opinię!\n";
                String endN = "Powiedz mi co Ci się nie podobało i co mógłbym ulepszyć.";
                String endP = "Powiedz mi co Ci się podobało, a co mógłbym ulepszyć.";


                if (answer.equals(no)) {
                    System.out.println(endN);
                    String opinionN = in.nextLine();
                    System.out.println(thanksO + thanksG);
                    System.out.println("\nTwoja opinia:" + opinionN);
                    System.out.println("Twój wynik: \npierwszy strzał " + "\ndrugi strzał ");
                } else if (answer.equals(yes) || answer.equals(maybe)) { //ponowna gra lub opinia i koniec
                    System.out.println("\nChcesz zagrać jeszcze raz?" + "\nWpisz małymi literami: tak lub nie");
                    answerCon = in.nextLine(); // nie String answerCon ...> to tworzy zmienną, a my używamy juz zdefiniowaną.

                    if (answerCon.equals(no)) {
                        System.out.println(endP);
                        String opinionP = in.nextLine();
                        System.out.println(thanksO + thanksG);
                        System.out.println("\nTwoja opinia:" + opinionP);
                        System.out.println("\nTwój wynik: \npierwszy strzał: " + "\ndrugi strzał: ");
                    } else if (answerCon.equals(yes)) {  // rozpoczyna ponownie - pętla do...while
                        System.out.println("Zaczynamy!");
                    } else {
                        System.out.println("nie rozumiem co chciałeś powiedzieć..."); //- jak wrócić do pytania?
                    }
                } else if (answer != yes && answer != no && answer != maybe) {
                    System.out.println("\nnie rozumiem co chciałeś powiedzieć...");
                } else { // nie zaczyna gry. kończy.
                }
            }
            while (answerCon.equals("tak"));
        }
        System.out.println("\nDo zobaczenia! Miłego dnia!");
    }

    // do trzeciego sposobu przy losowaniu liczby 1-10.
    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }
}


//przekształcenie do pętli for / zastosowanie break i continue + pętla while / zastosowanie switch przy bloku z opiniami. 