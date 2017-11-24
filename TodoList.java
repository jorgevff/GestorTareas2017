import java.util.ArrayList;
/**
 * 
 * Clase que permite almacenar las tareas pendientes
 */
public class TodoList
{
    //almacena nuestras tareas
    private ArrayList<String> tareas;
    
    /**
     * Constructor en la clase TodoList. Crea un gestor de 
     * las tareas creadas.
     */
    public TodoList()
    {
        tareas = new ArrayList<String>();
    }

    /**
     * Inserta la tarea especificada en la posicion indicada
     */

    public void addTarea(String nombreTarea)
    {
        tareas.add(nombreTarea);

    }

    /**
     * Muestra por pantalla todas las tareas
     */
    public void mostrarTareas()
    {
        System.out.println(tareas);
    }

}

