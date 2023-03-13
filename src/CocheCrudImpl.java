public class CocheCrudImpl implements Coche_crud{
    String save = "Guardando ....";
    String findAll = "Buscando ....";
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

    @Override
    public  String toString() {
        return "CocheCRUDImpl [save=" + save + ", finAll=" + findAll + ", delete=" + delete + "]";
    }
}
