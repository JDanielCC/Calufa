
package Calculadora_Basica_UI;

/*@author José Daniel*/

public class Operaciones {
    private int numero1;
    private int numero2;
    
    //Constructores
    Operaciones(){ //Constructor sin parametros
    }
    
    Operaciones(int numero1,int numero2){
    this.numero1=numero1;
    this.numero2=numero2;
    }
       
    //Metodos Set = Cambiar
    public void setNumero1(int numero1R){
    this.numero1=numero1R;
    }
    
    public void setNumero2(int numero2R){
    this.numero2=numero2R;
    }
    
    //Metodos Get = Mostrar
    public int getNumero1(){
    return this.numero1;
    }
    
    public int getNumero2(){
    return this.numero2;
    }
    
 
    //Métodos de las operaciones matemáticas
    //Método sumar
    public int Sumar(int numero1,int numero2){
    int resultado= (numero1+numero2);
    return resultado;
    }
    
    //Método restar
    public int Restar(int numero1,int numero2){
    int resultado= (numero1-numero2);
    return resultado;
    }
    
    public int Dividir(int numero1,int numero2){
    int resultado= (numero1/numero2);
    return resultado;
    }
    
    public int Multiplicar(int numero1,int numero2){
    int resultado= (numero1*numero2);
    return resultado;
    }
}
