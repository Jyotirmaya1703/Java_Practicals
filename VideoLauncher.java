import java.util.Scanner;

public class VideoLauncher {

    private static final int ADD_VIDEO = 1;
    private static final int CHECKOUT_VIDEO = 2;
    private static final int RETURN_VIDEO = 3;
    private static final int RECEIVE_RATING = 4;
    private static final int LIST_INVENTORY = 5;
    private static final int EXIT = 6;

    private final Scanner input;
    private final VideoStore videoStore;

    public VideoLauncher() {
        input = new Scanner(System.in);
        videoStore = new VideoStore();
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = getUserChoice();
            processUserChoice(choice);
        } while (choice != EXIT);
        input.close();
    }

    private void displayMenu() {
        System.out.println("\nMAIN MENU\n=========");
        System.out.println(ADD_VIDEO + ". Add Videos");
        System.out.println(CHECKOUT_VIDEO + ". Check Out Video");
        System.out.println(RETURN_VIDEO + ". Return Video");
        System.out.println(RECEIVE_RATING + ". Receive Rating");
        System.out.println(LIST_INVENTORY + ". List Inventory");
        System.out.println(EXIT + ". Exit");
    }

    private int getUserChoice() {
        System.out.print("\nEnter your choice (1-6): ");
        return input.nextInt();
    }

    private void processUserChoice(int choice) {
        switch (choice) {
            case ADD_VIDEO:
                addVideo();
                break;
            case CHECKOUT_VIDEO:
                checkoutVideo();
                break;
            case RETURN_VIDEO:
                returnVideo();
                break;
            case RECEIVE_RATING:
                receiveRating();
                break;
            case LIST_INVENTORY:
                listInventory();
                break;
            case EXIT:
                System.out.println("Exiting Video Launcher...!! Thanks for using the application");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }

    private void addVideo() {
        System.out.print("\nEnter the name of the video you want to add: ");
        String name = input.next();
        videoStore.addVideo(name);
    }

    private void checkoutVideo() {
        System.out.print("\nEnter the name of the video you want to check out: ");
        String name = input.next();
        videoStore.doCheckout(name);
    }

    private void returnVideo() {
        System.out.print("\nEnter the name of the video you want to return: ");
        String name = input.next();
        videoStore.doReturn(name);
    }

    private void receiveRating() {
        System.out.print("\nEnter the name of the video you want to rate: ");
        String name = input.next();
        System.out.print("Enter the rating for the video (1-10): ");
        int rating = input.nextInt();
        videoStore.receiveRating(name, rating);
    }

    private void listInventory() {
        videoStore.listInventory();
    }

    public static void main(String[] args) {
        VideoLauncher launcher = new VideoLauncher();
        launcher.run();
    }
}