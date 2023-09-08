package ur0;

import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.ipcinvoker.C1254b;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, mo182094d2 = {"Lur0/c;", "Lcom/tencent/mm/ipcinvoker/b;", "Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandProcessSuicideNotifyTask$Args;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: ur0.c */
public final class C90726c extends C1254b<AppBrandProcessSuicideNotifyTask$Args, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        boolean z;
        AppBrandProcessSuicideNotifyTask$Args appBrandProcessSuicideNotifyTask$Args = (AppBrandProcessSuicideNotifyTask$Args) obj;
        C87412m.m108594g(appBrandProcessSuicideNotifyTask$Args, "data");
        String str = appBrandProcessSuicideNotifyTask$Args.f80587d;
        long j = appBrandProcessSuicideNotifyTask$Args.f80588e;
        int i = appBrandProcessSuicideNotifyTask$Args.f80589f;
        try {
            List f = AppBrandProcessesManager.f246131g.mo116962a().mo111391f(new C90725b(str));
            ArrayList arrayList = (ArrayList) f;
            Iterator it = arrayList.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                j2 = Math.max(j2, ((C84310k) it.next()).mo117010u());
            }
            if (j2 <= j) {
                ((C84310k) C110818d0.m150914L(f)).mo111369n();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    C84310k kVar = (C84310k) it4.next();
                    kVar.f234942c = LuggageServiceType.NIL;
                    kVar.f234940a.clear();
                    kVar.mo111365j();
                }
                C115669n.INSTANCE.mo175911u(365, i);
                z = true;
            } else {
                z = false;
            }
            Log.m105924i("MicroMsg.AppBrandProcessSuicideNotifyTask", "executeAsync in main process, processName:" + str + ", killed:" + z + ", timestamp:(" + j2 + " , " + j + ')');
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AppBrandProcessSuicideNotifyTask", "executeAsync in main process, processName:" + str + ", get exception:" + e);
        }
    }
}
