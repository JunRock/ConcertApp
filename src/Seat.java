public class Seat {//10개의 좌석존재
    String S[] = new String[10];
    String A[] = new String[10];
    String B[] = new String[10];

    public Seat() {
    }

    public void SetS(String[] S) {
        this.S = S;
        System.out.print("S>>");
        for (String s : S) {
            if (s == null)
                System.out.print("___ ");
            else
                System.out.print(s + " ");
        }
        System.out.println();
    }

    public void SetA(String[] A) {
        this.A = A;
        System.out.print("A>>");
        for (String a : A) {
            if (a == null)
                System.out.print("___ ");
            else
                System.out.print(a + " ");
        }
        System.out.println();
    }

    public void SetB(String[] B) {
        this.B = B;
        System.out.print("B>>");
        for (String b : B) {
            if (b == null)
                System.out.print("___ ");
            else
                System.out.print(b + " ");
        }
        System.out.println();
    }
}

