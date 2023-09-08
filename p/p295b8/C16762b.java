package p295b8;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Comparator;
import p333e8.C20528a;
import p370p7.C21961u;

/* renamed from: b8.b */
public abstract class C16762b implements C16772f {

    /* renamed from: a */
    public final C21961u f45302a;

    /* renamed from: b */
    public final int f45303b;

    /* renamed from: c */
    public final int[] f45304c;

    /* renamed from: d */
    public final Format[] f45305d;

    /* renamed from: e */
    public final long[] f45306e;

    /* renamed from: f */
    public int f45307f;

    /* renamed from: b8.b$b */
    public static final class C16764b implements Comparator<Format> {
        public C16764b(C16763a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((Format) obj2).f45773e - ((Format) obj).f45773e;
        }
    }

    public C16762b(C21961u uVar, int... iArr) {
        int i = 0;
        C20528a.m22240d(iArr.length > 0);
        uVar.getClass();
        this.f45302a = uVar;
        int length = iArr.length;
        this.f45303b = length;
        this.f45305d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f45305d[i2] = uVar.f62174b[iArr[i2]];
        }
        Arrays.sort(this.f45305d, new C16764b((C16763a) null));
        this.f45304c = new int[this.f45303b];
        while (true) {
            int i3 = this.f45303b;
            if (i < i3) {
                this.f45304c[i] = uVar.mo35036a(this.f45305d[i]);
                i++;
            } else {
                this.f45306e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo17788a(int i) {
        return this.f45304c[i];
    }

    /* renamed from: b */
    public final int mo17789b() {
        return this.f45304c[getSelectedIndex()];
    }

    /* renamed from: c */
    public final Format mo17790c() {
        return this.f45305d[getSelectedIndex()];
    }

    /* renamed from: d */
    public final Format mo17791d(int i) {
        return this.f45305d[i];
    }

    /* renamed from: e */
    public final int mo17792e(int i) {
        for (int i2 = 0; i2 < this.f45303b; i2++) {
            if (this.f45304c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16762b bVar = (C16762b) obj;
        return this.f45302a == bVar.f45302a && Arrays.equals(this.f45304c, bVar.f45304c);
    }

    /* renamed from: f */
    public final C21961u mo17794f() {
        return this.f45302a;
    }

    /* renamed from: h */
    public final boolean mo17795h(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean k = mo17797k(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f45303b && !k) {
            k = i2 != i && !mo17797k(i2, elapsedRealtime);
            i2++;
        }
        if (!k) {
            return false;
        }
        long[] jArr = this.f45306e;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + j);
        return true;
    }

    public int hashCode() {
        if (this.f45307f == 0) {
            this.f45307f = (System.identityHashCode(this.f45302a) * 31) + Arrays.hashCode(this.f45304c);
        }
        return this.f45307f;
    }

    /* renamed from: k */
    public final boolean mo17797k(int i, long j) {
        return this.f45306e[i] > j;
    }

    public final int length() {
        return this.f45304c.length;
    }
}
