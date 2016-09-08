package keggapi;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import keggapi.ler_arquivo;
import keggapi.get_enzymes_by_reaction;
import java.rmi.RemoteException;
import java.util.regex.Pattern;
import javax.xml.rpc.ServiceException;
import java.io.*;
        




/**
 *
 * @author DI
 */
public class gravar_arquivo 
{

  public gravar_arquivo(String ec, String rn) throws ServiceException, RemoteException, FileNotFoundException, IOException {
        String query = null;
        String results[]=null ;
        File arquivo;
        String separador = " | ";
        String space = " ";
        arquivo = new File ("/Saraiva/output_keggapi1.txt");
       // FileOutputStream fos = new FileOutputStream(arquivo);  
        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        String values[] = ec.split(Pattern.quote(";"));  
       // get_enzymes_by_reaction enzyme = new get_enzymes_by_reaction(values);    
                KEGGLocator  locator = new KEGGLocator();
                KEGGPortType serv    = locator.getKEGGPort();
               for(int i=0; i<values.length;i++)
                {
                    
                    query   = values[i];
                    // System.out.println(query);
                     String reaction_id = query;
                     bw.write(reaction_id);
                     results = serv.get_enzymes_by_reaction(query);
                     System.out.println(query);
                    //System.out.println(results);
                     bw.write(separador); 
                    for (int j = 0; j < results.length; j++) {
                       
                        String ec_number = results[j];
                        bw.write(ec_number);
                        bw.write(space);
                         
                         System.out.println(ec_number);
                    }
                    }bw.newLine();
                      
                bw.close(); 
     }
        
}          



   


   

  
 

  

   

    
    

