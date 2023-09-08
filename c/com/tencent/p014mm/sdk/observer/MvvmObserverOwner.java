package com.tencent.p014mm.sdk.observer;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C26236u;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000 %*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0002%&B\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J\u0016\u0010\u0014\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0016J;\u0010\u001c\u001a\u00120\u001bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u000bH&R0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020 \u0012\u0014\u0012\u00120\u001bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, mo182094d2 = {"Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "T", "E", "Lcom/tencent/mm/sdk/observer/IMvvmObserverOwner;", "Landroidx/lifecycle/s;", "lifecycleOwner", "observer", "Lrx3/b0;", "observe", "(Landroidx/lifecycle/s;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "", "threadTag", "(Landroidx/lifecycle/s;Ljava/lang/String;Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "uiObserve", "removeObserver", "(Lcom/tencent/mm/sdk/observer/IMvvmObserver;)V", "", "hasObserver", "event", "notify", "(Ljava/lang/Object;)V", "", "notifyAny", "", "eventList", "owner", "Lcom/tencent/mm/sdk/observer/MvvmObserverOwner$LifecycleBoundObserver;", "createLifecycleBoundObserver", "(Landroidx/lifecycle/s;Lcom/tencent/mm/sdk/observer/IMvvmObserver;Ljava/lang/String;)Lcom/tencent/mm/sdk/observer/MvvmObserverOwner$LifecycleBoundObserver;", "getLogTag", "Ljava/util/concurrent/ConcurrentHashMap;", "", "observerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "Companion", "LifecycleBoundObserver", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.observer.MvvmObserverOwner */
public abstract class MvvmObserverOwner<T extends IMvvmObserver<E>, E> implements IMvvmObserverOwner<T, E> {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String DefaultThread = "%DefaultThread%";
    public static final String MainThread = "%MainThread%";
    private final ConcurrentHashMap<Integer, MvvmObserverOwner<T, E>.LifecycleBoundObserver> observerMap = new ConcurrentHashMap<>(1);

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/observer/MvvmObserverOwner$Companion;", "", "()V", "DefaultThread", "", "MainThread", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.observer.MvvmObserverOwner$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007J\b\u0010\n\u001a\u00020\u0004H\u0017J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/sdk/observer/MvvmObserverOwner$LifecycleBoundObserver;", "Landroidx/lifecycle/r;", "", "shouldBeActive", "Lrx3/b0;", "attachObserver", "detachObserver", "", "eventList", "onChange", "onLifecycleDestroy", "", "hashCode", "Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/s;", "getOwner", "()Landroidx/lifecycle/s;", "observer", "Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "getObserver", "()Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "", "threadTag", "Ljava/lang/String;", "getThreadTag", "()Ljava/lang/String;", "<init>", "(Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;Landroidx/lifecycle/s;Lcom/tencent/mm/sdk/observer/IMvvmObserver;Ljava/lang/String;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver */
    public class LifecycleBoundObserver implements C0124r {
        private final T observer;
        private final C0125s owner;
        public final /* synthetic */ MvvmObserverOwner<T, E> this$0;
        private final String threadTag;

        public LifecycleBoundObserver(MvvmObserverOwner mvvmObserverOwner, C0125s sVar, T t, String str) {
            C87412m.m108594g(sVar, "owner");
            C87412m.m108594g(t, "observer");
            this.this$0 = mvvmObserverOwner;
            this.owner = sVar;
            this.observer = t;
            this.threadTag = str;
        }

        /* access modifiers changed from: private */
        public final boolean shouldBeActive() {
            return this.owner.getLifecycle().getCurrentState() != C39623j.C39626c.DESTROYED;
        }

        public final void attachObserver() {
            CommonKt.uiThread(new MvvmObserverOwner$LifecycleBoundObserver$attachObserver$1(this, this.this$0));
        }

        public final void detachObserver() {
            CommonKt.uiThread(new MvvmObserverOwner$LifecycleBoundObserver$detachObserver$1(this));
        }

        public final T getObserver() {
            return this.observer;
        }

        public final C0125s getOwner() {
            return this.owner;
        }

        public final String getThreadTag() {
            return this.threadTag;
        }

        public int hashCode() {
            return this.observer.hashCode();
        }

        public final void onChange(List<? extends E> list) {
            Object obj;
            C87412m.m108594g(list, "eventList");
            if (shouldBeActive()) {
                String str = this.threadTag;
                if (str != null) {
                    MvvmObserverOwner<T, E> mvvmObserverOwner = this.this$0;
                    if (C87412m.m108589b(str, MvvmObserverOwner.MainThread)) {
                        CommonKt.uiThread(new MvvmObserverOwner$LifecycleBoundObserver$onChange$1$1(this, list));
                        obj = C13598b0.f38549a;
                    } else {
                        C119179t tVar = C119157j.f356862d;
                        MvvmObserverOwner$LifecycleBoundObserver$onChange$1$2 mvvmObserverOwner$LifecycleBoundObserver$onChange$1$2 = new MvvmObserverOwner$LifecycleBoundObserver$onChange$1$2(this, list, mvvmObserverOwner);
                        C119157j jVar = (C119157j) tVar;
                        jVar.getClass();
                        obj = jVar.mo183879j(mvvmObserverOwner$LifecycleBoundObserver$onChange$1$2, 0, str);
                    }
                } else {
                    obj = null;
                }
                if (obj == null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        this.observer.onChanged(it.next());
                    }
                }
            }
        }

        @C112974b0(C39623j.C39625b.ON_DESTROY)
        public void onLifecycleDestroy() {
            String logTag = this.this$0.getLogTag();
            Log.m105918d(logTag, "onLifecycleDestroy owner:" + this.owner.hashCode() + " observer:" + this.observer.hashCode());
            this.this$0.removeObserver(this.observer);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LifecycleBoundObserver(MvvmObserverOwner mvvmObserverOwner, C0125s sVar, IMvvmObserver iMvvmObserver, String str, int i, C8480h hVar) {
            this(mvvmObserverOwner, sVar, iMvvmObserver, (i & 4) != 0 ? null : str);
        }
    }

    public static /* synthetic */ LifecycleBoundObserver createLifecycleBoundObserver$default(MvvmObserverOwner mvvmObserverOwner, C0125s sVar, IMvvmObserver iMvvmObserver, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                str = null;
            }
            return mvvmObserverOwner.createLifecycleBoundObserver(sVar, iMvvmObserver, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLifecycleBoundObserver");
    }

    public MvvmObserverOwner<T, E>.LifecycleBoundObserver createLifecycleBoundObserver(C0125s sVar, T t, String str) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(t, "observer");
        return new LifecycleBoundObserver(this, sVar, t, str);
    }

    public abstract String getLogTag();

    public boolean hasObserver() {
        boolean z;
        synchronized (this.observerMap) {
            z = !this.observerMap.isEmpty();
        }
        return z;
    }

    public void notify(E e) {
        notify(C26236u.m33719b(e));
    }

    public void notifyAny(Object obj) {
        C87412m.m108594g(obj, "event");
        notify(obj);
    }

    public void observe(C0125s sVar, T t) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(t, "observer");
        synchronized (this.observerMap) {
            LifecycleBoundObserver lifecycleBoundObserver = this.observerMap.get(Integer.valueOf(t.hashCode()));
            if (lifecycleBoundObserver != null) {
                C0125s owner = lifecycleBoundObserver.getOwner();
                if (!(!C87412m.m108589b(owner, sVar))) {
                    owner = null;
                }
                if (owner != null) {
                    Log.m105920e(getLogTag(), "Cannot add the same observer with different lifecycles");
                    return;
                }
                LifecycleBoundObserver remove = this.observerMap.remove(Integer.valueOf(t.hashCode()));
                if (remove != null) {
                    remove.detachObserver();
                }
            }
            LifecycleBoundObserver createLifecycleBoundObserver$default = createLifecycleBoundObserver$default(this, sVar, t, (String) null, 4, (Object) null);
            createLifecycleBoundObserver$default.attachObserver();
            this.observerMap.put(Integer.valueOf(t.hashCode()), createLifecycleBoundObserver$default);
            String logTag = getLogTag();
            Log.m105918d(logTag, "observe: " + t.hashCode());
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public void removeObserver(T t) {
        C87412m.m108594g(t, "observer");
        synchronized (this.observerMap) {
            LifecycleBoundObserver remove = this.observerMap.remove(Integer.valueOf(t.hashCode()));
            if (remove != null) {
                remove.detachObserver();
                String logTag = getLogTag();
                Log.m105918d(logTag, "removeObserver: " + t.hashCode());
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public void uiObserve(C0125s sVar, T t) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(t, "observer");
        observe(sVar, MainThread, t);
    }

    public void notify(List<? extends E> list) {
        C87412m.m108594g(list, "eventList");
        try {
            if ((!this.observerMap.isEmpty()) && (!list.isEmpty())) {
                ConcurrentHashMap<Integer, MvvmObserverOwner<T, E>.LifecycleBoundObserver> concurrentHashMap = this.observerMap;
                ArrayList<Map.Entry> arrayList = new ArrayList<>(concurrentHashMap.size());
                for (Map.Entry<Integer, MvvmObserverOwner<T, E>.LifecycleBoundObserver> add : concurrentHashMap.entrySet()) {
                    arrayList.add(add);
                }
                for (Map.Entry value : arrayList) {
                    ((LifecycleBoundObserver) value.getValue()).onChange(list);
                }
                String logTag = getLogTag();
                Log.m105918d(logTag, "doNotify notifyCount:" + arrayList.size());
            }
        } catch (Exception e) {
            Log.printErrStackTrace(getLogTag(), e, "doNotify", new Object[0]);
        }
    }

    public void observe(C0125s sVar, String str, T t) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(str, "threadTag");
        C87412m.m108594g(t, "observer");
        synchronized (this.observerMap) {
            LifecycleBoundObserver lifecycleBoundObserver = this.observerMap.get(Integer.valueOf(t.hashCode()));
            if (lifecycleBoundObserver != null) {
                C0125s owner = lifecycleBoundObserver.getOwner();
                if (!(!C87412m.m108589b(owner, sVar))) {
                    owner = null;
                }
                if (owner != null) {
                    Log.m105920e(getLogTag(), "Cannot add the same observer with different lifecycles");
                    return;
                }
                LifecycleBoundObserver remove = this.observerMap.remove(Integer.valueOf(t.hashCode()));
                if (remove != null) {
                    remove.detachObserver();
                }
            }
            MvvmObserverOwner<T, E>.LifecycleBoundObserver createLifecycleBoundObserver = createLifecycleBoundObserver(sVar, t, str);
            createLifecycleBoundObserver.attachObserver();
            this.observerMap.put(Integer.valueOf(t.hashCode()), createLifecycleBoundObserver);
            String logTag = getLogTag();
            Log.m105918d(logTag, "observe: " + t.hashCode());
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
