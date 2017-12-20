

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PruebaTodoist.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PruebaTodoist
{
    private TodoListA todoList1;
    private TodoListA todoList2;

    /**
     * Default constructor for test class PruebaTodoist
     */
    public PruebaTodoist()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        todoList1 = new TodoListA();
        todoList1.addTarea("estudiar");
        todoList1.addTarea("limpiar");
        todoList1.addTarea("salir");
        todoList1.marcarComoCompletada(1);
        todoList1.mostrarTareasNumeradas();
        todoList1.mostrarTareasNumeradas();
        todoList1.mostrarTareasNumeradas();
        todoList2 = new TodoListA();
        todoList2.addTarea("estudiar Sistemas");
        todoList2.addTarea("limpiar cocina");
        todoList2.addTarea("salir a comprar");
        todoList2.addTarea("estudiar programacion");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
