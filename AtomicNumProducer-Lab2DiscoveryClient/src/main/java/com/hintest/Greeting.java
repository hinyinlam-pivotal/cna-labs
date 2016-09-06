package com.hintest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by hinlam on 6/9/2016.
 */

@RefreshScope
@Component
class Greeting{

    @Value("${message:localmessage}")
    private String message;

    public String getMessage() {
        return message;
    }
}

