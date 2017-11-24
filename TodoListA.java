
import java.util.ArrayList;
/**
 * 
 * Clase que permite almacenar las tareas pendientes
 */
public class TodoListA
{
    //almacena nuestras tareas
    private ArrayList<String> tareas;
    
    /**
     * Constructor en la clase TodoList. Crea un gestor de 
     * las tareas creadas.
     */
    public TodoListA()
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
    
    /**
     * Devuelve el numero de tareas existentes
     */
    public int getNumeroDeTareas()
    {
        return tareas.size();
    }
    
    /**
     * Muestra el numero de tareas pendientes
     */
    
    public void mostrarNumeroDeTareasPendientes()
    {
        System.out.println(tareas.size());
    }
    
    /**
     * Elimina la tarea que ocupa la posicion indicada como parametro
     * (empezando por 0), devuelve true si elimina tarea
     * false en caso contrario
     */
    
    public boolean eliminarTarea(int posicionTarea)
    {
        //creamos una varible local y la devolvemos
        boolean valorDevolverTarea = false;
        if(posicionTarea >= 0 && posicionTarea < tareas.size()){
            tareas.remove(posicionTarea);
            valorDevolverTarea = true;
        }
                   
        return valorDevolverTarea;
    }
}

