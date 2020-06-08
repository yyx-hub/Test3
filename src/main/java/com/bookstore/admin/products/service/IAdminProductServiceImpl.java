package com.bookstore.admin.products.service;

import com.bookstore.admin.products.dao.IAdminProductDao;
import com.bookstore.commons.beans.Product;
import com.bookstore.commons.beans.ProductList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/15 15:14
 */
@Service
public class IAdminProductServiceImpl implements IAdminProductService {

    @Resource
    IAdminProductDao adminProductDao;

    @Override
    public List<Product> findProduct() {
        return adminProductDao.selectProduct();
    }

    @Override
    public List<Product> findProductByManyCondition(Product product, Double minprice, Double maxprice) {
        //把三个参数都封装到map里
        Map map = new HashMap();
        map.put("product",product);
        map.put("minprice",minprice);
        map.put("maxprice",maxprice);
        return adminProductDao.selectProductByManyCondition(map);
    }

    @Override
    public void addProduct(Product product) {
        adminProductDao.insertProduct(product);
    }

    @Override
    public Product findProductById(String id) {
        return adminProductDao.selectProductById(id);
    }

    @Override
    public void editProduct(Product product) {
        adminProductDao.updateProduct(product);
    }

    @Override
    public void deleteProduct(String id) {
        adminProductDao.removeProduct(id);
    }

    @Override
    public List<ProductList> findProductSalList(String year, String month) {
        return adminProductDao.selectProductSalList(year,month);
    }
}
