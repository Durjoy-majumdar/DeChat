package com.tencent.p014mm.plugin.appbrand.task.ipc;

import com.tencent.p014mm.ipcinvoker.C1254b;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import kotlin.Metadata;
import x20.C15618a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/b;", "Lcom/tencent/mm/ipcinvoker/b;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.b */
public final class C84307b extends C1254b<IPCString, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        String str;
        IPCString iPCString = (IPCString) obj;
        if (iPCString != null) {
            try {
                str = iPCString.f10315d;
            } catch (Throwable th) {
                if (gVar != null) {
                    C15618a.m14625a(gVar);
                }
                throw th;
            }
        } else {
            str = null;
        }
        if (str != null) {
            AppBrandProcessesManager.f246131g.mo116962a().mo116953R(new C84306a(str));
            if (gVar == null) {
                return;
            }
        } else if (gVar == null) {
            return;
        }
        C15618a.m14625a(gVar);
    }
}
