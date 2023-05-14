import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to Java Calculator");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Insert x, /, -, or +");
            String a = sc.nextLine();
            try {
                if (a.equals("x")) {
                    System.out.println("First number to multiply:");
                    String b = sc.nextLine();
                    System.out.println("Second number to multiply:");
                    String c = sc.nextLine();
                    int d = Integer.parseInt(c);
                    int e = Integer.parseInt(b);
                    System.out.println(d * e);
                } else if (a.equals("/")) {
                    System.out.println("First number to divide:");
                    String f = sc.nextLine();
                    System.out.println("Second number to divide:");
                    String g = sc.nextLine();
                    int h = Integer.parseInt(f);
                    int i = Integer.parseInt(g);
                    System.out.println(h / i);
                } else if (a.equals("-")) {
                    System.out.println("First number to subtract:");
                    String j = sc.nextLine();
                    System.out.println("Second number to subtract:");
                    String k = sc.nextLine();
                    int l = Integer.parseInt(j);
                    int m = Integer.parseInt(k);
                    System.out.println(l - m);
                } else if (a.equals("+")) {
                    System.out.println("First number to add:");
                    String n = sc.nextLine();
                    System.out.println("Second number to add:");
                    String o = sc.nextLine();
                    int p = Integer.parseInt(o);
                    int q = Integer.parseInt(n);
                    int r = q + p;
                    System.out.println(r);
                } else {
                    System.out.println("Invalid input");
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input, please enter valid integers");
            }
            System.out.println("Type 'exit' to leave or press any key to continue");
            String z = sc.nextLine();
            if (z.equalsIgnoreCase("exit")) {
                break;
            }
        }
        sc.close();
    }
}
