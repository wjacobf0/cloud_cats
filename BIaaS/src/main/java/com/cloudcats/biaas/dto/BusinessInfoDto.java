package com.cloudcats.biaas.dto;

import lombok.Data;

@Data
public class BusinessInfoDto {
    private Integer businessId;
    private String businessFEIN;
    private String businessName;
    private String businessState;
    private String businessOwners;
}