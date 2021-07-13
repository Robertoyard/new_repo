public class Husky {
    public String name;

    public Husky (String s) {
        this.name = s;
    }

    public boolean equals(Object o) {
        Husky other = (Husky) o;
        return this.name.equals(other.name);
    }

    public int hashCode() {
        return this.name.length();
    }
}