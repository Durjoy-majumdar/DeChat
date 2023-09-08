package ma2;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: ma2.r */
public interface C99819r {

    /* renamed from: ma2.r$a */
    public static final class C61452a {

        /* renamed from: a */
        public boolean f174759a;

        /* renamed from: b */
        public long f174760b;

        /* renamed from: c */
        public String f174761c;

        /* renamed from: a */
        public boolean mo86424a() {
            return Util.isNullOrNil(this.f174761c.trim());
        }

        public String toString() {
            return String.format("[%d %s]", new Object[]{Long.valueOf(this.f174760b), this.f174761c});
        }
    }

    /* renamed from: a */
    C61452a mo86426a(int i);

    /* renamed from: b */
    int mo86427b();
}
