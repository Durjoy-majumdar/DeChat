package com.tencent.p014mm.sdk.observer;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\u00020\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00028\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0018\u001a\u00028\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c2\b\b\u0002\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001eJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001fJ\u0016\u0010\u0019\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0016J\u000f\u0010 \u001a\u00028\u0002H&¢\u0006\u0004\b \u0010!¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/sdk/observer/IMvvmTypeObserverOwner;", "Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "T", "E", "K", "", "key", "Landroidx/lifecycle/s;", "lifecycleOwner", "observer", "Lrx3/b0;", "observe", "(Ljava/lang/Object;Landroidx/lifecycle/s;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "", "threadTag", "(Ljava/lang/Object;Landroidx/lifecycle/s;Ljava/lang/String;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "(Landroidx/lifecycle/s;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "(Landroidx/lifecycle/s;Ljava/lang/String;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "removeObserver", "(Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "(Ljava/lang/Object;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "", "hasObserver", "(Ljava/lang/Object;)Z", "event", "notifyAll", "notify", "(Ljava/lang/Object;Ljava/lang/Object;Z)V", "", "eventList", "(Ljava/lang/Object;Ljava/util/List;Z)V", "(Ljava/lang/Object;)V", "getAllKey", "()Ljava/lang/Object;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.observer.IMvvmTypeObserverOwner */
public interface IMvvmTypeObserverOwner<T extends IMvvmObserver<E>, E, K> {

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.observer.IMvvmTypeObserverOwner$DefaultImpls */
    public static final class DefaultImpls {
        public static <T extends IMvvmObserver<E>, E, K> void notify(IMvvmTypeObserverOwner<T, E, K> iMvvmTypeObserverOwner, K k, E e, boolean z) {
        }

        public static <T extends IMvvmObserver<E>, E, K> void notify(IMvvmTypeObserverOwner<T, E, K> iMvvmTypeObserverOwner, K k, List<? extends E> list, boolean z) {
            C87412m.m108594g(list, "eventList");
        }

        public static /* synthetic */ void notify$default(IMvvmTypeObserverOwner iMvvmTypeObserverOwner, Object obj, Object obj2, boolean z, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 4) != 0) {
                    z = true;
                }
                iMvvmTypeObserverOwner.notify(obj, obj2, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notify");
        }

        public static <T extends IMvvmObserver<E>, E, K> void notifyAll(IMvvmTypeObserverOwner<T, E, K> iMvvmTypeObserverOwner, E e) {
        }

        public static <T extends IMvvmObserver<E>, E, K> void notifyAll(IMvvmTypeObserverOwner<T, E, K> iMvvmTypeObserverOwner, List<? extends E> list) {
            C87412m.m108594g(list, "eventList");
        }

        public static /* synthetic */ void notify$default(IMvvmTypeObserverOwner iMvvmTypeObserverOwner, Object obj, List list, boolean z, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 4) != 0) {
                    z = true;
                }
                iMvvmTypeObserverOwner.notify(obj, list, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notify");
        }
    }

    K getAllKey();

    boolean hasObserver(K k);

    void notify(K k, E e, boolean z);

    void notify(K k, List<? extends E> list, boolean z);

    void notifyAll(E e);

    void notifyAll(List<? extends E> list);

    void observe(C0125s sVar, T t);

    void observe(C0125s sVar, String str, T t);

    void observe(K k, C0125s sVar, T t);

    void observe(K k, C0125s sVar, String str, T t);

    void removeObserver(T t);

    void removeObserver(K k, T t);
}
