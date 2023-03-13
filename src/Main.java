public class Main {
    public static void main(String[] args) {

        Coche_crud coche = new CocheCrudImpl();
        coche.save();
        coche.findAll();
        coche.delete();

        System.out.println(coche);


    }
}