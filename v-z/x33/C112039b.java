package x33;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;

/* renamed from: x33.b */
public final class C112039b {

    /* renamed from: a */
    public int f335399a;

    /* renamed from: b */
    public long f335400b;

    /* renamed from: x33.b$a */
    public static final class C112040a {

        /* renamed from: a */
        public String f335401a = "";

        /* renamed from: b */
        public int f335402b;

        /* renamed from: c */
        public long f335403c;

        /* renamed from: d */
        public long f335404d;

        /* renamed from: e */
        public String f335405e = "";

        /* renamed from: f */
        public String f335406f = "";

        /* renamed from: g */
        public String f335407g;

        /* renamed from: h */
        public long f335408h;

        /* renamed from: i */
        public long f335409i;

        /* renamed from: j */
        public String f335410j;

        /* renamed from: k */
        public boolean f335411k = true;

        /* renamed from: a */
        public final C112040a mo163757a() {
            if (this.f335411k) {
                this.f335402b++;
                this.f335411k = false;
                mo163761e(Util.milliSecondsToNow(this.f335408h));
                this.f335404d += Util.milliSecondsToNow(this.f335408h);
            }
            return this;
        }

        /* renamed from: b */
        public final C112040a mo163758b() {
            this.f335402b++;
            mo163761e(Util.milliSecondsToNow(this.f335408h));
            this.f335404d += Util.milliSecondsToNow(this.f335408h);
            return this;
        }

        /* renamed from: c */
        public final C112039b mo163759c() {
            return new C112039b(this.f335401a, this.f335402b, this.f335403c, this.f335404d, this.f335405e, this.f335406f, this.f335407g);
        }

        /* renamed from: d */
        public final C112040a mo163760d(long j) {
            this.f335405e += '_' + j;
            this.f335408h = Util.nowMilliSecond();
            return this;
        }

        /* renamed from: e */
        public final C112040a mo163761e(long j) {
            this.f335406f += '_' + j;
            this.f335409i = j;
            this.f335403c = Math.max(j, this.f335403c);
            return this;
        }

        /* renamed from: f */
        public final C112040a mo163762f(String str) {
            C87412m.m108594g(str, "side");
            this.f335401a = str;
            return this;
        }

        /* renamed from: g */
        public final C112040a mo163763g(String str) {
            C87412m.m108594g(str, "tag");
            this.f335407g = str;
            return this;
        }
    }

    public C112039b(String str, int i, long j, long j2, String str2, String str3, String str4) {
        C87412m.m108594g(str, "side");
        C87412m.m108594g(str2, "happenTimes");
        C87412m.m108594g(str3, "stillPerTime");
        this.f335399a = i;
        this.f335400b = j2;
    }
}
