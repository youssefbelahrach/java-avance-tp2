public class Produit {
    private long id;
    private String nom;
    private String marque;
    private String description;
    private double prix;
    private long stock;

    public Produit(long id, String nom, String marque, String description, double prix, long stock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public long getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "\n Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", stock=" + stock +
                '}' + "\n";
    }
}
