public class Main {
    public static void main(String[] args) {

        /* 1, 2 задание */
//1
        int [] height = new int[3];
        for (int i=0; i < height.length; i++) {
            height[i] = i + 1;
            if (i == height.length - 1) {
                System.out.print(height[i]);
                break;
            }
            System.out.print (height[i] + ", ");
        }
        System.out.println();
//2

        double [] grams = {1.57, 7.654, 9.986};
        for (int a = 0; a < grams.length; a++) {
            if (a == grams.length - 1) {
                System.out.print(grams[a]);
                break;
            }
            System.out.print (grams[a] + ", ");
        }
        System.out.println();
//3

        int [] grade = {5, 4, 5, 3, 4, 4, 5, 3};
        for (int b=0; b < grade.length; b++) {
            if (b == grade.length - 1) {
                System.out.print(grade[b]);
                break;
            }
            System.out.print (grade[b] + ", ");
        }
        System.out.println();

        /* 3 задание */
//1
        int [] mice = new int[3];
        for (int i= mice.length-1; i>=0; i--) {
            mice[i] = i + 1;
            if (i == 0) {
                System.out.print(mice[i]);
                break;
            }
            System.out.print(mice[i] + ", ");
        }
        System.out.println();


//2

        double [] kilo = {1.57, 7.654, 9.986};
        for (int a = kilo.length-1; a >=0; a--) {
            if (a == 0) {
                System.out.print(kilo[a]);
                break;
            }
            System.out.print (kilo[a] + ", ");
        }
        System.out.println();
//3

        int [] gradesForToday = {5, 4, 5, 3, 4, 4, 5, 3};
        for (int b=gradesForToday.length-1; b >=0; b--) {
            if (b == 0) {
                System.out.print(gradesForToday[b]);
                break;
            }
            System.out.print (gradesForToday[b] + ", ");
        }
        System.out.println();

        /* 4 задание */

        int [] birds = new int[3];
        for (int c=0; c < birds.length; c++) {
            birds[c] = c+1;
            if (birds[c] % 2 != 0) {
                System.out.print(birds[c] + 1 + " ");
            } else {
                System.out.print(birds[c] + " ");
            }

        }
        System.out.println();

    }
}
