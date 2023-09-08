package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import eb0.C45628s0;
import eb0.C75592q0;
import gy3.C87412m;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.l */
public final class C1926l {

    /* renamed from: a */
    public static final C1926l f11800a = new C1926l();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/precondition/l$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.l$a */
    public static final class C1927a implements C80916r<IPCVoid, IPCBoolean> {
        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            boolean z = true;
            if (C45628s0.m50756U() && (C75592q0.m90781k() & 16777216) != 0) {
                z = false;
            }
            return new IPCBoolean(z);
        }
    }

    /* renamed from: a */
    public final boolean mo1819a(String str, boolean z, boolean z2) {
        C87412m.m108594g(str, "appId");
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C1927a.class);
        boolean z3 = false;
        boolean z4 = iPCBoolean != null ? iPCBoolean.f10312d : false;
        if (!z2 && !z && !z4) {
            z3 = true;
        }
        Log.m105924i("MicroMsg.AppBrandOverseaServiceAuthorizationHelper", "shouldTriggerOverseaServiceUserAuthorization, appId:" + str + ", isHalfScreenMode:" + z + ", isPluginApp:" + z2 + ", ret:" + z3);
        return z3;
    }
}
