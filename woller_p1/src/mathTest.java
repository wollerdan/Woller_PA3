import java.security.SecureRandom;
import java.util.Scanner;

public class mathTest {
    static void correctStatement(int a)
    {
        switch(a)
        {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
            default:
                break;
        }
    }

    static void wrongStatement(int a)
    {
        switch(a)
        {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don’t give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner scan = new Scanner(System.in);
        int i = 0, correctCount = 0, difficultyAns, difficulty = 0, type = 0;
        boolean game = true;

        while(game)
        {
            System.out.println("Please select your difficulty 1-4: ");
            difficultyAns = scan.nextInt();
            System.out.println("Please select your arithmetic type 1-5: ");
            type = scan.nextInt();
            switch (difficultyAns) {
                case 1:
                    difficulty = 9;
                    break;
                case 2:
                    difficulty = 99;
                    break;
                case 3:
                    difficulty = 999;
                    break;
                case 4:
                    difficulty = 9999;
                    break;
                default:
                    break;
            }
            i = 0;
            while (i < 10) {
                int rand1 = rand.nextInt(difficulty) + 1;
                int rand2 = rand.nextInt(difficulty) + 1;
                double userAnswer, answer = 0;
                boolean correct = false;


                switch (type) {
                    case 1:
                        answer = rand1 + rand2;
                        System.out.print("How much is " + rand1 + " plus " + rand2 + "? ");
                        break;
                    case 2:
                        answer = rand1 * rand2;
                        System.out.print("How much is " + rand1 + " time " + rand2 + "? ");
                        break;
                    case 3:
                        answer = rand1 - rand2;
                        System.out.print("How much is " + rand1 + " subtracted by " + rand2 + "? ");
                        break;
                    case 4:
                        answer = (double)rand1 / rand2;
                        System.out.print("How much is " + rand1 + " divided by " + rand2 + "? ");
                        break;
                    case 5:
                        int randomQuestion = rand.nextInt(3) + 1;
                        switch (randomQuestion) {
                            case 1:
                                answer = rand1 + rand2;
                                System.out.print("How much is " + rand1 + " plus " + rand2 + "? ");
                                break;
                            case 2:
                                answer = rand1 * rand2;
                                System.out.print("How much is " + rand1 + " time " + rand2 + "? ");
                                break;
                            case 3:
                                answer = rand1 - rand2;
                                System.out.print("How much is " + rand1 + " subtracted by " + rand2 + "? ");
                                break;
                            case 4:
                                answer = (double)rand1 / rand2;
                                System.out.print("How much is " + rand1 + " divided by " + rand2 + "? ");
                                break;
                        }
                }
                userAnswer = scan.nextDouble();
                if (Math.abs(answer - userAnswer) < 0.01) {
                    correctCount++;
                    int statement = rand.nextInt(3) + 1;
                    correctStatement(statement);
                } else {
                    int statement = rand.nextInt(3) + 1;
                    wrongStatement(statement);
                }

                i++;
            }
            double percentageCorrect = ((double) correctCount / 10) * 100;
            if (percentageCorrect >= 75) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            } else {
                System.out.println("Please ask your teacher for extra help.");
            }

            System.out.println("Test another student? (y/n): ");

            char choice = scan.next().charAt(0);

            if (choice == 'y') {
                continue;
            } else if (choice == 'n') {
                game = false;
            }
        }
    }
}
