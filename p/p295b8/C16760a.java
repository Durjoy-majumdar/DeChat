package p295b8;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import p295b8.C16772f;
import p300c8.C16871d;
import p370p7.C21961u;

/* renamed from: b8.a */
public class C16760a extends C16762b {

    /* renamed from: g */
    public final C16871d f45294g;

    /* renamed from: h */
    public final int f45295h;

    /* renamed from: i */
    public final long f45296i;

    /* renamed from: j */
    public final long f45297j;

    /* renamed from: k */
    public final float f45298k;

    /* renamed from: l */
    public int f45299l = mo17786l(Long.MIN_VALUE);

    /* renamed from: m */
    public int f45300m = 1;

    /* renamed from: b8.a$a */
    public static final class C16761a implements C16772f.C16773a {

        /* renamed from: a */
        public final C16871d f45301a;

        public C16761a(C16871d dVar) {
            this.f45301a = dVar;
        }

        /* renamed from: a */
        public C16772f mo17787a(C21961u uVar, int[] iArr) {
            long j = (long) 25000;
            return new C16760a(uVar, iArr, this.f45301a, 800000, (long) 10000, j, j, 0.75f);
        }
    }

    public C16760a(C21961u uVar, int[] iArr, C16871d dVar, int i, long j, long j2, long j3, float f) {
        super(uVar, iArr);
        this.f45294g = dVar;
        this.f45295h = i;
        this.f45296i = j * 1000;
        this.f45297j = j2 * 1000;
        this.f45298k = f;
    }

    /* renamed from: g */
    public void mo17782g(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.f45299l;
        int l = mo17786l(elapsedRealtime);
        this.f45299l = l;
        if (l != i) {
            if (!mo17797k(i, elapsedRealtime)) {
                Format[] formatArr = this.f45305d;
                Format format = formatArr[i];
                int i2 = formatArr[this.f45299l].f45773e;
                int i3 = format.f45773e;
                if (i2 > i3 && j < this.f45296i) {
                    this.f45299l = i;
                } else if (i2 < i3 && j >= this.f45297j) {
                    this.f45299l = i;
                }
            }
            if (this.f45299l != i) {
                this.f45300m = 3;
            }
        }
    }

    public int getSelectedIndex() {
        return this.f45299l;
    }

    /* renamed from: i */
    public Object mo17784i() {
        return null;
    }

    /* renamed from: j */
    public int mo17785j() {
        return this.f45300m;
    }

    /* renamed from: l */
    public final int mo17786l(long j) {
        long b = this.f45294g.mo17927b();
        long j2 = b == -1 ? (long) this.f45295h : (long) (((float) b) * this.f45298k);
        int i = 0;
        for (int i2 = 0; i2 < this.f45303b; i2++) {
            if (j == Long.MIN_VALUE || !mo17797k(i2, j)) {
                if (((long) this.f45305d[i2].f45773e) <= j2) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }
}
