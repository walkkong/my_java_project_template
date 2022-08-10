package com.sss.ormbase.autogenerator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vendors {
    private String vendId;

    private String vendName;

    private String vendAddress;

    private String vendCity;

    private String vendState;

    private String vendZip;

    private String vendCountry;

    private String vendWeb;
}