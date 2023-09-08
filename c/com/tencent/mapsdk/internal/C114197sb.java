package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.sb */
public final class C114197sb extends JsonComposer {

    /* renamed from: a */
    public static int f341907a = 0;

    /* renamed from: b */
    public static final int f341908b = 1000;

    /* renamed from: c */
    public static int f341909c = 100;

    /* renamed from: d */
    public static final int f341910d = 0;

    /* renamed from: e */
    public static final int f341911e = 0;

    /* renamed from: f */
    public static final int f341912f = 7;
    @Json(name = "version")

    /* renamed from: g */
    public int f341913g;
    @Json(name = "frontier")

    /* renamed from: h */
    public C114196sa f341914h;
    @Json(name = "ver_data")

    /* renamed from: i */
    public List<C114192rx> f341915i;
    @Json(name = "detail")

    /* renamed from: j */
    public List<C114193ry> f341916j;

    /* renamed from: a */
    private int m159602a() {
        return this.f341913g;
    }

    /* renamed from: b */
    private C114196sa m159606b() {
        return this.f341914h;
    }

    /* renamed from: c */
    private List<C114192rx> m159608c() {
        return this.f341915i;
    }

    /* renamed from: d */
    private List<C114193ry> m159609d() {
        return this.f341916j;
    }

    /* renamed from: a */
    private void m159603a(int i) {
        this.f341913g = i;
    }

    /* renamed from: b */
    private void m159607b(List<C114193ry> list) {
        this.f341916j = list;
    }

    /* renamed from: a */
    private void m159604a(C114196sa saVar) {
        this.f341914h = saVar;
    }

    /* renamed from: a */
    private void m159605a(List<C114192rx> list) {
        this.f341915i = list;
    }
}
