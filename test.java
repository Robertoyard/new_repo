import java.util.*;
class test {
    public static void main(String[] args) {
        HashMap<Husky, Integer> map = new HashMap<>();
        Husky a = new Husky("jeter");
        Husky b = new Husky("diana");

        map.put(a, 1);
        map.put(b, 2);

        a.name += a.name;
        map.put(a, 3);
        map.put(b, 4);

        b.name += b.name;
        map.put(b, 5);

        System.out.println(map.size());
        System.out.println(map.toString());
        for (Husky each: map.keySet()) {
            System.out.println(each.name + " " + map.get(each));
        }
        System.out.println(a.name);
    }
}