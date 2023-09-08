package dp0;

import com.tencent.luggage.bridge.impl.C80206a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import ep0.C107281c;
import p1038ta.C90383b;
import pi0.C110230e;
import zi0.C91755a;

/* renamed from: dp0.a */
public class C86389a extends C80206a {

    /* renamed from: b */
    public static C110230e f251178b = new C107281c();

    /* renamed from: a */
    public void mo113342a(C90383b.C90386c cVar) {
        Log.m105925i("MicroMsg.LuggageInitDelegateWxImpl", "onInitialize %s", MMApplicationContext.getProcessName());
        C116281f0.m163819m(MMApplicationContext.getContext());
        cVar.mo114853b(C91755a.class, this.f234757a);
        cVar.mo114853b(C110230e.class, f251178b);
    }

    /* renamed from: b */
    public void mo113343b(C90383b.C90384a aVar) {
        Log.m105925i("MicroMsg.LuggageInitDelegateWxImpl", "onInitComponent %s", MMApplicationContext.getProcessName());
        ((C82510g.C82512b) aVar).mo114853b(C91755a.class, this.f234757a);
    }
}
