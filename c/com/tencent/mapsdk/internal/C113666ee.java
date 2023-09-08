package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ee */
public class C113666ee extends JsonComposer {
    @Json(name = "layers")

    /* renamed from: a */
    public List<C113665ed> f340091a;
    @Json(name = "enable")

    /* renamed from: b */
    private int f340092b;

    /* renamed from: b */
    private List<C113665ed> m156671b() {
        return this.f340091a;
    }

    /* renamed from: a */
    public final boolean mo171994a() {
        return this.f340092b == 1;
    }

    public String toString() {
        return "DataLayerInfo{enable=" + this.f340092b + ", layers=" + this.f340091a + '}';
    }
}
