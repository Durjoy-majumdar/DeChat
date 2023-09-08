package com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.a.b */
public class C116377b {

    /* renamed from: a */
    public final double f349207a;

    /* renamed from: b */
    public final double f349208b;

    public C116377b(double d, double d2) {
        this.f349207a = d;
        this.f349208b = d2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C116377b)) {
            return false;
        }
        C116377b bVar = (C116377b) obj;
        return this.f349207a == bVar.f349207a && this.f349208b == bVar.f349208b;
    }

    public String toString() {
        return "Point{x=" + this.f349207a + ", y=" + this.f349208b + '}';
    }
}
