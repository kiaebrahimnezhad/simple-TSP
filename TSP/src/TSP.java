import java.util.ArrayList;

public class TSP {
    ArrayList<Integer> path = new ArrayList<Integer>();
    int pathWeight = 0;
    int step = 0;
    int selector = 0;

    public int nextStep(int[][] w, int st) {
        int tester = 1000;
        //اضافه کردن راس به مسیر دور
        path.add(st);
        //اگر مرحله آخر یعنی باید به راس شروع برگردیم و حالات غیر پایانی
        if (step == (w.length - 1)) {
            pathWeight += w[st][0];
            path.add(0);
        } else {
            for (int i = 0; i < w.length; i++) {
                // اگر راس مورد آزمایش ، مسیرش 0 نباشد و مسیرش کمترین باشد و جزو رِئوس پیمایش شده نباشد ، راس بعدی ماست
                if (w[st][i] != 0 && w[st][i] <= tester) {
                    if (!path.contains(i)) {
                        tester = w[st][i];
                        selector = i;
                    }
                }
            }
            pathWeight += w[st][selector];
            step += 1;
        }

        return selector;
    }
}
