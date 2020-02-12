/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import DAO.InvoiceDao;
import DAO.ProductDao;
import Model.Customer;
import Model.Invoice;
import Model.Product;
import Model.TypeProduct;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class tesst {
    public static void main(String[] args) {
        InvoiceDao dao = new InvoiceDao();
        List<Invoice> list = dao.getList();
        int ma = 0 ;
        for (int i = 0; i < list.size(); i++) {
            int id = list.get(i).getIdInvoice();
            ma=id+1;
            
        }
        System.out.println(ma);
   
     
    }
}
