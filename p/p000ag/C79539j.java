package p000ag;

import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import p000ag.C79533b;

/* renamed from: ag.j */
public final class C79539j extends C86430i<C79538i> {
    /* renamed from: e */
    public String mo16e() {
        return "notifyMiniProgramPlayableStatus";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C79538i iVar;
        C87412m.m108594g(hVar, "data");
        boolean optBoolean = hVar.optBoolean("isEnd");
        Log.m105924i("MbJsApiNotifyMiniProgramPlayableStatus", "isEnd:" + optBoolean);
        if (optBoolean && (iVar = (C79538i) this.f251227a) != null) {
            C79533b.C79534a aVar = iVar.f233195d;
            if (aVar != null) {
                aVar.mo109573a(0, "");
            } else {
                C87412m.m108603p("playableContainerViewCallback");
                throw null;
            }
        }
        mo120840p().invoke(mo120844i());
    }
}
