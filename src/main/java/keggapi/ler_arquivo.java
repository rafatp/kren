package keggapi;


import java.io.*;
import java.rmi.RemoteException;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.rpc.ServiceException;
import org.apache.xmlbeans.impl.xb.xsdschema.LengthDocument;

/**
 *
 * @author DI
 */
public class ler_arquivo 
{
    private static final String  FILENAME = "/Saraiva/keggpathway_id.txt";
    String ec; 
    String reaction_number;
    int i = 0;
    public ler_arquivo () throws FileNotFoundException, IOException 
    {   
        try {
           // System.out.println("Entrou na ler_arquivo");
            try{
             // open text file
             BufferedReader in = new BufferedReader(new FileReader(FILENAME));
             String line = in.readLine();
             String space = " ";
       
             while(line != null) 
              {
                 try{
                     StringTokenizer tk = new StringTokenizer(line);
                     reaction_number +="rn:"+tk.nextToken()+";";
                     line = in.readLine();
                     ec = reaction_number;
                     //ec = "EC NUMBERS |"+reaction_number+"|";
                     //System.out.println("EC Numbers: "+reaction_number);
                    
                 }catch(Exception e)
                    {
                        System.out.println(e);
                    } 
                //
               //gravar_arquivo arq = new gravar_arquivo();
                 
              } //System.out.println("EC Numbers: "+ec+"\r\n");
               //System.out.println("\t");
             System.out.println("EC Numbers: "+ec);
              
                in.close();
            
            }catch(Exception e)
                {
                    System.out.println(e);
                }
            //for (int k = 0; k<i;k++)
            //{
            //System.out.println(reaction_number[k]);
            //}
            //System.out.println(i);
             gravar_arquivo gravar = new gravar_arquivo(ec, reaction_number);
        } catch (ServiceException ex) {
            Logger.getLogger(ler_arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ler_arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
}
    

