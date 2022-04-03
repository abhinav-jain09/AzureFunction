package com.ns.rivier.tokenvault.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllowList {
    private String identifierType;
    private String id;
    private Date timeStamp;
    private ArrayList<Services> services = new ArrayList<Services>();
}


