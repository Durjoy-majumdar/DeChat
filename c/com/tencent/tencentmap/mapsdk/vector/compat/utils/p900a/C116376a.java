package com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.a.a */
public class C116376a {

    /* renamed from: a */
    public final double f349201a;

    /* renamed from: b */
    public final double f349202b;

    /* renamed from: c */
    public final double f349203c;

    /* renamed from: d */
    public final double f349204d;

    /* renamed from: e */
    public final double f349205e;

    /* renamed from: f */
    public final double f349206f;

    public C116376a(double d, double d2, double d3, double d4) {
        this.f349201a = d;
        this.f349202b = d3;
        this.f349203c = d2;
        this.f349204d = d4;
        this.f349205e = (d + d2) / 2.0d;
        this.f349206f = (d3 + d4) / 2.0d;
    }

    /* renamed from: a */
    public boolean mo178905a(double d, double d2) {
        return this.f349201a <= d && d <= this.f349203c && this.f349202b <= d2 && d2 <= this.f349204d;
    }

    /* renamed from: b */
    public boolean mo178909b(C116376a aVar) {
        return aVar.f349201a >= this.f349201a && aVar.f349203c <= this.f349203c && aVar.f349202b >= this.f349202b && aVar.f349204d <= this.f349204d;
    }

    /* renamed from: a */
    public boolean mo178908a(C116377b bVar) {
        return mo178905a(bVar.f349207a, bVar.f349208b);
    }

    /* renamed from: a */
    public boolean mo178906a(double d, double d2, double d3, double d4) {
        return d < this.f349203c && this.f349201a < d2 && d3 < this.f349204d && this.f349202b < d4;
    }

    /* renamed from: a */
    public boolean mo178907a(C116376a aVar) {
        return mo178906a(aVar.f349201a, aVar.f349203c, aVar.f349202b, aVar.f349204d);
    }
}
