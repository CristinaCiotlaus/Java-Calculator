import java.io.*;
import java.util.Scanner;
import java.util.NoSuchElementException;
class Main {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to Java Calculator");
        while(true){
            System.out.println(" Insert x ,/ ,- or + ");
            try {
                Scanner sc = new Scanner(System.in);
                String a = sc.nextLine();
                if (a.equals("x")) {
                    System.out.println(" First number to multiply ");
                    Scanner sa = new Scanner(System.in);
                    String b = sc.nextLine();
                    System.out.println(" Second number to multiply ");
                    Scanner sn = new Scanner(System.in);
                    String c = sc.nextLine();
                    int d = Integer.parseInt(c);
                    int e = Integer.parseInt(b);
                    System.out.println(d * e);
                }

                else if (a.equals("/")) {
                    System.out.println(" First number to divide ");
                    Scanner se = new Scanner(System.in);
                    String f = se.nextLine();
                    System.out.println(" Second number to divide ");
                    Scanner sr = new Scanner(System.in);
                    String g = sr.nextLine();
                    int h = Integer.parseInt(f);
                    int i = Integer.parseInt(g);
                    System.out.println(h / i);
                }
                if (a.equals("-")) {
                    System.out.println(" First number to subtract ");
                    Scanner as = new Scanner(System.in);
                    String j = as.nextLine();
                    System.out.println(" Second number to subtract ");
                    Scanner ac = new Scanner(System.in);
                    String k = ac.nextLine();
                    int l = Integer.parseInt(j);
                    int m = Integer.parseInt(k);
                    System.out.println(l - m);
                }
                if (a.equals("+")) {
                    System.out.println(" First number to add ");
                    Scanner aa = new Scanner(System.in);
                    String n = aa.nextLine();
                    System.out.println(" Second number to add ");
                    Scanner scanner1 = new Scanner(System.in);
                    String o = scanner1.nextLine();
                    scanner1.close();
                    int p = Integer.parseInt(o);
                    int q = Integer.parseInt(n);
                    int r = q + p;
                    System.out.println(r);
                }
            } catch (Exception e) {
                System.out.println("Incorrect Input, please put valid integers");
            }
            System.out.println(" Type exit to leave or press 1 to keep going ");
            Scanner scanner2 = new Scanner(System.in);
            String z = scanner2.nextLine();

            if (z.equalsIgnoreCase("exit")) {
                break;
            }

        }


    }

}