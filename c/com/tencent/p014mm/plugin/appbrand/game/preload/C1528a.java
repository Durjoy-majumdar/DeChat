package com.tencent.p014mm.plugin.appbrand.game.preload;

import a70.C112760b;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.game.preload.C1531b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;

/* renamed from: com.tencent.mm.plugin.appbrand.game.preload.a */
public class C1528a {

    /* renamed from: a */
    public static final String f10900a;

    /* renamed from: com.tencent.mm.plugin.appbrand.game.preload.a$a */
    public interface C1529a {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.game.preload.a$b */
    public static final class C1530b {

        /* renamed from: a */
        public static final C1528a f10901a = new C1528a();
    }

    static {
        String str;
        if (!Util.isNullOrNil(C1531b.f10902a)) {
            str = C1531b.f10902a;
        } else {
            IPCString iPCString = null;
            try {
                iPCString = (IPCString) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C1531b.C1532a.class);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WAGameLoadingImgPathRetriever", "retrieve ipc ex = %s", e);
            }
            if (iPCString == null) {
                String C = C112760b.m154195C();
                if (!C.endsWith("/")) {
                    C = C + "/";
                }
                str = C + "appbrand/loadingurl";
            } else {
                str = iPCString.f10315d;
                C1531b.f10902a = str;
            }
        }
        f10900a = str;
    }
}
