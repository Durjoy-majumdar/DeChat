package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent;
import di3.C86312j;
import h81.C32735h;
import kotlin.Metadata;
import lp3.C88633e;
import p170ic.C87688b;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/k0;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: com.tencent.mm.plugin.appbrand.task.k0 */
public final class C84311k0 implements C1255d<IPCVoid, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        try {
            AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f238248d.mo113165a(true);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_release_preloaded_instances_on_wx_bg, 0) == 1) {
                C87688b bVar = new C87688b(C84309j0.f246193d, C84343y.values().length - 1);
                for (C84343y yVar : C84343y.values()) {
                    if (C84343y.NIL != yVar) {
                        ((C88633e) C84331q.m103960o(yVar)).mo114038a(new C84292i0(bVar));
                    }
                }
                if (gVar == null) {
                }
            }
        } finally {
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }
}
