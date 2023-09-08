package com.tencent.p014mm.plugin.appbrand.appcache;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import lu3.C109426i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.e1 */
public class C81240e1 implements C109426i {
    public String getKey() {
        return "PkgNetworkOpt.triggerPreConnect";
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        String str;
        try {
            String str2 = AppBrandGlobalSystemConfig.m100099b().f239314r;
            if (TextUtils.isEmpty(str2)) {
                C81245g1.f238643a = false;
                return;
            }
            C81245g1.m99552a(str2);
            try {
                str = Uri.parse(str2).getHost();
            } catch (Exception unused) {
                str = "";
            }
            C81245g1.m99553b(str);
            C81245g1.f238643a = false;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PkgNetworkOpt", e, "triggerPreConnect", new Object[0]);
        } catch (Throwable th) {
            C81245g1.f238643a = false;
            throw th;
        }
    }
}
