package p284zb;

import com.tencent.p014mm.plugin.appbrand.jsapi.C83133y6;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zb.d$$h */
public class d$$h implements C83164h {

    /* renamed from: a */
    public final /* synthetic */ C83165i f262559a;

    /* renamed from: b */
    public final /* synthetic */ C91633d f262560b;

    public d$$h(C91633d dVar, C83165i iVar) {
        this.f262560b = dVar;
        this.f262559a = iVar;
    }

    /* renamed from: a */
    public void mo69211a(String str, String str2) {
        Log.m105921e("Luggage.AppBrandMiniProgramServiceLogicImp", "hy: wxa main context exception %s %s", str, str2);
        String format = String.format("{'message':'%s', 'stack': '%s'}", new Object[]{C84751i1.m104412a(str), C84751i1.m104412a(str2)});
        C83133y6.m101968a(this.f262559a, "onError", format, 0);
        this.f262560b.mo122613T0(str, str2);
        Log.m105920e("MicroMsg.AppBrand.JsRuntimeException", format);
    }
}
