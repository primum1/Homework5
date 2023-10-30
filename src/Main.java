public class Main {
    public static void main(String[] args) {
        // Задание 1
        int [] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] weidhts = {1.57, 7.654, 9.986};
        int[] weidh = {56, 78, 12, 44, 59, 47, 38};
        // Задание 2
        for (int i = 0; i < 12; i++) {
            System.out.print(weight[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(weidhts[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < weidh.length; i++) {
            System.out.print(weidh[i] + ",");
        }
        System.out.println();
        // Задание 3
        for (int i = weight.length-1; i >= 0; i--) {
            System.out.print(weight[i] + ",");
        }
        System.out.println();
        for (int i = weidhts.length-1; i >=0; i--) {
            System.out.print(weidhts[i] + ",");
        }
        System.out.println();
        for (int i = weidh.length-1; i >=0; i--) {
            System.out.print(weidh[i] + ",");
        }
        System.out.println();
        //Задание 4
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] = weight[i] + 1;
            }
        }
        for (int i = 0; i < weight.length - 1; i++) {
            System.out.print(weight[i] + ",");
        }
    }
}