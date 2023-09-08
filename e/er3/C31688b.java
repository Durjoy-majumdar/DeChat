package er3;

import ce2.C28545b;
import oa1.C117731d;

/* renamed from: er3.b */
public final class C31688b {
    /* renamed from: a */
    public static boolean m39498a() {
        Class<C31688b> cls = C31688b.class;
        StringBuilder sb = new StringBuilder(8);
        try {
            sb.append(C28545b.m38262a("­¬°¬ªº°¸¶²½·­¡¢¥¨¤¾¢¤¥³µ³§±"));
            String sb4 = sb.toString();
            sb.delete(0, sb.length());
            sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
            return !sb.toString().equals(m39499b(sb4, sb.toString()));
        } catch (Throwable unused) {
            String sb5 = sb.toString();
            sb.delete(0, sb.length());
            sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
            return !sb.toString().equals(m39499b(sb5, sb.toString()));
        }
    }

    /* renamed from: b */
    public static String m39499b(String str, String str2) {
        return C117731d.m166007c().mo182444f(str, str2, false, true);
    }
}
