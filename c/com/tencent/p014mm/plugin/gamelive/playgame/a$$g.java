package com.tencent.p014mm.plugin.gamelive.playgame;

import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService;
import com.tencent.p014mm.sdk.platformtools.Log;
import hl0.j$$b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.a$$g */
public final /* synthetic */ class a$$g implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C85232a f248319d;

    public /* synthetic */ a$$g(C85232a aVar) {
        this.f248319d = aVar;
    }

    /* renamed from: a */
    public final void mo894a(Object obj) {
        C85232a aVar = this.f248319d;
        aVar.getClass();
        GameLiveAppbrandEventService.LiveIntPayload liveIntPayload = (GameLiveAppbrandEventService.LiveIntPayload) ((GameLiveCommonService.IPCLiveControlData) obj).f237647g;
        if (aVar.f248314o != null && aVar.f248315p) {
            Log.m105924i("GameLivePlayGameAnchorInviteWidget", "zbqzbq callback");
            ((j$$b) aVar.f248314o).mo122013a(aVar.f248312m, liveIntPayload.f248281d, false);
            aVar.f248315p = false;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C85233b(aVar, liveIntPayload));
    }
}
