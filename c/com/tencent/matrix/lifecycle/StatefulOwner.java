package com.tencent.matrix.lifecycle;

import androidx.lifecycle.C0125s;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0006\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0004R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "Lkotlin/Function1;", "Lcom/tencent/matrix/lifecycle/h;", "Lrx3/b0;", "observer", "invokeAsync", "dispatchStateChanged", "", "active", "observeForever", "Landroidx/lifecycle/s;", "lifecycleOwner", "observeWithLifecycle", "removeObserver", "turnOn", "turnOff", "Lcom/tencent/matrix/lifecycle/h0;", "state", "Lcom/tencent/matrix/lifecycle/h0;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/tencent/matrix/lifecycle/f0;", "observerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "async", "Z", "getAsync", "()Z", "<init>", "(Z)V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public class StatefulOwner implements IStatefulOwner {
    private final boolean async;
    private final ConcurrentHashMap<C80407h, C80405f0> observerMap;
    private volatile C80408h0 state;

    /* renamed from: com.tencent.matrix.lifecycle.StatefulOwner$a */
    public static final class C80388a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l f235315d;

        /* renamed from: e */
        public final /* synthetic */ C80407h f235316e;

        public C80388a(C32226l lVar, C80407h hVar) {
            this.f235315d = lVar;
            this.f235316e = hVar;
        }

        public final void run() {
            this.f235315d.invoke(this.f235316e);
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.StatefulOwner$b */
    public static final class C80389b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l f235317d;

        /* renamed from: e */
        public final /* synthetic */ C80407h f235318e;

        public C80389b(C32226l<? super C80407h, C13598b0> lVar, C80407h hVar) {
            this.f235317d = lVar;
            this.f235318e = hVar;
        }

        public void run() {
            this.f235317d.invoke(this.f235318e);
        }

        public String toString() {
            return String.valueOf(this.f235318e);
        }
    }

    public StatefulOwner() {
        this(false, 1, (C8480h) null);
    }

    public StatefulOwner(boolean z) {
        this.async = z;
        this.state = C80408h0.INIT;
        this.observerMap = new ConcurrentHashMap<>();
    }

    private final void dispatchStateChanged() {
        if (this.async) {
            C80408h0 h0Var = this.state;
            for (Map.Entry next : this.observerMap.entrySet()) {
                C32226l<C80407h, C13598b0> lVar = h0Var.f235342d;
                if (lVar != null) {
                    invokeAsync(lVar, (C80407h) next.getKey());
                }
            }
            return;
        }
        for (Map.Entry next2 : this.observerMap.entrySet()) {
            C32226l<C80407h, C13598b0> lVar2 = this.state.f235342d;
            if (lVar2 != null) {
                C13598b0 invoke = lVar2.invoke(next2.getKey());
            }
        }
    }

    private final void invokeAsync(C32226l<? super C80407h, C13598b0> lVar, C80407h hVar) {
        if (!(hVar instanceof C80406g) || !((C80406g) hVar).serial()) {
            C80411j jVar = C80392a0.f235321a;
            ((Executor) C80392a0.f235324d.getValue()).execute(new C80389b(lVar, hVar));
            return;
        }
        C80392a0.f235326f.mo111887a().post(new C80388a(lVar, hVar));
    }

    public boolean active() {
        return this.state == C80408h0.ON;
    }

    public final boolean getAsync() {
        return this.async;
    }

    public synchronized void observeForever(C80407h hVar) {
        C87412m.m108594g(hVar, "observer");
        C80405f0 f0Var = this.observerMap.get(hVar);
        if (f0Var == null) {
            this.observerMap.put(hVar, new C80405f0(hVar, this));
            if (this.async) {
                C32226l<C80407h, C13598b0> lVar = this.state.f235342d;
                if (lVar != null) {
                    invokeAsync(lVar, hVar);
                }
            } else {
                C32226l<C80407h, C13598b0> lVar2 = this.state.f235342d;
                if (lVar2 != null) {
                    C13598b0 invoke = lVar2.invoke(hVar);
                }
            }
        } else if (f0Var instanceof AutoReleaseObserverWrapper) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
    }

    public synchronized void observeWithLifecycle(C0125s sVar, C80407h hVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(hVar, "observer");
        C80405f0 f0Var = this.observerMap.get(hVar);
        if (f0Var == null) {
            this.observerMap.put(hVar, new AutoReleaseObserverWrapper(sVar, this, hVar));
            if (this.async) {
                C32226l<C80407h, C13598b0> lVar = this.state.f235342d;
                if (lVar != null) {
                    invokeAsync(lVar, hVar);
                }
            } else {
                C32226l<C80407h, C13598b0> lVar2 = this.state.f235342d;
                if (lVar2 != null) {
                    C13598b0 invoke = lVar2.invoke(hVar);
                }
            }
        } else if (f0Var.mo111851a(sVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
    }

    public synchronized void removeObserver(C80407h hVar) {
        C87412m.m108594g(hVar, "observer");
        this.observerMap.remove(hVar);
    }

    public final synchronized void turnOff() {
        C80408h0 h0Var = this.state;
        C80408h0 h0Var2 = C80408h0.OFF;
        if (h0Var != h0Var2) {
            this.state = h0Var2;
            dispatchStateChanged();
        }
    }

    public final synchronized void turnOn() {
        C80408h0 h0Var = this.state;
        C80408h0 h0Var2 = C80408h0.ON;
        if (h0Var != h0Var2) {
            this.state = h0Var2;
            dispatchStateChanged();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatefulOwner(boolean z, int i, C8480h hVar) {
        this((i & 1) != 0 ? true : z);
    }
}
