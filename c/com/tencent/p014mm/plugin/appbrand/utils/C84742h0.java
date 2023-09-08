package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import p635os.C89291d;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.h0 */
public final class C84742h0 {

    /* renamed from: a */
    public static final C84743a f247143a = new C84743a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.h0$a */
    public static final class C84743a {
        public C84743a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo117462a(String str, int i) {
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
}
