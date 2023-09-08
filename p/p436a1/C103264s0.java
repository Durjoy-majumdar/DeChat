package p436a1;

import gy3.C8480h;
import p1166z0.C112539e;
import rx3.C90109v;

/* renamed from: a1.s0 */
public final class C103264s0 {

    /* renamed from: d */
    public static final C103264s0 f304481d = new C103264s0(0, 0, 0.0f, 7, (C8480h) null);

    /* renamed from: a */
    public final long f304482a;

    /* renamed from: b */
    public final long f304483b;

    /* renamed from: c */
    public final float f304484c;

    public C103264s0(long j, long j2, float f, C8480h hVar) {
        this.f304482a = j;
        this.f304483b = j2;
        this.f304484c = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C103264s0)) {
            return false;
        }
        C103264s0 s0Var = (C103264s0) obj;
        if (!C103272w.m136781c(this.f304482a, s0Var.f304482a) || !C112539e.m153736a(this.f304483b, s0Var.f304483b)) {
            return false;
        }
        return (this.f304484c > s0Var.f304484c ? 1 : (this.f304484c == s0Var.f304484c ? 0 : -1)) == 0;
    }

    public int hashCode() {
        long j = this.f304482a;
        int i = C103272w.f304516h;
        return (((C90109v.m112737a(j) * 31) + C112539e.m153740e(this.f304483b)) * 31) + Float.floatToIntBits(this.f304484c);
    }

    public String toString() {
        return "Shadow(color=" + C103272w.m136787i(this.f304482a) + ", offset=" + C112539e.m153744i(this.f304483b) + ", blurRadius=" + this.f304484c + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103264s0(long r8, long r10, float r12, int r13, gy3.C8480h r14) {
        /*
            r7 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x000d
            r8 = 4278190080(0xff000000, double:2.113706745E-314)
            long r8 = p436a1.C103276y.m136792c(r8)
        L_0x000d:
            r1 = r8
            r8 = r13 & 2
            if (r8 == 0) goto L_0x0016
            int r8 = p1166z0.C112539e.f336958e
            long r10 = p1166z0.C112539e.f336955b
        L_0x0016:
            r3 = r10
            r8 = r13 & 4
            if (r8 == 0) goto L_0x001e
            r12 = 0
            r5 = 0
            goto L_0x001f
        L_0x001e:
            r5 = r12
        L_0x001f:
            r6 = 0
            r0 = r7
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p436a1.C103264s0.<init>(long, long, float, int, gy3.h):void");
    }
}
