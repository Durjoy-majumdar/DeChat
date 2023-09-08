package com.tencent.p014mm.sdk.plugin;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import sx3.C64186f0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/sdk/plugin/PluginLifecycleRegistry;", "Landroidx/lifecycle/j;", "Landroidx/lifecycle/r;", "observer", "Lrx3/b0;", "addObserver", "removeObserver", "Landroidx/lifecycle/j$c;", "getCurrentState", "moveToCreateState", "moveToDestroyState", "state", "Landroidx/lifecycle/j$c;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "observerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "getObserverMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "setObserverMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "<init>", "()V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.plugin.PluginLifecycleRegistry */
public class PluginLifecycleRegistry extends C39623j {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Mvvm.PluginLifecycleRegistry";
    private ConcurrentHashMap<Integer, C0124r> observerMap = new ConcurrentHashMap<>();
    private C39623j.C39626c state = C39623j.C39626c.INITIALIZED;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/plugin/PluginLifecycleRegistry$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.plugin.PluginLifecycleRegistry$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public void addObserver(C0124r rVar) {
        C87412m.m108594g(rVar, "observer");
        ConcurrentHashMap<Integer, C0124r> concurrentHashMap = this.observerMap;
        if (concurrentHashMap != null) {
            C0124r put = concurrentHashMap.put(Integer.valueOf(rVar.hashCode()), rVar);
        }
    }

    public C39623j.C39626c getCurrentState() {
        return this.state;
    }

    public final ConcurrentHashMap<Integer, C0124r> getObserverMap() {
        return this.observerMap;
    }

    public final void moveToCreateState() {
        List<C0124r> list;
        Log.m105924i(TAG, "moveToCreateState start");
        ConcurrentHashMap<Integer, C0124r> concurrentHashMap = this.observerMap;
        if (concurrentHashMap != null) {
            list = new ArrayList<>(concurrentHashMap.size());
            for (Map.Entry value : concurrentHashMap.entrySet()) {
                list.add((C0124r) value.getValue());
            }
        } else {
            list = C64186f0.f181907d;
        }
        for (C0124r rVar : list) {
            Method[] methods = rVar.getClass().getMethods();
            C87412m.m108593f(methods, "observer::class.java.methods");
            for (Method method : methods) {
                C112974b0 b0Var = (C112974b0) method.getAnnotation(C112974b0.class);
                if (b0Var != null && b0Var.value() == C39623j.C39625b.ON_CREATE) {
                    method.invoke(rVar, new Object[0]);
                }
            }
        }
        this.state = C39623j.C39626c.CREATED;
        Log.m105924i(TAG, "moveToCreateState end");
    }

    public final void moveToDestroyState() {
        List<C0124r> list;
        Log.m105924i(TAG, "moveToDestroyState start");
        ConcurrentHashMap<Integer, C0124r> concurrentHashMap = this.observerMap;
        if (concurrentHashMap != null) {
            list = new ArrayList<>(concurrentHashMap.size());
            for (Map.Entry value : concurrentHashMap.entrySet()) {
                list.add((C0124r) value.getValue());
            }
        } else {
            list = C64186f0.f181907d;
        }
        for (C0124r rVar : list) {
            Method[] methods = rVar.getClass().getMethods();
            C87412m.m108593f(methods, "observer::class.java.methods");
            for (Method method : methods) {
                C112974b0 b0Var = (C112974b0) method.getAnnotation(C112974b0.class);
                if (b0Var != null && b0Var.value() == C39623j.C39625b.ON_DESTROY) {
                    method.invoke(rVar, new Object[0]);
                }
            }
        }
        this.observerMap = null;
        this.state = C39623j.C39626c.DESTROYED;
        Log.m105924i(TAG, "moveToDestroyState end");
    }

    public void removeObserver(C0124r rVar) {
        C87412m.m108594g(rVar, "observer");
        ConcurrentHashMap<Integer, C0124r> concurrentHashMap = this.observerMap;
        if (concurrentHashMap != null) {
            C0124r remove = concurrentHashMap.remove(Integer.valueOf(rVar.hashCode()));
        }
    }

    public final void setObserverMap(ConcurrentHashMap<Integer, C0124r> concurrentHashMap) {
        this.observerMap = concurrentHashMap;
    }
}
