package com.tencent.p014mm.feature.gamelive;

import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService;
import gy3.C8480h;
import kz1.C88341h;

/* renamed from: com.tencent.mm.feature.gamelive.c */
public final class C80858c implements C88341h.C88343b {

    /* renamed from: a */
    public final /* synthetic */ C1256g<GameLiveCommonService.IPCLiveControlData> f237691a;

    public C80858c(C1256g<GameLiveCommonService.IPCLiveControlData> gVar) {
        this.f237691a = gVar;
    }

    /* renamed from: a */
    public void mo112616a(boolean z, String str) {
        GameLiveAppbrandEventService.LiveTopicPayload liveTopicPayload = new GameLiveAppbrandEventService.LiveTopicPayload("", z, str);
        C1256g<GameLiveCommonService.IPCLiveControlData> gVar = this.f237691a;
        if (gVar != null) {
            gVar.mo894a(new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionSetTopic, (String) null, 0, liveTopicPayload, 6, (C8480h) null));
        }
    }
}
