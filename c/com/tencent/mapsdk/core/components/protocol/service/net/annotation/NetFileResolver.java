package com.tencent.mapsdk.core.components.protocol.service.net.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NetFileResolver {
    String outFile();

    int[] queryRange();
}
