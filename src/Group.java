public class Group {

    public Group() {
    }

    Seat se = new Seat();
    String[] a = new String[10];

    public void group(String a[], String name, int seatno) {
        if (a[seatno - 1] != null) {
            System.out.println("이미 예약된 좌석입니다.");
            return;
        }
        a[seatno - 1] = name;
    }

    public boolean cancel(String a[], String name) {
        if (name != null) {
            for (int i = 0; i < 10; i++) {
                if (name.equals(a[i])) {
                    a[i] = "___ ";
                    return true;
                }
            }
            System.out.println("예약자 명을 찾을 수 없습니다.");
        }
        return false;
    }
}


