package com.tencent.p014mm.plugin.report.service;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.report.service.ReportManager$4 */
class ReportManager$4 extends IListener<PostSyncTaskEvent> {

    /* renamed from: d */
    public final /* synthetic */ Runnable f81923d;

    /* renamed from: e */
    public final /* synthetic */ C115669n f81924e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportManager$4(C115669n nVar, C0125s sVar, Runnable runnable) {
        super(sVar);
        this.f81924e = nVar;
        this.f81923d = runnable;
        this.__eventId = -790196534;
    }

    public boolean callback(IEvent iEvent) {
        Object f;
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        if (this.f81924e.f346962j <= 0 && (f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CLOG_SAMPLING_REFRESH_TIME_LONG, (Object) null)) != null && (f instanceof Long)) {
            this.f81924e.f346962j = ((Long) f).longValue();
        }
        if (!this.f81924e.f346963n && System.currentTimeMillis() - this.f81924e.f346962j <= 86400000) {
            return true;
        }
        C86709a0.m107525e().postToWorkerDelayed(this.f81923d, 100);
        return true;
    }
}
