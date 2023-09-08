package com.tencent.p014mm.plugin.lite.debug;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.lite.debug.a */
public class C69112a {

    /* renamed from: com.tencent.mm.plugin.lite.debug.a$a */
    public class C69113a implements C1256g<LiteAppDebugIPCCallbackData> {
        /* renamed from: a */
        public void mo894a(Object obj) {
            String str = ((LiteAppDebugIPCCallbackData) obj).f198745d;
            Log.m105924i("MicroMsg.LiteAppDebug", "IPCInvoker.invokeAsync ret = " + str);
        }
    }

    /* renamed from: a */
    public static void m81426a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        bundle.putString("qr_url_query_string", str2);
        C80907o.m98781d(MMApplicationContext.getPackageName(), bundle, C69114b.class, new C69113a());
    }
}
