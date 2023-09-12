package org.example.hw1.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    public static void main(String[] args) {
        Shop shop = new Shop();
        List productList = new ArrayList<Product>();

        Product product1 = new Product();
        product1.setTitle("Bread");
        product1.setCost(50);
        productList.add(product1);

        Product product = new Product();
        product.setTitle("Fish");
        product.setCost(1500);
        productList.add(product);

        Product product2 = new Product();
        product2.setTitle("Milk");
        product2.setCost(100);
        productList.add(product2);

        shop.setProducts(productList);

        assertThat(shop.getProducts()).hasSize(3); // Проверяем что магазин хранит правильное количество продуктов
        assertThat(shop.getProducts()).contains(product, product1, product2); // Проверяем что магазин верный список продуктов
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product); // Проверяем что метод getMostExpensiveProduct() отрабатывает корректно и возвращает самый дорогой продукт
        assertThat(shop.sortProductsByPrice()).containsSequence(product1, product2, product); //Проверяем что метод sortProductsByPrice() правильно отсортировал список

    }
}