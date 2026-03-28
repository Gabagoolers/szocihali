package hu.gabagoolers.szocihali;

import org.springframework.boot.SpringApplication;

public class TestSzocihaliApplication {

	public static void main(String[] args) {
		SpringApplication.from(SzocihaliApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
