package qo0;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import ej0.C86524b;
import ej0.C86525c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p1042u.C90590d;
import sx3.C110818d0;
import sx3.C36907w;

/* renamed from: qo0.f0 */
public final class C63288f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f179620d;

    /* renamed from: e */
    public final /* synthetic */ C86525c f179621e;

    public C63288f0(MultiProcessMMKV multiProcessMMKV, C86525c cVar, int i) {
        this.f179620d = multiProcessMMKV;
        this.f179621e = cVar;
    }

    public final void run() {
        String str = null;
        Set<String> stringSet = this.f179620d.getStringSet("VideoCastDeviceManager.saveDevice", (Set<String>) null);
        List<T> B0 = stringSet != null ? C110818d0.m150900B0(stringSet) : null;
        C86524b bVar = this.f179621e.f251382a;
        String str2 = bVar != null ? bVar.f251380i : null;
        if (B0 == null) {
            C90590d dVar = new C90590d();
            dVar.add(str2);
            this.f179620d.putStringSet("VideoCastDeviceManager.saveDevice", dVar);
            this.f179620d.putLong(str2, System.currentTimeMillis());
        } else if (B0.contains(str2)) {
            this.f179620d.putLong(str2, System.currentTimeMillis());
        } else {
            if (B0.size() >= 2) {
                MultiProcessMMKV multiProcessMMKV = this.f179620d;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(B0, 10));
                for (T t : B0) {
                    arrayList.add(Long.valueOf(multiProcessMMKV.getLong(t, 0)));
                }
                C110818d0.m150942n0(arrayList);
                multiProcessMMKV.removeValueForKey((String) B0.get(0));
                B0.set(0, str2);
                multiProcessMMKV.putLong(str2, System.currentTimeMillis());
            }
            C86524b bVar2 = this.f179621e.f251382a;
            if (bVar2 != null) {
                str = bVar2.f251380i;
            }
            B0.add(str);
            this.f179620d.putStringSet("VideoCastDeviceManager.saveDevice", C110818d0.m150904D0(B0));
            this.f179620d.putLong(str2, System.currentTimeMillis());
        }
    }
}
