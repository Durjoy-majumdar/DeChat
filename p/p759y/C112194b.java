package p759y;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import gy3.C87412m;
import iy3.C60641c;
import java.util.List;
import p1166z0.C112539e;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p175j0.C108494d2;
import p175j0.C108500f2;
import p175j0.C108516z0;
import p175j0.C60690y0;
import p436a1.C103223b;
import p436a1.C103226c;
import p436a1.C103262s;
import p436a1.C103276y;
import p560i2.C108330s;
import p835c1.C104231f;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: y.b */
public final class C112194b implements C112241i0 {

    /* renamed from: a */
    public final C112226g0 f335897a;

    /* renamed from: b */
    public final EdgeEffect f335898b;

    /* renamed from: c */
    public final EdgeEffect f335899c;

    /* renamed from: d */
    public final EdgeEffect f335900d;

    /* renamed from: e */
    public final EdgeEffect f335901e;

    /* renamed from: f */
    public final List<EdgeEffect> f335902f;

    /* renamed from: g */
    public final EdgeEffect f335903g;

    /* renamed from: h */
    public final EdgeEffect f335904h;

    /* renamed from: i */
    public final EdgeEffect f335905i;

    /* renamed from: j */
    public final EdgeEffect f335906j;

    /* renamed from: k */
    public final C60690y0<C13598b0> f335907k;

    /* renamed from: l */
    public long f335908l;

    /* renamed from: m */
    public boolean f335909m;

    public C112194b(Context context, C112226g0 g0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(g0Var, "overScrollConfig");
        this.f335897a = g0Var;
        C112193a0 a0Var = C112193a0.f335896a;
        EdgeEffect a = a0Var.mo163999a(context, (AttributeSet) null);
        this.f335898b = a;
        EdgeEffect a2 = a0Var.mo163999a(context, (AttributeSet) null);
        this.f335899c = a2;
        EdgeEffect a3 = a0Var.mo163999a(context, (AttributeSet) null);
        this.f335900d = a3;
        EdgeEffect a4 = a0Var.mo163999a(context, (AttributeSet) null);
        this.f335901e = a4;
        List<EdgeEffect> f = C64197v.m75537f(a3, a, a4, a2);
        this.f335902f = f;
        this.f335903g = a0Var.mo163999a(context, (AttributeSet) null);
        this.f335904h = a0Var.mo163999a(context, (AttributeSet) null);
        this.f335905i = a0Var.mo163999a(context, (AttributeSet) null);
        this.f335906j = a0Var.mo163999a(context, (AttributeSet) null);
        int size = f.size();
        for (int i = 0; i < size; i++) {
            f.get(i).setColor(C103276y.m136796g(this.f335897a.f336013a));
        }
        this.f335907k = C108500f2.m146995b(C13598b0.f38549a, C108516z0.f324839a);
        int i2 = C112545k.f336975d;
        this.f335908l = C112545k.f336973b;
    }

    /* renamed from: a */
    public void mo164002a(C104231f fVar) {
        boolean z;
        C87412m.m108594g(fVar, "<this>");
        C103262s i = fVar.mo145815B().mo145835i();
        ((C108494d2) this.f335907k).getValue();
        if (!mo164012k()) {
            Canvas canvas = C103226c.f304431a;
            C87412m.m108594g(i, "<this>");
            Canvas canvas2 = ((C103223b) i).f304427a;
            C112193a0 a0Var = C112193a0.f335896a;
            boolean z2 = true;
            if (!(a0Var.mo164000b(this.f335905i) == 0.0f)) {
                mo164011j(fVar, this.f335905i, canvas2);
                this.f335905i.finish();
            }
            if (!this.f335900d.isFinished()) {
                z = mo164010i(fVar, this.f335900d, canvas2);
                a0Var.mo164001c(this.f335905i, a0Var.mo164000b(this.f335900d), 0.0f);
            } else {
                z = false;
            }
            if (!(a0Var.mo164000b(this.f335903g) == 0.0f)) {
                mo164009h(fVar, this.f335903g, canvas2);
                this.f335903g.finish();
            }
            if (!this.f335898b.isFinished()) {
                EdgeEffect edgeEffect = this.f335898b;
                int save = canvas2.save();
                canvas2.translate(0.0f, fVar.mo143034T(this.f335897a.f336015c.mo142922d()));
                boolean draw = edgeEffect.draw(canvas2);
                canvas2.restoreToCount(save);
                z = draw || z;
                a0Var.mo164001c(this.f335903g, a0Var.mo164000b(this.f335898b), 0.0f);
            }
            if (!(a0Var.mo164000b(this.f335906j) == 0.0f)) {
                mo164010i(fVar, this.f335906j, canvas2);
                this.f335906j.finish();
            }
            if (!this.f335901e.isFinished()) {
                z = mo164011j(fVar, this.f335901e, canvas2) || z;
                a0Var.mo164001c(this.f335906j, a0Var.mo164000b(this.f335901e), 0.0f);
            }
            if (!(a0Var.mo164000b(this.f335904h) == 0.0f)) {
                EdgeEffect edgeEffect2 = this.f335904h;
                int save2 = canvas2.save();
                canvas2.translate(0.0f, fVar.mo143034T(this.f335897a.f336015c.mo142922d()));
                edgeEffect2.draw(canvas2);
                canvas2.restoreToCount(save2);
                this.f335904h.finish();
            }
            if (!this.f335899c.isFinished()) {
                if (!mo164009h(fVar, this.f335899c, canvas2) && !z) {
                    z2 = false;
                }
                a0Var.mo164001c(this.f335904h, a0Var.mo164000b(this.f335899c), 0.0f);
                z = z2;
            }
            if (z) {
                mo164013l();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo164003b(long r7, p1166z0.C112539e r9, int r10) {
        /*
            r6 = this;
            boolean r0 = r6.mo164012k()
            if (r0 != 0) goto L_0x00ec
            r0 = 0
            r1 = 1
            if (r10 != r1) goto L_0x000c
            r10 = 1
            goto L_0x000d
        L_0x000c:
            r10 = 0
        L_0x000d:
            if (r10 != 0) goto L_0x0011
            goto L_0x00ec
        L_0x0011:
            if (r9 == 0) goto L_0x0016
            long r9 = r9.f336959a
            goto L_0x001c
        L_0x0016:
            long r9 = r6.f335908l
            long r9 = p1166z0.C112546l.m153762b(r9)
        L_0x001c:
            float r2 = p1166z0.C112539e.m153739d(r7)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0027
            r2 = 1
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r2 == 0) goto L_0x002c
        L_0x002a:
            r4 = 0
            goto L_0x007d
        L_0x002c:
            y.a0 r2 = p759y.C112193a0.f335896a
            android.widget.EdgeEffect r4 = r6.f335898b
            float r4 = r2.mo164000b(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x003a
            r4 = 1
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            if (r4 != 0) goto L_0x0056
            float r4 = r6.mo164017p(r7, r9)
            android.widget.EdgeEffect r5 = r6.f335898b
            float r2 = r2.mo164000b(r5)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x004d
            r2 = 1
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            if (r2 == 0) goto L_0x007d
            android.widget.EdgeEffect r2 = r6.f335898b
            r2.onRelease()
            goto L_0x007d
        L_0x0056:
            android.widget.EdgeEffect r4 = r6.f335899c
            float r4 = r2.mo164000b(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0062
            r4 = 1
            goto L_0x0063
        L_0x0062:
            r4 = 0
        L_0x0063:
            if (r4 != 0) goto L_0x002a
            float r4 = r6.mo164014m(r7, r9)
            android.widget.EdgeEffect r5 = r6.f335899c
            float r2 = r2.mo164000b(r5)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0075
            r2 = 1
            goto L_0x0076
        L_0x0075:
            r2 = 0
        L_0x0076:
            if (r2 == 0) goto L_0x007d
            android.widget.EdgeEffect r2 = r6.f335899c
            r2.onRelease()
        L_0x007d:
            float r2 = p1166z0.C112539e.m153738c(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0087
            r2 = 1
            goto L_0x0088
        L_0x0087:
            r2 = 0
        L_0x0088:
            if (r2 == 0) goto L_0x008b
            goto L_0x00da
        L_0x008b:
            y.a0 r2 = p759y.C112193a0.f335896a
            android.widget.EdgeEffect r5 = r6.f335900d
            float r5 = r2.mo164000b(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0099
            r5 = 1
            goto L_0x009a
        L_0x0099:
            r5 = 0
        L_0x009a:
            if (r5 != 0) goto L_0x00b4
            float r7 = r6.mo164015n(r7, r9)
            android.widget.EdgeEffect r8 = r6.f335900d
            float r8 = r2.mo164000b(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00ab
            r0 = 1
        L_0x00ab:
            if (r0 == 0) goto L_0x00b2
            android.widget.EdgeEffect r8 = r6.f335900d
            r8.onRelease()
        L_0x00b2:
            r3 = r7
            goto L_0x00da
        L_0x00b4:
            android.widget.EdgeEffect r5 = r6.f335901e
            float r5 = r2.mo164000b(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00c0
            r5 = 1
            goto L_0x00c1
        L_0x00c0:
            r5 = 0
        L_0x00c1:
            if (r5 != 0) goto L_0x00da
            float r7 = r6.mo164016o(r7, r9)
            android.widget.EdgeEffect r8 = r6.f335901e
            float r8 = r2.mo164000b(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00d2
            r0 = 1
        L_0x00d2:
            if (r0 == 0) goto L_0x00b2
            android.widget.EdgeEffect r8 = r6.f335901e
            r8.onRelease()
            goto L_0x00b2
        L_0x00da:
            long r7 = p1166z0.C112540f.m153745a(r3, r4)
            int r9 = p1166z0.C112539e.f336958e
            long r9 = p1166z0.C112539e.f336955b
            boolean r9 = p1166z0.C112539e.m153736a(r7, r9)
            if (r9 != 0) goto L_0x00eb
            r6.mo164013l()
        L_0x00eb:
            return r7
        L_0x00ec:
            int r7 = p1166z0.C112539e.f336958e
            long r7 = p1166z0.C112539e.f336955b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112194b.mo164003b(long, z0.e, int):long");
    }

    /* renamed from: c */
    public void mo164004c(long j, long j2, C112539e eVar, int i) {
        boolean z;
        boolean z2;
        if (!mo164012k()) {
            boolean z3 = true;
            if (i == 1) {
                long b = eVar != null ? eVar.f336959a : C112546l.m153762b(this.f335908l);
                if (C112539e.m153738c(j2) > 0.0f) {
                    mo164015n(j2, b);
                } else if (C112539e.m153738c(j2) < 0.0f) {
                    mo164016o(j2, b);
                }
                if (C112539e.m153739d(j2) > 0.0f) {
                    mo164017p(j2, b);
                } else if (C112539e.m153739d(j2) < 0.0f) {
                    mo164014m(j2, b);
                }
                int i2 = C112539e.f336958e;
                z = !C112539e.m153736a(j2, C112539e.f336955b);
            } else {
                z = false;
            }
            if (this.f335900d.isFinished() || C112539e.m153738c(j) >= 0.0f) {
                z2 = false;
            } else {
                this.f335900d.onRelease();
                z2 = this.f335900d.isFinished();
            }
            if (!this.f335901e.isFinished() && C112539e.m153738c(j) > 0.0f) {
                this.f335901e.onRelease();
                z2 = z2 || this.f335901e.isFinished();
            }
            if (!this.f335898b.isFinished() && C112539e.m153739d(j) < 0.0f) {
                this.f335898b.onRelease();
                z2 = z2 || this.f335898b.isFinished();
            }
            if (!this.f335899c.isFinished() && C112539e.m153739d(j) > 0.0f) {
                this.f335899c.onRelease();
                z2 = z2 || this.f335899c.isFinished();
            }
            if (!z2 && !z) {
                z3 = false;
            }
            if (z3) {
                mo164013l();
            }
        }
    }

    /* renamed from: d */
    public void mo164005d(long j) {
        if (!mo164012k()) {
            if (C108330s.m146746b(j) > 0.0f) {
                EdgeEffect edgeEffect = this.f335900d;
                int b = C60641c.m70921b(C108330s.m146746b(j));
                C87412m.m108594g(edgeEffect, "<this>");
                if (Build.VERSION.SDK_INT >= 31) {
                    edgeEffect.onAbsorb(b);
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb(b);
                }
            } else if (C108330s.m146746b(j) < 0.0f) {
                EdgeEffect edgeEffect2 = this.f335901e;
                int i = -C60641c.m70921b(C108330s.m146746b(j));
                C87412m.m108594g(edgeEffect2, "<this>");
                if (Build.VERSION.SDK_INT >= 31) {
                    edgeEffect2.onAbsorb(i);
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb(i);
                }
            }
            if (C108330s.m146747c(j) > 0.0f) {
                EdgeEffect edgeEffect3 = this.f335898b;
                int b2 = C60641c.m70921b(C108330s.m146747c(j));
                C87412m.m108594g(edgeEffect3, "<this>");
                if (Build.VERSION.SDK_INT >= 31) {
                    edgeEffect3.onAbsorb(b2);
                } else if (edgeEffect3.isFinished()) {
                    edgeEffect3.onAbsorb(b2);
                }
            } else if (C108330s.m146747c(j) < 0.0f) {
                EdgeEffect edgeEffect4 = this.f335899c;
                int i2 = -C60641c.m70921b(C108330s.m146747c(j));
                C87412m.m108594g(edgeEffect4, "<this>");
                if (Build.VERSION.SDK_INT >= 31) {
                    edgeEffect4.onAbsorb(i2);
                } else if (edgeEffect4.isFinished()) {
                    edgeEffect4.onAbsorb(i2);
                }
            }
            if (!(j == C108330s.f324354b)) {
                mo164013l();
            }
        }
    }

    /* renamed from: e */
    public boolean mo164006e() {
        boolean z;
        long b = C112546l.m153762b(this.f335908l);
        C112193a0 a0Var = C112193a0.f335896a;
        boolean z2 = false;
        if (!(a0Var.mo164000b(this.f335900d) == 0.0f)) {
            int i = C112539e.f336958e;
            mo164015n(C112539e.f336955b, b);
            z = true;
        } else {
            z = false;
        }
        if (!(a0Var.mo164000b(this.f335901e) == 0.0f)) {
            int i2 = C112539e.f336958e;
            mo164016o(C112539e.f336955b, b);
            z = true;
        }
        if (!(a0Var.mo164000b(this.f335898b) == 0.0f)) {
            int i3 = C112539e.f336958e;
            mo164017p(C112539e.f336955b, b);
            z = true;
        }
        if (a0Var.mo164000b(this.f335899c) == 0.0f) {
            z2 = true;
        }
        if (z2) {
            return z;
        }
        int i4 = C112539e.f336958e;
        mo164014m(C112539e.f336955b, b);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x012b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo164007f(long r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo164012k()
            if (r0 == 0) goto L_0x0009
            long r10 = p560i2.C108330s.f324354b
            return r10
        L_0x0009:
            float r0 = p560i2.C108330s.m146746b(r10)
            r1 = 31
            java.lang.String r2 = "<this>"
            r3 = 0
            r4 = 1
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            android.widget.EdgeEffect r0 = r9.f335900d
            gy3.C87412m.m108594g(r0, r2)
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L_0x0028
            y.d r7 = p759y.C112208d.f335949a
            float r0 = r7.mo164026b(r0)
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x002f
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 != 0) goto L_0x0053
            android.widget.EdgeEffect r0 = r9.f335900d
            float r7 = p560i2.C108330s.m146746b(r10)
            int r7 = iy3.C60641c.m70921b(r7)
            gy3.C87412m.m108594g(r0, r2)
            if (r6 < r1) goto L_0x0045
            r0.onAbsorb(r7)
            goto L_0x004e
        L_0x0045:
            boolean r6 = r0.isFinished()
            if (r6 == 0) goto L_0x004e
            r0.onAbsorb(r7)
        L_0x004e:
            float r0 = p560i2.C108330s.m146746b(r10)
            goto L_0x0098
        L_0x0053:
            float r0 = p560i2.C108330s.m146746b(r10)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0097
            android.widget.EdgeEffect r0 = r9.f335901e
            gy3.C87412m.m108594g(r0, r2)
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L_0x006b
            y.d r7 = p759y.C112208d.f335949a
            float r0 = r7.mo164026b(r0)
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 != 0) goto L_0x0097
            android.widget.EdgeEffect r0 = r9.f335901e
            float r7 = p560i2.C108330s.m146746b(r10)
            int r7 = iy3.C60641c.m70921b(r7)
            int r7 = -r7
            gy3.C87412m.m108594g(r0, r2)
            if (r6 < r1) goto L_0x0089
            r0.onAbsorb(r7)
            goto L_0x0092
        L_0x0089:
            boolean r6 = r0.isFinished()
            if (r6 == 0) goto L_0x0092
            r0.onAbsorb(r7)
        L_0x0092:
            float r0 = p560i2.C108330s.m146746b(r10)
            goto L_0x0098
        L_0x0097:
            r0 = 0
        L_0x0098:
            float r6 = p560i2.C108330s.m146747c(r10)
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00db
            android.widget.EdgeEffect r6 = r9.f335898b
            gy3.C87412m.m108594g(r6, r2)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r1) goto L_0x00b0
            y.d r8 = p759y.C112208d.f335949a
            float r6 = r8.mo164026b(r6)
            goto L_0x00b1
        L_0x00b0:
            r6 = 0
        L_0x00b1:
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L_0x00b7
            r6 = 1
            goto L_0x00b8
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            if (r6 != 0) goto L_0x00db
            android.widget.EdgeEffect r5 = r9.f335898b
            float r6 = p560i2.C108330s.m146747c(r10)
            int r6 = iy3.C60641c.m70921b(r6)
            gy3.C87412m.m108594g(r5, r2)
            if (r7 < r1) goto L_0x00cd
            r5.onAbsorb(r6)
            goto L_0x00d6
        L_0x00cd:
            boolean r1 = r5.isFinished()
            if (r1 == 0) goto L_0x00d6
            r5.onAbsorb(r6)
        L_0x00d6:
            float r5 = p560i2.C108330s.m146747c(r10)
            goto L_0x011e
        L_0x00db:
            float r6 = p560i2.C108330s.m146747c(r10)
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x011e
            android.widget.EdgeEffect r6 = r9.f335899c
            gy3.C87412m.m108594g(r6, r2)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r1) goto L_0x00f3
            y.d r8 = p759y.C112208d.f335949a
            float r6 = r8.mo164026b(r6)
            goto L_0x00f4
        L_0x00f3:
            r6 = 0
        L_0x00f4:
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L_0x00fa
            r6 = 1
            goto L_0x00fb
        L_0x00fa:
            r6 = 0
        L_0x00fb:
            if (r6 != 0) goto L_0x011e
            android.widget.EdgeEffect r5 = r9.f335899c
            float r6 = p560i2.C108330s.m146747c(r10)
            int r6 = iy3.C60641c.m70921b(r6)
            int r6 = -r6
            gy3.C87412m.m108594g(r5, r2)
            if (r7 < r1) goto L_0x0111
            r5.onAbsorb(r6)
            goto L_0x011a
        L_0x0111:
            boolean r1 = r5.isFinished()
            if (r1 == 0) goto L_0x011a
            r5.onAbsorb(r6)
        L_0x011a:
            float r5 = p560i2.C108330s.m146747c(r10)
        L_0x011e:
            long r10 = p560i2.C108331t.m146750a(r0, r5)
            long r0 = p560i2.C108330s.f324354b
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0129
            r3 = 1
        L_0x0129:
            if (r3 != 0) goto L_0x012e
            r9.mo164013l()
        L_0x012e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112194b.mo164007f(long):long");
    }

    /* renamed from: g */
    public void mo164008g(long j, boolean z) {
        boolean z2 = true;
        boolean z3 = !C112545k.m153755a(j, this.f335908l);
        if (this.f335909m == z) {
            z2 = false;
        }
        this.f335908l = j;
        this.f335909m = z;
        if (z3) {
            this.f335898b.setSize(C60641c.m70921b(C112545k.m153758d(j)), C60641c.m70921b(C112545k.m153756b(j)));
            this.f335899c.setSize(C60641c.m70921b(C112545k.m153758d(j)), C60641c.m70921b(C112545k.m153756b(j)));
            this.f335900d.setSize(C60641c.m70921b(C112545k.m153756b(j)), C60641c.m70921b(C112545k.m153758d(j)));
            this.f335901e.setSize(C60641c.m70921b(C112545k.m153756b(j)), C60641c.m70921b(C112545k.m153758d(j)));
            this.f335903g.setSize(C60641c.m70921b(C112545k.m153758d(j)), C60641c.m70921b(C112545k.m153756b(j)));
            this.f335904h.setSize(C60641c.m70921b(C112545k.m153758d(j)), C60641c.m70921b(C112545k.m153756b(j)));
            this.f335905i.setSize(C60641c.m70921b(C112545k.m153756b(j)), C60641c.m70921b(C112545k.m153758d(j)));
            this.f335906j.setSize(C60641c.m70921b(C112545k.m153756b(j)), C60641c.m70921b(C112545k.m153758d(j)));
        }
        if (z2 || z3) {
            mo164013l();
            release();
        }
    }

    /* renamed from: h */
    public final boolean mo164009h(C104231f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-C112545k.m153758d(this.f335908l), (-C112545k.m153756b(this.f335908l)) + fVar.mo143034T(this.f335897a.f336015c.mo142921c()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: i */
    public final boolean mo164010i(C104231f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-C112545k.m153756b(this.f335908l), fVar.mo143034T(this.f335897a.f336015c.mo142919a(fVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: j */
    public final boolean mo164011j(C104231f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int b = C60641c.m70921b(C112545k.m153758d(this.f335908l));
        float b2 = this.f335897a.f336015c.mo142920b(fVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-((float) b)) + fVar.mo143034T(b2));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: k */
    public final boolean mo164012k() {
        return !this.f335897a.f336014b && !this.f335909m;
    }

    /* renamed from: l */
    public final void mo164013l() {
        ((C108494d2) this.f335907k).setValue(C13598b0.f38549a);
    }

    /* renamed from: m */
    public final float mo164014m(long j, long j2) {
        float c = C112539e.m153738c(j2) / C112545k.m153758d(this.f335908l);
        float d = C112539e.m153739d(j) / C112545k.m153756b(this.f335908l);
        EdgeEffect edgeEffect = this.f335899c;
        float f = -d;
        float f2 = ((float) 1) - c;
        C87412m.m108594g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f = C112208d.f335949a.mo164027c(edgeEffect, f, f2);
        } else {
            edgeEffect.onPull(f, f2);
        }
        return (-f) * C112545k.m153756b(this.f335908l);
    }

    /* renamed from: n */
    public final float mo164015n(long j, long j2) {
        float d = C112539e.m153739d(j2) / C112545k.m153756b(this.f335908l);
        float c = C112539e.m153738c(j) / C112545k.m153758d(this.f335908l);
        EdgeEffect edgeEffect = this.f335900d;
        float f = ((float) 1) - d;
        C87412m.m108594g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            c = C112208d.f335949a.mo164027c(edgeEffect, c, f);
        } else {
            edgeEffect.onPull(c, f);
        }
        return c * C112545k.m153758d(this.f335908l);
    }

    /* renamed from: o */
    public final float mo164016o(long j, long j2) {
        float d = C112539e.m153739d(j2) / C112545k.m153756b(this.f335908l);
        float c = C112539e.m153738c(j) / C112545k.m153758d(this.f335908l);
        EdgeEffect edgeEffect = this.f335901e;
        float f = -c;
        C87412m.m108594g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f = C112208d.f335949a.mo164027c(edgeEffect, f, d);
        } else {
            edgeEffect.onPull(f, d);
        }
        return (-f) * C112545k.m153758d(this.f335908l);
    }

    /* renamed from: p */
    public final float mo164017p(long j, long j2) {
        float c = C112539e.m153738c(j2) / C112545k.m153758d(this.f335908l);
        float d = C112539e.m153739d(j) / C112545k.m153756b(this.f335908l);
        EdgeEffect edgeEffect = this.f335898b;
        C87412m.m108594g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            d = C112208d.f335949a.mo164027c(edgeEffect, d, c);
        } else {
            edgeEffect.onPull(d, c);
        }
        return d * C112545k.m153756b(this.f335908l);
    }

    public void release() {
        if (!mo164012k()) {
            List<EdgeEffect> list = this.f335902f;
            int size = list.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                EdgeEffect edgeEffect = list.get(i);
                edgeEffect.onRelease();
                z = edgeEffect.isFinished() || z;
            }
            if (z) {
                mo164013l();
            }
        }
    }
}
