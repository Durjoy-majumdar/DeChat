package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.sc */
public class C114198sc extends JsonComposer {
    @Json(name = "error")

    /* renamed from: a */
    public int f341917a = Integer.MIN_VALUE;
    @Json(name = "info")

    /* renamed from: b */
    public C114197sb f341918b;

    /* renamed from: a */
    private int m159610a() {
        return this.f341917a;
    }

    /* renamed from: b */
    private C114197sb m159613b() {
        return this.f341918b;
    }

    /* renamed from: a */
    private void m159611a(int i) {
        this.f341917a = i;
    }

    /* renamed from: a */
    private void m159612a(C114197sb sbVar) {
        this.f341918b = sbVar;
    }
}
