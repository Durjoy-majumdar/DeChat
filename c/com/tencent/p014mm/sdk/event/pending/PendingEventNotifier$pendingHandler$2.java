package com.tencent.p014mm.sdk.event.pending;

import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import mu3.C109639a;

@Metadata(mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "T", "Lcom/tencent/mm/sdk/event/pending/IPendingEvent;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.event.pending.PendingEventNotifier$pendingHandler$2 */
public final class PendingEventNotifier$pendingHandler$2 extends C87413o implements C32224a<MMHandler> {
    public final /* synthetic */ PendingEventNotifier<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingEventNotifier$pendingHandler$2(PendingEventNotifier<T> pendingEventNotifier) {
        super(0);
        this.this$0 = pendingEventNotifier;
    }

    public final MMHandler invoke() {
        PendingEventNotifier$pendingHandler$2$callback$1 pendingEventNotifier$pendingHandler$2$callback$1 = new PendingEventNotifier$pendingHandler$2$callback$1(this.this$0);
        if (C87412m.m108589b(this.this$0.getHandleThreadTag(), MvvmObserverOwner.MainThread)) {
            return new MMHandler(C109639a.m148951b(), (MMHandler.Callback) pendingEventNotifier$pendingHandler$2$callback$1);
        }
        C109639a aVar = C109639a.f328235e.get(this.this$0.getHandleThreadTag());
        if (aVar == null) {
            aVar = C109639a.m148950a(this.this$0.getHandleThreadTag());
        }
        return new MMHandler(aVar, (MMHandler.Callback) pendingEventNotifier$pendingHandler$2$callback$1);
    }
}
