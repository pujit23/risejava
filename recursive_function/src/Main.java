class Main {
    static int cnt = 0;

    static void print() {

       // base condition
        if (cnt == 3) return;
        System.out.println(cnt);

        // Count
        cnt = cnt + 1;
        print();

    }

    public static void main(String[] args) {
        print();
    }
}