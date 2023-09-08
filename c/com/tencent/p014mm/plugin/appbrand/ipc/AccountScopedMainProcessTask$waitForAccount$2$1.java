package com.tencent.p014mm.plugin.appbrand.ipc;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CoreAccountInitializationNotifiedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/ipc/AccountScopedMainProcessTask$waitForAccount$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CoreAccountInitializationNotifiedEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AccountScopedMainProcessTask$waitForAccount$2$1 */
public final class AccountScopedMainProcessTask$waitForAccount$2$1 extends IListener<CoreAccountInitializationNotifiedEvent> {

    /* renamed from: d */
    public final /* synthetic */ C15601d<C13598b0> f10903d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountScopedMainProcessTask$waitForAccount$2$1(C15601d<? super C13598b0> dVar, C40008f fVar) {
        super(fVar);
        this.f10903d = dVar;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((CoreAccountInitializationNotifiedEvent) iEvent, "event");
        dead();
        C15601d<C13598b0> dVar = this.f10903d;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        return false;
    }
}
