package keggapi;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package keggapi;

/**
 *
 * @author DI
 */

class GetGenesByOrganism {
        public static void main(String[] args) throws Exception {
                KEGGLocator  locator = new KEGGLocator();
                KEGGPortType serv    = locator.getKEGGPort();
                String organism = "mtv";

                String[] results = serv.get_genes_by_organism(organism,1, 5000);
                int num_genes=0;
                for (int i = 0; i < results.length; i++) {
                    num_genes++;    
                    System.out.println(results[i]);
                }
                System.out.println("Genes: "+num_genes);
        }
}
