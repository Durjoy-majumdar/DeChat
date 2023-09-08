package bo1;

import com.tencent.p014mm.sdk.platformtools.Util;
import e03.C58469b;
import gy3.C8480h;
import gy3.C87412m;
import p1081gi.C98127h;
import pl1.C62367r0;

/* renamed from: bo1.y */
public final class C54512y extends C98127h implements Comparable<C54512y> {

    /* renamed from: g1 */
    public final C58469b f152809g1;

    /* renamed from: h1 */
    public final C62367r0 f152810h1;

    /* renamed from: i1 */
    public long f152811i1;

    /* renamed from: j1 */
    public C54514b f152812j1 = C54514b.PENDING;

    /* renamed from: k1 */
    public int f152813k1;

    /* renamed from: l1 */
    public final String f152814l1;

    /* renamed from: m1 */
    public final String f152815m1;

    /* renamed from: n1 */
    public int f152816n1;

    /* renamed from: bo1.y$a */
    public static final class C54513a {
        public C54513a(C8480h hVar) {
        }
    }

    /* renamed from: bo1.y$b */
    public enum C54514b {
        LOADING,
        PENDING,
        WAITING
    }

    static {
        new C54513a((C8480h) null);
    }

    public C54512y(C58469b bVar, C62367r0 r0Var) {
        C87412m.m108594g(bVar, "taskContext");
        C87412m.m108594g(r0Var, "video");
        this.f152809g1 = bVar;
        this.f152810h1 = r0Var;
        this.f152814l1 = r0Var.mo11841b();
        String str = r0Var.f177253e.f185275p;
        this.f152815m1 = str == null ? "" : str;
    }

    /* renamed from: c */
    public final String mo75350c() {
        String str = this.f287699a1;
        return str == null ? "xV0" : str;
    }

    public int compareTo(Object obj) {
        C54512y yVar = (C54512y) obj;
        C87412m.m108594g(yVar, "other");
        return C87412m.m108596i(yVar.f152813k1, this.f152813k1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C54512y) {
            return C87412m.m108589b(this.f152814l1, ((C54512y) obj).f152814l1);
        }
        return false;
    }

    public int hashCode() {
        return this.f152814l1.hashCode();
    }

    public String toString() {
        int i = this.field_requestVideoFormat;
        String str = "";
        boolean z = true;
        String str2 = i == 1 ? "H264" : i == 2 ? "H265" : str;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.f152812j1);
        sb.append("] ");
        String str3 = this.f152814l1;
        C87412m.m108594g(str3, "mediaId");
        if (str3.length() != 0) {
            z = false;
        }
        if (!z) {
            if (str3.length() <= 13) {
                str = str3;
            } else {
                int length = str3.length();
                if (length > 24) {
                    length = 24;
                }
                str = str3.substring(13, length);
                C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
        }
        sb.append(str);
        sb.append(' ');
        sb.append(str2);
        sb.append(" percent=");
        sb.append(this.f287692W0);
        sb.append("% minSize=");
        sb.append(Util.getSizeKB(this.f287671r));
        sb.append(" connection=");
        sb.append(this.f287657N);
        return sb.toString();
    }
}
