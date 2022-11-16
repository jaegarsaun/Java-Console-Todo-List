import java.util.Scanner;
import todoList.todoList;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        todoList newAction = new todoList();

        //Welcome Screen
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Welcome, User.");
        System.out.println("Type 'Start' to start your Todo-List");
        System.out.println("--------------------------------------------------------------------------------------------");

        String start = input.nextLine();
        start = start.toLowerCase();
        boolean active;

        if(start.equals("start")){
            active = true;
        }else{
            active = false;
        }

        while(active){
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("Choose an action...");
            System.out.println("(1) Display List");
            System.out.println("(2) Add item to list");
            System.out.println("(3) Remove item from list");
            System.out.println("(4) Mark item as done");
            System.out.println("(5) Edit item name");
            System.out.println("(6) Exit");

            int userInput = input.nextInt();
            input.nextLine();
            switch(userInput){
                case 1:
                    newAction.printList();
                    break;
                case 2:
                    newAction.addItem();
                    break;
                case 3:
                    newAction.removeItem();
                    break;
                case 4:
                    newAction.itemComplete();
                    break;
                case 5:
                    newAction.editItem();
                    break;
                case 6:
                    System.out.println("Are you sure you want to exit? If you do so, all your data will be lost! (Yes/No");
                    String check = input.nextLine();
                    check = check.toLowerCase();
                    if(check.equals("yes")){
                        System.out.println("Thank you, come again.");
                        System.exit(0);

                    }

            }
        }
    }
}