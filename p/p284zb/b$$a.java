package p284zb;

import com.tencent.p014mm.plugin.appbrand.jsapi.C83137z6;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.List;
import sr0.C90341b;
import sr0.C90346d;

/* renamed from: zb.b$$a */
public final /* synthetic */ class b$$a implements C83164h {

    /* renamed from: a */
    public final /* synthetic */ C91631b f262493a;

    /* renamed from: b */
    public final /* synthetic */ C40480g f262494b;

    /* renamed from: c */
    public final /* synthetic */ String f262495c;

    public /* synthetic */ b$$a(C91631b bVar, C40480g gVar, String str) {
        this.f262493a = bVar;
        this.f262494b = gVar;
        this.f262495c = str;
    }

    /* renamed from: a */
    public final void mo69211a(String str, String str2) {
        C91631b bVar = this.f262493a;
        C40480g gVar = this.f262494b;
        String str3 = this.f262495c;
        bVar.getClass();
        Log.m105921e("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: on exception! message: %s, stacktrace %s", str, str2);
        C83137z6.m101976a(gVar, "onError", String.format("{'message':'%s', 'stack': '%s'}", new Object[]{C84751i1.m104412a(str), C84751i1.m104412a(str2)}), 0);
        List list = (List) ((HashMap) C90341b.C90342a.f259326a.f259325a).get(KSProcessWeAppLaunch.NAME);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ((C90346d) list.get(i)).mo124566a(str, str2);
            }
        }
        bVar.mo122601w(str3, str, str2);
    }
}
