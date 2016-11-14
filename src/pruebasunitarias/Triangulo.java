package pruebasunitarias;
public class Triangulo {
    
    public static final int NO_TRIANGULO = 0;
    public static final int ESCALENO = 1;
       
    public int verTipo(int i, int j,int k){
    int tipo;
    
    if(i+j<=k || j+k<=i	|| i+k<=j)	{
        tipo = Triangulo.NO_TRIANGULO;
    }else{
        tipo = Triangulo.ESCALENO;
    }
    return tipo;
    }
}
