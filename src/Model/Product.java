package Model;
// Generated Nov 6, 2019 7:38:26 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private String idProduct;
     private Producer producer;
     private TypeProduct typeProduct;
     private String nameProduct;
     private int priceProduct;
     private int amout;
     private String imageProduct;
     private String descriptionProduct;
     private Set<Invoice> invoices = new HashSet<Invoice>(0);

    public Product() {
    }

	
    public Product(String idProduct, Producer producer, TypeProduct typeProduct, String nameProduct, int priceProduct, int amout, String imageProduct) {
        this.idProduct = idProduct;
        this.producer = producer;
        this.typeProduct = typeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.amout = amout;
        this.imageProduct = imageProduct;
    }
    public Product(String idProduct, Producer producer, TypeProduct typeProduct, String nameProduct, int priceProduct, int amout, String imageProduct, String descriptionProduct) {
       this.idProduct = idProduct;
       this.producer = producer;
       this.typeProduct = typeProduct;
       this.nameProduct = nameProduct;
       this.priceProduct = priceProduct;
       this.amout = amout;
       this.imageProduct = imageProduct;
       this.descriptionProduct = descriptionProduct;
//       this.invoices = invoices;
    }
   
    public String getIdProduct() {
        return this.idProduct;
    }
    
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }
    public Producer getProducer() {
        return this.producer;
    }
    
    public void setProducer(Producer producer) {
        this.producer = producer;
    }
    public TypeProduct getTypeProduct() {
        return this.typeProduct;
    }
    
    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }
    public String getNameProduct() {
        return this.nameProduct;
    }
    
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public int getPriceProduct() {
        return this.priceProduct;
    }
    
    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }
    public int getAmout() {
        return this.amout;
    }
    
    public void setAmout(int amout) {
        this.amout = amout;
    }
    public String getImageProduct() {
        return this.imageProduct;
    }
    
    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }
    public String getDescriptionProduct() {
        return this.descriptionProduct;
    }
    
    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }
    public Set<Invoice> getInvoices() {
        return this.invoices;
    }
    
    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }
  




}

