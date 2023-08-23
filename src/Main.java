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



    }
}
