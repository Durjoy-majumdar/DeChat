package com.tencent.p014mm.feature.gamelive;

import android.view.Surface;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import gy3.C8480h;
import mz1.C88870s;

/* renamed from: com.tencent.mm.feature.gamelive.a */
public final class C80856a implements C88870s.C88871a {

    /* renamed from: a */
    public final /* synthetic */ C1256g<GameLiveCommonService.IPCLiveControlData> f237689a;

    public C80856a(C1256g<GameLiveCommonService.IPCLiveControlData> gVar) {
        this.f237689a = gVar;
    }

    /* renamed from: a */
    public final void mo112615a(Surface surface) {
        C1256g<GameLiveCommonService.IPCLiveControlData> gVar = this.f237689a;
        if (gVar != null) {
            gVar.mo894a(new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionUnknown, (String) null, 0, surface, 6, (C8480h) null));
        }
    }
}
