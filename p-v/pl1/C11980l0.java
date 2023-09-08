package pl1;

import gy3.C87412m;
import kotlin.Result;
import u60.C14121l;
import u60.C65234n;
import wx3.C15601d;

/* renamed from: pl1.l0 */
public class C11980l0 extends C14121l {

    /* renamed from: i */
    public C15601d<? super C65234n> f34963i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11980l0(fy3.C32226l r1, java.lang.String r2, int r3, gy3.C8480h r4) {
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
            java.lang.String r3 = "task"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "id"
            gy3.C87412m.m108594g(r2, r3)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pl1.C11980l0.<init>(fy3.l, java.lang.String, int, gy3.h):void");
    }

    /* renamed from: a */
    public void mo11852a() {
        this.f39519f.invoke(this);
    }

    /* renamed from: b */
    public void mo11853b(C65234n nVar) {
        C87412m.m108594g(nVar, "status");
        C15601d<? super C65234n> dVar = this.f34963i;
        if (dVar != null) {
            dVar.resumeWith(Result.m168114constructorimpl(nVar));
        }
        this.f34963i = null;
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
}
