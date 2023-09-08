package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.f0 */
public class C68579f0 {
    /* renamed from: a */
    public static void m80843a(String str) {
        C86013q1.m106447h(str);
        try {
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("rm -r " + str + "_xdir");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.PkgCleanupLogic.CleanupUtil", "rm -r %s, e = %s", str + "_xdir", e);
        }
    }
}
