package com.bookstore.admin.products.service;

import com.bookstore.commons.beans.Product;
import com.bookstore.commons.beans.ProductList;

import java.util.List;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/15 15:10
 */
public interface IAdminProductService {
    List<Product> findProduct();

    List<Product> findProductByManyCondition(Product product, Double minprice, Double maxprice);

    void addProduct(Product product);

    Product findProductById(String id);

    void editProduct(Product product);

    void deleteProduct(String id);

    List<ProductList> findProductSalList(String year, String month);
}
