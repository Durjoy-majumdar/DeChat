package com.tencent.p014mm.sdk.statecenter;

import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"com/tencent/mm/sdk/statecenter/ServiceStateCenter$observerOwner$1", "Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "getLogTag", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.statecenter.ServiceStateCenter$observerOwner$1 */
public final class ServiceStateCenter$observerOwner$1 extends MvvmObserverOwner<IMvvmObserver<State>, State> {
    public final /* synthetic */ ServiceStateCenter<State> this$0;

    public ServiceStateCenter$observerOwner$1(ServiceStateCenter<State> serviceStateCenter) {
        this.this$0 = serviceStateCenter;
    }

    public String getLogTag() {
        return this.this$0.getLogTag();
    }
}
