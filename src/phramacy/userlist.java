package phramacy;


import java.util.ArrayList;
import java.util.Scanner;
public class userlist {
            public  int totalusers = user.count;
            public ArrayList<user> users=new ArrayList<>();
            Scanner scanner=new Scanner(System.in);

    public userlist(){
                runprogram();
                printALLuser();
            }
            public void runprogram(){
                String cont,name;


                while (true){
                    System.out.println("enter the customer name");

                    name = scanner.nextLine();
                    users.add(new user (name));
                    System.out.println("do want to continue?y/n");
                    cont= scanner.next();
                    scanner.nextLine();
                    if (cont.equals("no"));
                    break;
                }

            }

    public void printALLuser(){
        System.out.println("ALLuser count:"+totalusers);
        for (user user:users){
            user.printUesrname();

        }
    }
}



