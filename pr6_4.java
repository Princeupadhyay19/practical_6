public class pr4 extends Thread {
    public void run() {

    }

    public static void main(String[] args) {
        pr4 FIRST = new pr4();
        pr4 SECOND = new pr4();
        pr4 THIRD = new pr4();

        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);

        System.out.println("Priority of FIRST Thread:" + FIRST.getPriority());
        System.out.println("Priority of SECOND Thread:" + SECOND.getPriority());
        System.out.println("Priority of THIRD Thread:" + THIRD.getPriority());

//Prepared by Prince_21ce148
System.out.println("Prepared by Prince_21ce148");
    }
}

