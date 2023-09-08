package eu0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import du0.C31289a;
import eu0.C86683b;
import fu0.C87081a;
import gy3.C87412m;
import ob0.C47350c;
import ob0.C89144l0;
import te3.b75;
import te3.c75;

/* renamed from: eu0.c */
public final class C86688c implements C87081a.C87082a {

    /* renamed from: a */
    public final /* synthetic */ Context f251693a;

    /* renamed from: b */
    public final /* synthetic */ C86683b.C86685b f251694b;

    public C86688c(Context context, C86683b.C86685b bVar) {
        this.f251693a = context;
        this.f251694b = bVar;
    }

    /* renamed from: a */
    public void mo121075a(C87081a aVar) {
        C87412m.m108594g(aVar, "window");
        Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "click reject button");
        C86683b bVar = C86683b.f251674a;
        String str = this.f251694b.f251683b;
        C87412m.m108594g(str, "roomId");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        b75 b75 = new b75();
        b75.f131003e = 4;
        b75.f131002d = str;
        bVar2.f127066a = b75;
        bVar2.f127067b = new c75();
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus";
        bVar2.f127069d = 5036;
        C89144l0.m111429e(bVar2.mo72403a(), C31289a.f83781d, true);
        bVar.mo121066c();
        bVar.mo121067d();
    }

    /* renamed from: b */
    public void mo121076b(C87081a aVar) {
        C87412m.m108594g(aVar, "window");
        Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "click window");
        C86683b bVar = C86683b.f251674a;
        Context context = this.f251693a;
        C87412m.m108593f(context, "context");
        bVar.mo121066c();
        bVar.mo121065a(context, false);
    }

    /* renamed from: c */
    public void mo121077c(C87081a aVar) {
        C87412m.m108594g(aVar, "window");
        Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "click accept button");
        C86683b bVar = C86683b.f251674a;
        Context context = this.f251693a;
        C87412m.m108593f(context, "context");
        bVar.mo121066c();
        bVar.mo121065a(context, true);
    }
}
