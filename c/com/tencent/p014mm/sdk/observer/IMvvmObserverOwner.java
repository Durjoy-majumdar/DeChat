package com.tencent.p014mm.sdk.observer;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H&J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0001H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0014\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H&J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004H&¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/sdk/observer/IMvvmObserverOwner;", "Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "T", "E", "", "Landroidx/lifecycle/s;", "lifecycleOwner", "observer", "Lrx3/b0;", "observe", "(Landroidx/lifecycle/s;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "", "threadTag", "(Landroidx/lifecycle/s;Ljava/lang/String;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "uiObserve", "removeObserver", "(Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "", "hasObserver", "event", "notify", "(Ljava/lang/Object;)V", "", "eventList", "notifyAny", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.observer.IMvvmObserverOwner */
public interface IMvvmObserverOwner<T extends IMvvmObserver<E>, E> {
    boolean hasObserver();

    void notify(E e);

    void notify(List<? extends E> list);

    void notifyAny(Object obj);

    void observe(C0125s sVar, T t);

    void observe(C0125s sVar, String str, T t);

    void removeObserver(T t);

    void uiObserve(C0125s sVar, T t);
}
