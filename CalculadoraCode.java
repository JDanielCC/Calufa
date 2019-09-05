package Calculadora_Basica_UI;

/*@author JoseDaniel*/
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        //this.txtDatos.enable(false); Por si se quiere evitar que se escriba con el teclado en el campo de texto
        setLocationRelativeTo(null);//Esta linea de codigo lo que permite es centrar en la pantalla nuesta aplicación
    }

    //Objeto Global
    Operaciones operaciones = new Operaciones();

                      
    private void initComponents() { 
    //Código oculto
    }


    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Asignando valor al boton del numero 1
        this.txtDatos.setText(this.txtDatos.getText() + 1);
    }                                   

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Asignando valor al boton del numero 2
        this.txtDatos.setText(this.txtDatos.getText() + 2);
    }                                   

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Asignando valor al boton del numero 3
        this.txtDatos.setText(this.txtDatos.getText() + 3);
    }                                   

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Asignando valor al boton del numero 4
        this.txtDatos.setText(this.txtDatos.getText() + 4);
    }                                   

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Asignando valor al boton del numero 5
        this.txtDatos.setText(this.txtDatos.getText() + 5);
    }                                   

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Asignando valor al boton del numero 6
        this.txtDatos.setText(this.txtDatos.getText() + 6);
    }                                   

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Asignando valor al boton del numero 7
        this.txtDatos.setText(this.txtDatos.getText() + 7);
    }                                   

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Asignando valor al boton del numero 8
        this.txtDatos.setText(this.txtDatos.getText() + 8);
    }                                   

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Asignando valor al boton del numero 9
        this.txtDatos.setText(this.txtDatos.getText() + 9);
    }                                   

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // Asignando valor al boton del numero 
        this.txtDatos.setText(this.txtDatos.getText() + 0);
    }                                   

    //Código de programación del botón de suma
    private void btsumaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operador = "+";
        operaciones.setNumero1((Integer.parseInt(this.txtDatos.getText())));
        this.txtDatos.setText("");// Para que quede vacio a la hora de agregar otro número que desee sumar
    }                                      
    //Código del botón Total
    private void btTotalActionPerformed(java.awt.event.ActionEvent evt) {                                        

        operaciones.setNumero2((Integer.parseInt(this.txtDatos.getText())));
        //El menú de operaciones
        switch (operador) {
            case "+":
                resultado = operaciones.Sumar(operaciones.getNumero1(), operaciones.getNumero2());
                break;
            case "-":
                resultado = operaciones.Restar(operaciones.getNumero1(), operaciones.getNumero2());
                break;
            case "*":
                resultado = operaciones.Multiplicar(operaciones.getNumero1(), operaciones.getNumero2());
                break;
            case "/":
                resultado = operaciones.Dividir(operaciones.getNumero1(), operaciones.getNumero2());
                break;
        }

        this.txtDatos.setText(String.valueOf(resultado));

        operador = "=";

    }                                       
    //Código del botón Multiplicar
    private void btmultiActionPerformed(java.awt.event.ActionEvent evt) {                                        
        operador = "*";
        operaciones.setNumero1((Integer.parseInt(this.txtDatos.getText())));
        this.txtDatos.setText("");// Para que quede vacio a la hora de agregar otro número que desee multiplicar
    }                                       

    //Código del botón Borrar AC
    private void btACActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //Se ponen todo los valores en blanco es decir los numero en 0 y el campo de texto vacio

        this.txtDatos.setText("");
        operaciones.setNumero1(0);
        operaciones.setNumero2(0);
        resultado = 0;
        operador = "";
    }                                    

    //Código del botón resta
    private void btrestaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        operador = "-";
        operaciones.setNumero1((Integer.parseInt(this.txtDatos.getText())));
        this.txtDatos.setText("");// Para que quede vacio a la hora de agregar otro número que desee restar
    }                                       

    //Código del botón de división
    private void btdivisionActionPerformed(java.awt.event.ActionEvent evt) {                                           
        operador = "/";
        operaciones.setNumero1((Integer.parseInt(this.txtDatos.getText())));
        this.txtDatos.setText("");// Para que quede vacio a la hora de agregar otro número que desee dividir
    }                                          

   
}
