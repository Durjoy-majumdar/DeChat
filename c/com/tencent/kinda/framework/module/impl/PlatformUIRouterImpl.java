package com.tencent.kinda.framework.module.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.kinda.gen.KPlatformUIRouter;
import com.tencent.p014mm.autogen.events.KindaGotoExternAppEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;

public class PlatformUIRouterImpl implements KPlatformUIRouter {
    public static final String TAG = "MicroMsg.PlatformUIRouterImpl";
    private byte _hellAccFlag_;

    public void gotoExternApp(String str, int i, String str2, String str3, String str4, int i2, int i3, byte[] bArr) {
        KindaGotoExternAppEvent kindaGotoExternAppEvent = new KindaGotoExternAppEvent();
        KindaGotoExternAppEvent.C67722a aVar = kindaGotoExternAppEvent.f193709d;
        aVar.f193711b = i;
        aVar.f193712c = str2;
        aVar.f193710a = str;
        kindaGotoExternAppEvent.publish();
    }

    public void jointpayGotoExternApp(String str, int i, String str2, String str3, String str4, int i2, int i3, byte[] bArr) {
        KindaGotoExternAppEvent kindaGotoExternAppEvent = new KindaGotoExternAppEvent();
        KindaGotoExternAppEvent.C67722a aVar = kindaGotoExternAppEvent.f193709d;
        aVar.f193711b = i;
        aVar.f193712c = str2;
        aVar.f193710a = str;
        kindaGotoExternAppEvent.publish();
    }

    public void openUrlScheme(String str) {
        String str2 = str;
        if (!Util.isNullOrNil(str)) {
            if (str2.startsWith("telprompt://")) {
                Log.m105925i(TAG, "call dial: %s", str2);
                String replace = str2.replace("telprompt://", "");
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setFlags(268435456);
                intent.setData(Uri.parse("tel:" + replace));
                if (Util.isIntentAvailable(MMApplicationContext.getContext(), intent, true)) {
                    try {
                        Context context = MMApplicationContext.getContext();
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(context, "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (Exception e) {
                        Log.printErrStackTrace(TAG, e, "", new Object[0]);
                    }
                }
            } else {
                Log.m105924i(TAG, "startOuterApp callbackUrl is " + str2);
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268435456);
                if (Util.isIntentAvailable(MMApplicationContext.getContext(), intent2, true)) {
                    try {
                        Context context2 = MMApplicationContext.getContext();
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent2);
                        C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context2.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(context2, "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (Exception e2) {
                        Log.printErrStackTrace(TAG, e2, "", new Object[0]);
                    }
                }
            }
        }
    }
}
