package nx2;

import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: nx2.d */
public final class C89100d implements C89095a {
    /* renamed from: a */
    public void mo123434a(C35038e eVar) {
        C87412m.m108594g(eVar, "action");
        if (eVar == C35038e.SERVER_ERROR) {
            C89096b bVar = C89096b.f256754a;
            Log.m105924i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanUpService");
            C85486a aVar = C89096b.f256755b;
            if (aVar != null) {
                aVar.mo118861j0();
            }
            C89096b.f256755b = null;
        }
    }
}
