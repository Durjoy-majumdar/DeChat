package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import lo0.C88615f;
import p635os.C89291d;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.g0 */
public class C84738g0 implements C88615f {

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.g0$b */
    public static class C84740b {

        /* renamed from: a */
        public static C84738g0 f247140a = new C84738g0((C84739a) null);
    }

    public C84738g0(C84739a aVar) {
    }

    /* renamed from: W */
    public String mo117459W(String str, int i) {
        Boolean Qq0 = ((C89291d) C86312j.m106911c(C89291d.class)).Qq0(str, i);
        C87412m.m108593f(Qq0, "getService(IGameLiveComm…iving(appId, versionType)");
        if (Qq0.booleanValue()) {
            Log.m105924i("MicroMsg.AppBrandVoipHelper", "canJoinVOIP: is game living");
            return MMApplicationContext.getContext().getString(C0966R.string.fqy);
        }
        IPCString iPCString = (IPCString) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C84765m0.class);
        if (iPCString != null) {
            return iPCString.f10315d;
        }
        return null;
    }
}
