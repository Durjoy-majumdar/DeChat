package com.tencent.p014mm.app;

import androidx.lifecycle.C0124r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.plugin.PluginLifecycleRegistry;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.app.d */
public final class C40007d extends PluginLifecycleRegistry {
    public void addObserver(C0124r rVar) {
        C87412m.m108594g(rVar, "observer");
        super.addObserver(rVar);
        StringBuilder sb = new StringBuilder();
        sb.append("addObserver totalCount:");
        ConcurrentHashMap<Integer, C0124r> observerMap = getObserverMap();
        sb.append(observerMap != null ? Integer.valueOf(observerMap.size()) : null);
        sb.append(" observer:");
        sb.append(rVar);
        Log.m105924i("MicroMsg.Mvvm.ApplicationLifecycleRegistry", sb.toString());
    }

    public void removeObserver(C0124r rVar) {
        C87412m.m108594g(rVar, "observer");
        super.removeObserver(rVar);
        StringBuilder sb = new StringBuilder();
        sb.append("removeObserver totalCount:");
        ConcurrentHashMap<Integer, C0124r> observerMap = getObserverMap();
        sb.append(observerMap != null ? Integer.valueOf(observerMap.size()) : null);
        sb.append(" observer:");
        sb.append(rVar);
        Log.m105924i("MicroMsg.Mvvm.ApplicationLifecycleRegistry", sb.toString());
    }
}
