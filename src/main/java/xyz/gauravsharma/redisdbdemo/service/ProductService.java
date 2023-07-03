package xyz.gauravsharma.redisdbdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.gauravsharma.redisdbdemo.dao.ProductDao;
import xyz.gauravsharma.redisdbdemo.entity.Product;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao dao;

    public Product save(Product product) {
        return dao.save(product);
    }

    public List<Product> findAll() {
        return dao.findAll();
    }

    public Product findProductById(int id) {
        return dao.findProductById(id);
    }


    public String deleteProduct(int id) {
        return dao.deleteProduct(id);
    }
}
