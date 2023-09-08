package p396x6;

import android.util.Pair;
import p333e8.C20528a;

/* renamed from: x6.v */
public abstract class C23027v {

    /* renamed from: a */
    public static final C23027v f66205a = new C23028a();

    /* renamed from: x6.v$a */
    public static class C23028a extends C23027v {
        /* renamed from: a */
        public int mo34967a(Object obj) {
            return -1;
        }

        /* renamed from: e */
        public C23029b mo34969e(int i, C23029b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: f */
        public int mo35005f() {
            return 0;
        }

        /* renamed from: i */
        public C23030c mo34970i(int i, C23030c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: j */
        public int mo35006j() {
            return 0;
        }
    }

    /* renamed from: x6.v$b */
    public static final class C23029b {

        /* renamed from: a */
        public Object f66206a;

        /* renamed from: b */
        public Object f66207b;

        /* renamed from: c */
        public int f66208c;

        /* renamed from: d */
        public long f66209d;

        /* renamed from: e */
        public long f66210e;

        /* renamed from: f */
        public long[] f66211f;

        /* renamed from: g */
        public int[] f66212g;

        /* renamed from: h */
        public int[] f66213h;

        /* renamed from: i */
        public int[] f66214i;

        /* renamed from: j */
        public long[][] f66215j;

        /* renamed from: k */
        public long f66216k;

        /* renamed from: a */
        public int mo36346a(long j) {
            if (this.f66211f == null) {
                return -1;
            }
            int i = 0;
            while (true) {
                long[] jArr = this.f66211f;
                if (i >= jArr.length) {
                    break;
                }
                long j2 = jArr[i];
                if (j2 == Long.MIN_VALUE || (j < j2 && !mo36348c(i))) {
                    break;
                }
                i++;
            }
            if (i < this.f66211f.length) {
                return i;
            }
            return -1;
        }

        /* renamed from: b */
        public int mo36347b(long j) {
            long[] jArr = this.f66211f;
            if (jArr == null) {
                return -1;
            }
            int length = jArr.length - 1;
            while (length >= 0) {
                long j2 = this.f66211f[length];
                if (j2 != Long.MIN_VALUE && j2 <= j) {
                    break;
                }
                length--;
            }
            if (length < 0 || mo36348c(length)) {
                return -1;
            }
            return length;
        }

        /* renamed from: c */
        public boolean mo36348c(int i) {
            int i2 = this.f66212g[i];
            return i2 != -1 && this.f66214i[i] == i2;
        }
    }

    /* renamed from: x6.v$c */
    public static final class C23030c {

        /* renamed from: a */
        public Object f66217a;

        /* renamed from: b */
        public long f66218b;

        /* renamed from: c */
        public long f66219c;

        /* renamed from: d */
        public boolean f66220d;

        /* renamed from: e */
        public boolean f66221e;

        /* renamed from: f */
        public int f66222f;

        /* renamed from: g */
        public int f66223g;

        /* renamed from: h */
        public long f66224h;

        /* renamed from: i */
        public long f66225i;

        /* renamed from: j */
        public long f66226j;
    }

    /* renamed from: a */
    public abstract int mo34967a(Object obj);

    /* renamed from: b */
    public final int mo36341b(int i, C23029b bVar, C23030c cVar, int i2) {
        int i3 = mo34969e(i, bVar, false).f66208c;
        if (mo36344h(i3, cVar, false).f66223g != i) {
            return i + 1;
        }
        int c = mo34968c(i3, i2);
        if (c == -1) {
            return -1;
        }
        return mo36344h(c, cVar, false).f66222f;
    }

    /* renamed from: c */
    public int mo34968c(int i, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i == mo35006j() - 1) {
                return 0;
            } else {
                return i + 1;
            }
        } else if (i == mo35006j() - 1) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: d */
    public final C23029b mo36342d(int i, C23029b bVar) {
        return mo34969e(i, bVar, false);
    }

    /* renamed from: e */
    public abstract C23029b mo34969e(int i, C23029b bVar, boolean z);

    /* renamed from: f */
    public abstract int mo35005f();

    /* renamed from: g */
    public final Pair<Integer, Long> mo36343g(C23030c cVar, C23029b bVar, int i, long j, long j2) {
        C20528a.m22239c(i, 0, mo35006j());
        mo34970i(i, cVar, false, j2);
        if (j == -9223372036854775807L) {
            j = cVar.f66224h;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f66222f;
        long j3 = cVar.f66226j + j;
        long j4 = mo34969e(i2, bVar, false).f66209d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < cVar.f66223g) {
            j3 -= j4;
            i2++;
            j4 = mo34969e(i2, bVar, false).f66209d;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }

    /* renamed from: h */
    public C23030c mo36344h(int i, C23030c cVar, boolean z) {
        return mo34970i(i, cVar, z, 0);
    }

    /* renamed from: i */
    public abstract C23030c mo34970i(int i, C23030c cVar, boolean z, long j);

    /* renamed from: j */
    public abstract int mo35006j();

    /* renamed from: k */
    public final boolean mo36345k() {
        return mo35006j() == 0;
    }
}
