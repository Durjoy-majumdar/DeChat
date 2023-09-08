package p560i2;

import gy3.C8480h;

/* renamed from: i2.b */
public final class C108319b {

    /* renamed from: b */
    public static final C108320a f324339b = new C108320a((C8480h) null);

    /* renamed from: c */
    public static final int[] f324340c = {18, 20, 17, 15};

    /* renamed from: d */
    public static final int[] f324341d = {65535, 262143, 32767, 8191};

    /* renamed from: e */
    public static final int[] f324342e = {32767, 8191, 65535, 262143};

    /* renamed from: a */
    public final long f324343a;

    /* renamed from: i2.b$a */
    public static final class C108320a {
        public C108320a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo158783a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        /* renamed from: b */
        public final long mo158784b(int i, int i2, int i3, int i4) {
            long j;
            int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
            int a = mo158783a(i5);
            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
            int a2 = mo158783a(i6);
            if (a + a2 <= 31) {
                if (a2 == 13) {
                    j = 3;
                } else if (a2 == 18) {
                    j = 1;
                } else if (a2 == 15) {
                    j = 2;
                } else if (a2 == 16) {
                    j = 0;
                } else {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                int i7 = 0;
                int i8 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
                if (i4 != Integer.MAX_VALUE) {
                    i7 = i4 + 1;
                }
                int i9 = C108319b.f324340c[(int) j];
                return (((long) i8) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i7) << (i9 + 31));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
        }

        /* renamed from: c */
        public final long mo158785c(int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                return mo158784b(i, i, i2, i2);
            }
            throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
        }
    }

    public /* synthetic */ C108319b(long j) {
        this.f324343a = j;
    }

    /* renamed from: a */
    public static long m146690a(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m146699j(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m146697h(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m146698i(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m146696g(j);
        }
        boolean z = false;
        if (i3 >= 0 && i >= 0) {
            if (i2 >= i || i2 == Integer.MAX_VALUE) {
                if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
                    z = true;
                }
                if (z) {
                    return f324339b.mo158784b(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
            }
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
    }

    /* renamed from: b */
    public static final boolean m146691b(long j, long j2) {
        return j == j2;
    }

    /* renamed from: c */
    public static final boolean m146692c(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> (f324340c[i] + 31))) & f324342e[i]) != 0;
    }

    /* renamed from: d */
    public static final boolean m146693d(long j) {
        return (((int) (j >> 33)) & f324341d[(int) (3 & j)]) != 0;
    }

    /* renamed from: e */
    public static final boolean m146694e(long j) {
        return m146696g(j) == m146698i(j);
    }

    /* renamed from: f */
    public static final boolean m146695f(long j) {
        return m146697h(j) == m146699j(j);
    }

    /* renamed from: g */
    public static final int m146696g(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> (f324340c[i] + 31))) & f324342e[i];
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    /* renamed from: h */
    public static final int m146697h(long j) {
        int i = ((int) (j >> 33)) & f324341d[(int) (3 & j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: i */
    public static final int m146698i(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> f324340c[i])) & f324342e[i];
    }

    /* renamed from: j */
    public static final int m146699j(long j) {
        return ((int) (j >> 2)) & f324341d[(int) (3 & j)];
    }

    /* renamed from: k */
    public static String m146700k(long j) {
        int h = m146697h(j);
        String str = "Infinity";
        String valueOf = h == Integer.MAX_VALUE ? str : String.valueOf(h);
        int g = m146696g(j);
        if (g != Integer.MAX_VALUE) {
            str = String.valueOf(g);
        }
        return "Constraints(minWidth = " + m146699j(j) + ", maxWidth = " + valueOf + ", minHeight = " + m146698i(j) + ", maxHeight = " + str + ')';
    }

    public boolean equals(Object obj) {
        return (obj instanceof C108319b) && this.f324343a == ((C108319b) obj).f324343a;
    }

    public int hashCode() {
        long j = this.f324343a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return m146700k(this.f324343a);
    }
}
