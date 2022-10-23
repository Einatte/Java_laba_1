
public class Main {
    public static void main(String[] args) {
        List l = new List();

        System.out.println(l.get_elem(1));

        for (int i = 0; i <= 100; i++) {
            l.add_back(i + 1);
        }

        l.print_all();

        System.out.println(l.get_elem(0));
        l.add_back(101);
        l.add_front(-1);
        l.del_elem(1);
        l.print_all();
    }
}