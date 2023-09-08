package com.tencent.p014mm.plugin.gamelive.playgame;

import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import hl0.j$$b;
import kz1.C88349l;
import qo3.w$$d;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.a$$c */
public final /* synthetic */ class a$$c implements w$$d {

    /* renamed from: a */
    public final /* synthetic */ C85232a f248317a;

    public /* synthetic */ a$$c(C85232a aVar) {
        this.f248317a = aVar;
    }

    public final void onDismiss() {
        C85232a aVar = this.f248317a;
        C88349l.C88350a aVar2 = aVar.f248314o;
        if (aVar2 != null && !aVar.f248315p) {
            ((j$$b) aVar2).mo122013a(0, 0, true);
            GameLiveAppbrandEventService.LivePlayGamePayLoad livePlayGamePayLoad = aVar.f248311l;
            livePlayGamePayLoad.f248296p = 3;
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionPlayGamePanelShowReport, (String) null, 0, livePlayGamePayLoad), GameLiveCommonService.C80854b.class, (C1256g) null);
        }
    }
}
