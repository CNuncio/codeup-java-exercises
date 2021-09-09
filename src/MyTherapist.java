import java.util.Scanner;
public class MyTherapist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tarotCard = scanner.next();
        do {
            System.out.println("Choose your card. ");

            switch (tarotCard) {
                case "Judgement " -> System.out.println("Be ready to be judged by someone in your life; perhaps it it life itself. Be prepared to make decisions that may have a grand consequence. ");
                case "Moon " -> System.out.println("Something is not as it seems. There is an illusion or perhaps deception afoot. Your intuition and dreams will help uncover this anomoly. ");
                case "Reverse Ace of Pentacles " -> System.out.println("There has been or will be a loss of an opportunity. You did not have the foresight or make plans ahead to secure a financial or abundant gain. ");
                default -> System.out.println("I'm sorry. I do not know this card. ");
            }

        } while (!tarotCard.equals(" "));
    }
}