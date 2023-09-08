package androidx.compose.p002ui.platform;

import android.graphics.Outline;
import android.os.Build;
import com.google.android.gms.common.internal.Constants;
import gy3.C87412m;
import iy3.C60641c;
import p1166z0.C112535a;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p1166z0.C112541g;
import p1166z0.C112543i;
import p1166z0.C112544j;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p436a1.C103237h0;
import p436a1.C103240i;
import p436a1.C103245l;
import p436a1.C103252o0;
import p436a1.C103266t0;
import p436a1.C27726j0;
import p560i2.C108322d;
import p560i2.C33183o;
import rx3.C13603j;

/* renamed from: androidx.compose.ui.platform.m1 */
public final class C103664m1 {

    /* renamed from: a */
    public C108322d f306199a;

    /* renamed from: b */
    public boolean f306200b = true;

    /* renamed from: c */
    public final Outline f306201c;

    /* renamed from: d */
    public long f306202d;

    /* renamed from: e */
    public C103266t0 f306203e;

    /* renamed from: f */
    public C27726j0 f306204f;

    /* renamed from: g */
    public C27726j0 f306205g;

    /* renamed from: h */
    public boolean f306206h;

    /* renamed from: i */
    public boolean f306207i;

    /* renamed from: j */
    public C27726j0 f306208j;

    /* renamed from: k */
    public C112543i f306209k;

    /* renamed from: l */
    public float f306210l;

    /* renamed from: m */
    public long f306211m;

    /* renamed from: n */
    public long f306212n;

    /* renamed from: o */
    public boolean f306213o;

    /* renamed from: p */
    public C33183o f306214p;

    /* renamed from: q */
    public C103237h0 f306215q;

    public C103664m1(C108322d dVar) {
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        this.f306199a = dVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f306201c = outline;
        int i = C112545k.f336975d;
        long j = C112545k.f336973b;
        this.f306202d = j;
        this.f306203e = C103252o0.f304457a;
        int i2 = C112539e.f336958e;
        this.f306211m = C112539e.f336955b;
        this.f306212n = j;
        this.f306214p = C33183o.Ltr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if ((p1166z0.C112535a.m153728b(r8.f336969e) == r2) != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r13 == false) goto L_0x008d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo144806a(p436a1.C103262s r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "canvas"
            gy3.C87412m.m108594g(r1, r2)
            r17.mo144810e()
            a1.j0 r2 = r0.f306205g
            r3 = 0
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0018
            p436a1.C103262s.C103263a.m136765a(r1, r2, r5, r4, r3)
            goto L_0x0101
        L_0x0018:
            float r2 = r0.f306210l
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d5
            a1.j0 r7 = r0.f306208j
            z0.i r8 = r0.f306209k
            if (r7 == 0) goto L_0x008d
            long r9 = r0.f306211m
            long r11 = r0.f306212n
            r13 = 1
            if (r8 == 0) goto L_0x008a
            boolean r14 = p1166z0.C112544j.m153754b(r8)
            if (r14 != 0) goto L_0x0033
            goto L_0x008a
        L_0x0033:
            float r14 = r8.f336965a
            float r15 = p1166z0.C112539e.m153738c(r9)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x003f
            r14 = 1
            goto L_0x0040
        L_0x003f:
            r14 = 0
        L_0x0040:
            if (r14 == 0) goto L_0x008a
            float r14 = r8.f336966b
            float r15 = p1166z0.C112539e.m153739d(r9)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x004e
            r14 = 1
            goto L_0x004f
        L_0x004e:
            r14 = 0
        L_0x004f:
            if (r14 == 0) goto L_0x008a
            float r14 = r8.f336967c
            float r15 = p1166z0.C112539e.m153738c(r9)
            float r16 = p1166z0.C112545k.m153758d(r11)
            float r15 = r15 + r16
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x0063
            r14 = 1
            goto L_0x0064
        L_0x0063:
            r14 = 0
        L_0x0064:
            if (r14 == 0) goto L_0x008a
            float r14 = r8.f336968d
            float r9 = p1166z0.C112539e.m153739d(r9)
            float r10 = p1166z0.C112545k.m153756b(r11)
            float r9 = r9 + r10
            int r9 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0077
            r9 = 1
            goto L_0x0078
        L_0x0077:
            r9 = 0
        L_0x0078:
            if (r9 == 0) goto L_0x008a
            long r8 = r8.f336969e
            float r8 = p1166z0.C112535a.m153728b(r8)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0086
            r2 = 1
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            if (r2 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r13 = 0
        L_0x008b:
            if (r13 != 0) goto L_0x00d1
        L_0x008d:
            long r8 = r0.f306211m
            float r10 = p1166z0.C112539e.m153738c(r8)
            long r8 = r0.f306211m
            float r11 = p1166z0.C112539e.m153739d(r8)
            long r8 = r0.f306211m
            float r2 = p1166z0.C112539e.m153738c(r8)
            long r8 = r0.f306212n
            float r8 = p1166z0.C112545k.m153758d(r8)
            float r12 = r2 + r8
            long r8 = r0.f306211m
            float r2 = p1166z0.C112539e.m153739d(r8)
            long r8 = r0.f306212n
            float r8 = p1166z0.C112545k.m153756b(r8)
            float r13 = r2 + r8
            float r2 = r0.f306210l
            long r14 = p1166z0.C112536b.m153732b(r2, r6, r4, r3)
            z0.i r2 = p1166z0.C112544j.m153753a(r10, r11, r12, r13, r14)
            if (r7 != 0) goto L_0x00c7
            a1.j0 r6 = p436a1.C103245l.m136700a()
            r7 = r6
            goto L_0x00ca
        L_0x00c7:
            r7.reset()
        L_0x00ca:
            r7.mo55582g(r2)
            r0.f306209k = r2
            r0.f306208j = r7
        L_0x00d1:
            p436a1.C103262s.C103263a.m136765a(r1, r7, r5, r4, r3)
            goto L_0x0101
        L_0x00d5:
            long r2 = r0.f306211m
            float r2 = p1166z0.C112539e.m153738c(r2)
            long r3 = r0.f306211m
            float r3 = p1166z0.C112539e.m153739d(r3)
            long r4 = r0.f306211m
            float r4 = p1166z0.C112539e.m153738c(r4)
            long r5 = r0.f306212n
            float r5 = p1166z0.C112545k.m153758d(r5)
            float r4 = r4 + r5
            long r5 = r0.f306211m
            float r5 = p1166z0.C112539e.m153739d(r5)
            long r6 = r0.f306212n
            float r6 = p1166z0.C112545k.m153756b(r6)
            float r5 = r5 + r6
            r6 = 1
            r1 = r18
            r1.mo142942a(r2, r3, r4, r5, r6)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C103664m1.mo144806a(a1.s):void");
    }

    /* renamed from: b */
    public final Outline mo144807b() {
        mo144810e();
        if (!this.f306213o || !this.f306200b) {
            return null;
        }
        return this.f306201c;
    }

    /* renamed from: c */
    public final boolean mo144808c(long j) {
        C103237h0 h0Var;
        boolean b;
        if (!this.f306213o || (h0Var = this.f306215q) == null) {
            return true;
        }
        float c = C112539e.m153738c(j);
        float d = C112539e.m153739d(j);
        boolean z = false;
        if (h0Var instanceof C103237h0.C103238b) {
            C112541g gVar = ((C103237h0.C103238b) h0Var).f304446a;
            return gVar.f336961a <= c && c < gVar.f336963c && gVar.f336962b <= d && d < gVar.f336964d;
        } else if (h0Var instanceof C103237h0.C103239c) {
            C112543i iVar = ((C103237h0.C103239c) h0Var).f304447a;
            if (c >= iVar.f336965a && c < iVar.f336967c && d >= iVar.f336966b && d < iVar.f336968d) {
                if (C112535a.m153728b(iVar.f336969e) + C112535a.m153728b(iVar.f336970f) <= iVar.f336967c - iVar.f336965a && C112535a.m153728b(iVar.f336972h) + C112535a.m153728b(iVar.f336971g) <= iVar.f336967c - iVar.f336965a && C112535a.m153729c(iVar.f336969e) + C112535a.m153729c(iVar.f336972h) <= iVar.f336968d - iVar.f336966b && C112535a.m153729c(iVar.f336970f) + C112535a.m153729c(iVar.f336971g) <= iVar.f336968d - iVar.f336966b) {
                    z = true;
                }
                if (!z) {
                    C103240i iVar2 = (C103240i) C103245l.m136700a();
                    iVar2.mo55582g(iVar);
                    return C103705w1.m137998a(iVar2, c, d, (C27726j0) null, (C27726j0) null);
                }
                float b2 = C112535a.m153728b(iVar.f336969e) + iVar.f336965a;
                float c2 = C112535a.m153729c(iVar.f336969e) + iVar.f336966b;
                float b3 = iVar.f336967c - C112535a.m153728b(iVar.f336970f);
                float c3 = iVar.f336966b + C112535a.m153729c(iVar.f336970f);
                float b4 = iVar.f336967c - C112535a.m153728b(iVar.f336971g);
                float c4 = iVar.f336968d - C112535a.m153729c(iVar.f336971g);
                float c5 = iVar.f336968d - C112535a.m153729c(iVar.f336972h);
                float b5 = C112535a.m153728b(iVar.f336972h) + iVar.f336965a;
                if (c < b2 && d < c2) {
                    b = C103705w1.m137999b(c, d, iVar.f336969e, b2, c2);
                } else if (c < b5 && d > c5) {
                    b = C103705w1.m137999b(c, d, iVar.f336972h, b5, c5);
                } else if (c > b3 && d < c3) {
                    b = C103705w1.m137999b(c, d, iVar.f336970f, b3, c3);
                } else if (c <= b4 || d <= c4) {
                    return true;
                } else {
                    b = C103705w1.m137999b(c, d, iVar.f336971g, b4, c4);
                }
                return b;
            }
        } else if (h0Var instanceof C103237h0.C27725a) {
            C103237h0.C27725a aVar = (C103237h0.C27725a) h0Var;
            return C103705w1.m137998a((C27726j0) null, c, d, (C27726j0) null, (C27726j0) null);
        } else {
            throw new C13603j();
        }
    }

    /* renamed from: d */
    public final boolean mo144809d(C103266t0 t0Var, float f, boolean z, float f2, C33183o oVar, C108322d dVar) {
        C87412m.m108594g(t0Var, "shape");
        C87412m.m108594g(oVar, "layoutDirection");
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        this.f306201c.setAlpha(f);
        boolean z2 = !C87412m.m108589b(this.f306203e, t0Var);
        if (z2) {
            this.f306203e = t0Var;
            this.f306206h = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.f306213o != z3) {
            this.f306213o = z3;
            this.f306206h = true;
        }
        if (this.f306214p != oVar) {
            this.f306214p = oVar;
            this.f306206h = true;
        }
        if (!C87412m.m108589b(this.f306199a, dVar)) {
            this.f306199a = dVar;
            this.f306206h = true;
        }
        return z2;
    }

    /* renamed from: e */
    public final void mo144810e() {
        if (this.f306206h) {
            int i = C112539e.f336958e;
            this.f306211m = C112539e.f336955b;
            long j = this.f306202d;
            this.f306212n = j;
            this.f306210l = 0.0f;
            this.f306205g = null;
            this.f306206h = false;
            this.f306207i = false;
            if (!this.f306213o || C112545k.m153758d(j) <= 0.0f || C112545k.m153756b(this.f306202d) <= 0.0f) {
                this.f306201c.setEmpty();
                return;
            }
            this.f306200b = true;
            C103237h0 a = this.f306203e.mo143025a(this.f306202d, this.f306214p, this.f306199a);
            this.f306215q = a;
            if (a instanceof C103237h0.C103238b) {
                C112541g gVar = ((C103237h0.C103238b) a).f304446a;
                this.f306211m = C112540f.m153745a(gVar.f336961a, gVar.f336962b);
                this.f306212n = C112546l.m153761a(gVar.f336963c - gVar.f336961a, gVar.f336964d - gVar.f336962b);
                this.f306201c.setRect(C60641c.m70921b(gVar.f336961a), C60641c.m70921b(gVar.f336962b), C60641c.m70921b(gVar.f336963c), C60641c.m70921b(gVar.f336964d));
            } else if (a instanceof C103237h0.C103239c) {
                C112543i iVar = ((C103237h0.C103239c) a).f304447a;
                float b = C112535a.m153728b(iVar.f336969e);
                this.f306211m = C112540f.m153745a(iVar.f336965a, iVar.f336966b);
                this.f306212n = C112546l.m153761a(iVar.f336967c - iVar.f336965a, iVar.f336968d - iVar.f336966b);
                if (C112544j.m153754b(iVar)) {
                    this.f306201c.setRoundRect(C60641c.m70921b(iVar.f336965a), C60641c.m70921b(iVar.f336966b), C60641c.m70921b(iVar.f336967c), C60641c.m70921b(iVar.f336968d), b);
                    this.f306210l = b;
                    return;
                }
                C27726j0 j0Var = this.f306204f;
                if (j0Var == null) {
                    j0Var = C103245l.m136700a();
                    this.f306204f = j0Var;
                }
                C103240i iVar2 = (C103240i) j0Var;
                iVar2.reset();
                iVar2.mo55582g(iVar);
                mo144811f(iVar2);
            } else if (a instanceof C103237h0.C27725a) {
                ((C103237h0.C27725a) a).getClass();
                mo144811f((C27726j0) null);
            }
        }
    }

    /* renamed from: f */
    public final void mo144811f(C27726j0 j0Var) {
        if (Build.VERSION.SDK_INT > 28 || j0Var.mo55583h()) {
            Outline outline = this.f306201c;
            if (j0Var instanceof C103240i) {
                outline.setConvexPath(((C103240i) j0Var).f304449a);
                this.f306207i = !this.f306201c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.f306200b = false;
            this.f306201c.setEmpty();
            this.f306207i = true;
        }
        this.f306205g = j0Var;
    }
}
