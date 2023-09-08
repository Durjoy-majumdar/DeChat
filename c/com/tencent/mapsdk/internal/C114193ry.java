package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ry */
public class C114193ry extends JsonComposer {
    @Json(name = "level")

    /* renamed from: a */
    public int[] f341891a;
    @Json(name = "districts")

    /* renamed from: b */
    public List<C114194rz> f341892b;

    /* renamed from: a */
    private void m159577a(int[] iArr) {
        this.f341891a = iArr;
    }

    /* renamed from: b */
    private List<C114194rz> m159579b() {
        return this.f341892b;
    }

    /* renamed from: a */
    private void m159576a(List<C114194rz> list) {
        this.f341892b = list;
    }

    /* renamed from: a */
    private int[] m159578a() {
        return this.f341891a;
    }
}
