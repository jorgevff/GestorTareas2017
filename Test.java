
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
    
    public void test2()
    {
        System.out.println("Creamos un objeto todoist");
        TodoListA todoist = new TodoListA();
        System.out.println("\nAñadimos 4 tareas");
        todoist.addTarea("Estudiar programacion");
        todoist.addTarea("Limpiar la cocina");
        todoist.addTarea("Salir a comprar");
        todoist.addTarea("Estudiar Sistemas");
        System.out.println("Motramos las tareas existentes numeradas");
        todoist.mostrarTareasNumeradas();
        System.out.println("\nBorramos la primera tarea coincidente que contenga \n##Estudiar##");
        todoist.eliminaPrimeraTareaCoincidente("Estudiar");
        System.out.println("Motramos las tareas existentes numeradas");
        todoist.mostrarTareasNumeradas();
        
            
    }
    
    public void test3()
    {
        System.out.println("Creamos un objeto todoist");
        TodoListA todoist = new TodoListA();
        System.out.println("\nAñadimos 4 tareas");
        todoist.addTarea("Estudiar programacion");
        todoist.addTarea("Limpiar la cocina");
        todoist.addTarea("Salir a comprar");
        todoist.addTarea("Estudiar Sistemas");
        System.out.println("Motramos las tareas existentes numeradas");
        todoist.mostrarTareasNumeradas();
        System.out.println("\nBorramos todas las tareas que contengan la palabra \n##Estudiar##");
        todoist.eliminaTodasTareasCoincidentes("Estudiar");
        System.out.println("Motramos las tareas existentes numeradas");
        todoist.mostrarTareasNumeradas();
       
    }

}
