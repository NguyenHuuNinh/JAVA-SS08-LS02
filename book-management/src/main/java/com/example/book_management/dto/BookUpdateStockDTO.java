package com.example.book_management.dto;

import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class BookUpdateStockDTO {

    @Min(value = 0, message = "Stock must be a non-negative integer.")
    private Integer stock;

}