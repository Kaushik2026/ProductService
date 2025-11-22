package com.backendlld.productservice.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseModel {
    private Long id;
    private Long created_at;
    private Long updated_at;
}
