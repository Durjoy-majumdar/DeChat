package com.tencent.p014mm.plugin.lite.debug;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.lite.debug.b */
class C69114b implements C80883e<Bundle, LiteAppDebugIPCCallbackData> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Log.m105924i("MicroMsg.LiteAppDebugInvokeTask", "invoke data = " + bundle.toString());
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(MMApplicationContext.getContext(), bundle, false, true, (C14088e.C14090b) null);
        Log.m105924i("MicroMsg.LiteAppDebugInvokeTask", "after start activity");
        LiteAppDebugIPCCallbackData liteAppDebugIPCCallbackData = new LiteAppDebugIPCCallbackData();
        liteAppDebugIPCCallbackData.f198745d = "ok";
        gVar.mo894a(liteAppDebugIPCCallbackData);
        Log.m105924i("MicroMsg.LiteAppDebugInvokeTask", "after callback");
    }
}
