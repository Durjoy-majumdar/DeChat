package lk0;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82247k;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;

/* renamed from: lk0.s */
public final class C88567s {

    /* renamed from: a */
    public static final C88567s f255793a = new C88567s();

    /* renamed from: b */
    public static final Map<Integer, C88564p> f255794b = new ConcurrentHashMap();

    /* renamed from: c */
    public static C83231l.C83234d f255795c;

    /* renamed from: d */
    public static C82247k f255796d;

    /* renamed from: e */
    public static volatile boolean f255797e;

    /* renamed from: a */
    public final void mo123029a() {
        synchronized (this) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f255794b;
            ArrayList<C88564p> arrayList = new ArrayList<>(concurrentHashMap.size());
            for (Map.Entry value : concurrentHashMap.entrySet()) {
                arrayList.add((C88564p) value.getValue());
            }
            for (C88564p pVar : arrayList) {
                Log.m105924i("MicroMsg.BLE.PeripheralBleServerManager", "destroy server #" + pVar.f255788d);
                pVar.mo123027c();
            }
            ((ConcurrentHashMap) f255794b).clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public final C88564p mo123030b(int i) {
        if (f255797e) {
            return null;
        }
        return (C88564p) ((ConcurrentHashMap) f255794b).get(Integer.valueOf(i));
    }
}
