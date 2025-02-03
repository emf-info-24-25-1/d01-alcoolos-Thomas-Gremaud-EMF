package app;

public class Application {
    
        Ami ami1 = new Ami("Gabriel", 5);
        Ami ami2 = new Ami("Lucien", 3);
        Ami ami3 = new Ami("David", 4);

        
        System.out.println(ami1.getNom() + " peut boire encore " + ami1.getBieresRestantes() + " bières.");
        System.out.println(ami2.getNom() + " peut boire encore " + ami2.getBieresRestantes() + " bières.");
        System.out.println(ami3.getNom() + " peut boire encore " + ami3.getBieresRestantes() + " bières.");

        
        ami1.boitUneBiere();
        ami2.boitUneBiere();
        ami2.boitUneBiere();
        ami3.boitUneBiere();
        ami3.boitUneBiere();

      
        System.out.println(ami1.getNom() + " peut encore boire " + ami1.getBieresRestantes() + " bières.");
        System.out.println(ami2.getNom() + " peut encore boire " + ami2.getBieresRestantes() + " bières.");
        System.out.println(ami3.getNom() + " peut encore boire " + ami3.getBieresRestantes() + " bières.");
    }



//je sais pas si mon code fonctionne, je sais pas pourquoi mais je n'ai pas le bouton run 