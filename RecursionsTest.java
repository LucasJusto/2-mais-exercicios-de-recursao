import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionsTest{

    @Test
    public void testExec1FatorialMaiorqUm(){
        int result = Recursions.exercicio1(10);
        assertEquals(result,3628800);
    }
    @Test
    public void testExec1FatorialMenorqUm(){
        Exception error = assertThrows(IllegalArgumentException.class,() ->{
            Recursions.exercicio1(-10);
        });
        assertEquals("por que trolas meu programinha ?",error.getMessage());
    }
    @Test
    public void testExec1FatorialIgualUm(){
        int result = Recursions.exercicio1(1);
        assertEquals(result,1);
    }
    @Test
    public void testExec2SomatorioMaiorqUm(){
        int result = Recursions.exercicio2(10);
        assertEquals(result,55);
    }
    @Test
    public void testExec2SomatorioMenorqUm(){
        int result = Recursions.exercicio2(-10);
        assertEquals(result,-55);
    }
    @Test
    public void testExec2SomatorioIgualUm(){
        int result = Recursions.exercicio2(1);
        assertEquals(result,1);
    }
    @Test
    public void testExec3MaiorqUm(){
        int result = Recursions.exercicio3(10);
        assertEquals(result,55);
    }
    @Test
    public void testExec3MenorqUm(){
        Exception error = assertThrows(IllegalArgumentException.class,() ->{
            Recursions.exercicio3(-10);
        });
        assertEquals("por que trolas meu programinha",error.getMessage());
    }
    @Test
    public void testExec3IgualUm(){
        int result = Recursions.exercicio3(1);
        assertEquals(result,1);
    }
    @Test
    public void testExec3IgualDois(){
        int result = Recursions.exercicio3(2);
        assertEquals(result,1);
    }
    @Test
    public void testExec4DezAteQuinze(){
        int result = Recursions.exercicio4(10,15);
        assertEquals(result,75);
    }
    @Test
    public void testExec4QuinzeAteDez(){
        Exception error = assertThrows(IllegalArgumentException.class,() ->{Recursions.exercicio4(15,10);});
        assertEquals("por que trolas meu programinha",error.getMessage());
    }
    @Test
    public void testExec4QuinzeAteQuinze(){
        int result = Recursions.exercicio4(15,15);
        assertEquals(result,15);
    }
    @Test
    public void testExec5Arara(){
        boolean result = Recursions.exercicio5("arara");
        assertTrue(result);
    }
    @Test
    public void testExec5Abobora(){
        boolean result = Recursions.exercicio5("abobora");
        assertFalse(result);
    }
    @Test
    public void testExec6Dez(){
        String result = Recursions.exercicio6(10);
        assertEquals("1010",result);
    }
    @Test
    public void testExec6MenosDez(){
        Exception error = assertThrows(IllegalArgumentException.class,() ->{
            Recursions.exercicio6(-10);
        });
        assertEquals("por que trolas meu programinha",error.getMessage());
    }
    @Test
    public void testExec7ListaComValores(){
        int result = Recursions.exercicio7(new ArrayList<Integer>(Arrays.asList(10,5,7,9,12)));
        assertEquals(43 ,result);
    }
    @Test
    public void testExec7ListaComValor(){
        int result = Recursions.exercicio7(new ArrayList<Integer>(Arrays.asList(10)));
        assertEquals(10 ,result);
    }
    @Test
    public void testExec7Null(){
        Exception error = assertThrows(NullPointerException.class,() ->{
            Recursions.exercicio7(null);
        });
        assertEquals("por que trolas meu programinha",error.getMessage());
    }
    @Test
    public void testExec8Maior(){
        int result = Recursions.exercicio8(new ArrayList<Integer>(Arrays.asList(10,5,8,7,9,5,10,222)));
        assertEquals(222,result);
    }
    @Test
    public void testExec8Null(){
        Exception error = assertThrows(NullPointerException.class,() ->{
            Recursions.exercicio8(null);
        });
        assertEquals("java.lang.NullPointerException",error.toString());
    }
}