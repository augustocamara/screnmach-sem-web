package br.com.rootnet.screnmach3;

import br.com.rootnet.screnmach3.model.DadosSerie;
import br.com.rootnet.screnmach3.service.ConsumoApi;
import br.com.rootnet.screnmach3.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Screnmach3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Screnmach3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=Gilmore+Girls&apikey=2bce3272");
		System.out.println(json);
		System.out.println();
		ConverteDados converteDados = new ConverteDados();
		DadosSerie dadosSerie = converteDados.obterDados(json, DadosSerie.class);
		System.out.println(dadosSerie);

	}
}
