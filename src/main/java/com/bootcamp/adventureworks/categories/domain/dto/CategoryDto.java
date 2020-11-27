package com.bootcamp.adventureworks.categories.domain.dto;

import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Integer id;
    private Integer parentId;
    private String name;

    private String rowguid;
    private Date modifiedDate;

}
