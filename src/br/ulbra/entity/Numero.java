
package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Numero {
    public ArrayList numero; 

    public Numero() { 
      numero = new ArrayList();        
    }
    
    //create - adicionar  
    public void salvar(String item){
        numero.add(item); 
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    }
    //read - listar 
    public String listar (){ 
    String res = ""; 
        if (!numero.isEmpty()) {
        for (int i=0; i<numero.size(); i++){
         res+=(i+1) + "- "+numero.get(i)+ "\n"; 
        }
        }else{ 
            res = "Lista vazia!"; 
    }
        return res; 
    }
    //deletar
    public void excluir (int indice){
        if (!numero.isEmpty()){
          if (indice>0 && indice<=numero.size()) {
              numero.remove(indice-1);
          JOptionPane.showMessageDialog(null,"Excluido com sucesso!!"); 
        }else{
            JOptionPane.showMessageDialog(null,"Código não existe!!"); 
        }
        }else{  
            JOptionPane.showMessageDialog(null,"Impossível excluir a lista vazia!");
        }
    }
    
    public void alterar (int indice, String elemento){
         if (!numero.isEmpty()){
          if (indice>0 && indice<=numero.size()) {
              numero.set(indice-1, elemento);
         JOptionPane.showMessageDialog(null,"Alterado com sucesso!!"); 
    }else{
          JOptionPane.showMessageDialog(null,"Código não existe!!");
        }
        }else{  
            JOptionPane.showMessageDialog(null,"Impossível alterar a lista vazia!");
        }    
    }
}
