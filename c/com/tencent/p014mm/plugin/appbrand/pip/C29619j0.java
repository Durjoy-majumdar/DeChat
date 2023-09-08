package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/pip/j0;", "Lcom/tencent/mm/plugin/appbrand/pip/l0;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/appbrand/pip/PipStablePos;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.pip.j0 */
final class C29619j0 extends C29621l0 implements C80883e<PipStablePos, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        PipStablePos pipStablePos = (PipStablePos) obj;
        if (pipStablePos == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "SetStablePosTask#invoke, data is null");
            return;
        }
        Log.m105918d("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "SetStablePosTask#invoke, data: " + pipStablePos);
        ((C29618i0) ((C36570n) this.f80549d).getValue()).mo56861a(pipStablePos.f80545d, pipStablePos.f80546e);
        if (gVar != null) {
            gVar.mo894a(IPCVoid.f10316d);
        }
    }
}
