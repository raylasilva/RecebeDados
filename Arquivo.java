

import javax.swing.JOptionPane;



public class Arquivo{


 public static void main(String[] args) {
     

  String  nome = JOptionPane.showInputDialog("Qual o seu nome?");
   
   String sexo = JOptionPane.showInputDialog("Qual o seu sexo?");
   
   String idade = JOptionPane.showInputDialog("Qual o sua idade?");
   
 
   JOptionPane.showMessageDialog(null, "Ola " +nome + " seu sexo é : " + sexo+ " e sua idade é: " + idade);
}

}