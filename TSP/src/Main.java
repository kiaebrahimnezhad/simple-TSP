import java.util.ArrayList;

public class Main {

    public static void findTSP(int[][] w) {
        TSP tsp = new TSP();
        //پیمایش مرحله به مرحله برای پیدا کردن راس بعدی
        int nextNode = 0;
        for (int i = 0; i < w.length; i++) {
            nextNode = tsp.nextStep(w, nextNode);
        }
        //چاپ مسیر بهینه و وزن مسیر
        System.out.print("The Path Is : ");
        for (int i : tsp.path) {
            System.out.print("(" + i + ") ");
        }
        System.out.println("The Total Weight Is : " + tsp.pathWeight);
    }

    public static void main(String[] args) {
        int[][] w = {
                {0, 2, 2, 1, 4},
                {2, 0, 3, 2, 3},
                {2, 3, 0, 2, 2},
                {1, 2, 2, 0, 4},
                {4, 3, 2, 4, 0}
        };
        System.out.println("گراف داده شده در pdf مساله");
        findTSP(w);
        System.out.println("----------");

        int[][] secW = {
                {0, 1, 2, 5},
                {1, 0, 1, 3},
                {2, 1, 0, 4},
                {5, 3, 4, 0}
        };
        System.out.println("گراف تستی");
        findTSP(secW);
    }
}