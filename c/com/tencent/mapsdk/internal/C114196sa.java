package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.sa */
public final class C114196sa extends JsonComposer {
    @Json(name = "version")

    /* renamed from: a */
    public int f341905a = 0;
    @Json(name = "path")

    /* renamed from: b */
    public String f341906b;

    /* renamed from: a */
    private String m159598a() {
        return this.f341906b;
    }

    /* renamed from: b */
    private int m159601b() {
        return this.f341905a;
    }

    /* renamed from: a */
    private void m159600a(String str) {
        this.f341906b = str;
    }

    /* renamed from: a */
    private void m159599a(int i) {
        this.f341905a = i;
    }
}
