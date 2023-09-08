package p658q1;

import com.google.android.gms.common.internal.ImagesContract;
import fy3.C32224a;
import gy3.C87412m;
import p1140p1.C110095a;
import p1140p1.C110098d;
import p410k0.C108793e;
import rx3.C13598b0;

/* renamed from: q1.x */
public final class C110329x implements C32224a<C13598b0> {

    /* renamed from: d */
    public final C110301j f330038d;

    /* renamed from: e */
    public final C110098d<?> f330039e;

    /* renamed from: f */
    public C110329x f330040f;

    /* renamed from: g */
    public C110329x f330041g;

    /* renamed from: h */
    public boolean f330042h;

    /* renamed from: i */
    public final C108793e<C110325w> f330043i = new C108793e<>(new C110325w[16], 0);

    public C110329x(C110301j jVar, C110098d<?> dVar) {
        C87412m.m108594g(jVar, "layoutNode");
        C87412m.m108594g(dVar, "modifier");
        this.f330038d = jVar;
        this.f330039e = dVar;
    }

    /* renamed from: a */
    public final void mo161780a() {
        this.f330042h = false;
        C108793e<C110325w> eVar = this.f330043i;
        int i = eVar.f325786f;
        if (i > 0) {
            T[] tArr = eVar.f325784d;
            int i2 = 0;
            do {
                C110325w wVar = (C110325w) tArr[i2];
                wVar.f330033e.mo145808U(C110325w.f330031i);
                wVar.f330035g = false;
                i2++;
            } while (i2 < i);
        }
        mo161782c(this.f330039e.getKey(), false);
    }

    /* renamed from: b */
    public final C110098d<?> mo161781b(C110095a<?> aVar) {
        C110329x xVar;
        C110098d<?> b;
        C87412m.m108594g(aVar, ImagesContract.LOCAL);
        if (C87412m.m108589b(this.f330039e.getKey(), aVar)) {
            return this.f330039e;
        }
        C110329x xVar2 = this.f330041g;
        if (xVar2 != null && (b = xVar2.mo161781b(aVar)) != null) {
            return b;
        }
        C110301j s = this.f330038d.mo161723s();
        if (s == null || (xVar = s.f329902Q) == null) {
            return null;
        }
        return xVar.mo161781b(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r7 = r5.f330038d.mo161726u();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo161782c(p1140p1.C110095a<?> r6, boolean r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L_0x000f
            p1.d<?> r7 = r5.f330039e
            p1.f r7 = r7.getKey()
            boolean r7 = gy3.C87412m.m108589b(r7, r6)
            if (r7 == 0) goto L_0x000f
            return
        L_0x000f:
            k0.e<q1.w> r7 = r5.f330043i
            int r0 = r7.f325786f
            r1 = 0
            if (r0 <= 0) goto L_0x003c
            T[] r7 = r7.f325784d
            r2 = 0
        L_0x0019:
            r3 = r7[r2]
            q1.w r3 = (p658q1.C110325w) r3
            r3.getClass()
            java.lang.String r4 = "local"
            gy3.C87412m.m108594g(r6, r4)
            k0.e<p1.a<?>> r4 = r3.f330034f
            boolean r4 = r4.mo159864f(r6)
            if (r4 == 0) goto L_0x0038
            q1.x r4 = r3.f330032d
            q1.j r4 = r4.f330038d
            q1.c0 r4 = r4.f329918j
            if (r4 == 0) goto L_0x0038
            r4.mo144673o(r3)
        L_0x0038:
            int r2 = r2 + 1
            if (r2 < r0) goto L_0x0019
        L_0x003c:
            q1.x r7 = r5.f330040f
            r0 = 1
            if (r7 == 0) goto L_0x0047
            r7.mo161782c(r6, r0)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            if (r7 != 0) goto L_0x0063
            q1.j r7 = r5.f330038d
            k0.e r7 = r7.mo161726u()
            int r2 = r7.f325786f
            if (r2 <= 0) goto L_0x0063
            T[] r7 = r7.f325784d
        L_0x0056:
            r3 = r7[r1]
            q1.j r3 = (p658q1.C110301j) r3
            q1.x r3 = r3.f329901P
            r3.mo161782c(r6, r0)
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x0056
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p658q1.C110329x.mo161782c(p1.a, boolean):void");
    }

    public Object invoke() {
        if (this.f330042h) {
            mo161782c(this.f330039e.getKey(), false);
        }
        return C13598b0.f38549a;
    }
}
