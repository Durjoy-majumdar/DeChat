package p248ug;

import android.net.Uri;
import com.tencent.p014mm.modelimage.C92856r0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86484b;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: ug.b */
public class C102027b {

    /* renamed from: a */
    public static String[] f300463a;

    /* renamed from: b */
    public static Boolean f300464b;

    /* renamed from: c */
    public static String f300465c;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        if ((r3 == 1 || r3 == 2 || r3 == 3 || r3 == 4) != false) goto L_0x0017;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m134386a(java.lang.String r2, int r3, boolean r4) {
        /*
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0016
            if (r3 == r0) goto L_0x0012
            r4 = 2
            if (r3 == r4) goto L_0x0012
            r4 = 3
            if (r3 == r4) goto L_0x0012
            r4 = 4
            if (r3 != r4) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r3 = 0
            goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            if (r3 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            java.lang.String r2 = m134387b(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p248ug.C102027b.m134386a(java.lang.String, int, boolean):java.lang.String");
    }

    /* renamed from: b */
    public static String m134387b(String str, boolean z) {
        if (m134390e() && z) {
            String[] strArr = f300463a;
            if (strArr == null || strArr.length == 0) {
                Log.m105918d("MicroMsg.BizImageStrategy", "addWXPicURLIfNecessary, cdn url is null");
                m134388c();
            }
            if (!m134389d(str)) {
                Log.m105918d("MicroMsg.BizImageStrategy", "addWXPicURLIfNecessary, is not cdn url");
                return str;
            }
            try {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("wxtype");
                if (queryParameter != null) {
                    String lowerCase = queryParameter.toLowerCase();
                    if (lowerCase.equals("gif")) {
                        return str;
                    }
                    if (lowerCase.contains("gif")) {
                        return str;
                    }
                }
                String queryParameter2 = parse.getQueryParameter("tp");
                if (!Util.isNullOrNil(queryParameter2)) {
                    if (queryParameter2.equals("wxpic")) {
                        return str;
                    }
                }
                return parse.buildUpon().appendQueryParameter("tp", "wxpic").build().toString();
            } catch (Exception unused) {
                return str;
            }
        } else if (!C92856r0.m117121g()) {
            return str;
        } else {
            String[] strArr2 = f300463a;
            if (strArr2 == null || strArr2.length == 0) {
                Log.m105918d("MicroMsg.BizImageStrategy", "addWebpURLIfNecessary, cdn url is null");
                m134388c();
            }
            if (!m134389d(str)) {
                Log.m105918d("MicroMsg.BizImageStrategy", "addWebpURLIfNecessary, is not cdn url");
                return str;
            }
            Uri parse2 = Uri.parse(str);
            String queryParameter3 = parse2.getQueryParameter("wxtype");
            if (Util.isNullOrNil(queryParameter3)) {
                return str;
            }
            String lowerCase2 = queryParameter3.toLowerCase();
            if (lowerCase2.equals("gif")) {
                return str;
            }
            if (lowerCase2.contains("gif")) {
                return str;
            }
            String queryParameter4 = parse2.getQueryParameter("tp");
            if (!Util.isNullOrNil(queryParameter4)) {
                if (queryParameter4.equals("webp")) {
                    return str;
                }
            }
            return !Util.isNullOrNil(lowerCase2) ? parse2.buildUpon().appendQueryParameter("tp", "webp").build().toString() : str;
        }
    }

    /* renamed from: c */
    public static void m134388c() {
        try {
            String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("BizEnableWxPicUrl");
            Log.m105925i("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList, urlList: %s", c);
            if (!Util.isNullOrNil(c)) {
                String[] split = c.split(";");
                f300463a = split;
                Log.m105919d("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList, CDN_URL_LIST.length: %d", Integer.valueOf(split.length));
            }
        } catch (C86484b unused) {
            Log.m105928w("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList fail, AccountNotReady");
        } catch (Exception e) {
            Log.m105919d("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList error: %s", e.getMessage());
        }
    }

    /* renamed from: d */
    public static boolean m134389d(String str) {
        String[] strArr = f300463a;
        if (strArr != null && strArr.length > 0 && !Util.isNullOrNil(str)) {
            for (String startsWith : f300463a) {
                if (str.startsWith(startsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m134390e() {
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
            return true;
        }
        if (f300464b == null) {
            f300464b = Boolean.TRUE;
        }
        return f300464b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m134391f(String str) {
        try {
            if (Util.isNullOrNil(str) || !m134389d(str)) {
                return false;
            }
            String queryParameter = Uri.parse(str).getQueryParameter("tp");
            return !Util.isNullOrNil(queryParameter) && queryParameter.equals("wxpic");
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static boolean m134392g(String str) {
        try {
            if (Util.isNullOrNil(str) || !m134389d(str)) {
                return false;
            }
            String queryParameter = Uri.parse(str).getQueryParameter("tp");
            return !Util.isNullOrNil(queryParameter) && queryParameter.equals("webp");
        } catch (Exception unused) {
        }
    }
}
