package p191l2;

import gy3.C87412m;

/* renamed from: l2.p */
public final class C109153p {

    /* renamed from: a */
    public final boolean f326824a;

    /* renamed from: b */
    public final boolean f326825b;

    /* renamed from: c */
    public final boolean f326826c;

    /* renamed from: d */
    public final C10450q f326827d;

    /* renamed from: e */
    public final boolean f326828e;

    /* renamed from: f */
    public final boolean f326829f;

    /* renamed from: g */
    public final boolean f326830g;

    public C109153p(boolean z, boolean z2, boolean z3, C10450q qVar, boolean z4, boolean z5, boolean z6) {
        C87412m.m108594g(qVar, "securePolicy");
        this.f326824a = z;
        this.f326825b = z2;
        this.f326826c = z3;
        this.f326827d = qVar;
        this.f326828e = z4;
        this.f326829f = z5;
        this.f326830g = z6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109153p)) {
            return false;
        }
        C109153p pVar = (C109153p) obj;
        return this.f326824a == pVar.f326824a && this.f326825b == pVar.f326825b && this.f326826c == pVar.f326826c && this.f326827d == pVar.f326827d && this.f326828e == pVar.f326828e && this.f326829f == pVar.f326829f && this.f326830g == pVar.f326830g;
    }

    public int hashCode() {
        boolean z = this.f326825b;
        int i = 1231;
        int hashCode = (((((((((((((z ? 1231 : 1237) * 31) + (this.f326824a ? 1231 : 1237)) * 31) + (z ? 1231 : 1237)) * 31) + (this.f326826c ? 1231 : 1237)) * 31) + this.f326827d.hashCode()) * 31) + (this.f326828e ? 1231 : 1237)) * 31) + (this.f326829f ? 1231 : 1237)) * 31;
        if (!this.f326830g) {
            i = 1237;
        }
        return hashCode + i;
    }

    public C109153p() {
        this(false, true, true, C10450q.Inherit, true, true, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C109153p(boolean r8, boolean r9, boolean r10, p191l2.C10450q r11, boolean r12, boolean r13, int r14, gy3.C8480h r15) {
        /*
            r7 = this;
            r0 = r14 & 1
            if (r0 == 0) goto L_0x0006
            r0 = 0
            goto L_0x0007
        L_0x0006:
            r0 = r8
        L_0x0007:
            r1 = r14 & 2
            r2 = 1
            if (r1 == 0) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = r9
        L_0x000f:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = r10
        L_0x0016:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x001d
            l2.q r4 = p191l2.C10450q.Inherit
            goto L_0x001e
        L_0x001d:
            r4 = r11
        L_0x001e:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x0024
            r5 = 1
            goto L_0x0025
        L_0x0024:
            r5 = r12
        L_0x0025:
            r6 = r14 & 32
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r2 = r13
        L_0x002b:
            java.lang.String r6 = "securePolicy"
            gy3.C87412m.m108594g(r4, r6)
            r6 = 0
            r8 = r7
            r9 = r0
            r10 = r1
            r11 = r3
            r12 = r4
            r13 = r5
            r14 = r2
            r15 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p191l2.C109153p.<init>(boolean, boolean, boolean, l2.q, boolean, boolean, int, gy3.h):void");
    }
}
