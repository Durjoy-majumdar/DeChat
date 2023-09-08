package com.tencent.p014mm.sdk.storage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.tencent.mm.sdk.storage.MAutoDBFieldAnnotation */
public @interface MAutoDBFieldAnnotation {
    String defValue();

    int primaryKey() default 0;
}
