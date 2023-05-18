import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        // initialize an empty ArrayList
        ArrayList<String> my_list = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        int choice;
        String item;

        do {
            // display menu
            System.out.println("\nMenu:");
            System.out.println("1. Insert an item");
            System.out.println("2. Delete an item");
            System.out.println("3. Display the list");
            System.out.println("4. Search for an item");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // insert an item into the list
                    System.out.print("Enter item to be inserted: ");
                    input.nextLine(); // clear the buffer
                    item = input.nextLine();
                    my_list.add(item);
                    System.out.println("'" + item + "' has been added to the list.");
                    break;

                case 2:
                    // delete an item from the list
                    System.out.print("Enter item to be deleted: ");
                    input.nextLine(); // clear the buffer
                    item = input.nextLine();
                    if (my_list.contains(item)) {
                        my_list.remove(item);
                        System.out.println("'" + item + "' has been removed from the list.");
                    } else {
                        System.out.println("'" + item + "' is not in the list.");
                    }
                    break;

                case 3:
                    // display the list
                    System.out.println("The list contains:");
                    for (String str : my_list) {
                        System.out.println(str);
                    }
                    break;

                case 4:
                    // search for an item in the list
                    System.out.print("Enter item to be searched: ");
                    input.nextLine(); // clear the buffer
                    item = input.nextLine();
                    if (my_list.contains(item)) {
                        System.out.println("'" + item + "' is in the list.");
                    } else {
                        System.out.println("'" + item + "' is not in the list.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 0);

        input.close();
    }
}
