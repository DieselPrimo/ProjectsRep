import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logic {
    static int solve(int[] t) {
        int res = 0;
        int sum = 0;
        int max = -10000;
        int firstBad = 0;
        int firstGood = 0;
        int[] counter = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            if (t[i] != 0) {
                firstBad = (i - t[i]) + 1;
                if (firstBad < 0) {
                    counter[firstBad + t.length]--;
                } else
                    counter[firstBad]--;
                firstGood = (i + 1) % t.length;
                counter[firstGood]++;
            }
        }
        for (int i = 0; i < t.length; i++) {
            sum += counter[i];
            if (sum > max) {
                max = sum;
                res = i + 1;
            }
        }
        System.out.println("res= " + res);
        return res;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Input n of students");
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        int[] t = new int[n];
        String string;
        String[] substr;
        string = reader.readLine();
        substr = string.split(" ");
        System.out.println("Input the time for each student");
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(substr[i]);
        }
        solve(t);
    }
}
