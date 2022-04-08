package com.ns.rivier.tokenvault;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
    public  class  Services {
        private String partnerId;
        private String allow;
        private Date activationTimestamp;
        private String endDate;
    }

