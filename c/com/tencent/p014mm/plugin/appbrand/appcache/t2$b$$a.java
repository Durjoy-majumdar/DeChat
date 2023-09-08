package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.plugin.appbrand.appcache.C81282k1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.vfs.C86013q1;
import ei0.C86516a;
import java.util.concurrent.CountDownLatch;
import js0.C9514m;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.t2$b$$a */
public final /* synthetic */ class t2$b$$a implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ String f238844d;

    /* renamed from: e */
    public final /* synthetic */ C81282k1.C81283a f238845e;

    /* renamed from: f */
    public final /* synthetic */ C86516a f238846f;

    /* renamed from: g */
    public final /* synthetic */ C9514m f238847g;

    /* renamed from: h */
    public final /* synthetic */ CountDownLatch f238848h;

    public /* synthetic */ t2$b$$a(String str, C81282k1.C81283a aVar, C86516a aVar2, C9514m mVar, CountDownLatch countDownLatch) {
        this.f238844d = str;
        this.f238845e = aVar;
        this.f238846f = aVar2;
        this.f238847g = mVar;
        this.f238848h = countDownLatch;
    }

    public final boolean onTimerExpired() {
        String str = this.f238844d;
        C81282k1.C81283a aVar = this.f238845e;
        C86516a aVar2 = this.f238846f;
        C9514m mVar = this.f238847g;
        CountDownLatch countDownLatch = this.f238848h;
        Log.m105925i("MicroMsg.AppBrand.CronetHttpsDownloadPerformer", "onTimerExpired, urlKey:%s", str);
        CronetLogic.cancelCronetTask(str);
        aVar.mo113476c();
        C86013q1.m106447h(aVar2.f249583c);
        mVar.f29691a = null;
        countDownLatch.countDown();
        return false;
    }
}
