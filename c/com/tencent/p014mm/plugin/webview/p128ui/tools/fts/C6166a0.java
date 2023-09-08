package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import eb0.C75592q0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.a0 */
public class C6166a0 {

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.a0$a */
    public static class C6167a implements C80916r<IPCVoid, IPCBoolean> {
        private C6167a() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            return new IPCBoolean(C6166a0.m6052a());
        }
    }

    /* renamed from: a */
    public static boolean m6052a() {
        if (MMApplicationContext.isMainProcess()) {
            return (C75592q0.m90781k() & 2097152) == 2097152;
        }
        IPCBoolean iPCBoolean = (IPCBoolean) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, null, C6167a.class);
        if (iPCBoolean == null) {
            return false;
        }
        return iPCBoolean.f10312d;
    }
}
