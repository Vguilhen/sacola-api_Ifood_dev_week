package me.dio.sacola.repository;

import me.dio.sacola.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //informa que é um repositório para o banco de dados // Precisa informar a classe model e a primary key que é o Long dentro da <>
public interface ClienteRepository extends JpaRepository<Cliente,Long> { // são as classes interface que se conectam com o banco de dados

}
