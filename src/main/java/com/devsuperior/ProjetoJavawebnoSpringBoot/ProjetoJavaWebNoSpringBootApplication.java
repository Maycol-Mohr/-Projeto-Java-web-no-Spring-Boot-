package com.devsuperior.ProjetoJavawebnoSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.ProjetoJavawebnoSpringBoot.entities.Category;
import com.devsuperior.ProjetoJavawebnoSpringBoot.repositories.CategoryRepository;

@SpringBootApplication
public class ProjetoJavaWebNoSpringBootApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoJavaWebNoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}
}