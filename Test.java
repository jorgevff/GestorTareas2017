
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args)
    {
        System.out.println("Creamos un objeto todoist");
        TodoListA todoist = new TodoListA();
        System.out.println("\nMostramos el numero de tareas");
        todoist.mostrarNumeroDeTareasPendientes();
        System.out.println("\nAñadimos una tarea");
        todoist.addTarea("Estudiar programacion");
        System.out.println("\nAñadimos una tarea");
        todoist.addTarea("Limpiar los armarios");
        System.out.println("\nAñadimos una tarea");
        todoist.addTarea("Comprar fruta");
        System.out.println("\nMostramos todas las tareas");
        todoist.mostrarTareas();
        System.out.println("\nEliminamos una  tarea");
        boolean valorDevuelto;
        valorDevuelto = todoist.eliminarTarea(1);
        System.out.println("\nMostramos todas las tareas");
        System.out.println(valorDevuelto);
        todoist.mostrarTareas();
        System.out.println("\nIntentamos borrar tarea no existente");
       
        todoist.eliminarTarea(4);
        System.out.println(valorDevuelto);
        
    }

}
