package ea3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import java.util.regex.Pattern;

/* renamed from: ea3.x */
public class C45606x {

    /* renamed from: a */
    public static final String[] f123373a = {WeChatHosts.domainString(C0966R.string.fmp), WeChatHosts.domainString(C0966R.string.fmt), WeChatHosts.domainString(C0966R.string.fmn)};

    /* renamed from: b */
    public static Pattern f123374b = null;

    /* renamed from: c */
    public static String f123375c = null;

    /* renamed from: d */
    public static Boolean f123376d = null;

    /* renamed from: a */
    public static void m50663a(String str) {
        MultiProcessMMKV.getDefault().putString("webview_url_prefs_url", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r8.endsWith("." + r4) != false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[LOOP:0: B:3:0x000b->B:16:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m50664b(java.net.URI r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0043
            java.lang.String r8 = r8.getHost()
            java.lang.String[] r1 = f123373a
            int r2 = r1.length
            r3 = 0
        L_0x000b:
            if (r3 >= r2) goto L_0x0043
            r4 = r1[r3]
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            r6 = 1
            if (r5 != 0) goto L_0x003c
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x001d
            goto L_0x003c
        L_0x001d:
            boolean r5 = r8.equals(r4)
            if (r5 != 0) goto L_0x003a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "."
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            boolean r4 = r8.endsWith(r4)
            if (r4 == 0) goto L_0x003c
        L_0x003a:
            r4 = 1
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            if (r4 == 0) goto L_0x0040
            return r6
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ea3.C45606x.m50664b(java.net.URI):boolean");
    }
}
