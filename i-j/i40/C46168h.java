package i40;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.plugin.PluginLifecycleRegistry;
import gy3.C87412m;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sx3.C64186f0;

/* renamed from: i40.h */
public class C46168h extends C39623j {

    /* renamed from: a */
    public C39623j.C39626c f124455a = C39623j.C39626c.INITIALIZED;

    /* renamed from: b */
    public ConcurrentHashMap<Integer, C0124r> f124456b = new ConcurrentHashMap<>();

    public void addObserver(C0124r rVar) {
        C87412m.m108594g(rVar, "observer");
        ConcurrentHashMap<Integer, C0124r> concurrentHashMap = this.f124456b;
        if (concurrentHashMap != null) {
            C0124r put = concurrentHashMap.put(Integer.valueOf(rVar.hashCode()), rVar);
        }
    }

    public C39623j.C39626c getCurrentState() {
        return this.f124455a;
    }

    public final void moveToCreateState() {
        List<C0124r> list;
        Log.m105924i(PluginLifecycleRegistry.TAG, "moveToCreateState start");
        ConcurrentHashMap<Integer, C0124r> concurrentHashMap = this.f124456b;
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
        this.f124455a = C39623j.C39626c.CREATED;
        Log.m105924i(PluginLifecycleRegistry.TAG, "moveToCreateState end");
    }

    public final void moveToDestroyState() {
        List<C0124r> list;
        Log.m105924i(PluginLifecycleRegistry.TAG, "moveToDestroyState start");
        ConcurrentHashMap<Integer, C0124r> concurrentHashMap = this.f124456b;
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
        this.f124456b = null;
        this.f124455a = C39623j.C39626c.DESTROYED;
        Log.m105924i(PluginLifecycleRegistry.TAG, "moveToDestroyState end");
    }

    public void removeObserver(C0124r rVar) {
        C87412m.m108594g(rVar, "observer");
        ConcurrentHashMap<Integer, C0124r> concurrentHashMap = this.f124456b;
        if (concurrentHashMap != null) {
            C0124r remove = concurrentHashMap.remove(Integer.valueOf(rVar.hashCode()));
        }
    }
}
