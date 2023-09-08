package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.gu */
public final class C113791gu extends C113793gw {
    @Json(name = "showCount")

    /* renamed from: a */
    public int f340425a = 0;

    public C113791gu(long j) {
        super(j);
    }

    /* renamed from: a */
    private int m157026a() {
        int i = this.f340425a + 1;
        this.f340425a = i;
        return i;
    }
}
