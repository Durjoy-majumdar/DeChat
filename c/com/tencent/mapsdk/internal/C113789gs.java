package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.gs */
public final class C113789gs extends C113793gw {
    @Json(name = "showCount")

    /* renamed from: a */
    private int f340422a = 0;

    public C113789gs(long j) {
        super(j);
    }

    /* renamed from: a */
    public final int mo172153a() {
        int i = this.f340422a + 1;
        this.f340422a = i;
        return i;
    }
}
