package com.tencent.p014mm.sdk.observer;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C26236u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u001dJ\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001aH\u0016J\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010 \u001a\u00020\nJ\b\u0010!\u001a\u00020\rH&J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0000H\u0014¢\u0006\u0004\b#\u0010\u0014R_\u0010'\u001aJ\u0012\u0004\u0012\u00028\u0002\u0012\u001a\u0012\u00180%R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00000$j$\u0012\u0004\u0012\u00028\u0002\u0012\u001a\u0012\u00180%R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000`&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/sdk/observer/MvvmTypeObserverOwner;", "Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "T", "E", "K", "Lcom/tencent/mm/sdk/observer/IMvvmTypeObserverOwner;", "key", "Landroidx/lifecycle/s;", "lifecycleOwner", "observer", "Lrx3/b0;", "observe", "(Ljava/lang/Object;Landroidx/lifecycle/s;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "", "threadTag", "(Ljava/lang/Object;Landroidx/lifecycle/s;Ljava/lang/String;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "(Landroidx/lifecycle/s;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "(Landroidx/lifecycle/s;Ljava/lang/String;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "removeObserver", "(Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "(Ljava/lang/Object;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "event", "", "notifyAll", "notify", "(Ljava/lang/Object;Ljava/lang/Object;Z)V", "", "eventList", "(Ljava/lang/Object;Ljava/util/List;Z)V", "(Ljava/lang/Object;)V", "hasObserver", "(Ljava/lang/Object;)Z", "reset", "getLogTag", "type", "onRemoveObserver", "Ljava/util/HashMap;", "Lcom/tencent/mm/sdk/observer/MvvmTypeObserverOwner$TypeObserverOwner;", "Lkotlin/collections/HashMap;", "ownerMap", "Ljava/util/HashMap;", "getOwnerMap", "()Ljava/util/HashMap;", "<init>", "()V", "TypeObserverOwner", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.observer.MvvmTypeObserverOwner */
public abstract class MvvmTypeObserverOwner<T extends IMvvmObserver<E>, E, K> implements IMvvmTypeObserverOwner<T, E, K> {
    private final HashMap<K, MvvmTypeObserverOwner<T, E, K>.TypeObserverOwner> ownerMap = new HashMap<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/sdk/observer/MvvmTypeObserverOwner$TypeObserverOwner;", "Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "", "getLogTag", "observer", "Lrx3/b0;", "removeObserver", "(Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "type", "Ljava/lang/Object;", "getType", "()Ljava/lang/Object;", "<init>", "(Lcom/tencent/mm/sdk/observer/MvvmTypeObserverOwner;Ljava/lang/Object;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.observer.MvvmTypeObserverOwner$TypeObserverOwner */
    public final class TypeObserverOwner extends MvvmObserverOwner<T, E> {
        private final K type;

        public TypeObserverOwner(K k) {
            this.type = k;
        }

        public String getLogTag() {
            return MvvmTypeObserverOwner.this.getLogTag();
        }

        public final K getType() {
            return this.type;
        }

        public void removeObserver(T t) {
            C87412m.m108594g(t, "observer");
            super.removeObserver(t);
            MvvmTypeObserverOwner.this.onRemoveObserver(this.type, t);
        }
    }

    public abstract String getLogTag();

    public final HashMap<K, MvvmTypeObserverOwner<T, E, K>.TypeObserverOwner> getOwnerMap() {
        return this.ownerMap;
    }

    public boolean hasObserver(K k) {
        TypeObserverOwner typeObserverOwner = this.ownerMap.get(k);
        if (typeObserverOwner != null) {
            return typeObserverOwner.hasObserver();
        }
        return false;
    }

    public void notify(K k, E e, boolean z) {
        notify(k, C26236u.m33719b(e), z);
    }

    public void notifyAll(E e) {
        notifyAll(C26236u.m33719b(e));
    }

    public void observe(K k, C0125s sVar, T t) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(t, "observer");
        synchronized (this.ownerMap) {
            HashMap<K, MvvmTypeObserverOwner<T, E, K>.TypeObserverOwner> hashMap = this.ownerMap;
            MvvmTypeObserverOwner<T, E, K>.TypeObserverOwner typeObserverOwner = hashMap.get(k);
            if (typeObserverOwner == null) {
                typeObserverOwner = new TypeObserverOwner(k);
                hashMap.put(k, typeObserverOwner);
            }
            typeObserverOwner.observe(sVar, t);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public void onRemoveObserver(K k, T t) {
        C87412m.m108594g(t, "observer");
    }

    public void removeObserver(T t) {
        C87412m.m108594g(t, "observer");
        removeObserver(getAllKey(), t);
    }

    public final void reset() {
        synchronized (this.ownerMap) {
            this.ownerMap.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public void notify(K k, List<? extends E> list, boolean z) {
        C87412m.m108594g(list, "eventList");
        try {
            TypeObserverOwner typeObserverOwner = this.ownerMap.get(k);
            if (typeObserverOwner != null) {
                typeObserverOwner.notify(list);
            }
            if (z) {
                notifyAll(list);
            }
        } catch (Exception e) {
            Log.printErrStackTrace(getLogTag(), e, "doNotify", new Object[0]);
        }
    }

    public void notifyAll(List<? extends E> list) {
        TypeObserverOwner typeObserverOwner;
        C87412m.m108594g(list, "eventList");
        try {
            if ((!list.isEmpty()) && (typeObserverOwner = this.ownerMap.get(getAllKey())) != null) {
                typeObserverOwner.notify(list);
            }
        } catch (Exception e) {
            Log.printErrStackTrace(getLogTag(), e, "doNotify", new Object[0]);
        }
    }

    public void removeObserver(K k, T t) {
        C87412m.m108594g(t, "observer");
        synchronized (this.ownerMap) {
            TypeObserverOwner typeObserverOwner = this.ownerMap.get(k);
            if (typeObserverOwner != null) {
                typeObserverOwner.removeObserver(t);
                if (!typeObserverOwner.hasObserver()) {
                    this.ownerMap.remove(k);
                    String logTag = getLogTag();
                    Log.m105918d(logTag, "owner remove key:" + k);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public void observe(K k, C0125s sVar, String str, T t) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(str, "threadTag");
        C87412m.m108594g(t, "observer");
        synchronized (this.ownerMap) {
            HashMap<K, MvvmTypeObserverOwner<T, E, K>.TypeObserverOwner> hashMap = this.ownerMap;
            MvvmTypeObserverOwner<T, E, K>.TypeObserverOwner typeObserverOwner = hashMap.get(k);
            if (typeObserverOwner == null) {
                typeObserverOwner = new TypeObserverOwner(k);
                hashMap.put(k, typeObserverOwner);
            }
            typeObserverOwner.observe(sVar, str, t);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public void observe(C0125s sVar, T t) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(t, "observer");
        observe(getAllKey(), sVar, t);
    }

    public void observe(C0125s sVar, String str, T t) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(str, "threadTag");
        C87412m.m108594g(t, "observer");
        observe(getAllKey(), sVar, str, t);
    }
}
