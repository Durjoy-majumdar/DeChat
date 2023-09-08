package eu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import du0.C31289a;
import eu0.C86683b;
import gy3.C87412m;
import ob0.C47350c;
import ob0.C89144l0;
import p576jp.C33612d;
import te3.b75;
import te3.c75;

/* renamed from: eu0.i */
public final class C86696i implements C33612d.C33613a {
    /* renamed from: a */
    public void mo56933a() {
        Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "onInterruptBegin");
        C86683b.C86685b bVar = C86683b.f251676c;
        if (bVar != null) {
            String str = bVar.f251683b;
            C87412m.m108594g(str, "roomId");
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            b75 b75 = new b75();
            b75.f131003e = 9;
            b75.f131002d = str;
            bVar2.f127066a = b75;
            bVar2.f127067b = new c75();
            bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus";
            bVar2.f127069d = 5036;
            C89144l0.m111429e(bVar2.mo72403a(), C31289a.f83781d, true);
        }
        C86683b bVar3 = C86683b.f251674a;
        bVar3.mo121066c();
        bVar3.mo121067d();
    }

    /* renamed from: b */
    public void mo56934b() {
        Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "onInterruptEnd");
    }
}
