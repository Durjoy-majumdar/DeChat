package com.tencent.p014mm.plugin.appbrand.launching;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.PrepareStepCheckLaunchInfo$2 */
class PrepareStepCheckLaunchInfo$2 extends IListener<NotifyWxaCommLibUpdatedEvent> {

    /* renamed from: d */
    public final /* synthetic */ long f243383d;

    /* renamed from: e */
    public final /* synthetic */ PBool f243384e;

    /* renamed from: f */
    public final /* synthetic */ CountDownLatch f243385f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrepareStepCheckLaunchInfo$2(C83524y3 y3Var, C0125s sVar, long j, PBool pBool, CountDownLatch countDownLatch) {
        super(sVar);
        this.f243383d = j;
        this.f243384e = pBool;
        this.f243385f = countDownLatch;
        Class<NotifyWxaCommLibUpdatedEvent> cls = NotifyWxaCommLibUpdatedEvent.class;
        this.__eventId = -1441357655;
    }

    public boolean callback(IEvent iEvent) {
        dead();
        long currentTicks = Util.currentTicks() - this.f243383d;
        NotifyWxaCommLibUpdatedEvent.UpdateResult updateResult = ((NotifyWxaCommLibUpdatedEvent) iEvent).f238553d;
        if (updateResult instanceof NotifyWxaCommLibUpdatedEvent.UpdateResult.Succeed) {
            ICommLibReader iCommLibReader = ((NotifyWxaCommLibUpdatedEvent.UpdateResult.Succeed) updateResult).f238554d;
            Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "waitForCommLibUpdated, cost:%dms, get lib.version:(%d | %s)", Long.valueOf(currentTicks), Integer.valueOf(iCommLibReader.mo113371a()), iCommLibReader.mo113377i());
            this.f243384e.value = true;
        } else if (updateResult instanceof NotifyWxaCommLibUpdatedEvent.UpdateResult.Failed) {
            Log.m105921e("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "waitForCommLibUpdated, cost:%dms, failed", Long.valueOf(currentTicks));
            this.f243384e.value = false;
        }
        this.f243385f.countDown();
        return false;
    }
}
