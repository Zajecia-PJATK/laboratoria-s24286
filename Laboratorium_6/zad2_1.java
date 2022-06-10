import java.util.*;

class Hamster {
    private int hamsterNumber;
    private String hamsterName;
    Hamster(int i) { hamsterNumber = i; }
    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber;
    }
    public String getHamsterName() {
        return hamsterName;
    }
    public void setHamsterName(String name) {
        hamsterName = name;
    }
}

class Printer {
    static void printAll(List <Hamster> hl) {
        for (Hamster hamster : hl) {
            System.out.println(hamster.hamsterNumber());
        }
    }
}

class HamsterMaze {
    public static void main(String[] args) {
        List<Hamster> v = new ArrayList<Hamster>();
        Map<String, Hamster> hamsterMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
            v.add(new Hamster(i));

        for (int i = 0; i < 3; i++) {
            int id;
            String name;
            Hamster hamster;

            try {
                System.out.print("Podaj id chomika:");
                id = scanner.nextInt();
                if (id < 0) throw new InputMismatchException();
                System.out.print("Podaj imię chomika:");
                name = scanner.next();
            } catch (Exception exception) {
                scanner.nextLine();
                System.out.println("ID chomika musi być liczbą naturalną!");
                System.out.print("Podaj id chomika:");
                id = scanner.nextInt();
                System.out.print("Podaj imię chomika:");
                name = scanner.next();
            }
            hamster = new Hamster(id);
            hamster.setHamsterName(name);
            hamsterMap.put(hamster.getHamsterName(), hamster);
        }


        Printer.printAll(v);
        for (String key : hamsterMap.keySet()) {
            System.out.println(key);
        }
    }
}
