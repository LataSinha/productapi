package com.bhardwaj.productapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhardwaj.productapi.entity.ProductEntity;
import com.bhardwaj.productapi.entity.ProductServiceAreaEntity;
import com.bhardwaj.productapi.repository.ProductRepository;
import com.bhardwaj.productapi.repository.ProductServiceAreaRepository;
import com.bhardwaj.productapi.service.ImageService;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    ProductServiceAreaRepository productServiceAreaRepository;
    
    @Autowired
    ImageService imageService;
    
    @Override
    public void run(String... args) {
        // Create and persist objects
        ProductEntity product1;
        ProductEntity product2;
        ProductEntity product3;
        ProductEntity product4;
        ProductEntity product5;
        ProductEntity product6;
        ProductEntity product7;
        ProductEntity product8;
        ProductEntity product9;
        ProductEntity product10;
//        Product product11;
//        Product product12;
//        Product product13;
//        Product product14;
//        Product product15;
        
        List<ProductServiceAreaEntity> productServiceAreas1 = new ArrayList<>();
        List<ProductServiceAreaEntity> productServiceAreas2 = new ArrayList<>();
        List<ProductServiceAreaEntity> productServiceAreas3 = new ArrayList<>();
        List<ProductServiceAreaEntity> productServiceAreas4 = new ArrayList<>();
        List<ProductServiceAreaEntity> productServiceAreas5 = new ArrayList<>();
        List<ProductServiceAreaEntity> productServiceAreas6 = new ArrayList<>();
        List<ProductServiceAreaEntity> productServiceAreas7 = new ArrayList<>();
        List<ProductServiceAreaEntity> productServiceAreas8 = new ArrayList<>();
        List<ProductServiceAreaEntity> productServiceAreas9 = new ArrayList<>();
        List<ProductServiceAreaEntity> productServiceAreas10 = new ArrayList<>();
//        List<ProductServiceArea> productServiceAreas11 = new ArrayList<>();
//        List<ProductServiceArea> productServiceAreas12 = new ArrayList<>();
//        List<ProductServiceArea> productServiceAreas13 = new ArrayList<>();
//        List<ProductServiceArea> productServiceAreas14 = new ArrayList<>();
//        List<ProductServiceArea> productServiceAreas15 = new ArrayList<>();
        
        
        ProductServiceAreaEntity productServiceArea1 = new ProductServiceAreaEntity();
        ProductServiceAreaEntity productServiceArea2 = new ProductServiceAreaEntity();
        ProductServiceAreaEntity productServiceArea3 = new ProductServiceAreaEntity();
        ProductServiceAreaEntity productServiceArea4 = new ProductServiceAreaEntity();
        ProductServiceAreaEntity productServiceArea5 = new ProductServiceAreaEntity();
        ProductServiceAreaEntity productServiceArea6 = new ProductServiceAreaEntity();
        
        productServiceArea1.setAreaCode("201301");
        productServiceArea1.setDaysToDeliver(1);
        productServiceArea2.setAreaCode("600001");
        productServiceArea2.setDaysToDeliver(1);
        productServiceArea3.setAreaCode("201001");
        productServiceArea3.setDaysToDeliver(2);
        productServiceArea4.setAreaCode("560001");
        productServiceArea4.setDaysToDeliver(3);
        productServiceArea5.setAreaCode("400001");
        productServiceArea5.setDaysToDeliver(5);
        productServiceArea6.setAreaCode("122001");
        productServiceArea6.setDaysToDeliver(3);
        
        
        productServiceAreas1.add(productServiceArea1);
        productServiceAreas1.add(productServiceArea2);
        productServiceAreas2.add(productServiceArea1);
        productServiceAreas3.add(productServiceArea1);
        productServiceAreas3.add(productServiceArea2);
        productServiceAreas3.add(productServiceArea5);
        productServiceAreas4.add(productServiceArea2);
        productServiceAreas5.add(productServiceArea4);
        productServiceAreas5.add(productServiceArea6);
        productServiceAreas6.add(productServiceArea1);
        productServiceAreas6.add(productServiceArea2);
        productServiceAreas6.add(productServiceArea6);
        productServiceAreas7.add(productServiceArea1);
        productServiceAreas7.add(productServiceArea2);
        productServiceAreas8.add(productServiceArea1);
        productServiceAreas9.add(productServiceArea1);
        productServiceAreas9.add(productServiceArea2);
        productServiceAreas10.add(productServiceArea5);
        productServiceAreas10.add(productServiceArea2);
        productServiceAreas10.add(productServiceArea4);
//        productServiceAreas11.add(productServiceArea6);
//        productServiceAreas12.add(productServiceArea1);
//        productServiceAreas12.add(productServiceArea2);
//        productServiceAreas13.add(productServiceArea6);
//        productServiceAreas14.add(productServiceArea1);
//        productServiceAreas14.add(productServiceArea1);
//        productServiceAreas15.add(productServiceArea2);
//        productServiceAreas15.add(productServiceArea5);
        
        
        
                
        productServiceAreaRepository.save(productServiceArea1);
        productServiceAreaRepository.save(productServiceArea2);
        productServiceAreaRepository.save(productServiceArea3);
        productServiceAreaRepository.save(productServiceArea4);
        productServiceAreaRepository.save(productServiceArea5);
        productServiceAreaRepository.save(productServiceArea6);
        
        
        product1=new ProductEntity("NICJ0921092SG", "Nike Men's T-Shirt", "Nike", 1199,
    			"Experience unrivaled comfort and style with this men's T-shirt. Designed with innovative ventilation technology, it ensures optimal airflow, keeping you cool even during the toughest workouts. The lightweight fabric offers a soft touch against your skin, while the iconic logo adds a timeless touch. Move with ease and confidence in the Nike T-Shirt, the perfect blend of performance and fashion.",
    			imageService.getImageBytes("static/images/nike1.jpg") , productServiceAreas1);   
        product2= new ProductEntity("ADC14536258MP", "Adidas Men Black Slim Fit Aeroready", "Adidas", 899,
    			"Unleash your athletic prowess with this high-performance men's T-shirt. Engineered with advanced moisture-wicking technology, it keeps you cool and dry during intense workouts. The sleek design boasts a vibrant gradient pattern, reflecting your bold style. Crafted from top-quality fabrics, this tee offers unparalleled comfort and durability. Elevate your fitness game and make a statement with the Adidas T-Shirt.",
    			imageService.getImageBytes("static/images/adidas1.jpg") , productServiceAreas2);
        
        product3=new ProductEntity("ADC76537883SB", "Adidas Printed Win 2.0 Tee", "Adidas", 1799,
    			"Unleash your athletic prowess with this high-performance men's T-shirt. Engineered with advanced moisture-wicking technology, it keeps you cool and dry during intense workouts. The sleek design boasts a vibrant gradient pattern, reflecting your bold style. Crafted from top-quality fabrics, this tee offers unparalleled comfort and durability. Elevate your fitness game and make a statement with the Adidas T-Shirt.",
    			imageService.getImageBytes("static/images/adidas2.jpg") , productServiceAreas3);
        
        
        
        product4=new ProductEntity("PU581371LB", "Nu-tility Relaxed T-shirt", "Puma", 899,
    			"Make a fashion-forward statement with this urban-inspired men's T-shirt. Combining style and functionality, it features bold color blocking and a unique graphic design. Crafted from premium materials, this tee offers superior comfort and durability. Whether hitting the streets or hanging out, the Puma T-Shirt adds an edgy touch to your wardrobe, keeping you comfortable and stylish all day long.",
    			imageService.getImageBytes("static/images/puma1.jpg") , productServiceAreas4);   
        product5= new ProductEntity("ADC13242545LY", "Adidas Designed2Move T", "Adidas", 3000,
    			"Unleash your athletic prowess with this high-performance men's T-shirt. Engineered with advanced moisture-wicking technology, it keeps you cool and dry during intense workouts. The sleek design boasts a vibrant gradient pattern, reflecting your bold style. Crafted from top-quality fabrics, this tee offers unparalleled comfort and durability. Elevate your fitness game and make a statement with the Adidas T-Shirt.",
    			imageService.getImageBytes("static/images/adidas3.jpg") , productServiceAreas5);
        
        product6=new ProductEntity("PU847760LB", "PUMA Graphic Men's T-Shirt", "Puma", 1299,
    			"Make a fashion-forward statement with this urban-inspired men's T-shirt. Combining style and functionality, it features bold color blocking and a unique graphic design. Crafted from premium materials, this tee offers superior comfort and durability. Whether hitting the streets or hanging out, the Puma T-Shirt adds an edgy touch to your wardrobe, keeping you comfortable and stylish all day long.",
    			imageService.getImageBytes("static/images/puma2.jpg") , productServiceAreas6);
        
        
        product7=new ProductEntity("NIDJ1829010MB", "Nike Sportswear", "Nike", 1800,
    			"Experience unrivaled comfort and style with this men's T-shirt. Designed with innovative ventilation technology, it ensures optimal airflow, keeping you cool even during the toughest workouts. The lightweight fabric offers a soft touch against your skin, while the iconic logo adds a timeless touch. Move with ease and confidence in the Nike T-Shirt, the perfect blend of performance and fashion.",
    			imageService.getImageBytes("static/images/nike2.jpg") , productServiceAreas7);   
        product8= new ProductEntity("ADC23627167LB", "Adidas Solid Freelift Tennis T-shirt", "Adidas", 2100,
    			"Unleash your athletic prowess with this high-performance men's T-shirt. Engineered with advanced moisture-wicking technology, it keeps you cool and dry during intense workouts. The sleek design boasts a vibrant gradient pattern, reflecting your bold style. Crafted from top-quality fabrics, this tee offers unparalleled comfort and durability. Elevate your fitness game and make a statement with the Adidas T-Shirt.",
    			imageService.getImageBytes("static/images/adidas4.jpg") , productServiceAreas8);
        
        product9=new ProductEntity("NICB7952103MP", "Nike x AMBUSH Gillet", "Nike", 7000,
    			"Experience unrivaled comfort and style with this men's T-shirt. Designed with innovative ventilation technology, it ensures optimal airflow, keeping you cool even during the toughest workouts. The lightweight fabric offers a soft touch against your skin, while the iconic logo adds a timeless touch. Move with ease and confidence in the Nike T-Shirt, the perfect blend of performance and fashion.",
    			imageService.getImageBytes("static/images/nike3.jpg") , productServiceAreas9);
        product10=new ProductEntity("PU847828MB", "PUMA Graphic dryCELL Men's TraiPUng T-Shirt", "Puma", 1100,
    			"Make a fashion-forward statement with this urban-inspired men's T-shirt. Combining style and functionality, it features bold color blocking and a unique graphic design. Crafted from premium materials, this tee offers superior comfort and durability. Whether hitting the streets or hanging out, the Puma T-Shirt adds an edgy touch to your wardrobe, keeping you comfortable and stylish all day long.",
    			imageService.getImageBytes("static/images/puma3.jpg") , productServiceAreas10);
        
        
        
        
        
        
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);
        productRepository.save(product5);
        productRepository.save(product6);
        productRepository.save(product7);
        productRepository.save(product8);
        productRepository.save(product9);
        productRepository.save(product10);
        
    }
}
