
package resolucaotela;

import java.awt.Dimension;
import static java.awt.Toolkit.getDefaultToolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        //Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = getDefaultToolkit().getScreenSize(); 
        System.out.println("" +d.width + "x" +d.height);
        
        StringBuilder s = new StringBuilder();
        
        s.append("Sua Resolução é: ").append(d.width).append("x").append(d.height);
        System.out.println(s);
     
        
    //Spit serve quebrar 
    //replace serve para substituir , por . ou vise versa   
        
        String j = "pai;mae;filho;filha;primo;prima";
        System.out.println(j.replace(";", ""));
        String[] h = j.split(";");
        
        for(String parte : h){
            System.out.println(parte);
        }
    }
}
