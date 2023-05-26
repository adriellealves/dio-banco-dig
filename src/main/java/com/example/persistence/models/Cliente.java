package com.example.persistence.models;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    protected String nome;
    protected String cpf;
    protected LocalDate dataNascimento;

}
