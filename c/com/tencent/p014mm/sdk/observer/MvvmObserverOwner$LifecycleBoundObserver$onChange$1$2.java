package com.tencent.p014mm.sdk.observer;

import java.util.List;
import kotlin.Metadata;
import lu3.C109426i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo182094d2 = {"com/tencent/mm/sdk/observer/MvvmObserverOwner$LifecycleBoundObserver$onChange$1$2", "Llu3/i;", "Lrx3/b0;", "run", "", "isLogging", "", "getKey", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver$onChange$1$2 */
public final class MvvmObserverOwner$LifecycleBoundObserver$onChange$1$2 implements C109426i {
    public final /* synthetic */ List<E> $eventList;
    public final /* synthetic */ MvvmObserverOwner<T, E>.LifecycleBoundObserver this$0;
    public final /* synthetic */ MvvmObserverOwner<T, E> this$1;

    public MvvmObserverOwner$LifecycleBoundObserver$onChange$1$2(MvvmObserverOwner<T, E>.LifecycleBoundObserver lifecycleBoundObserver, List<? extends E> list, MvvmObserverOwner<T, E> mvvmObserverOwner) {
        this.this$0 = lifecycleBoundObserver;
        this.$eventList = list;
        this.this$1 = mvvmObserverOwner;
    }

    public String getKey() {
        return this.this$1.getLogTag();
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        if (this.this$0.shouldBeActive()) {
            List<E> list = this.$eventList;
            MvvmObserverOwner<T, E>.LifecycleBoundObserver lifecycleBoundObserver = this.this$0;
            for (E onChanged : list) {
                lifecycleBoundObserver.getObserver().onChanged(onChanged);
            }
        }
    }
}
