package com.tencent.p014mm.plugin.recordvideo.res;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.recordvideo.res.a */
public final class C105980a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseVideoResLogic f315412d;

    /* renamed from: e */
    public final /* synthetic */ CheckResUpdateCacheFileEvent f315413e;

    public C105980a(BaseVideoResLogic baseVideoResLogic, CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f315412d = baseVideoResLogic;
        this.f315413e = checkResUpdateCacheFileEvent;
    }

    public final void run() {
        BaseVideoResLogic baseVideoResLogic = this.f315412d;
        String str = this.f315413e.f78743d.f78746c;
        C87412m.m108593f(str, "event.data.filePath");
        CheckResUpdateCacheFileEvent.C28720a aVar = this.f315413e.f78743d;
        baseVideoResLogic.mo151285o(str, aVar.f78744a, aVar.f78745b, aVar.f78747d);
    }
}
