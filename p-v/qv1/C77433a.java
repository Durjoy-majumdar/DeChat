package qv1;

import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.plugin.fts.plc.FTSQueryClickRecallFSC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hp3.C87581a;
import kv1.C76636p;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49322er2;
import te3.C49374f33;
import te3.C49600gr2;

/* renamed from: qv1.a */
public final class C77433a<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FTSQueryClickRecallFSC f225848a;

    public C77433a(FTSQueryClickRecallFSC fTSQueryClickRecallFSC) {
        this.f225848a = fTSQueryClickRecallFSC;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("MicroMsg.FTSQueryClickRecallPLC", "OnPardusSearchSceneEnd " + cVar.f256793a + ' ' + cVar.f256794b + ' ' + cVar.f256795c);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            FTSQueryClickRecallFSC fTSQueryClickRecallFSC = this.f225848a;
            C49600gr2 gr22 = (C49600gr2) cVar.f256796d;
            C49322er2 er22 = gr22 != null ? gr22.f134209d : null;
            C49374f33 f332 = gr22 != null ? gr22.f134210e : null;
            fTSQueryClickRecallFSC.getClass();
            Log.m105924i("MicroMsg.FTSQueryClickRecallPLC", "updateRecallDict");
            C76636p Jd = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).mo128743Jd();
            if (Jd != null) {
                ((C93836i) Jd).mo128803c(65536, new C77435c(fTSQueryClickRecallFSC, er22, f332));
            }
            FTSQueryClickRecallFSC fTSQueryClickRecallFSC2 = this.f225848a;
            C49600gr2 gr23 = (C49600gr2) cVar.f256796d;
            fTSQueryClickRecallFSC2.f198227g = ((long) (gr23 != null ? gr23.f134211f : 0)) * 1000;
        }
        this.f225848a.f198228h = null;
        return C13598b0.f38549a;
    }
}
