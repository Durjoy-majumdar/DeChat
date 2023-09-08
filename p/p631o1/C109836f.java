package p631o1;

import p1166z0.C112545k;

/* renamed from: o1.f */
public interface C109836f {

    /* renamed from: a */
    public static final /* synthetic */ int f328763a = 0;

    /* renamed from: o1.f$a */
    public static final class C109837a {

        /* renamed from: a */
        public static final C109836f f328764a = new C109838a();

        /* renamed from: b */
        public static final C109836f f328765b = new C109840c();

        /* renamed from: c */
        public static final C109836f f328766c = new C109839b();

        /* renamed from: d */
        public static final C109836f f328767d = new C109841d();

        /* renamed from: o1.f$a$a */
        public static final class C109838a implements C109836f {
            /* renamed from: a */
            public long mo161161a(long j, long j2) {
                float max = Math.max(C112545k.m153758d(j2) / C112545k.m153758d(j), C112545k.m153756b(j2) / C112545k.m153756b(j));
                return C109877t0.m149365a(max, max);
            }
        }

        /* renamed from: o1.f$a$b */
        public static final class C109839b implements C109836f {
            /* renamed from: a */
            public long mo161161a(long j, long j2) {
                float d = C112545k.m153758d(j2) / C112545k.m153758d(j);
                return C109877t0.m149365a(d, d);
            }
        }

        /* renamed from: o1.f$a$c */
        public static final class C109840c implements C109836f {
            /* renamed from: a */
            public long mo161161a(long j, long j2) {
                float min = Math.min(C112545k.m153758d(j2) / C112545k.m153758d(j), C112545k.m153756b(j2) / C112545k.m153756b(j));
                return C109877t0.m149365a(min, min);
            }
        }

        /* renamed from: o1.f$a$d */
        public static final class C109841d implements C109836f {
            /* renamed from: a */
            public long mo161161a(long j, long j2) {
                if (C112545k.m153758d(j) <= C112545k.m153758d(j2) && C112545k.m153756b(j) <= C112545k.m153756b(j2)) {
                    return C109877t0.m149365a(1.0f, 1.0f);
                }
                float min = Math.min(C112545k.m153758d(j2) / C112545k.m153758d(j), C112545k.m153756b(j2) / C112545k.m153756b(j));
                return C109877t0.m149365a(min, min);
            }
        }
    }

    /* renamed from: a */
    long mo161161a(long j, long j2);
}
