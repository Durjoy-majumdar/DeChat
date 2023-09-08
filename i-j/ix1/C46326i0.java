package ix1;

import gy3.C87412m;
import java.util.HashMap;
import rx3.C13604l;

/* renamed from: ix1.i0 */
public final class C46326i0 {

    /* renamed from: a */
    public static final HashMap<C13604l<String, String>, Long> f124817a = new HashMap<>();

    /* renamed from: b */
    public static final HashMap<C13604l<String, String>, Long> f124818b = new HashMap<>();

    /* renamed from: a */
    public static final long m51632a(String str, String str2) {
        C87412m.m108594g(str, "chatroomName");
        C87412m.m108594g(str2, "toUserName");
        Long l = f124818b.get(new C13604l(str, str2));
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m51633b(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "chatroomName"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "toUserName"
            gy3.C87412m.m108594g(r7, r0)
            rx3.l r0 = new rx3.l
            r0.<init>(r6, r7)
            long r6 = java.lang.System.currentTimeMillis()
            java.util.HashMap<rx3.l<java.lang.String, java.lang.String>, java.lang.Long> r1 = f124817a
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r1 = 1
            if (r0 == 0) goto L_0x0049
            long r2 = r0.longValue()
            long r6 = r6 - r2
            py1.u r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45368b()
            if (r0 == 0) goto L_0x003c
            py1.c5 r0 = r0.f128046g
            if (r0 == 0) goto L_0x0034
            int r0 = r0.f127628e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x003c
            int r0 = r0.intValue()
            goto L_0x003e
        L_0x003c:
            r0 = 1800(0x708, float:2.522E-42)
        L_0x003e:
            long r2 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ix1.C46326i0.m51633b(java.lang.String, java.lang.String):boolean");
    }
}
