package p436a1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import gy3.C87412m;
import p1166z0.C112539e;
import p1166z0.C112541g;
import p560i2.C33177j;
import p560i2.C33181m;
import rx3.C13598b0;

/* renamed from: a1.b */
public final class C103223b implements C103262s {

    /* renamed from: a */
    public Canvas f304427a = C103226c.f304431a;

    /* renamed from: b */
    public final Rect f304428b = new Rect();

    /* renamed from: c */
    public final Rect f304429c = new Rect();

    /* renamed from: a */
    public void mo142942a(float f, float f2, float f3, float f4, int i) {
        this.f304427a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    /* renamed from: b */
    public void mo142943b() {
        this.f304427a.restore();
    }

    /* renamed from: c */
    public void mo142944c() {
        this.f304427a.save();
    }

    /* renamed from: d */
    public void mo142945d(float f, float f2) {
        this.f304427a.translate(f, f2);
    }

    /* renamed from: e */
    public void mo142946e(C27726j0 j0Var, int i) {
        C87412m.m108594g(j0Var, "path");
        Canvas canvas = this.f304427a;
        if (j0Var instanceof C103240i) {
            canvas.clipPath(((C103240i) j0Var).f304449a, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: f */
    public void mo142947f(C112541g gVar, C103241i0 i0Var) {
        C87412m.m108594g(gVar, "rect");
        C87412m.m108594g(i0Var, "paint");
        mo142955n(gVar.f336961a, gVar.f336962b, gVar.f336963c, gVar.f336964d, i0Var);
    }

    /* renamed from: g */
    public void mo142948g(C112541g gVar, int i) {
        C87412m.m108594g(gVar, "rect");
        mo142942a(gVar.f336961a, gVar.f336962b, gVar.f336963c, gVar.f336964d, i);
    }

    /* renamed from: h */
    public void mo142949h(C27726j0 j0Var, C103241i0 i0Var) {
        C87412m.m108594g(j0Var, "path");
        C87412m.m108594g(i0Var, "paint");
        Canvas canvas = this.f304427a;
        if (j0Var instanceof C103240i) {
            canvas.drawPath(((C103240i) j0Var).f304449a, i0Var.mo142992f());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: i */
    public void mo142950i() {
        C103267u.f304486a.mo143045a(this.f304427a, false);
    }

    /* renamed from: j */
    public void mo142951j(C112541g gVar, C103241i0 i0Var) {
        C87412m.m108594g(gVar, "bounds");
        C87412m.m108594g(i0Var, "paint");
        this.f304427a.saveLayer(gVar.f336961a, gVar.f336962b, gVar.f336963c, gVar.f336964d, i0Var.mo142992f(), 31);
    }

    /* renamed from: k */
    public void mo142952k(float f, float f2) {
        this.f304427a.scale(f, f2);
    }

    /* renamed from: l */
    public void mo142953l(long j, long j2, C103241i0 i0Var) {
        C87412m.m108594g(i0Var, "paint");
        this.f304427a.drawLine(C112539e.m153738c(j), C112539e.m153739d(j), C112539e.m153738c(j2), C112539e.m153739d(j2), i0Var.mo142992f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo142954m(float[] r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "matrix"
            gy3.C87412m.m108594g(r0, r1)
            r1 = 0
            r2 = 0
        L_0x0009:
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r5 = 4
            r6 = 1
            if (r2 >= r5) goto L_0x002f
            r7 = 0
        L_0x0011:
            if (r7 >= r5) goto L_0x002c
            if (r2 != r7) goto L_0x0018
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0019
        L_0x0018:
            r8 = 0
        L_0x0019:
            int r9 = r2 * 4
            int r9 = r9 + r7
            r9 = r0[r9]
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0024
            r8 = 1
            goto L_0x0025
        L_0x0024:
            r8 = 0
        L_0x0025:
            if (r8 != 0) goto L_0x0029
            r2 = 0
            goto L_0x0030
        L_0x0029:
            int r7 = r7 + 1
            goto L_0x0011
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x002f:
            r2 = 1
        L_0x0030:
            if (r2 != 0) goto L_0x00f2
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r7 = 2
            r8 = r0[r7]
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            r9 = 1
            goto L_0x0041
        L_0x0040:
            r9 = 0
        L_0x0041:
            r10 = 8
            r11 = 6
            if (r9 == 0) goto L_0x0092
            r9 = r0[r11]
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x004e
            r9 = 1
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            if (r9 == 0) goto L_0x0092
            r9 = 10
            r9 = r0[r9]
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x005b
            r3 = 1
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 == 0) goto L_0x0092
            r3 = 14
            r3 = r0[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0068
            r3 = 1
            goto L_0x0069
        L_0x0068:
            r3 = 0
        L_0x0069:
            if (r3 == 0) goto L_0x0092
            r3 = r0[r10]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            if (r3 == 0) goto L_0x0092
            r3 = 9
            r3 = r0[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0080
            r3 = 1
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            if (r3 == 0) goto L_0x0092
            r3 = 11
            r3 = r0[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x008d
            r3 = 1
            goto L_0x008e
        L_0x008d:
            r3 = 0
        L_0x008e:
            if (r3 == 0) goto L_0x0092
            r3 = 1
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 == 0) goto L_0x00e4
            r3 = r0[r1]
            r4 = r0[r6]
            r9 = 3
            r12 = r0[r9]
            r13 = r0[r5]
            r14 = 5
            r15 = r0[r14]
            r16 = r0[r11]
            r17 = 7
            r18 = r0[r17]
            r19 = r0[r10]
            r20 = 12
            r20 = r0[r20]
            r21 = 13
            r21 = r0[r21]
            r22 = 15
            r22 = r0[r22]
            r0[r1] = r3
            r0[r6] = r13
            r0[r7] = r20
            r0[r9] = r4
            r0[r5] = r15
            r0[r14] = r21
            r0[r11] = r12
            r0[r17] = r18
            r0[r10] = r22
            r2.setValues(r0)
            r0[r1] = r3
            r0[r6] = r4
            r0[r7] = r8
            r0[r9] = r12
            r0[r5] = r13
            r0[r14] = r15
            r0[r11] = r16
            r0[r17] = r18
            r0[r10] = r19
            r0 = r23
            android.graphics.Canvas r1 = r0.f304427a
            r1.concat(r2)
            goto L_0x00f4
        L_0x00e4:
            r0 = r23
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Android does not support arbitrary transforms"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00f2:
            r0 = r23
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p436a1.C103223b.mo142954m(float[]):void");
    }

    /* renamed from: n */
    public void mo142955n(float f, float f2, float f3, float f4, C103241i0 i0Var) {
        C87412m.m108594g(i0Var, "paint");
        this.f304427a.drawRect(f, f2, f3, f4, i0Var.mo142992f());
    }

    /* renamed from: o */
    public void mo142956o(C103229d0 d0Var, long j, C103241i0 i0Var) {
        C87412m.m108594g(d0Var, "image");
        C87412m.m108594g(i0Var, "paint");
        this.f304427a.drawBitmap(C103230e.m136641a(d0Var), C112539e.m153738c(j), C112539e.m153739d(j), i0Var.mo142992f());
    }

    /* renamed from: p */
    public void mo142957p(long j, float f, C103241i0 i0Var) {
        C87412m.m108594g(i0Var, "paint");
        this.f304427a.drawCircle(C112539e.m153738c(j), C112539e.m153739d(j), f, i0Var.mo142992f());
    }

    /* renamed from: q */
    public void mo142958q(C103229d0 d0Var, long j, long j2, long j3, long j4, C103241i0 i0Var) {
        C103229d0 d0Var2 = d0Var;
        C87412m.m108594g(d0Var, "image");
        C87412m.m108594g(i0Var, "paint");
        Canvas canvas = this.f304427a;
        Bitmap a = C103230e.m136641a(d0Var);
        Rect rect = this.f304428b;
        int i = C33177j.f90051c;
        int i2 = (int) (j >> 32);
        rect.left = i2;
        rect.top = C33177j.m39962a(j);
        rect.right = i2 + ((int) (j2 >> 32));
        rect.bottom = C33177j.m39962a(j) + C33181m.m39966b(j2);
        C13598b0 b0Var = C13598b0.f38549a;
        Rect rect2 = this.f304429c;
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        rect2.top = C33177j.m39962a(j3);
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = C33177j.m39962a(j3) + C33181m.m39966b(j4);
        canvas.drawBitmap(a, rect, rect2, i0Var.mo142992f());
    }

    /* renamed from: r */
    public void mo142959r() {
        C103267u.f304486a.mo143045a(this.f304427a, true);
    }

    /* renamed from: s */
    public void mo142960s(float f) {
        this.f304427a.rotate(f);
    }

    /* renamed from: t */
    public void mo142961t(float f, float f2, float f3, float f4, float f5, float f6, C103241i0 i0Var) {
        C87412m.m108594g(i0Var, "paint");
        this.f304427a.drawRoundRect(f, f2, f3, f4, f5, f6, i0Var.mo142992f());
    }

    /* renamed from: u */
    public final Canvas mo142962u() {
        return this.f304427a;
    }

    /* renamed from: v */
    public final void mo142963v(Canvas canvas) {
        C87412m.m108594g(canvas, "<set-?>");
        this.f304427a = canvas;
    }
}
