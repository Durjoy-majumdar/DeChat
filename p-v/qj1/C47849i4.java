package qj1;

import android.os.Bundle;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: qj1.i4 */
public final class C47849i4<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C47851k4 f128436d;

    public C47849i4(C47851k4 k4Var) {
        this.f128436d = k4Var;
    }

    public void onChanged(Object obj) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("boxChangedObserver, ");
        sb.append(concurrentHashMap != null ? Integer.valueOf(concurrentHashMap.size()) : null);
        String sb4 = sb.toString();
        C87412m.m108594g(sb4, "str");
        Log.m105924i("Finder.FinderLiveBoxPlugin", "liveDataLog " + sb4);
        if (concurrentHashMap == null) {
            Log.m105928w("Finder.FinderLiveBoxPlugin", "getAllBoxInfo is null");
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (this.f128436d.f128446v.size() == concurrentHashMap.size()) {
            C47851k4 k4Var = this.f128436d;
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (!k4Var.f128446v.containsKey(entry.getKey()) || !C87412m.m108589b(k4Var.f128446v.get(entry.getKey()), entry.getValue())) {
                    z = true;
                }
            }
            z2 = z;
        }
        this.f128436d.f128446v.clear();
        this.f128436d.f128446v.putAll(concurrentHashMap);
        if (z2) {
            Log.m105924i("Finder.FinderLiveBoxPlugin", "mainFlowLog status FINDER_LIVE_UPDATE_BOX_INFO");
            this.f128436d.f128440p.statusChange(C58124b.C58125b.FINDER_LIVE_UPDATE_BOX_INFO, new Bundle());
        }
    }
}
