/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keggapi;

import java.rmi.RemoteException;

/**
 *
 * @author DI
 */
public class get_enzymes_by_reaction {
  public static void main(String[] args) throws Exception {
  
                KEGGLocator  locator = new KEGGLocator();
                KEGGPortType serv    = locator.getKEGGPort();
                
                String query   = args[0];
                String[] results = serv.get_enzymes_by_reaction(query);
                 int num_genes = 0;
                for (int i = 0; i < results.length; i++) {
                    num_genes++;    
                    System.out.println(results[i]);
                }
                //System.out.println("Número de genes: "+num_genes);
        }
/*
    get_enzymes_by_reaction(String[] values) throws ServiceException, RemoteException {
        System.out.println("Entrou no GET");
        String query = values[1];
        System.out.println("Query "+query);
         KEGGLocator  locator = new KEGGLocator();
         KEGGPortType serv    = locator.getKEGGPort();
         System.out.println("Serv "+serv);
        String[] results = serv.get_enzymes_by_reaction(query);
         System.out.println("RESULT "+results[0]);
           for (int i = 0; i < results.length; i++) {
                System.out.println(results[i]);
                }
    }
*/
 }
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
