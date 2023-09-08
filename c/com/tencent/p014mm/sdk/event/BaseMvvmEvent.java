package com.tencent.p014mm.sdk.event;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u001c\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u0014\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fR)\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00028\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/BaseMvvmEvent;", "D", "Landroidx/lifecycle/i0;", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "observer", "Lrx3/b0;", "observe", "", "threadTag", "observeInUIThread", "removeObserver", "data", "publish", "(Ljava/lang/Object;)V", "Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "observerOwner", "Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "getObserverOwner", "()Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.event.BaseMvvmEvent */
public abstract class BaseMvvmEvent<D> extends C39622i0 {
    private final MvvmObserverOwner<IMvvmObserver<D>, D> observerOwner = new BaseMvvmEvent$observerOwner$1();

    public final MvvmObserverOwner<IMvvmObserver<D>, D> getObserverOwner() {
        return this.observerOwner;
    }

    public final void observe(C0125s sVar, IMvvmObserver<D> iMvvmObserver) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(iMvvmObserver, "observer");
        this.observerOwner.observe(sVar, iMvvmObserver);
    }

    public final void observeInUIThread(C0125s sVar, IMvvmObserver<D> iMvvmObserver) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(iMvvmObserver, "observer");
        this.observerOwner.observe(sVar, MvvmObserverOwner.MainThread, iMvvmObserver);
    }

    public final void publish(D d) {
        this.observerOwner.notify(d);
    }

    public final void removeObserver(IMvvmObserver<D> iMvvmObserver) {
        C87412m.m108594g(iMvvmObserver, "observer");
        this.observerOwner.removeObserver(iMvvmObserver);
    }

    public final void observe(C0125s sVar, String str, IMvvmObserver<D> iMvvmObserver) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(str, "threadTag");
        C87412m.m108594g(iMvvmObserver, "observer");
        this.observerOwner.observe(sVar, str, iMvvmObserver);
    }
}
