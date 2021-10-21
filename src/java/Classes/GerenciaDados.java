
package Classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.JOptionPane;




public class GerenciaDados {

    
        String nome;
        Date data = new java.sql.Date(System.currentTimeMillis());
        int Score;   
        
    
    public String getNome() {
        System.out.print("Nome:");
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public int getScore() {
        System.out.print("Score:");
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }
    
     public void Retornos(){
         System.out.printf("----------------------");
         System.out.printf("DATA:" + nome+" "+Score+" "+data);
     }
    
    
    
    public void create(){
        
        //JOptionPane.showMessageDialog(null, "Iniciou O Insert");
       Connection con  = GerenciaJogo.getConnection();
       PreparedStatement stmt = null;
       
        try { 
            stmt = con.prepareStatement("insert into dados (nome,data,Score) values (?,?,?)");
            
            stmt.setString(1,getNome());
            stmt.setDate(2,data);            
            stmt.setInt(3,getScore());            
            stmt.executeUpdate();
          
            //JOptionPane.showMessageDialog(null, "Inseri os Dados");
            
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir dados");
            System.out.println("--------------");
            System.out.printf("DATA ERROR:" + nome+" "+Score+" "+data);
        }finally{
        GerenciaJogo.fechaConexao(con, stmt);
    }
              
    }
    
    
    public  String Leitura(){
        
        //JOptionPane.showMessageDialog(null, "Iniciou O Insert");
       Connection con  = GerenciaJogo.getConnection();
       PreparedStatement stmt = null;
       String nomeRetorno;
       String scoreRetorno, dataid ;
       String dataRetorno = null;
       
        try { 
            stmt = con.prepareStatement("select * from dados order by score desc");
            ResultSet resultado = stmt.executeQuery();
            
             ArrayList <String> Saida = new ArrayList<>();
              
             while(resultado.next()){ 
              
               nomeRetorno = resultado.getString("nome");
                scoreRetorno = resultado.getString("Score");
                dataRetorno = resultado.getString("data");
                dataid = resultado.getString("id");
                
                Saida.add(dataid + nomeRetorno + scoreRetorno);
                
               
               
                
                //System.out.println("Dados recebidos: "+ nomeRetorno + " " + scoreRetorno);
                 
            }
            
                System.out.println(Saida);
               
            
        } catch (SQLException ex) {
            System.out.println("Erro na Leitura"+ ex);
            
        }finally{
        GerenciaJogo.fechaConexao(con, stmt);
    }
            return null;
   
 }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    

    



