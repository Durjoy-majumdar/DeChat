package y50;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: y50.n0 */
public final class C15936n0 {

    /* renamed from: a */
    public static final C15937a f42815a = new C15937a((C8480h) null);

    /* renamed from: y50.n0$a */
    public static final class C15937a {
        public C15937a(C8480h hVar) {
        }

        /* renamed from: a */
        public static String m14866a(C15937a aVar, int i, String str, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            String str2;
            String str3;
            String str4;
            if ((i2 & 4) != 0) {
                z = true;
            }
            if ((i2 & 8) != 0) {
                z2 = true;
            }
            if ((i2 & 16) != 0) {
                z3 = true;
            }
            aVar.getClass();
            C87412m.m108594g(str, "splitStr");
            int i3 = i % 60;
            int i4 = i / 60;
            int i5 = i4 % 60;
            int i6 = i4 / 60;
            if (i3 < 10) {
                StringBuilder sb = new StringBuilder();
                sb.append('0');
                sb.append(i3);
                str2 = sb.toString();
            } else {
                str2 = String.valueOf(i3);
            }
            if (i5 < 10) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append('0');
                sb4.append(i5);
                str3 = sb4.toString();
            } else {
                str3 = String.valueOf(i5);
            }
            if (i6 < 10) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append('0');
                sb5.append(i6);
                str4 = sb5.toString();
            } else {
                str4 = String.valueOf(i6);
            }
            StringBuilder sb6 = new StringBuilder();
            if (z) {
                sb6.append(str4 + str);
            }
            if (z2) {
                sb6.append(str3 + str);
            }
            if (z3) {
                sb6.append(str2);
            }
            String sb7 = sb6.toString();
            C87412m.m108593f(sb7, "result.toString()");
            return sb7;
        }

        /* renamed from: b */
        public final String mo14587b(int i, String str) {
            C87412m.m108594g(str, "splitStr");
            return i < 3600 ? m14866a(this, i, str, false, false, false, 24, (Object) null) : m14866a(this, i, str, true, false, false, 24, (Object) null);
        }
    }
}
