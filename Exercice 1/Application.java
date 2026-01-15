import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int choix;
        Scanner sc = new Scanner(System.in);
        IMetier<Produit> listeProduits = new MetierProduitImpl();
        //Initialisation de la liste par des produits.
        listeProduits.add(new Produit(111, "Tablette", "Apple", "Tablette iPad", 10000, 10));
        listeProduits.add(new Produit(222, "Smartphone", "Samsung", "Smartphone Galaxy", 8000, 20));
        listeProduits.add(new Produit(333, "MAC", "Apple", "MacBook Air", 12000, 5));


        do{
            System.out.println("\n--- Menu ---");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par son id.");
            System.out.println("5. Quitter ce programme.\n");
            System.out.print("Choix: ");
            choix = sc.nextInt();

            if(choix == 1){
                System.out.println("--- Affichage de la liste des produits ---");
                System.out.println(listeProduits.getAll());
            }else if(choix == 2){
                System.out.println("--- Recherche d'un produit par son id ---");
                System.out.print("Donner un id à rechercher: ");
                long idChoix = sc.nextLong();
                Produit p = listeProduits.findById(idChoix);
                System.out.println(p != null ? p : "Produit introuvable!");
            }else if(choix == 3){
                System.out.println("--- Ajout d'un nouveau produit ---");
                System.out.println("Donner un id pour le produit: ");
                long id = sc.nextLong();
                sc.nextLine();
                System.out.println("Donner le nom du produit: ");
                String nom = sc.nextLine();
                System.out.println("Donner la marque du produit: ");
                String marque = sc.nextLine();
                System.out.println("Donner la description du produit: ");
                String description = sc.nextLine();
                System.out.println("Donner le prix du produit: ");
                double prix = sc.nextDouble();
                sc.nextLine();
                System.out.println("Donner le quantité du produit en stock: ");
                long stock = sc.nextLong();
                listeProduits.add(new Produit(id,nom,marque,description,prix,stock));
                System.out.println("Produit ajouté avec succés.");
            }else if(choix == 4){
                System.out.println("--- Supression d'un produit ---");
                System.out.println("Donner un id du produit à supprimer: ");
                long id = sc.nextLong();
                if(listeProduits.findById(id) == null){
                    System.out.println("Produit introuvable!");
                }else{
                    listeProduits.delete(id);
                    System.out.println("Produit supprimé avec succés.");
                }
            }

        }while(choix!=5);
        sc.close();

    }
}
