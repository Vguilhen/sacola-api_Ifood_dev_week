package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor // Constroi os construtores automaticamente reduzindo a quantidade de código
@Builder// faz o sacola builder um design patter que vai ajudar a criar o objeto
@Data//nos mostra todos os getters and setters que pediriamos da forma manual
@Entity
@JsonIgnoreProperties({"HibernateLazyInitializer", "handler"})
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Embedded
    private Endereco endereco;
}
