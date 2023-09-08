package com.tencent.mapsdk.core.components.protocol.service.net.annotation;

import com.tencent.map.tools.json.JsonComposer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NetJsonResolver {
    Class<? extends JsonComposer> outModel();

    int[] queryRange();
}
