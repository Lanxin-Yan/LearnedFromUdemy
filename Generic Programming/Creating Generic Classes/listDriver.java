public class listDriver {
    public static void main(String[] args){
        list<String> cars = new list<String>(20); 
        cars.add("Audi");
        cars.add("Range Rover");
        cars.add("Aston Martin");
        System.out.println("My favs car brands list: " + cars.toString());

        list<Integer> numbs = new list<Integer>(2); 
        numbs.add(8);
        numbs.add(6);
        System.out.println("My list of lucky numbers: " + numbs.toString());
    }
}
