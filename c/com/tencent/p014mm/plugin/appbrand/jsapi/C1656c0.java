package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.c0 */
public final class C1656c0 {

    /* renamed from: a */
    public static final C1656c0 f11315a = new C1656c0();

    /* renamed from: a */
    public final boolean mo1682a(String str) {
        Log.m105924i("MicroMsg.AppBrand.CheckIsThirdAppInstalledLogic", "checkByDeepLinkUrl, deepLinkUrl: " + str);
        boolean z = false;
        if (str == null) {
            return false;
        }
        List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(MMApplicationContext.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str)));
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            z = true;
        }
        return !z;
    }
}
