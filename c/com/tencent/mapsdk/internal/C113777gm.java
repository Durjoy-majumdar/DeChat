package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.gm */
public final class C113777gm extends C113793gw {
    @Json(name = "showCount")

    /* renamed from: a */
    public int f340395a = 0;

    public C113777gm(long j) {
        super(j);
    }

    /* renamed from: a */
    private int m157001a() {
        int i = this.f340395a + 1;
        this.f340395a = i;
        return i;
    }
}
