package com.itorizon.simpleWebAPP.Services;

import com.itorizon.simpleWebAPP.Models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
@Service
public class ProductService {
    List<Product> product = new ArrayList<>(Arrays.asList(new Product(10, "laptop", 8000),
            new Product(20, "pen", 8),
            new Product(30, "books", 800)));

    public List<Product> getProducts() {
        return product;
    }

    public Product getProductBYID(int productid) {
        //return product.stream().filter(p -> p.getProductid() == productid).findFirst().get();
        Product result = null;
        Iterator<Product> lis = product.listIterator();
        while (lis.hasNext()) {
            Product product1 = lis.next();
            if (product1.getProductid() == (productid)) {
                result = product1;
                return result;
            }
        }
        return null;
    }

    public void addProduct(Product prod) {
        product.add(prod);
    }


    public void updateProduct(Product pr) {
        int index = 0;
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getProductid() == pr.getProductid()) {
                index = i;
                product.set(index, pr);
            }
        }
    }

    public void deleteProduct(int prr) {
           Iterator<Product> p = product.iterator();
            while (p.hasNext()) {
                Product p1 = p.next();
                if(p1.getProductid()==prr) {
                    p.remove();
                }
            }

        /*int index = 0;
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getProductid() == prr) {
                index = i;
                product.remove(index);
            }
        }*/

    }
}


