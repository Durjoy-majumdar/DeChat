package p295b8;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p295b8.C16772f;
import p333e8.C20551y;

/* renamed from: b8.c */
public class C16765c extends C16769e {

    /* renamed from: f */
    public static final int[] f45308f = new int[0];

    /* renamed from: d */
    public final C16772f.C16773a f45309d;

    /* renamed from: e */
    public final AtomicReference<C16767b> f45310e = new AtomicReference<>(new C16767b());

    /* renamed from: b8.c$a */
    public static final class C16766a {

        /* renamed from: a */
        public final int f45311a;

        /* renamed from: b */
        public final int f45312b;

        /* renamed from: c */
        public final String f45313c;

        public C16766a(int i, int i2, String str) {
            this.f45311a = i;
            this.f45312b = i2;
            this.f45313c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C16766a.class != obj.getClass()) {
                return false;
            }
            C16766a aVar = (C16766a) obj;
            return this.f45311a == aVar.f45311a && this.f45312b == aVar.f45312b && TextUtils.equals(this.f45313c, aVar.f45313c);
        }

        public int hashCode() {
            int i = ((this.f45311a * 31) + this.f45312b) * 31;
            String str = this.f45313c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: b8.c$b */
    public static final class C16767b {

        /* renamed from: a */
        public final String f45314a = null;

        /* renamed from: b */
        public final String f45315b = null;

        /* renamed from: c */
        public final int f45316c = Integer.MAX_VALUE;

        /* renamed from: d */
        public final int f45317d = Integer.MAX_VALUE;

        /* renamed from: e */
        public final int f45318e = Integer.MAX_VALUE;

        /* renamed from: f */
        public final boolean f45319f = true;

        /* renamed from: g */
        public final int f45320g = Integer.MAX_VALUE;

        /* renamed from: h */
        public final int f45321h = Integer.MAX_VALUE;

        /* renamed from: i */
        public final boolean f45322i = true;

        /* renamed from: j */
        public final boolean f45323j = false;

        /* renamed from: k */
        public final boolean f45324k = true;

        /* renamed from: l */
        public final boolean f45325l = true;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C16767b.class != obj.getClass()) {
                return false;
            }
            C16767b bVar = (C16767b) obj;
            return this.f45323j == bVar.f45323j && this.f45324k == bVar.f45324k && this.f45316c == bVar.f45316c && this.f45317d == bVar.f45317d && this.f45319f == bVar.f45319f && this.f45325l == bVar.f45325l && this.f45322i == bVar.f45322i && this.f45320g == bVar.f45320g && this.f45321h == bVar.f45321h && this.f45318e == bVar.f45318e && TextUtils.equals(this.f45314a, bVar.f45314a) && TextUtils.equals(this.f45315b, bVar.f45315b);
        }

        public int hashCode() {
            return (((((((((((((((((((((this.f45314a.hashCode() * 31) + this.f45315b.hashCode()) * 31) + (this.f45323j ? 1 : 0)) * 31) + (this.f45324k ? 1 : 0)) * 31) + this.f45316c) * 31) + this.f45317d) * 31) + this.f45318e) * 31) + (this.f45319f ? 1 : 0)) * 31) + (this.f45325l ? 1 : 0)) * 31) + (this.f45322i ? 1 : 0)) * 31) + this.f45320g) * 31) + this.f45321h;
        }
    }

    public C16765c(C16772f.C16773a aVar) {
        this.f45309d = aVar;
    }

    /* renamed from: c */
    public static boolean m16385c(Format format, String str) {
        if (str != null) {
            String str2 = format.f45769E;
            int i = C20551y.f57835a;
            if (TextUtils.equals(str, str2 == null ? null : new Locale(str2).getLanguage())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Integer> m16386d(p370p7.C21961u r16, int r17, int r18, boolean r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.f62173a
            r3.<init>(r4)
            r4 = 0
            r5 = 0
        L_0x000f:
            int r6 = r0.f62173a
            if (r5 >= r6) goto L_0x001d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.add(r6)
            int r5 = r5 + 1
            goto L_0x000f
        L_0x001d:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r5) goto L_0x00ae
            if (r2 != r5) goto L_0x0026
            goto L_0x00ae
        L_0x0026:
            r6 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x002a:
            int r8 = r0.f62173a
            r9 = -1
            r10 = 1
            if (r6 >= r8) goto L_0x0089
            com.google.android.exoplayer2.Format[] r8 = r0.f62174b
            r8 = r8[r6]
            int r11 = r8.f45781p
            if (r11 <= 0) goto L_0x0086
            int r12 = r8.f45782q
            if (r12 <= 0) goto L_0x0086
            if (r19 == 0) goto L_0x004c
            if (r11 <= r12) goto L_0x0042
            r13 = 1
            goto L_0x0043
        L_0x0042:
            r13 = 0
        L_0x0043:
            if (r1 <= r2) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r10 = 0
        L_0x0047:
            if (r13 == r10) goto L_0x004c
            r10 = r1
            r13 = r2
            goto L_0x004e
        L_0x004c:
            r13 = r1
            r10 = r2
        L_0x004e:
            int r14 = r11 * r10
            int r15 = r12 * r13
            if (r14 < r15) goto L_0x005f
            android.graphics.Point r10 = new android.graphics.Point
            int r12 = p333e8.C20551y.f57835a
            int r15 = r15 + r11
            int r15 = r15 + r9
            int r15 = r15 / r11
            r10.<init>(r13, r15)
            goto L_0x006a
        L_0x005f:
            android.graphics.Point r11 = new android.graphics.Point
            int r13 = p333e8.C20551y.f57835a
            int r14 = r14 + r12
            int r14 = r14 + r9
            int r14 = r14 / r12
            r11.<init>(r14, r10)
            r10 = r11
        L_0x006a:
            int r9 = r8.f45781p
            int r8 = r8.f45782q
            int r11 = r9 * r8
            int r12 = r10.x
            float r12 = (float) r12
            r13 = 1065017672(0x3f7ae148, float:0.98)
            float r12 = r12 * r13
            int r12 = (int) r12
            if (r9 < r12) goto L_0x0086
            int r9 = r10.y
            float r9 = (float) r9
            float r9 = r9 * r13
            int r9 = (int) r9
            if (r8 < r9) goto L_0x0086
            if (r11 >= r7) goto L_0x0086
            r7 = r11
        L_0x0086:
            int r6 = r6 + 1
            goto L_0x002a
        L_0x0089:
            if (r7 == r5) goto L_0x00ae
            int r1 = r3.size()
            int r1 = r1 - r10
        L_0x0090:
            if (r1 < 0) goto L_0x00ae
            java.lang.Object r2 = r3.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.exoplayer2.Format[] r4 = r0.f62174b
            r2 = r4[r2]
            int r2 = r2.mo18399p()
            if (r2 == r9) goto L_0x00a8
            if (r2 <= r7) goto L_0x00ab
        L_0x00a8:
            r3.remove(r1)
        L_0x00ab:
            int r1 = r1 + -1
            goto L_0x0090
        L_0x00ae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p295b8.C16765c.m16386d(p7.u, int, int, boolean):java.util.List");
    }

    /* renamed from: e */
    public static boolean m16387e(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: f */
    public static boolean m16388f(Format format, int i, C16766a aVar) {
        if (!m16387e(i, false) || format.f45789x != aVar.f45311a || format.f45790y != aVar.f45312b) {
            return false;
        }
        String str = aVar.f45313c;
        return str == null || TextUtils.equals(str, format.f45777i);
    }

    /* renamed from: g */
    public static boolean m16389g(Format format, String str, int i, int i2, int i3, int i4, int i5) {
        if (!m16387e(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C20551y.m22311a(format.f45777i, str)) {
            return false;
        }
        int i6 = format.f45781p;
        if (i6 != -1 && i6 > i3) {
            return false;
        }
        int i7 = format.f45782q;
        if (i7 != -1 && i7 > i4) {
            return false;
        }
        int i8 = format.f45773e;
        return i8 == -1 || i8 <= i5;
    }
}
