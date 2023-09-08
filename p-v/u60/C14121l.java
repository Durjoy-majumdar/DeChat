package u60;

import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: u60.l */
public class C14121l extends C65220d {

    /* renamed from: f */
    public final C32226l<C14121l, C13598b0> f39519f;

    /* renamed from: g */
    public final String f39520g;

    /* renamed from: h */
    public int f39521h;

    public C14121l(C32226l<? super C14121l, C13598b0> lVar, String str) {
        C87412m.m108594g(lVar, "task");
        C87412m.m108594g(str, "id");
        this.f39519f = lVar;
        this.f39520g = str;
        this.f39521h = -1;
    }

    /* renamed from: a */
    public void mo11852a() {
        this.f39519f.invoke(this);
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f39520g;
    }

    /* renamed from: e */
    public void mo10270e() {
    }

    public String toString() {
        return "{token=" + this.f39521h + " id=" + this.f39520g + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C14121l(fy3.C32226l r1, java.lang.String r2, int r3, gy3.C8480h r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0019
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = java.lang.System.nanoTime()
            r2.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x0019:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u60.C14121l.<init>(fy3.l, java.lang.String, int, gy3.h):void");
    }
}
