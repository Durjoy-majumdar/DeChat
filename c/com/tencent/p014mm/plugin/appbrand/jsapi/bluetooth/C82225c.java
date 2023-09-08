package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import mk0.C88738b;
import nk0.C88999b;
import nk0.C89000c;
import nk0.C89002d;
import nk0.C89003e;
import nk0.C89004f;
import nk0.C89007g;
import qk0.C89684a;
import qk0.C89687b;
import qk0.C89690e;
import qk0.C89694i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c */
public class C82225c extends C83231l.C83234d implements C82247k {

    /* renamed from: d */
    public final String f241100d;

    /* renamed from: e */
    public volatile boolean f241101e = false;

    /* renamed from: f */
    public C88738b f241102f;

    /* renamed from: g */
    public final List<C82226a> f241103g = new CopyOnWriteArrayList();

    /* renamed from: h */
    public final List<C89694i> f241104h = new CopyOnWriteArrayList();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c$a */
    public interface C82226a {
        void onBluetoothStateChange(boolean z);
    }

    public C82225c(String str) {
        this.f241100d = str;
    }

    /* renamed from: a */
    public void mo114613a(C82228d dVar) {
        Log.m105925i("MicroMsg.ble.BleWorker", "onAuthorizeStateChange, newState: " + dVar, new Object[0]);
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            C82220a.m100946a(this.f241100d);
        } else if (ordinal == 1) {
            this.f241101e = false;
        } else if (ordinal == 2) {
            this.f241101e = true;
        }
    }

    /* renamed from: c */
    public void mo109497c() {
        C82220a.m100946a(this.f241100d);
    }

    /* renamed from: g */
    public void mo114614g(String str, C89684a aVar, C89687b bVar) {
        C89007g gVar;
        C88738b h = mo114615h();
        if (h != null) {
            C89004f fVar = h.f256136a;
            synchronized (fVar) {
                Map<String, C89007g> map = fVar.f256596b;
                if (map == null) {
                    Log.m105929w("MicroMsg.Ble.BleConnectMgr", "getWorker, connectWorkers is null", new Object[0]);
                    gVar = null;
                } else {
                    C89007g gVar2 = (C89007g) ((ConcurrentHashMap) map).get(str);
                    if (gVar2 == null) {
                        gVar2 = new C89007g(fVar.f256595a, str, fVar);
                        gVar2.mo123379n();
                        gVar2.f256609i = new C89002d(fVar);
                        gVar2.f256608h = new C89003e(fVar);
                        gVar2.f256610j = fVar.f256599e;
                        ((ConcurrentHashMap) fVar.f256596b).put(str, gVar2);
                    }
                    gVar = gVar2;
                }
            }
            if (gVar != null) {
                Log.m105925i(gVar.f256601a, "deviceId:%s aciton:%s", gVar.f256603c, aVar);
                C89000c cVar = gVar.f256604d;
                if (cVar != null) {
                    aVar.f257933a = gVar;
                    aVar.f257934b = cVar;
                    aVar.f257935c = bVar;
                    Log.m105925i("MicroMsg.Ble.BleConnectDispatcher", "doAction %s", aVar);
                    if (aVar.f257940h) {
                        Queue<C89684a> queue = cVar.f256588a;
                        if (queue != null) {
                            ((ConcurrentLinkedQueue) queue).add(aVar);
                            cVar.mo123371k();
                        }
                    } else if (aVar.f257939g) {
                        cVar.f256591d.postDelayed(new C88999b(cVar, aVar), aVar.f257942j);
                    } else {
                        aVar.mo124009k();
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final synchronized C88738b mo114615h() {
        C88738b bVar;
        bVar = this.f241102f;
        if (bVar == null) {
            Log.m105929w("MicroMsg.ble.BleWorker", "getBleManager, bleManager is null", new Object[0]);
        }
        return bVar;
    }

    /* renamed from: i */
    public List<C89690e> mo114616i(String str, boolean z) {
        C88738b h = mo114615h();
        if (h == null) {
            return null;
        }
        Map<String, C89007g> map = h.f256136a.f256596b;
        if (map == null) {
            Log.m105929w("MicroMsg.Ble.BleConnectMgr", "getServices, connectWorkers is null", new Object[0]);
            return null;
        }
        C89007g gVar = map.get(str);
        if (gVar == null) {
            Log.m105929w("MicroMsg.Ble.BleConnectMgr", "getServices, connectWorker is null", new Object[0]);
            return null;
        } else if (z) {
            return gVar.mo123378m();
        } else {
            synchronized (gVar) {
                BluetoothGatt bluetoothGatt = gVar.f256605e;
                if (bluetoothGatt == null) {
                    Log.m105921e(gVar.f256601a, "[getServicesNoCache] bluetoothGatt is null, err", new Object[0]);
                    return null;
                } else if (Util.isNullOrNil(gVar.f256603c)) {
                    Log.m105921e(gVar.f256601a, "[getServicesNoCache] deviceId is null, err", new Object[0]);
                    return null;
                } else {
                    List<BluetoothGattService> services = bluetoothGatt.getServices();
                    if (services == null) {
                        Log.m105929w(gVar.f256601a, "[getServicesNoCache] bluetoothGattServices is null, err", new Object[0]);
                        return null;
                    }
                    gVar.f256606f = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    for (BluetoothGattService next : services) {
                        C89690e eVar = new C89690e();
                        eVar.f257965a = next.getUuid().toString().toUpperCase();
                        eVar.f257966b = next.getType() == 0;
                        if (!eVar.f257965a.equals("00001800-0000-1000-8000-00805F9B34FB")) {
                            if (!eVar.f257965a.equals("00001801-0000-1000-8000-00805F9B34FB")) {
                                gVar.f256606f.add(eVar);
                            }
                        }
                        arrayList.add(eVar);
                    }
                    if (arrayList.size() > 0) {
                        gVar.f256606f.addAll(arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList(gVar.f256606f);
                    return arrayList2;
                }
            }
        }
    }
}
