package com.tencent.p014mm.modelimage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86484b;
import f40.C86709a0;
import lc3.C10485b;
import p156gj.C107835h0;

/* renamed from: com.tencent.mm.modelimage.r0 */
public class C92856r0 {

    /* renamed from: a */
    public static String[] f267467a;

    /* renamed from: a */
    public static String m117115a(int i) {
        return String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", new Object[]{Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(i), Integer.valueOf(m117117c()), 1});
    }

    /* renamed from: b */
    public static String m117116b(int i) {
        return String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", new Object[]{Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(i), Integer.valueOf(m117117c()), 2});
    }

    /* renamed from: c */
    public static int m117117c() {
        Context context = MMApplicationContext.getContext();
        if (NetStatusUtil.isWifi(context)) {
            return 1;
        }
        if (NetStatusUtil.is5G(context)) {
            return 5;
        }
        if (NetStatusUtil.is4G(context)) {
            return 4;
        }
        if (NetStatusUtil.is3G(context)) {
            return 3;
        }
        return NetStatusUtil.is2G(context) ? 2 : 0;
    }

    /* renamed from: d */
    public static String m117118d(String str) {
        if (!m117121g()) {
            return str;
        }
        String[] strArr = f267467a;
        if (strArr == null || strArr.length == 0) {
            Log.m105918d("MicroMsg.WebpUtil", "addWebpURLIfNecessary, cdn url is null");
            m117119e();
        }
        if (!m117120f(str)) {
            Log.m105918d("MicroMsg.WebpUtil", "addWebpURLIfNecessary, is not cdn url");
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("wxtype");
            if (Util.isNullOrNil(queryParameter)) {
                return str;
            }
            String lowerCase = queryParameter.toLowerCase();
            if (lowerCase.equals("gif")) {
                return str;
            }
            if (lowerCase.contains("gif")) {
                return str;
            }
            String queryParameter2 = parse.getQueryParameter("tp");
            if (!Util.isNullOrNil(queryParameter2)) {
                if (queryParameter2.equals("webp")) {
                    return str;
                }
            }
            return !Util.isNullOrNil(lowerCase) ? parse.buildUpon().appendQueryParameter("tp", "webp").build().toString() : str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: e */
    public static void m117119e() {
        try {
            String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("BizEnableWebpUrl");
            Log.m105925i("MicroMsg.WebpUtil", "initCdnUrlList, urllist: %s", c);
            if (!Util.isNullOrNil(c)) {
                String[] split = c.split(";");
                f267467a = split;
                Log.m105919d("MicroMsg.WebpUtil", "initCdnUrlList, CDN_URL_LIST.length: %d", Integer.valueOf(split.length));
            }
        } catch (C86484b unused) {
            Log.m105928w("MicroMsg.WebpUtil", "initCdnUrlList fail, AccountNotReady");
        } catch (Exception e) {
            Log.m105919d("MicroMsg.WebpUtil", "initCdnUrlList error: %s", e.getMessage());
        }
    }

    /* renamed from: f */
    public static boolean m117120f(String str) {
        String[] strArr = f267467a;
        if (strArr != null && strArr.length > 0 && !Util.isNullOrNil(str)) {
            for (String startsWith : f267467a) {
                if (str.startsWith(startsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m117121g() {
        if (f267467a == null) {
            m117119e();
        }
        String[] strArr = f267467a;
        return strArr != null && strArr.length > 0 && C107835h0.f322856m.f322894d0 == 1;
    }

    /* renamed from: h */
    public static boolean m117122h(String str) {
        try {
            if (Util.isNullOrNil(str) || !m117120f(str)) {
                return false;
            }
            String queryParameter = Uri.parse(str).getQueryParameter("tp");
            return !Util.isNullOrNil(queryParameter) && queryParameter.equals("webp");
        } catch (Exception unused) {
        }
    }
}
