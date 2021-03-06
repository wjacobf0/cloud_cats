package com.cloudcats.biaas.entity;

import lombok.Data;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

@Table(name = "BUSINESS_DIVERSITY_INFO")
@Data
public class BusinessDiversityInfo {
    @PrimaryKey
    @Column(name = "BUS_ID")
    private Integer businessId;
    @PrimaryKey(keyOrder = 2)
    @Column(name = "BUS_DIV_ID")
    private Integer businessDiversityId;
    @Column(name = "MINORITY_OWNED")
    private Boolean minorityOwned;
    @Column(name = "SMALL_BUSINESS")
    private Boolean smallBusiness;
    @Column(name = "WOMEN_OWNED")
    private Boolean womenOwned;
}
