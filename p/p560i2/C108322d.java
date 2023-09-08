package p560i2;

import iy3.C60641c;
import p1166z0.C112545k;
import p1166z0.C112546l;

/* renamed from: i2.d */
public interface C108322d {

    /* renamed from: i2.d$a */
    public static final class C108323a {
        /* renamed from: a */
        public static int m146719a(C108322d dVar, float f) {
            float T = dVar.mo143034T(f);
            if (Float.isInfinite(T)) {
                return Integer.MAX_VALUE;
            }
            return C60641c.m70921b(T);
        }

        /* renamed from: b */
        public static float m146720b(C108322d dVar, int i) {
            return ((float) i) / dVar.getDensity();
        }

        /* renamed from: c */
        public static long m146721c(C108322d dVar, long j) {
            int i = C112545k.f336975d;
            if (j != C112545k.f336974c) {
                return C108326g.m146737b(dVar.mo143035d0(C112545k.m153758d(j)), dVar.mo143035d0(C112545k.m153756b(j)));
            }
            int i2 = C108328i.f324352d;
            return C108328i.f324351c;
        }

        /* renamed from: d */
        public static float m146722d(C108322d dVar, long j) {
            if (C33186r.m39977a(C33184p.m39969b(j), 4294967296L)) {
                return C33184p.m39970c(j) * dVar.getFontScale() * dVar.getDensity();
            }
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }

        /* renamed from: e */
        public static float m146723e(C108322d dVar, float f) {
            return f * dVar.getDensity();
        }

        /* renamed from: f */
        public static long m146724f(C108322d dVar, long j) {
            int i = C108328i.f324352d;
            if (j != C108328i.f324351c) {
                return C112546l.m153761a(dVar.mo143034T(C108328i.m146741b(j)), dVar.mo143034T(C108328i.m146740a(j)));
            }
            int i2 = C112545k.f336975d;
            return C112545k.f336974c;
        }

        /* renamed from: g */
        public static long m146725g(C108322d dVar, float f) {
            return C33185q.m39976d(4294967296L, f / dVar.getFontScale());
        }
    }

    /* renamed from: F */
    long mo143031F(float f);

    /* renamed from: M */
    int mo143032M(float f);

    /* renamed from: O */
    float mo143033O(long j);

    /* renamed from: T */
    float mo143034T(float f);

    /* renamed from: d0 */
    float mo143035d0(float f);

    /* renamed from: g0 */
    long mo143036g0(long j);

    float getDensity();

    float getFontScale();

    /* renamed from: m */
    float mo143039m(int i);

    /* renamed from: q */
    long mo143040q(long j);
}
