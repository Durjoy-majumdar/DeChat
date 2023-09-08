package p532g5;

import android.os.SystemClock;
import gy3.C87412m;
import my3.C61595o;
import p1104d1.C106969c;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p436a1.C103274x;
import p643p5.C110168e;
import p835c1.C104231f;

/* renamed from: g5.a */
public final class C107733a extends C106969c {

    /* renamed from: i */
    public C106969c f322390i;

    /* renamed from: j */
    public final C106969c f322391j;

    /* renamed from: n */
    public final C110168e f322392n;

    /* renamed from: o */
    public final int f322393o;

    /* renamed from: p */
    public final boolean f322394p;

    /* renamed from: q */
    public final C60690y0 f322395q = C108500f2.m146996c(0, (C108497e2) null, 2, (Object) null);

    /* renamed from: r */
    public long f322396r = -1;

    /* renamed from: s */
    public boolean f322397s;

    /* renamed from: t */
    public final C60690y0 f322398t = C108500f2.m146996c(Float.valueOf(1.0f), (C108497e2) null, 2, (Object) null);

    /* renamed from: u */
    public final C60690y0 f322399u = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    public C107733a(C106969c cVar, C106969c cVar2, C110168e eVar, int i, boolean z) {
        C87412m.m108594g(eVar, "scale");
        this.f322390i = cVar;
        this.f322391j = cVar2;
        this.f322392n = eVar;
        this.f322393o = i;
        this.f322394p = z;
    }

    /* renamed from: a */
    public boolean mo84456a(float f) {
        ((C108494d2) this.f322398t).setValue(Float.valueOf(f));
        return true;
    }

    /* renamed from: e */
    public boolean mo84457e(C103274x xVar) {
        ((C108494d2) this.f322399u).setValue(xVar);
        return true;
    }

    /* renamed from: h */
    public long mo84458h() {
        C106969c cVar = this.f322390i;
        C112545k kVar = null;
        C112545k kVar2 = cVar == null ? null : new C112545k(cVar.mo84458h());
        long j = kVar2 == null ? C112545k.f336973b : kVar2.f336976a;
        C106969c cVar2 = this.f322391j;
        if (cVar2 != null) {
            kVar = new C112545k(cVar2.mo84458h());
        }
        long j2 = kVar == null ? C112545k.f336973b : kVar.f336976a;
        long j3 = C112545k.f336974c;
        boolean z = false;
        if (!(j != j3)) {
            return j3;
        }
        if (j2 != j3) {
            z = true;
        }
        return z ? C112546l.m153761a(Math.max(C112545k.m153758d(j), C112545k.m153758d(j2)), Math.max(C112545k.m153756b(j), C112545k.m153756b(j2))) : j3;
    }

    /* renamed from: i */
    public void mo84459i(C104231f fVar) {
        C87412m.m108594g(fVar, "<this>");
        if (this.f322397s) {
            mo158149j(fVar, this.f322391j, mo158150k());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f322396r == -1) {
            this.f322396r = uptimeMillis;
        }
        float f = ((float) (uptimeMillis - this.f322396r)) / ((float) this.f322393o);
        float d = C61595o.m72296d(f, 0.0f, 1.0f) * mo158150k();
        float k = this.f322394p ? mo158150k() - d : mo158150k();
        this.f322397s = ((double) f) >= 1.0d;
        mo158149j(fVar, this.f322390i, k);
        mo158149j(fVar, this.f322391j, d);
        if (this.f322397s) {
            this.f322390i = null;
        } else {
            ((C108494d2) this.f322395q).setValue(Integer.valueOf(((Number) ((C108494d2) this.f322395q).getValue()).intValue() + 1));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo158149j(p835c1.C104231f r14, p1104d1.C106969c r15, float r16) {
        /*
            r13 = this;
            r0 = r13
            if (r15 == 0) goto L_0x00d5
            r1 = 0
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x000a
            goto L_0x00d5
        L_0x000a:
            long r1 = r14.mo145819e()
            long r3 = r15.mo84458h()
            long r5 = p1166z0.C112545k.f336974c
            r7 = 0
            r8 = 1
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x001c
            r9 = 1
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            if (r9 != 0) goto L_0x0071
            boolean r9 = p1166z0.C112545k.m153759e(r3)
            if (r9 == 0) goto L_0x0026
            goto L_0x0071
        L_0x0026:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x002c
            r9 = 1
            goto L_0x002d
        L_0x002c:
            r9 = 0
        L_0x002d:
            if (r9 != 0) goto L_0x0071
            boolean r9 = p1166z0.C112545k.m153759e(r1)
            if (r9 == 0) goto L_0x0036
            goto L_0x0071
        L_0x0036:
            float r9 = p1166z0.C112545k.m153758d(r3)
            float r3 = p1166z0.C112545k.m153756b(r3)
            float r4 = p1166z0.C112545k.m153758d(r1)
            float r10 = p1166z0.C112545k.m153756b(r1)
            p5.e r11 = r0.f322392n
            int r12 = p972h5.C108138d.f323803a
            java.lang.String r12 = "scale"
            gy3.C87412m.m108594g(r11, r12)
            float r4 = r4 / r9
            float r10 = r10 / r3
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x0064
            if (r11 != r8) goto L_0x005e
            float r4 = java.lang.Math.min(r4, r10)
            goto L_0x0068
        L_0x005e:
            rx3.j r1 = new rx3.j
            r1.<init>()
            throw r1
        L_0x0064:
            float r4 = java.lang.Math.max(r4, r10)
        L_0x0068:
            float r9 = r9 * r4
            float r4 = r4 * r3
            long r3 = p1166z0.C112546l.m153761a(r9, r4)
            goto L_0x0072
        L_0x0071:
            r3 = r1
        L_0x0072:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0077
            r7 = 1
        L_0x0077:
            if (r7 != 0) goto L_0x00c3
            boolean r5 = p1166z0.C112545k.m153759e(r1)
            if (r5 == 0) goto L_0x0080
            goto L_0x00c3
        L_0x0080:
            float r5 = p1166z0.C112545k.m153758d(r1)
            float r6 = p1166z0.C112545k.m153758d(r3)
            float r5 = r5 - r6
            r6 = 2
            float r6 = (float) r6
            float r7 = r5 / r6
            float r1 = p1166z0.C112545k.m153756b(r1)
            float r2 = p1166z0.C112545k.m153756b(r3)
            float r1 = r1 - r2
            float r8 = r1 / r6
            c1.e r1 = r14.mo145815B()
            c1.h r1 = r1.mo145836j()
            r1.mo145840c(r7, r8, r7, r8)
            j0.y0 r1 = r0.f322399u
            j0.d2 r1 = (p175j0.C108494d2) r1
            java.lang.Object r1 = r1.getValue()
            r6 = r1
            a1.x r6 = (p436a1.C103274x) r6
            r1 = r15
            r2 = r14
            r5 = r16
            r1.mo157379g(r2, r3, r5, r6)
            c1.e r1 = r14.mo145815B()
            c1.h r1 = r1.mo145836j()
            float r2 = -r7
            float r3 = -r8
            r1.mo145840c(r2, r3, r2, r3)
            goto L_0x00d5
        L_0x00c3:
            j0.y0 r1 = r0.f322399u
            j0.d2 r1 = (p175j0.C108494d2) r1
            java.lang.Object r1 = r1.getValue()
            r6 = r1
            a1.x r6 = (p436a1.C103274x) r6
            r1 = r15
            r2 = r14
            r5 = r16
            r1.mo157379g(r2, r3, r5, r6)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p532g5.C107733a.mo158149j(c1.f, d1.c, float):void");
    }

    /* renamed from: k */
    public final float mo158150k() {
        return ((Number) this.f322398t.getValue()).floatValue();
    }
}
