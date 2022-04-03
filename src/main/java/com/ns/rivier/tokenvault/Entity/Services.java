package com.ns.rivier.tokenvault.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
  class  Services {
    private String partnerId;
    private String allow;
    private Date activationTimestamp;
    private String endDate;

}