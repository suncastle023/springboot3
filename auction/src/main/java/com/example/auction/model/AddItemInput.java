package com.example.auction.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;

public class AddItemInput {

    @NotBlank(message = "상품 이름은 비워둘 수 없습니다.")
    @Size(min = 2, max = 50, message = "상품 이름은 최소 2자 이상, 최대 50자 이하이어야 합니다.")
    private String name;

    @NotBlank(message = "상품 설명은 비워둘 수 없습니다.")
    private String description;

    @NotNull(message = "시작 가격을 입력해야 합니다.")
    @Range(min = 100, max = 10000000, message = "시작 가격은 100원에서 10,000,000원 사이여야 합니다.")
    private Integer startingPrice;

    // Getter 및 Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(Integer startingPrice) {
        this.startingPrice = startingPrice;
    }
}
