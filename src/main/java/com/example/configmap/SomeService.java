/****************************************************************
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 ****************************************************************/

package com.example.configmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class SomeService implements RefreshScheduler{

    @Autowired
    private ApplicationProperties applicationProperties;

    @Scheduled(fixedDelay = 10000)
    public void hello() {
        System.out.println("The balance url is " + this.applicationProperties.getGetbalance());
        System.out.println("The transfer url is " + this.applicationProperties.getTransferfund());
        System.out.println("The customerinfo url is " + this.applicationProperties.getCustomerinfo());
    }


}
