package t.FibonacciSeries;

public class Main {
	public static void main(String[] args) {

        int first = 0;
        int second = 1;

		
        System.out.print(first + ", " + second);

        while (true) {
            int next = first + second;

            if (next >= 50) {
                break;
            }

            System.out.print(", " + next);

            first = second;
            second = next;
        }


	}


}
