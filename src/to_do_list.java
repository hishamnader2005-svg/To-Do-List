
import java.util.ArrayList;
import java.util.Scanner;

public class to_do_list {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice ) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTask();
                    break;
                case 3:
                    mark();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.err.println("exiting goobye");
                    return;
                default :
                    System.err.println("invalid choice try again");
            }
        }
    }
    public static void displayMenu() {
        System.err.println("To Do list menu");
        System.err.println("1.add a tas");
        System.err.println("2.view a task");
        System.err.println("3.mark task as complete");
        System.err.println("4.delete a task");
        System.err.println("5.exit program");
        System.err.println("enter ur choice");
    }
    public static void	addTask() {
        System.err.println("enter a task");
        String task =sc.nextLine();
        tasks.add(task);
        System.err.println("tas added successfully");
    }

    public static void	viewTask() {
        if (tasks.isEmpty()) {
            System.err.println("no tasks available");
            return;
        }
        System.err.println("print all tasks\n\n");
        for (int i =0; i<tasks.size();i++) {
            System.err.println((i+1)+ "."+ tasks.get(i));
        }
    }
    public static void	mark() {
        if (tasks.isEmpty()) {
            System.err.println("no tasks available");
            return;
        }
        viewTask();
        System.err.println("enter tasks of number to mark as complete");
        int tasknumber = sc.nextInt();
        sc.nextLine();
        if(tasknumber<=0 || tasknumber >  tasks.size()) {
            System.err.println("invalid number ");

        }
        else {
            String complete = tasks.get(tasknumber-1)+ "[completed]";
            tasks.set(tasknumber-1, complete);
            System.err.println("task mared as complete");

        }
    }
    public static void	delete() {
        if (tasks.isEmpty()) {
            System.err.println("no tasks available");
            return;
        }
        viewTask();
        System.err.println("enter tasks of number to mark as delete");
        int tasknumber = sc.nextInt();
        sc.nextLine();
        if(tasknumber<=0 || tasknumber >  tasks.size()) {
            System.err.println("invalid number ");

        }
        else {
            tasks.remove(tasknumber-1);
            System.err.println("tasks deleted succefully");

        }
    }
}
