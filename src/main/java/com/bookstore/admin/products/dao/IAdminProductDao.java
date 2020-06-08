package com.bookstore.admin.products.dao;

import com.bookstore.commons.beans.Product;
import com.bookstore.commons.beans.ProductList;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/15 15:18
 */
public interface IAdminProductDao {
    List<Product> selectProduct();

    List<Product> selectProductByManyCondition(Map map);

    void insertProduct(Product product);

    Product selectProductById(String id);

    void updateProduct(Product product);

    void removeProduct(String id);

    List<ProductList> selectProductSalList(@Param("year") String year,@Param("month") String month);
}
