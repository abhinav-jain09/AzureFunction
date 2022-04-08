package com.ns.rivier.tokenvault;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
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
@Container(containerName = "allow")

public class AllowList {
    private String identifierType;
    @PartitionKey
    private String id;
    private Date timeStamp;
    private ArrayList<Services> services;
    private Date cardEndDate;
}


