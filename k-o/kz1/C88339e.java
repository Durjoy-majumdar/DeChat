package kz1;

import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kz1.C88349l;
import sj0.C90202a;
import uj0.C90680g;
import uj0.C90681h;
import uj0.C90684k;
import xj0.C91237o;
import xj0.C91253w;

/* renamed from: kz1.e */
public final class C88339e<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ GameLiveAppbrandProcessService f255330d;

    public C88339e(GameLiveAppbrandProcessService gameLiveAppbrandProcessService) {
        this.f255330d = gameLiveAppbrandProcessService;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        C91237o oVar;
        C91237o.C91243f fVar;
        GameLiveCommonService.IPCLiveControlData iPCLiveControlData = (GameLiveCommonService.IPCLiveControlData) obj;
        Log.m105924i("MicroMsg.GameLiveAppbrandProcessService", "invoke startPush callback");
        C88349l.C88356g gVar = this.f255330d.f248205d;
        if (gVar != null) {
            C90684k kVar = (C90684k) gVar;
            String b0 = kVar.mo125215b0();
            C91237o oVar2 = null;
            if (((HashMap) C91237o.f261804g).containsKey(b0) && (oVar = (C91237o) ((HashMap) C91237o.f261804g).get(b0)) != null && ((fVar = oVar.f261809d) == C91237o.C91243f.Running || fVar == C91237o.C91243f.Paused)) {
                oVar2 = oVar;
            }
            if (oVar2 != null) {
                Log.m105924i("MicroMsg.WAGamePageViewRendererWC", "stop running recorder");
                C90680g gVar2 = new C90680g(kVar);
                Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger stop");
                oVar2.f261806a.postToWorker(new C91253w(oVar2, gVar2));
                new C90202a().mo124441s(((C83928t1) kVar.mo124764Z()).mo116160O0(), 112, "game is living, not support record now");
            }
            kVar.f260499v.mo111630b(false, 2, new C90681h(kVar));
        }
    }
}
