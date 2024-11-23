package ru.innopolis;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Product {

    private Integer id;

    private  String description;

    private Long price;

    private Long count;


}
