package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor // Constroi os construtores automaticamente reduzindo a quantidade de código
@Builder// faz o sacola builder um design patter que vai ajudar a criar o objeto
@Data//nos mostra todos os getters and setters que pediriamos da forma manual
@Entity //converte a classe para um modelo do banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)// forma que vamos gerar o identificado unico (id)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL) //se excluir esse restaurante vai excluir todos os itens
    private List<Produto> cardapio;
    @Embedded // esse endereço vem da classe endereço embedable
    private Endereco endereco;
}
