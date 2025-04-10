package com.itorizon.simpleWebAPP.Repositorys;

import com.itorizon.simpleWebAPP.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
