/*

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);

            //note99.setContent("انما الهكم الله الذي لا اله الا هو وسع كل شى علما");
            boolean flag= true;
            ToDoS toDoS= new ToDoS();

            while (flag){
                System.out.println("note vs todo");
                String ch= scanner.next();
                switch (ch){
                    case "note":
                        System.out.println("new note p:1, view notes p:2");
                        int n= scanner.nextInt();
                        if (n==1){
                            Notes notes= new Notes();
                            notes.n();
                            break;
                        }
                        else if (n==2){
                            Notes notes= new Notes();
                            notes.s();
                            break;
                        }

                    case "todo":
                        System.out.println("new todo p:1, view todos p:2");
                        int d= scanner.nextInt();
                        if (d==1){
                            toDoS.n();
                            break;
                        }
                        else if (d==2){
                            toDoS.s();
                            break;
                        }
                    case "xx":
                        System.out.println("exit");
                        System.exit(0);
                        flag= false;
                        break;

                }
            }


        }
    }
    */
