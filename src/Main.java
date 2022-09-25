public class Main {
    public static void main(String[] args) {
        //Задача1
        System.out.println("Задача1");

        int [] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(number[i]);
        }
        System.out.println();

        float [] liquid = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < 3; i++) {
            System.out.println(liquid[i]);
        }
        System.out.println();

        int [] bookShelf = {20, 15, 17, 13};
        for (int i = 0; i < bookShelf.length; i++) {
            System.out.println(bookShelf[i]);
        }
        System.out.println();

        //Задача2
        System.out.println("Задача2");

        for (int i = 0; i < 3; i++) {
            if (i <2)
            System.out.print(number[i] + ", " );
            else
                System.out.println("" + number[i]);
        }

        for (int i = 0; i < 3; i++) {
            if (i<2)
            System.out.print(liquid[i] + ", ");
            else
                System.out.println("" + liquid[i]);
        }

        for (int i = 0; i < bookShelf.length; i++) {
            if (i<bookShelf.length-1)
            System.out.print(bookShelf[i] + ", ");
            else
                System.out.println("" + bookShelf[i]);
        }
        System.out.println();

        //Задача3
        System.out.println("Задача3");

        for (int i = 2; i >= 0; i--) {
            if (i >= 1)
                System.out.print(number[i] + ", " );
            else
                System.out.println(number[i]);
        }

        for (int i = 1; i >= 0; i--) {
            if (i >= 1)
                System.out.print(liquid[i] + ", ");
            else
                System.out.println("" + liquid[i]);
        }

        for (int i = bookShelf.length-1; i >= 0; i--) {
            if (i>=1)
                System.out.print(bookShelf[i] + ", ");
            else
                System.out.println("" + bookShelf[i]);
        }
        System.out.println();

        //Задача4
        System.out.println("Задача4");
        
        System.out.println("Было");
        for (int i = 0; i < number.length ; i++) {
            if (i < number.length-1)
                System.out.print(number[i] + ", " );
            else
                System.out.println("" + number[i]);
        }
        System.out.println("Стало");
        for (int i = 0; i < number.length; i++) {
            if (number[i]%2!=0)
                number[i]=number[i]+1;
        }
        for (int i = 0; i < number.length; i++) {
            if (i < number.length-1)
                System.out.print(number[i] + ", " );
            else
                System.out.println("" + number[i]);
        }



    }
}