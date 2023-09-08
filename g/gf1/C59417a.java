package gf1;

import gy3.C87412m;
import te3.C64517l90;

/* renamed from: gf1.a */
public final class C59417a {

    /* renamed from: a */
    public final C64517l90 f169822a;

    /* renamed from: b */
    public long f169823b;

    /* renamed from: c */
    public long f169824c;

    /* renamed from: d */
    public long f169825d;

    /* renamed from: e */
    public long f169826e;

    /* renamed from: f */
    public long f169827f;

    /* renamed from: g */
    public long f169828g;

    /* renamed from: h */
    public long f169829h;

    /* renamed from: i */
    public long f169830i;

    public C59417a(C64517l90 l902) {
        this.f169822a = l902;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C59417a) && C87412m.m108589b(this.f169822a, ((C59417a) obj).f169822a);
    }

    public int hashCode() {
        C64517l90 l902 = this.f169822a;
        if (l902 == null) {
            return 0;
        }
        return l902.hashCode();
    }

    public String toString() {
        return "EntranceReportSwitchEx(config=" + this.f169822a + ')';
    }
}
