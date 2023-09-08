package p958eb;

import com.tencent.p014mm.plugin.appbrand.jsapi.C83133y6;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.List;
import p284zb.C91635f;
import sr0.C90341b;
import sr0.C90346d;

/* renamed from: eb.a$$b */
public class a$$b implements C83164h {

    /* renamed from: a */
    public final /* synthetic */ C86470a f251281a;

    public a$$b(C86470a aVar) {
        this.f251281a = aVar;
    }

    /* renamed from: a */
    public void mo69211a(String str, String str2) {
        C91635f fVar = (C91635f) this.f251281a.mo124764Z();
        C83165i jsRuntime = fVar == null ? null : fVar.getJsRuntime();
        if (jsRuntime != null) {
            Log.m105921e("Luggage.AppBrandGameServiceLogicImp", "[WAGameJsException] hy: wxa main context exception %s %s", str, str2);
            C83133y6.m101968a(jsRuntime, "onError", String.format("{'message':'%s', 'stack': '%s'}", new Object[]{C84751i1.m104412a(str), C84751i1.m104412a(str2)}), 0);
            List list = (List) ((HashMap) C90341b.C90342a.f259326a.f259325a).get(KSProcessWeAppLaunch.NAME);
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    ((C90346d) list.get(i)).mo124566a(str, str2);
                }
            }
            this.f251281a.mo120911U0(str, str2);
        }
    }
}
