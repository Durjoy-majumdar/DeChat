package p835c1;

import p1166z0.C112535a;
import p1166z0.C112539e;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p436a1.C103229d0;
import p436a1.C103244k0;
import p436a1.C103257q;
import p436a1.C103274x;
import p436a1.C27726j0;
import p560i2.C108322d;
import p560i2.C108329n;
import p560i2.C33177j;
import p560i2.C33183o;

/* renamed from: c1.f */
public interface C104231f extends C108322d {

    /* renamed from: f0 */
    public static final /* synthetic */ int f308529f0 = 0;

    /* renamed from: c1.f$a */
    public static final class C104232a {
        /* renamed from: a */
        public static /* synthetic */ void m139082a(C104231f fVar, long j, float f, long j2, float f2, C104233g gVar, C103274x xVar, int i, int i2, Object obj) {
            int i3;
            if (obj == null) {
                float c = (i2 & 2) != 0 ? C112545k.m153757c(fVar.mo145819e()) / 2.0f : f;
                long f0 = (i2 & 4) != 0 ? fVar.mo145820f0() : j2;
                float f3 = (i2 & 8) != 0 ? 1.0f : f2;
                C104236j jVar = (i2 & 16) != 0 ? C104236j.f308530a : gVar;
                C103274x xVar2 = (i2 & 32) != 0 ? null : xVar;
                if ((i2 & 64) != 0) {
                    int i4 = C104231f.f308529f0;
                    i3 = 3;
                } else {
                    i3 = i;
                }
                fVar.mo145817b0(j, c, f0, f3, jVar, xVar2, i3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }

        /* renamed from: b */
        public static void m139083b(C104231f fVar, C103229d0 d0Var, long j, long j2, long j3, long j4, float f, C104233g gVar, C103274x xVar, int i, int i2, int i3, Object obj) {
            long j5;
            long j6;
            int i4;
            int i5;
            int i6 = i3;
            if (obj == null) {
                if ((i6 & 2) != 0) {
                    int i7 = C33177j.f90051c;
                    j5 = C33177j.f90050b;
                } else {
                    j5 = j;
                }
                long a = (i6 & 4) != 0 ? C108329n.m146743a(d0Var.getWidth(), d0Var.getHeight()) : j2;
                if ((i6 & 8) != 0) {
                    int i8 = C33177j.f90051c;
                    j6 = C33177j.f90050b;
                } else {
                    j6 = j3;
                }
                long j7 = (i6 & 16) != 0 ? a : j4;
                float f2 = (i6 & 32) != 0 ? 1.0f : f;
                C104233g gVar2 = (i6 & 64) != 0 ? C104236j.f308530a : gVar;
                C103274x xVar2 = (i6 & 128) != 0 ? null : xVar;
                if ((i6 & 256) != 0) {
                    int i9 = C104231f.f308529f0;
                    i4 = 3;
                } else {
                    i4 = i;
                }
                if ((i6 & 512) != 0) {
                    int i15 = C104231f.f308529f0;
                    i5 = 1;
                } else {
                    i5 = i2;
                }
                fVar.mo145830z(d0Var, j5, a, j6, j7, f2, gVar2, xVar2, i4, i5);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }

        /* renamed from: c */
        public static void m139084c(C104231f fVar, C103229d0 d0Var, long j, float f, C104233g gVar, C103274x xVar, int i, int i2, Object obj) {
            long j2;
            int i3;
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    int i4 = C112539e.f336958e;
                    j2 = C112539e.f336955b;
                } else {
                    j2 = j;
                }
                float f2 = (i2 & 4) != 0 ? 1.0f : f;
                C104233g gVar2 = (i2 & 8) != 0 ? C104236j.f308530a : gVar;
                C103274x xVar2 = (i2 & 16) != 0 ? null : xVar;
                if ((i2 & 32) != 0) {
                    int i5 = C104231f.f308529f0;
                    i3 = 3;
                } else {
                    i3 = i;
                }
                fVar.mo145825o0(d0Var, j2, f2, gVar2, xVar2, i3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }

        /* renamed from: d */
        public static /* synthetic */ void m139085d(C104231f fVar, C27726j0 j0Var, C103257q qVar, float f, C104233g gVar, C103274x xVar, int i, int i2, Object obj) {
            int i3;
            if (obj == null) {
                float f2 = (i2 & 4) != 0 ? 1.0f : f;
                if ((i2 & 8) != 0) {
                    gVar = C104236j.f308530a;
                }
                C104233g gVar2 = gVar;
                if ((i2 & 16) != 0) {
                    xVar = null;
                }
                C103274x xVar2 = xVar;
                if ((i2 & 32) != 0) {
                    int i4 = C104231f.f308529f0;
                    i3 = 3;
                } else {
                    i3 = i;
                }
                fVar.mo145827r0(j0Var, qVar, f2, gVar2, xVar2, i3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }

        /* renamed from: e */
        public static void m139086e(C104231f fVar, C103257q qVar, long j, long j2, float f, C104233g gVar, C103274x xVar, int i, int i2, Object obj) {
            long j3;
            long j4;
            int i3;
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    int i4 = C112539e.f336958e;
                    j3 = C112539e.f336955b;
                } else {
                    j3 = j;
                }
                if ((i2 & 4) != 0) {
                    C104231f fVar2 = fVar;
                    j4 = m139089h(fVar, fVar.mo145819e(), j3);
                } else {
                    C104231f fVar3 = fVar;
                    j4 = j2;
                }
                float f2 = (i2 & 8) != 0 ? 1.0f : f;
                C104233g gVar2 = (i2 & 16) != 0 ? C104236j.f308530a : gVar;
                C103274x xVar2 = (i2 & 32) != 0 ? null : xVar;
                if ((i2 & 64) != 0) {
                    int i5 = C104231f.f308529f0;
                    i3 = 3;
                } else {
                    i3 = i;
                }
                fVar.mo145826p(qVar, j3, j4, f2, gVar2, xVar2, i3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }

        /* renamed from: f */
        public static void m139087f(C104231f fVar, long j, long j2, long j3, float f, C104233g gVar, C103274x xVar, int i, int i2, Object obj) {
            long j4;
            long j5;
            int i3;
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    int i4 = C112539e.f336958e;
                    j4 = C112539e.f336955b;
                } else {
                    j4 = j2;
                }
                if ((i2 & 4) != 0) {
                    C104231f fVar2 = fVar;
                    j5 = m139089h(fVar, fVar.mo145819e(), j4);
                } else {
                    C104231f fVar3 = fVar;
                    j5 = j3;
                }
                float f2 = (i2 & 8) != 0 ? 1.0f : f;
                C104236j jVar = (i2 & 16) != 0 ? C104236j.f308530a : gVar;
                C103274x xVar2 = (i2 & 32) != 0 ? null : xVar;
                if ((i2 & 64) != 0) {
                    int i5 = C104231f.f308529f0;
                    i3 = 3;
                } else {
                    i3 = i;
                }
                fVar.mo145816W(j, j4, j5, f2, jVar, xVar2, i3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }

        /* renamed from: g */
        public static void m139088g(C104231f fVar, C103257q qVar, long j, long j2, long j3, float f, C104233g gVar, C103274x xVar, int i, int i2, Object obj) {
            long j4;
            long j5;
            long j6;
            int i3;
            int i4 = i2;
            if (obj == null) {
                if ((i4 & 2) != 0) {
                    int i5 = C112539e.f336958e;
                    j4 = C112539e.f336955b;
                } else {
                    j4 = j;
                }
                if ((i4 & 4) != 0) {
                    C104231f fVar2 = fVar;
                    j5 = m139089h(fVar, fVar.mo145819e(), j4);
                } else {
                    C104231f fVar3 = fVar;
                    j5 = j2;
                }
                if ((i4 & 8) != 0) {
                    int i6 = C112535a.f336950b;
                    j6 = C112535a.f336949a;
                } else {
                    j6 = j3;
                }
                float f2 = (i4 & 16) != 0 ? 1.0f : f;
                C104233g gVar2 = (i4 & 32) != 0 ? C104236j.f308530a : gVar;
                C103274x xVar2 = (i4 & 64) != 0 ? null : xVar;
                if ((i4 & 128) != 0) {
                    int i7 = C104231f.f308529f0;
                    i3 = 3;
                } else {
                    i3 = i;
                }
                fVar.mo145823l0(qVar, j4, j5, j6, f2, gVar2, xVar2, i3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }

        /* renamed from: h */
        public static long m139089h(C104231f fVar, long j, long j2) {
            return C112546l.m153761a(C112545k.m153758d(j) - C112539e.m153738c(j2), C112545k.m153756b(j) - C112539e.m153739d(j2));
        }
    }

    /* renamed from: B */
    C104230e mo145815B();

    /* renamed from: W */
    void mo145816W(long j, long j2, long j3, float f, C104233g gVar, C103274x xVar, int i);

    /* renamed from: b0 */
    void mo145817b0(long j, float f, long j2, float f2, C104233g gVar, C103274x xVar, int i);

    /* renamed from: e */
    long mo145819e();

    /* renamed from: f0 */
    long mo145820f0();

    C33183o getLayoutDirection();

    /* renamed from: l0 */
    void mo145823l0(C103257q qVar, long j, long j2, long j3, float f, C104233g gVar, C103274x xVar, int i);

    /* renamed from: m0 */
    void mo145824m0(C27726j0 j0Var, long j, float f, C104233g gVar, C103274x xVar, int i);

    /* renamed from: o0 */
    void mo145825o0(C103229d0 d0Var, long j, float f, C104233g gVar, C103274x xVar, int i);

    /* renamed from: p */
    void mo145826p(C103257q qVar, long j, long j2, float f, C104233g gVar, C103274x xVar, int i);

    /* renamed from: r0 */
    void mo145827r0(C27726j0 j0Var, C103257q qVar, float f, C104233g gVar, C103274x xVar, int i);

    /* renamed from: u0 */
    void mo145828u0(long j, long j2, long j3, long j4, C104233g gVar, float f, C103274x xVar, int i);

    /* renamed from: x */
    void mo145829x(C103257q qVar, long j, long j2, float f, int i, C103244k0 k0Var, float f2, C103274x xVar, int i2);

    /* renamed from: z */
    void mo145830z(C103229d0 d0Var, long j, long j2, long j3, long j4, float f, C104233g gVar, C103274x xVar, int i, int i2);
}
