package pruebasunitarias.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pruebasunitarias.Persona;
import pruebasunitarias.Triangulo;

public class PruebasTriangulos {
    public PruebasTriangulos() {
        
    }
    
    @Test
    public void testCamino1(){
        int i=1,j=2,k=4;
        Triangulo triangulo = new Triangulo();
        int res = triangulo.verTipo(i, j, k);
        assertEquals("No se esta calculando correctamente",triangulo.NO_TRIANGULO,res);
    }
    
    @Test
    public void testCamino2(){
        int i=1,j=1,k=1;
        Triangulo triangulo = new Triangulo();
        int res = triangulo.verTipo(i, j, k);
        assertTrue("No se esta calculando correctamente",res == triangulo.ESCALENO);
    }
    @Test
    public void testCamino3(){
        int i=4,j=1,k=2;
        Triangulo triangulo = new Triangulo();
        int res = triangulo.verTipo(i, j, k);
        assertTrue("No se esta calculando correctamente",res == triangulo.NO_TRIANGULO);
    }
    @Test
    public void testCamino4(){
        int i=1,j=4,k=2;
        Triangulo triangulo = new Triangulo();
        int res = triangulo.verTipo(i, j, k);
        assertTrue("No se esta calculando correctamente",res == triangulo.NO_TRIANGULO);
    }
    @Test
    public void testDesubicado(){
        String cad1 = "Peru";
        String cad2 = "Peru";
        
        //assertEquals("Cadenas diferentes", cad1,cad2);
        //assertSame("Cadenas diferentes", cad1,cad2);
        //assertNotSame("Cadenas diferentes", cad1, cad2);
        Persona p1 = new Persona("Pepito");
        Persona p2 = p1;
        p2.setNombre("Pepe");
        
        assertSame("Personas", p1, p2);
        
    }
    
}
