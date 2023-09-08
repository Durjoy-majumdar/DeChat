package p370p7;

import com.google.android.exoplayer2.Format;
import p294b7.C16750m;
import p333e8.C20528a;

/* renamed from: p7.p */
public final class C21952p {

    /* renamed from: a */
    public int f62126a = 1000;

    /* renamed from: b */
    public int[] f62127b = new int[1000];

    /* renamed from: c */
    public long[] f62128c = new long[1000];

    /* renamed from: d */
    public int[] f62129d = new int[1000];

    /* renamed from: e */
    public int[] f62130e = new int[1000];

    /* renamed from: f */
    public long[] f62131f = new long[1000];

    /* renamed from: g */
    public C16750m.C16751a[] f62132g = new C16750m.C16751a[1000];

    /* renamed from: h */
    public Format[] f62133h = new Format[1000];

    /* renamed from: i */
    public int f62134i;

    /* renamed from: j */
    public int f62135j;

    /* renamed from: k */
    public int f62136k;

    /* renamed from: l */
    public int f62137l;

    /* renamed from: m */
    public long f62138m = Long.MIN_VALUE;

    /* renamed from: n */
    public long f62139n = Long.MIN_VALUE;

    /* renamed from: o */
    public boolean f62140o = true;

    /* renamed from: p */
    public boolean f62141p = true;

    /* renamed from: q */
    public Format f62142q;

    /* renamed from: r */
    public int f62143r;

    /* renamed from: p7.p$a */
    public static final class C21953a {

        /* renamed from: a */
        public int f62144a;

        /* renamed from: b */
        public long f62145b;

        /* renamed from: c */
        public C16750m.C16751a f62146c;
    }

    /* renamed from: a */
    public final long mo35020a(int i) {
        this.f62138m = Math.max(this.f62138m, mo35023d(i));
        int i2 = this.f62134i - i;
        this.f62134i = i2;
        this.f62135j += i;
        int i3 = this.f62136k + i;
        this.f62136k = i3;
        int i4 = this.f62126a;
        if (i3 >= i4) {
            this.f62136k = i3 - i4;
        }
        int i5 = this.f62137l - i;
        this.f62137l = i5;
        if (i5 < 0) {
            this.f62137l = 0;
        }
        if (i2 != 0) {
            return this.f62128c[this.f62136k];
        }
        int i6 = this.f62136k;
        if (i6 != 0) {
            i4 = i6;
        }
        int i7 = i4 - 1;
        return this.f62128c[i7] + ((long) this.f62129d[i7]);
    }

    /* renamed from: b */
    public long mo35021b(int i) {
        int i2 = this.f62135j;
        int i3 = this.f62134i;
        int i4 = (i2 + i3) - i;
        C20528a.m22237a(i4 >= 0 && i4 <= i3 - this.f62137l);
        int i5 = this.f62134i - i4;
        this.f62134i = i5;
        this.f62139n = Math.max(this.f62138m, mo35023d(i5));
        int i6 = this.f62134i;
        if (i6 == 0) {
            return 0;
        }
        int e = mo35024e(i6 - 1);
        return this.f62128c[e] + ((long) this.f62129d[e]);
    }

    /* renamed from: c */
    public final int mo35022c(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f62131f[i] <= j; i4++) {
            if (!z || (this.f62130e[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.f62126a) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: d */
    public final long mo35023d(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int e = mo35024e(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f62131f[e]);
            if ((this.f62130e[e] & 1) != 0) {
                break;
            }
            e--;
            if (e == -1) {
                e = this.f62126a - 1;
            }
        }
        return j;
    }

    /* renamed from: e */
    public final int mo35024e(int i) {
        int i2 = this.f62136k + i;
        int i3 = this.f62126a;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: f */
    public synchronized boolean mo35025f() {
        return this.f62137l != this.f62134i;
    }
}
