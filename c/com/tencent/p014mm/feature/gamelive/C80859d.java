package com.tencent.p014mm.feature.gamelive;

import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService;
import gy3.C8480h;
import gy3.C87412m;
import kz1.C88341h;

/* renamed from: com.tencent.mm.feature.gamelive.d */
public final class C80859d implements C88341h.C88342a {

    /* renamed from: a */
    public final /* synthetic */ C1256g<GameLiveCommonService.IPCLiveControlData> f237692a;

    public C80859d(C1256g<GameLiveCommonService.IPCLiveControlData> gVar) {
        this.f237692a = gVar;
    }

    /* renamed from: a */
    public void mo112617a(GameLiveAppbrandEventService.LiveMemberInfoListPayload liveMemberInfoListPayload) {
        C87412m.m108594g(liveMemberInfoListPayload, "list");
        C1256g<GameLiveCommonService.IPCLiveControlData> gVar = this.f237692a;
        if (gVar != null) {
            gVar.mo894a(new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionUnknown, (String) null, 0, liveMemberInfoListPayload, 6, (C8480h) null));
        }
    }
}
