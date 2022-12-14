import java.util.ArrayList;

public class task003 {

    static ArrayList<String> allRoutes = new ArrayList<>();

    static void runFunc(int a, int b, int c, int d, String way) {
        if (a == b) {
            allRoutes.add(way);
        }
        if (a < b) {
            runFunc(a * c, b, c, d, way + "*" + c + " ");
            runFunc(a + d, b, c, d, way + "+" + d + " ");
        }
    }

    static String minWay(ArrayList<String> arr) {

        String minWay = arr.get(0);

        for (String elem : arr) {

            if (elem.length() < minWay.length()) minWay = elem;

        }
        return minWay;
    }

    public static void main(String[] args) {

        int a = 11;
        int b = 7;
        int c = 2;
        int d = 1;
        runFunc(a, b, c, d, a + " ");

        if (allRoutes.isEmpty())
            System.out.println("Решений нет!");
        else {

            StringBuilder route = new StringBuilder();

            route.append("Все варианты решений:\n\n");

            for (String elem : allRoutes) {

                route.append(elem).append(" = ").append(b);
                route.append("\n");

            }

            route.append("\n");
        }
    }
}
