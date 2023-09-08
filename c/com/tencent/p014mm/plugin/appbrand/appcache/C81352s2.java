package com.tencent.p014mm.plugin.appbrand.appcache;

import android.content.res.AssetManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.s2 */
public final class C81352s2 {

    /* renamed from: a */
    public static final int f238828a;

    /* renamed from: b */
    public static final String[] f238829b;

    /* renamed from: c */
    public static final C81353a f238830c;

    /* renamed from: d */
    public static Boolean f238831d = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.s2$a */
    public enum C81353a {
        DEVELOP,
        STABLE
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    static {
        /*
            com.tencent.mm.plugin.appbrand.appcache.s2$a r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81352s2.C81353a.STABLE
            java.lang.String r1 = m99773b()     // Catch:{ Exception -> 0x0023 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x0023 }
            if (r2 != 0) goto L_0x0023
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)     // Catch:{ Exception -> 0x0023 }
            if (r2 == 0) goto L_0x0023
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0023 }
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106432N(r1)     // Catch:{ Exception -> 0x0023 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r1 = "version"
            int r1 = r2.optInt(r1)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r1 = -1
        L_0x0024:
            if (r1 <= 0) goto L_0x002f
            f238828a = r1
            java.lang.String[] r1 = p1051vc.C90764a.f260658a
            f238829b = r1
            f238830c = r0
            goto L_0x0039
        L_0x002f:
            r1 = 890(0x37a, float:1.247E-42)
            f238828a = r1
            java.lang.String[] r1 = p1051vc.C90764a.f260658a
            f238829b = r1
            f238830c = r0
        L_0x0039:
            r0 = 0
            f238831d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81352s2.<clinit>():void");
    }

    /* renamed from: a */
    public static void m99772a() {
        C86013q1.m106447h(m99773b());
    }

    /* renamed from: b */
    public static String m99773b() {
        return new C86009m1(MMApplicationContext.getContext().getCacheDir().getAbsolutePath() + "/MockLibInfo.json").mo119971i();
    }

    /* renamed from: c */
    public static InputStream m99774c(String str) {
        AssetManager assets = MMApplicationContext.getContext().getAssets();
        try {
            if (!str.endsWith(".js")) {
                return assets.open(str, 3);
            }
            return assets.open(str + ".nocompress", 3);
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                try {
                    return assets.open(str, 3);
                } catch (Exception e2) {
                    Log.m105927v("MicroMsg.AppBrand.WxaLocalLibPkg", "openRead file( %s ) failed, exp = %s", str, e2);
                    return null;
                }
            } else {
                Log.m105927v("MicroMsg.AppBrand.WxaLocalLibPkg", "openRead file( %s ) failed, exp = %s", str, e);
                return null;
            }
        }
    }
}
