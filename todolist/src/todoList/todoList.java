package todoList;

import java.util.ArrayList;
import java.util.Scanner;

public class todoList {

    Scanner input = new Scanner(System.in);
    ArrayList<String> todoList = new ArrayList<String>();
    ArrayList<String> todoStatus = new ArrayList<String>();
    ArrayList<String> dueDate = new ArrayList<String>();
    ArrayList<String> todoDesc = new ArrayList<String>();

    // Display list
    public void printList(){
        if(todoList.isEmpty()){
            System.out.println("No items in todo list.");
        }else{
            for(int i = 0; i < todoList.size(); i++){
                System.out.println((i+1) + "." + " " + todoList.get(i) + " // Finish by: " + dueDate.get(i) + " // Status: " + todoStatus.get(i));
                System.out.println("Description: " + todoDesc.get(i));
            }
        }


    }

    // Add Item to list
    public void addItem(){
        System.out.println("What is the name of your todo?");
        todoList.add(input.nextLine());
        todoStatus.add("Not Complete");
        System.out.println("When do you want this completed by? (MM/DD/YYYY)");
        dueDate.add(input.nextLine());
        System.out.println("What is the description of this todo?");
        todoDesc.add(input.nextLine());
    }

    // Remove Item from list
    public void removeItem(){
        System.out.println("What # item would you like to remove?");

        int removeIndex = input.nextInt();
        removeIndex = removeIndex - 1;

        todoList.remove(removeIndex);
        todoStatus.remove(removeIndex);
        dueDate.remove(removeIndex);
    }

    // Mark item as complete
    public void itemComplete(){
        System.out.println("What # item is completed?");


        int statusIndex = input.nextInt();
        statusIndex = statusIndex - 1;

        todoStatus.set(statusIndex, "Completed");
    }

    //Edit item
    public void editItem(){
        System.out.println("What # item do you want to edit?");
        int editIndex = input.nextInt();
        input.nextLine();
        editIndex = editIndex -1;
        System.out.println("What is the new name for this item?");
        todoList.set(editIndex, input.nextLine());

    }

}
