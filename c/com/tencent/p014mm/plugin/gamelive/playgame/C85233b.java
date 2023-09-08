package com.tencent.p014mm.plugin.gamelive.playgame;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.b */
public class C85233b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameLiveAppbrandEventService.LiveIntPayload f248320d;

    /* renamed from: e */
    public final /* synthetic */ C85232a f248321e;

    public C85233b(C85232a aVar, GameLiveAppbrandEventService.LiveIntPayload liveIntPayload) {
        this.f248321e = aVar;
        this.f248320d = liveIntPayload;
    }

    public void run() {
        if (this.f248320d.f248281d == 0) {
            Context context = this.f248321e.f248301b;
            C76912y0.m92769h(context, context.getString(C0966R.string.a5c), C0966R.raw.icons_filled_done);
            return;
        }
        Context context2 = this.f248321e.f248301b;
        C76912y0.m92769h(context2, context2.getString(C0966R.string.a5d), C0966R.raw.icons_filled_error);
        C85232a aVar = this.f248321e;
        aVar.f248300a.mo5086o();
        GameLiveAppbrandEventService.LivePlayGamePayLoad livePlayGamePayLoad = aVar.f248311l;
        livePlayGamePayLoad.f248296p = 1;
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionPlayGamePanelShowReport, (String) null, 0, livePlayGamePayLoad), GameLiveCommonService.C80854b.class, (C1256g) null);
    }
}
