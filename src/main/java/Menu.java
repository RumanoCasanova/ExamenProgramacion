import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        System.out.println("Menú principal:");
        System.out.println("1. Personas");
        System.out.println("2. Tareas");
        System.out.println(("3. Salir"));
        System.out.println("Opción:");
        String opcion = scanner.nextLine();
        if (opcion.equals("1")){
            menuPersonas();
        }else if (opcion.equals("2")){
            menuTarea();
        }else if (opcion.equals("3")){
            System.out.println("Salir");
            return;
        }
    }
    private void menuPersonas(){
        System.out.println("Menú de Personas:");
        System.out.println("1. Introducir");
        System.out.println("2. Mostrar");
        System.out.println("3. Eliminar");
        String opcion = scanner.nextLine();
        if (opcion.equals("1")){
            nuevaPersona();
        }else if (opcion.equals("2")){

        }else if (opcion.equals("3")){

        }System.out.println();
        return;
    }
    private void nuevaPersona(){
        System.out.println("Nueva persona:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

    }
    private void menuTarea(){
        System.out.println("Menú de Tareas:");
        System.out.println("1. Introducir");
        System.out.println("2. Mostrar");
        System.out.println("3. Eliminar");
        String opcion = scanner.nextLine();
        if (opcion.equals("1")){
           nuevaTarea();
        }else if (opcion.equals("2")){

        }else if (opcion.equals("3")){

        }
        System.out.println();
        return;
    }
    private void nuevaTarea(){
        System.out.println("A quién vas a encargar la tarea?");
        System.out.println("Urgencia (alta|media|baja): ");
        System.out.print("Nombre para la tarea: ");
        String tarea = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();

    }
}
