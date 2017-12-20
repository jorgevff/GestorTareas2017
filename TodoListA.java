
import java.util.ArrayList;
/**
 * 
 * Clase que permite almacenar las tareas pendientes
 */
public class TodoListA
{
    //almacena nuestras tareas
    private ArrayList<String> tareas;
    
    private boolean tareaCompletada;

    /**
     * Constructor en la clase TodoList. Crea un gestor de 
     * las tareas creadas.
     */
    public TodoListA()
    {
        tareas = new ArrayList<String>();
        tareaCompletada = false;
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

    /**
     * Metodo que imprime todas las tareas existentes, una por linea
     * el metodo imprime el numero de posicion de la tarea antes 
     * del nombre de la tarea, si la tarea esta completada, estonces muestra
     * una "[x]" delante de la tarea, si no esta completada muestra un "[ ]"
     */
    public void mostrarTareasNumeradas()
    {
        //declaramos una variable local
        int numeroPosicion = 1;
        //bucle for each declara una variable String llamada tarea
        //se va guardando cada elemento de tareas
        for (String tarea : tareas){
            if(tarea.substring(0, 1).equals("@")){
                
                System.out.println("[x]" + numeroPosicion + ". " + tarea);
            }
            else{
                System.out.println("[ ]" + numeroPosicion + ". " + tarea);
            }
                numeroPosicion++;
        }
    }

    /**
     * muestra solo las tareas en posiciones impares sin numero
     * delante ni nada
     */
    public void mostrarTareasEnPosicionImpar()
    {
        //bucle for each declara una variable String llamada tarea
        //se va guardando cada elemento de tareas
        int indiceTarea = 1;
        for (String tarea : tareas){
            //si la condicion es verdadera imprime, en este caso que el resto n % 2 no sea 0
            if((indiceTarea % 2) != 0){
                System.out.println(tarea);
            }
            indiceTarea++;

        }
    }

    /**
     * Muestra por pantalla todas las tareas que contiene el texto
     * indicado como parametro una en cada linea, y ademas muestra un mensaje al final
     * el numero de coincidencias encontradas. Si no hay ninguna 
     * que contenga el texto a buscar, informa de la situacion. Este metodo es
     * insensible a mayusculas o minusculas
     * 
     */

    public void mostrarCoincidentes(String textoABuscar)
    {

        int totalTareasCoincidentes = 0;
        for (String tarea : tareas){
            //compara textoABuscar dentro de tarea
            //toLowerCase metodo que pasa a minuscula el texto
            if(tarea.toLowerCase().contains(textoABuscar.toLowerCase())){
                System.out.println(textoABuscar);
                totalTareasCoincidentes++;
            }

        }
        if(totalTareasCoincidentes !=0){
            System.out.println("Hay " + totalTareasCoincidentes + " coincidencias");
        }
        else {
            System.out.println("No hay coincidencias");
        }
    }

    /**
     * Muestra por pantalla la primera tarea que contenga el texto indicado como
     * parametro. En caso de que no haya ninguna coincidencia no muestra nada
     */
    public void mostrarPrimeraCoincidencia(String textoABuscar)
    {
        boolean impresoCoincidente = false;
        for (String tarea : tareas){
            if(tarea.toLowerCase().contains(textoABuscar.toLowerCase())){
                if(!impresoCoincidente){

                    System.out.println(tarea);
                    impresoCoincidente = true;
                }

            }
        }
    }

    /**
     * Muestra por pantalla todas las tareas existentes, una por linea
     * usando un bucle while
     */
    public void mostrarTareas2()
    {
        int posicion = 0;
        while(posicion < tareas.size()){
            System.out.println(tareas.get(posicion));
            posicion++;
        }
    }

    /**
     * Muestra las tareas numeradas usando un bucle while
     */
    public void mostrarTareasNumeradas2(){
        int posicion = 0;
        while(posicion < tareas.size()){
            System.out.println((posicion + 1) + ". " + tareas.get(posicion) );
            posicion++;
        }
    }

    /**
     * Muestra por pantalla las primeras n tareas (siendo n un parametro)
     * en caso de que no haya suficientes tareas muestra solo las que haya
     */
    public void mostrarNPrimerasTareas(int nTareas)
    {
        int posicion = 0;
        while(posicion < nTareas && posicion < tareas.size()){
            System.out.println(tareas.get(posicion));
            posicion++;
        }
    }

    /**
     * Devuelve true si hay al menos una  tarea que contenga el texto indicado
     * como parametro y false en caso contrario. El metodo se debe ejecutar de la 
     * manera mas rapida posible
     */
    public boolean hayTareaCoindicente(String textoABuscar)
    {
        boolean tareaCoincidente = false;

        int posicion = 0;
        while (posicion < tareas.size() && tareaCoincidente == false){
            if(tareas.get(posicion).contains(textoABuscar)){

                tareaCoincidente = true;
            }
            posicion++;
        }

        return tareaCoincidente;
    }
    /**
     * Devuelve true si hay al menos una tarea que contenga el texto indicado
     * como parametro y false en caso contrario. el metodo con un for each
     */
    public boolean hayTareaCoincidente(String textoABuscar)
    {
        boolean aDevolver = false;
        for(String tarea : tareas){
            if(tarea.contains(textoABuscar)){
                aDevolver = true;
            }
            
        }
        return aDevolver;
        
        
    }
    /**
     * Devuelve true si hay al menos una tarea que contenga el texto a buscar
     * como parametro y false en caso contrario. se debe usar el bucle while al ser 
     * mas eficiente
     */
    public boolean hayTareaCoincidenteEficiente(String textoABuscar)
    {
        boolean hayTareaCoincidente = false;
        String tarea = "";
        int contador = 0;
        
        while (contador < tareas.size() && hayTareaCoincidente == false){
            tarea = tareas.get(contador);
            if(tarea.contains(textoABuscar)){
                hayTareaCoincidente = true;
            }
            contador++;
        }
        return hayTareaCoincidente;
        
        
    }
    /**
     * Elimina la primera tarea qu contiene el texto indicado 
     * por parametro
     */
    public void eliminaPrimeraTareaCoincidente(String textoABuscar){
     
        String tareaAEliminar = "";
        boolean primeraTareaABorrar = false;
        int posicion = 0;
        while(posicion < tareas.size() && primeraTareaABorrar == false){
            tareaAEliminar = tareas.get(posicion);
            if(tareaAEliminar.contains(textoABuscar)){
                tareas.remove(posicion);
                primeraTareaABorrar = true;
            }
            posicion++;
        }
            
        
    }
    
    /**
     * Elimina las tareas que contienen el texto a  buscar
     */
    public void eliminaTodasTareasCoincidentes (String textoABuscar)
    {
       String tareasAEliminar = "";
       int posicion = 0;
       while(posicion < tareas.size()){
           tareasAEliminar = tareas.get(posicion);
           if(tareasAEliminar.contains(textoABuscar)){
               tareas.remove(tareasAEliminar);
            }
            posicion++;
        }
        
    }
    
    /**
     * Marcar como completada la tarea indicada como parametro. 
     * Por ejemplo si el parametro es 0 marca como 
     * completada la primera tarea, si es la segunda la segunda...
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        String tarea = tareas.get(indiceTarea);
        tarea = "@" + tarea;
        tareas.set(indiceTarea, tarea);
        
        
    }
    
    

}

