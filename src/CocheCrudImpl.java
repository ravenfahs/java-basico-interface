public class CocheCrudImpl implements Coche_crud{
    String save = "Guardando ....";
    String findAll = "Buscando todo ....";
    String delete = "Eliminando ....";
    @Override
    public void save() {
        System.out.println("Se esta ejecutando la tarea..." + save);
    }

    @Override
    public void findAll() {
        System.out.println("Se esta ejecutando la tarea..." + findAll);
    }

    @Override
    public void delete() {
        System.out.println("Se esta ejecutando la tarea..." + delete);
    }
}
