package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore;
import com.tencent.p014mm.plugin.appbrand.headless.C81909f;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.g */
public final class C81784g implements C81809z {

    /* renamed from: a */
    public static final C81784g f239984a = new C81784g();

    /* renamed from: b */
    public static final void m100353b(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo, boolean z, String str) {
        boolean z2;
        int i;
        C81801r.m100367a(monitoredBluetoothDeviceInfo, C81783f0.MONITORED_BLUETOOTH_DEVICE_FOUND, C81806w.f240032a);
        AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.getClass();
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeAppOnBluetoothDeviceFound, isConnected: " + z);
        String str2 = monitoredBluetoothDeviceInfo.field_appId;
        C87412m.m108593f(str2, "deviceInfo.field_appId");
        AppBrandMonitoredBluetoothDeviceServiceCore.C81764a aVar2 = new AppBrandMonitoredBluetoothDeviceServiceCore.C81764a(str2, monitoredBluetoothDeviceInfo.field_versionType);
        synchronized (AppBrandMonitoredBluetoothDeviceServiceCore.f239953h) {
            Set<AppBrandMonitoredBluetoothDeviceServiceCore.C81764a> set = AppBrandMonitoredBluetoothDeviceServiceCore.f239956k;
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = (HashSet) set;
            Iterator it = hashSet.iterator();
            while (true) {
                z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AppBrandMonitoredBluetoothDeviceServiceCore.C81764a aVar3 = (AppBrandMonitoredBluetoothDeviceServiceCore.C81764a) next;
                aVar3.getClass();
                if (AppBrandProcessesManager.f246131g.mo116962a().mo111387b(aVar3.f239957a, aVar3.f239958b) != null) {
                    z2 = true;
                }
                if (!z2) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
            Set<AppBrandMonitoredBluetoothDeviceServiceCore.C81764a> set2 = AppBrandMonitoredBluetoothDeviceServiceCore.f239956k;
            if (((HashSet) set2).contains(aVar2)) {
                C79708a.f233619a.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeAppOnBluetoothDeviceFound, toStartWeApp has started");
            } else if (((HashSet) AppBrandMonitoredBluetoothDeviceServiceCore.f239954i).contains(aVar2)) {
                C79708a.f233619a.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeAppOnBluetoothDeviceFound, toStartWeApp is starting");
                HashMap hashMap = (HashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239955j;
                Object obj = hashMap.get(aVar2);
                if (obj == null) {
                    obj = new HashSet();
                    hashMap.put(aVar2, obj);
                }
                ((Set) obj).add(monitoredBluetoothDeviceInfo);
            } else {
                int i2 = AppBrandGlobalSystemConfig.m100099b().f239297U;
                if (!(set2 instanceof Collection) || !((HashSet) set2).isEmpty()) {
                    Iterator it4 = ((HashSet) set2).iterator();
                    i = 0;
                    while (it4.hasNext()) {
                        if (((AppBrandMonitoredBluetoothDeviceServiceCore.C81764a) it4.next()).mo114147a()) {
                            i++;
                            if (i < 0) {
                                C64197v.m75541j();
                                throw null;
                            }
                        }
                    }
                } else {
                    i = 0;
                }
                int size = ((HashSet) AppBrandMonitoredBluetoothDeviceServiceCore.f239954i).size();
                Log.m105924i("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeAppOnBluetoothDeviceFound, maxStartWeAppCount: " + i2 + ", isInBackgroundTemporaryWeAppCount: " + i + ", startingWeAppCount: " + size);
                if (i2 <= i + size) {
                    C79708a.f233619a.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeAppOnBluetoothDeviceFound, reach max start count limit");
                }
            }
            ((HashSet) AppBrandMonitoredBluetoothDeviceServiceCore.f239954i).add(aVar2);
            C81787i iVar = new C81787i(monitoredBluetoothDeviceInfo);
            C81785g0 g0Var = C81785g0.NOT_ALIVE;
            AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
            C80264l b = a.mo111387b(aVar2.f239957a, aVar2.f239958b);
            if (b == null) {
                C79708a.f233619a.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, aliveAppRecord is null");
                iVar.invoke(g0Var);
            } else {
                String h = ((C84310k) a.mo111389d(b)).mo111363h();
                if (h == null) {
                    C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, processName is null");
                    iVar.invoke(g0Var);
                } else {
                    C28947a.m38500a(h, new IPCString(aVar2.f239957a), C81778d.f239971d, new C81780e(iVar));
                }
            }
            String str3 = monitoredBluetoothDeviceInfo.field_bluetoothDeviceId;
            C87412m.m108591d(str3);
            C81909f.f240255a.mo114315b(C81801r.m100368b(monitoredBluetoothDeviceInfo, z), new C81788j(str3, aVar2, monitoredBluetoothDeviceInfo), new C81805v());
            z2 = true;
        }
        if (z2 && !z) {
            AppBrandMonitoredBluetoothDeviceServiceCore appBrandMonitoredBluetoothDeviceServiceCore = AppBrandMonitoredBluetoothDeviceServiceCore.f239946a;
            String str4 = monitoredBluetoothDeviceInfo.field_appId;
            C87412m.m108593f(str4, "deviceInfo.field_appId");
            appBrandMonitoredBluetoothDeviceServiceCore.getClass();
            C81807x xVar = (C81807x) ((ConcurrentHashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239949d).get(str);
            if (xVar != null) {
                xVar.mo114173a();
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239951f;
            Object obj2 = concurrentHashMap.get(str4);
            if (obj2 == null) {
                obj2 = new ConcurrentHashMap();
                concurrentHashMap.put(str4, obj2);
            }
            Map map = (Map) obj2;
            if (map.get(str) == null) {
                map.put(str, Boolean.FALSE);
            }
        }
    }

    /* renamed from: a */
    public final void mo114171a(String str, boolean z) {
        C87412m.m108594g(str, "deviceId");
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onConnectStateChange, deviceId: " + str + ", isConnected: " + z);
        MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = (MonitoredBluetoothDeviceInfo) ((ConcurrentHashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239948c).get(str);
        if (monitoredBluetoothDeviceInfo == null) {
            aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onConnectStateChange, deviceInfo is null");
        } else if (z) {
            AppBrandMonitoredBluetoothDeviceServiceCore.f239950e.add(str);
            m100353b(monitoredBluetoothDeviceInfo, z, str);
        } else if (!AppBrandMonitoredBluetoothDeviceServiceCore.f239950e.remove(str)) {
            m100353b(monitoredBluetoothDeviceInfo, z, str);
        } else {
            aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onConnectStateChange, maybe device away");
        }
    }
}
