
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
    public int getNumeroDeTareasPendientes()
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
        //invocando el metodo esValidoElIndice para la comprobacion
        if(esValidoElIndice(posicionTarea)){
            tareas.remove(posicionTarea);
            valorDevolverTarea = true;
        }

        return valorDevolverTarea;
    }

    public boolean esValidoElIndice(int indice)
    {
        boolean indiceValido = false;
        if(indice >= 0 && indice < tareas.size()){
            indiceValido = true;
        }
        return indiceValido;
        /**
         * en una linea
         * return (indice >= 0 && indice < tareas.size());
         */
    }

    /**
     * Metodo que devuelve true en caso de que haya tareas por hacer
     * en caso contrario devuelve false
     */
    public boolean hayTareasPendientes()
    {
        //se declara siempre una variable local cuando se devuelve algo
        boolean valorADevolver = false;
        if(getNumeroDeTareasPendientes() > 0){
            valorADevolver = true;
            
        }
        return valorADevolver;
        /**
         * solucion en una linea
         * isEmpty() de vuelve true si esta vacio, por eso se niega
         * return !tareas.isEmpty();
         * o
         * return (getNumeroDeTareasPendientes() > 0);
         */
    }

}

