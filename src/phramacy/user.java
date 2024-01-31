package phramacy;

import java.util.ArrayList;
import java.util.Scanner;

public class user {
    public static int count = 0;
    public String username;
    public ArrayList<String> medicinelist = new ArrayList<>();
    Scanner scanner= new Scanner(System.in);
    public user (String username){
        count++;
        this.username=username;
        getmedicinelist();
        printmedicinelist();


    }
    public void getmedicinelist(){
        String medicine,cont,name;
        while (true){
            System.out.println("enter the medicine");
             medicine = scanner.nextLine();
            medicinelist.add(medicine);
            System.out.println("do you want to add medicine?y/n");
            cont=scanner.next();
            if(cont.equals("n")){
                break;
            }scanner.nextLine();

        }
    }
    public void printmedicinelist(){
        System.out.println("name:"+this.username);
        System.out.println("=====================");
        System.out.println("medicinelist");
        System.out.println("=====================");
        for (String medname:medicinelist){
            System.out.println("medname");

        }
        System.out.println("===================");

    }
    public void printUesrname(){
        System.out.println(this.username);
    }
}
