package br.com.mini_comercio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mini_comercio.controller.MenuComercio;

@SpringBootApplication
public class MiniComercioApplication {

	public static void main(String[] args) {
		MenuComercio.retornarMenu();
	}

}
