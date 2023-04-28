import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.example.ej29;
import org.junit.*;
import org.junit.jupiter.api.Test;
public class ej29Test {
   //metodo que prueba la suma de n=0 numeros que eleavara una excepcion
    @Test
    public void testSumaNumeros0() {
        ej29 ej=new ej29();
        try{
            int resultado=ej.sumannumeros(0);
            fail("Deberia haber lanzado una excepcion");
        }catch(IllegalArgumentException e){
            assertEquals("n tiene que ser mayor que  0",e.getMessage());
        }
    }

    //metodo que prueba la suma de n=3 numeros
    @Test
    public void testSumaNumeros3() {
        ej29 ej=new ej29();
        int resultado=ej.sumannumeros(3);
        assertEquals(6,resultado);
    }
    //metodo que prueba la suma de n=-3 numeros que eleavara una excepcion
    @Test
    public void testSumaNumerosMenos3() {
        ej29 ej=new ej29();
        try{
            int resultado=ej.sumannumeros(-3);
            fail("Deberia haber lanzado una excepcion");
        }catch(IllegalArgumentException e){
            assertEquals("n tiene que ser mayor que  0",e.getMessage());
        }
    }
}
