package p1104d1;

import gy3.C87412m;
import iy3.C60641c;
import p1166z0.C112545k;
import p436a1.C103229d0;
import p436a1.C103274x;
import p560i2.C108329n;
import p560i2.C33177j;
import p560i2.C33181m;
import p835c1.C104231f;
import p835c1.C104233g;

/* renamed from: d1.a */
public final class C106967a extends C106969c {

    /* renamed from: i */
    public final C103229d0 f320187i;

    /* renamed from: j */
    public final long f320188j;

    /* renamed from: n */
    public final long f320189n;

    /* renamed from: o */
    public int f320190o;

    /* renamed from: p */
    public final long f320191p;

    /* renamed from: q */
    public float f320192q;

    /* renamed from: r */
    public C103274x f320193r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C106967a(p436a1.C103229d0 r8, long r9, long r11, int r13, gy3.C8480h r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            if (r14 == 0) goto L_0x0008
            int r9 = p560i2.C33177j.f90051c
            long r9 = p560i2.C33177j.f90050b
        L_0x0008:
            r2 = r9
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0019
            int r9 = r8.getWidth()
            int r10 = r8.getHeight()
            long r11 = p560i2.C108329n.m146743a(r9, r10)
        L_0x0019:
            r4 = r11
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1104d1.C106967a.<init>(a1.d0, long, long, int, gy3.h):void");
    }

    /* renamed from: a */
    public boolean mo84456a(float f) {
        this.f320192q = f;
        return true;
    }

    /* renamed from: e */
    public boolean mo84457e(C103274x xVar) {
        this.f320193r = xVar;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C106967a)) {
            return false;
        }
        C106967a aVar = (C106967a) obj;
        if (!C87412m.m108589b(this.f320187i, aVar.f320187i)) {
            return false;
        }
        long j = this.f320188j;
        long j2 = aVar.f320188j;
        int i = C33177j.f90051c;
        if (!(j == j2) || !C33181m.m39965a(this.f320189n, aVar.f320189n)) {
            return false;
        }
        return this.f320190o == aVar.f320190o;
    }

    /* renamed from: h */
    public long mo84458h() {
        return C108329n.m146744b(this.f320191p);
    }

    public int hashCode() {
        long j = this.f320188j;
        int i = C33177j.f90051c;
        long j2 = this.f320189n;
        return (((((this.f320187i.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f320190o;
    }

    /* renamed from: i */
    public void mo84459i(C104231f fVar) {
        C87412m.m108594g(fVar, "<this>");
        C104231f.C104232a.m139083b(fVar, this.f320187i, this.f320188j, this.f320189n, 0, C108329n.m146743a(C60641c.m70921b(C112545k.m153758d(fVar.mo145819e())), C60641c.m70921b(C112545k.m153756b(fVar.mo145819e()))), this.f320192q, (C104233g) null, this.f320193r, 0, this.f320190o, 328, (Object) null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("BitmapPainter(image=");
        sb.append(this.f320187i);
        sb.append(", srcOffset=");
        sb.append(C33177j.m39963b(this.f320188j));
        sb.append(", srcSize=");
        sb.append(C33181m.m39967c(this.f320189n));
        sb.append(", filterQuality=");
        int i = this.f320190o;
        boolean z = false;
        if (i == 0) {
            str = "None";
        } else {
            if (i == 1) {
                str = "Low";
            } else {
                if (i == 2) {
                    str = "Medium";
                } else {
                    if (i == 3) {
                        z = true;
                    }
                    str = z ? "High" : "Unknown";
                }
            }
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r6 = (int) (r7 >> 32);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C106967a(p436a1.C103229d0 r4, long r5, long r7, gy3.C8480h r9) {
        /*
            r3 = this;
            r3.<init>()
            r3.f320187i = r4
            r3.f320188j = r5
            r3.f320189n = r7
            r9 = 1
            r3.f320190o = r9
            int r0 = p560i2.C33177j.f90051c
            r0 = 32
            long r1 = r5 >> r0
            int r2 = (int) r1
            if (r2 < 0) goto L_0x0037
            int r5 = p560i2.C33177j.m39962a(r5)
            if (r5 < 0) goto L_0x0037
            long r5 = r7 >> r0
            int r6 = (int) r5
            if (r6 < 0) goto L_0x0037
            int r5 = p560i2.C33181m.m39966b(r7)
            if (r5 < 0) goto L_0x0037
            int r5 = r4.getWidth()
            if (r6 > r5) goto L_0x0037
            int r5 = p560i2.C33181m.m39966b(r7)
            int r4 = r4.getHeight()
            if (r5 > r4) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r9 = 0
        L_0x0038:
            if (r9 == 0) goto L_0x0041
            r3.f320191p = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f320192q = r4
            return
        L_0x0041:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Failed requirement."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p1104d1.C106967a.<init>(a1.d0, long, long, gy3.h):void");
    }
}
