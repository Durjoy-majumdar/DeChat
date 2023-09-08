package p232rw;

import com.tencent.p014mm.plugin.sight.base.C94554a;
import di3.C7335d;
import gy3.C87412m;

/* renamed from: rw.m */
public interface C63679m extends C7335d {

    /* renamed from: rw.m$a */
    public static final class C63680a {

        /* renamed from: a */
        public final int f180525a;

        /* renamed from: b */
        public final int f180526b;

        /* renamed from: c */
        public final float f180527c;

        /* renamed from: d */
        public final long f180528d;

        /* renamed from: e */
        public final int f180529e;

        /* renamed from: f */
        public final int f180530f;

        /* renamed from: g */
        public final boolean f180531g;

        /* renamed from: h */
        public final int f180532h;

        /* renamed from: i */
        public final int f180533i;

        /* renamed from: j */
        public final int f180534j;

        /* renamed from: k */
        public final int f180535k;

        /* renamed from: l */
        public C94554a f180536l;

        public C63680a(int i, int i2, float f, long j, int i3, int i4, boolean z, int i5, int i6, int i7, int i8) {
            this.f180525a = i;
            this.f180526b = i2;
            this.f180527c = f;
            this.f180528d = j;
            this.f180529e = i3;
            this.f180530f = i4;
            this.f180531g = z;
            this.f180532h = i5;
            this.f180533i = i6;
            this.f180534j = i7;
            this.f180535k = i8;
        }

        /* renamed from: a */
        public final int mo88486a() {
            return this.f180532h;
        }

        /* renamed from: b */
        public final int mo88487b() {
            return this.f180529e;
        }

        /* renamed from: c */
        public final long mo88488c() {
            return this.f180528d;
        }

        /* renamed from: d */
        public final float mo88489d() {
            return this.f180527c;
        }

        /* renamed from: e */
        public final int mo88490e() {
            return this.f180526b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63680a)) {
                return false;
            }
            C63680a aVar = (C63680a) obj;
            return this.f180525a == aVar.f180525a && this.f180526b == aVar.f180526b && C87412m.m108589b(Float.valueOf(this.f180527c), Float.valueOf(aVar.f180527c)) && this.f180528d == aVar.f180528d && this.f180529e == aVar.f180529e && this.f180530f == aVar.f180530f && this.f180531g == aVar.f180531g && this.f180532h == aVar.f180532h && this.f180533i == aVar.f180533i && this.f180534j == aVar.f180534j && this.f180535k == aVar.f180535k;
        }

        /* renamed from: f */
        public final int mo88492f() {
            return this.f180525a;
        }

        /* renamed from: g */
        public final boolean mo88493g() {
            return this.f180525a > 0 && this.f180526b > 0 && this.f180528d > 0;
        }

        public int hashCode() {
            long j = this.f180528d;
            int floatToIntBits = ((((((((((this.f180525a * 31) + this.f180526b) * 31) + Float.floatToIntBits(this.f180527c)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f180529e) * 31) + this.f180530f) * 31;
            boolean z = this.f180531g;
            if (z) {
                z = true;
            }
            return ((((((((floatToIntBits + (z ? 1 : 0)) * 31) + this.f180532h) * 31) + this.f180533i) * 31) + this.f180534j) * 31) + this.f180535k;
        }

        public String toString() {
            return "[width:" + this.f180525a + ",height:" + this.f180526b + ",fps:" + this.f180527c + ",duration:" + this.f180528d + ']';
        }
    }

    /* renamed from: M1 */
    C63680a mo88483M1(String str);

    /* renamed from: UU */
    C63680a mo88484UU(String str, boolean z);

    /* renamed from: oC */
    C63680a mo88485oC(String str);
}
