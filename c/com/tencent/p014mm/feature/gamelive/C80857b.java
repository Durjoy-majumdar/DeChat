package com.tencent.p014mm.feature.gamelive;

import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService;
import gy3.C8480h;
import p565ir.C60606n;

/* renamed from: com.tencent.mm.feature.gamelive.b */
public final class C80857b implements C60606n.C46282d {

    /* renamed from: a */
    public final /* synthetic */ C1256g<GameLiveCommonService.IPCLiveControlData> f237690a;

    public C80857b(C1256g<GameLiveCommonService.IPCLiveControlData> gVar) {
        this.f237690a = gVar;
    }

    /* renamed from: a */
    public void mo71688a(int i) {
        GameLiveAppbrandEventService.LiveIntPayload liveIntPayload = new GameLiveAppbrandEventService.LiveIntPayload(i);
        C1256g<GameLiveCommonService.IPCLiveControlData> gVar = this.f237690a;
        if (gVar != null) {
            gVar.mo894a(new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionUnknown, (String) null, 0, liveIntPayload, 6, (C8480h) null));
        }
    }
}
