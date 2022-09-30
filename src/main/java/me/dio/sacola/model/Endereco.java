package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor // Constroi os construtores automaticamente reduzindo a quantidade de código
@Builder// faz o sacola builder um design patter que vai ajudar a criar o objeto
@Data//nos mostra todos os getters and setters que pediriamos da forma manual
@Embeddable
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String complemento;
}
