package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.config.GetOnLineInfoInfoResult;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import il0.C87751a;
import kr0.C88267e;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$i */
public class AppBrandRuntimeWC$$i implements MMToClientEvent.C81947d {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRuntimeWC f238324a;

    public AppBrandRuntimeWC$$i(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238324a = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public void mo22085a(Object obj) {
        if (obj instanceof GetOnLineInfoInfoResult) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], GetOnLineInfoInfoResult", this.f238324a.f238147j);
            GetOnLineInfoInfoResult getOnLineInfoInfoResult = (GetOnLineInfoInfoResult) obj;
            C84072q1.m103586a(this.f238324a.f238147j).f245472p = getOnLineInfoInfoResult.f80323d;
            C84072q1.m103586a(this.f238324a.f238147j).f245473q = getOnLineInfoInfoResult.f80324e;
            C84072q1.m103586a(this.f238324a.f238147j).f245474r = getOnLineInfoInfoResult.f80325f;
        }
        if (obj instanceof GameLifeOutputDataWrapper) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "gamelifeManager ,get event,GameLifeOutputDataWrapper.onCustomDataNotify, appId[%s]", this.f238324a.f238147j);
            C88267e eVar = (C88267e) this.f238324a.f238150p;
            GameLifeOutputDataWrapper gameLifeOutputDataWrapper = (GameLifeOutputDataWrapper) obj;
            String str = gameLifeOutputDataWrapper.f114692d;
            String str2 = gameLifeOutputDataWrapper.f114693e;
            String str3 = gameLifeOutputDataWrapper.f114694f;
            C87751a aVar = C87751a.f254043i;
            C87412m.m108594g(eVar, "component");
            C87412m.m108594g(str, "sessionId");
            C87412m.m108594g(str2, "fromUserName");
            C87412m.m108594g(str3, "toUserName");
            C87751a aVar2 = C87751a.f254043i;
            aVar2.mo115194p(eVar);
            aVar2.mo115165o(C90364q0.m113147f(new C13604l("sessionId", str), new C13604l("fromUserName", str2), new C13604l("toUserName", str3)));
            aVar2.mo115158h();
        }
    }
}
