package com.tencent.p014mm.model.gdpr;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;
import nc0.C76850a;

/* renamed from: com.tencent.mm.model.gdpr.f */
public class C1292f {

    /* renamed from: com.tencent.mm.model.gdpr.f$a */
    public static final class C1293a implements C80916r<IPCVoid, IPCBoolean> {
        private C1293a() {
        }

        public /* synthetic */ C1293a(C1291c cVar) {
            this();
        }

        /* renamed from: a */
        public IPCBoolean invoke(IPCVoid iPCVoid) {
            return new IPCBoolean(C86709a0.m107522a() && C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null)));
        }
    }

    /* renamed from: a */
    public static boolean m1381a() {
        if (MMApplicationContext.isMainProcess()) {
            return new C1293a((C1291c) null).invoke(IPCVoid.f10316d).f10312d;
        }
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C1293a.class);
        return iPCBoolean != null && iPCBoolean.f10312d;
    }
}
