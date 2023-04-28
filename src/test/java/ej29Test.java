import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.example.ej29;
import org.junit.*;
import org.junit.jupiter.api.Test;
public class ej29Test {
   //metodo que prueba la suma de n=0 numeros
    @Test
    public void testSumaNumeros0() {
        ej29 ej=new ej29();
        int resultado=ej.sumannumeros(0);
        assertEquals(0,resultado);
    }
    //metodo que prueba la suma de n=3 numeros
    @Test
    public void testSumaNumeros3() {
        ej29 ej=new ej29();
        int resultado=ej.sumannumeros(3);
        assertEquals(6,resultado);
    }
}
