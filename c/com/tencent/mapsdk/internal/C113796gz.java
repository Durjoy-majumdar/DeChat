package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.gz */
public final class C113796gz extends C113793gw {
    @Json(name = "showCount")

    /* renamed from: a */
    private int f340448a = 0;

    public C113796gz(long j) {
        super(j);
    }

    /* renamed from: a */
    public final int mo172172a() {
        int i = this.f340448a + 1;
        this.f340448a = i;
        return i;
    }
}
