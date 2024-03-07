package com.factura.demo.demofactura;

import com.factura.demo.demofactura.models.Item;
import com.factura.demo.demofactura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig
{
    @Bean
    List<Item> itemsInvoice() {
        Product p1 = new Product("Camara sony", 800);
        Product p2 = new Product("Patines", 250);
        List<Item> items = Arrays.asList(new Item(p1,2), new Item(p2,5));
        return items;
    }

    @Bean
    @Primary
    List<Item> itemsInvoiceOffice() {
        Product p1 = new Product("Monitor Asus 24", 800);
        Product p2 = new Product("Notebook razer", 1000);
        Product p3 = new Product("impresora HP", 500);
        List<Item> items = Arrays.asList(new Item(p1,4), new Item(p2,3), new Item(p3,8));
        return items;
    }
}
