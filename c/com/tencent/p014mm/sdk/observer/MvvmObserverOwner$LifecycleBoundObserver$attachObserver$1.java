package com.tencent.p014mm.sdk.observer;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "T", "E", "Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver$attachObserver$1 */
public final class MvvmObserverOwner$LifecycleBoundObserver$attachObserver$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ MvvmObserverOwner<T, E>.LifecycleBoundObserver this$0;
    public final /* synthetic */ MvvmObserverOwner<T, E> this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MvvmObserverOwner$LifecycleBoundObserver$attachObserver$1(MvvmObserverOwner<T, E>.LifecycleBoundObserver lifecycleBoundObserver, MvvmObserverOwner<T, E> mvvmObserverOwner) {
        super(0);
        this.this$0 = lifecycleBoundObserver;
        this.this$1 = mvvmObserverOwner;
    }

    public final void invoke() {
        if (this.this$0.shouldBeActive()) {
            this.this$0.getOwner().getLifecycle().addObserver(this.this$0);
            return;
        }
        String logTag = this.this$1.getLogTag();
        Log.m105920e(logTag, "attachObserver fail, lifecycle is destroyed owner:" + this.this$0.getOwner().hashCode() + " observer:" + this.this$0.getObserver().hashCode());
    }
}
