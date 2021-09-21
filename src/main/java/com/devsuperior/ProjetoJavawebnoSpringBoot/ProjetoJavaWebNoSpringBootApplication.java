package com.devsuperior.ProjetoJavawebnoSpringBoot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.ProjetoJavawebnoSpringBoot.entities.Category;
import com.devsuperior.ProjetoJavawebnoSpringBoot.entities.Product;
import com.devsuperior.ProjetoJavawebnoSpringBoot.repositories.CategoryRepository;
import com.devsuperior.ProjetoJavawebnoSpringBoot.repositories.ProductRepository;

@SpringBootApplication
public class ProjetoJavaWebNoSpringBootApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoJavaWebNoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Sports");

		Product p1 = new Product(null, "TV", 2200.00, cat1);
		Product p2 = new Product(null, "Domain Driven Design", 120.00, cat2);
		Product p3 = new Product(null, "PS5", 2800.00, cat1);
		Product p4 = new Product(null, "Docker", 100.00, cat2);
		Product p5 = new Product(null, "Soccer Ball", 230.00, cat3);

		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		cat3.getProducts().addAll(Arrays.asList(p5));

		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);
		
	}
}