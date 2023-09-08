package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.dz */
public enum C113646dz {
    None("", 0),
    Gradient("heat", 2),
    Aggregation("honey", 3),
    ArcLine("arcline", 4),
    GLModel("model", 5),
    Trail("trail", 6),
    Scatter("scatter", 7);
    

    /* renamed from: h */
    public final String f340043h;

    /* renamed from: i */
    private final int f340044i;

    private C113646dz(String str, int i) {
        this.f340043h = str;
        this.f340044i = i;
    }

    /* renamed from: a */
    public static C113646dz m156618a(int i) {
        for (C113646dz dzVar : values()) {
            if (dzVar.f340044i == i) {
                return dzVar;
            }
        }
        return None;
    }

    /* renamed from: b */
    private static C113646dz m156620b(String str) {
        for (C113646dz dzVar : values()) {
            if (dzVar.mo171982a(str)) {
                return dzVar;
            }
        }
        return None;
    }

    /* renamed from: b */
    private boolean m156621b(int i) {
        return this.f340044i == i;
    }

    /* renamed from: a */
    public final boolean mo171982a(String str) {
        return this.f340043h.equals(str);
    }

    /* renamed from: a */
    private String m156619a() {
        return this.f340043h;
    }
}
