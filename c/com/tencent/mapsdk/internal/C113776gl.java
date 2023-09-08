package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.gl */
public final class C113776gl extends C113793gw {
    @Json(name = "showCount")

    /* renamed from: a */
    public int f340394a = 0;

    public C113776gl(long j) {
        super(j);
    }

    /* renamed from: a */
    private int m157000a() {
        int i = this.f340394a + 1;
        this.f340394a = i;
        return i;
    }
}
