package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import di0.C86297n;
import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.j */
public final class C81788j implements C86297n {

    /* renamed from: a */
    public final /* synthetic */ String f239993a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandMonitoredBluetoothDeviceServiceCore.C81764a f239994b;

    /* renamed from: c */
    public final /* synthetic */ MonitoredBluetoothDeviceInfo f239995c;

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.j$a */
    public static final class C81789a extends C81781e0 {

        /* renamed from: a */
        public final int f239996a;

        public C81789a(int i) {
            this.f239996a = i;
        }

        /* renamed from: b */
        public Integer mo114163b() {
            return Integer.valueOf(this.f239996a);
        }
    }

    public C81788j(String str, AppBrandMonitoredBluetoothDeviceServiceCore.C81764a aVar, MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        this.f239993a = str;
        this.f239994b = aVar;
        this.f239995c = monitoredBluetoothDeviceInfo;
    }

    /* renamed from: a */
    public void mo1541a(int i, String str) {
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeApp fail, deviceId: " + this.f239993a + ", errCode: " + i + ", errMsg: " + str);
        C81801r.m100367a(this.f239995c, C81783f0.START_WE_APP_FAILURE, new C81789a(i));
        Object obj = AppBrandMonitoredBluetoothDeviceServiceCore.f239953h;
        AppBrandMonitoredBluetoothDeviceServiceCore.C81764a aVar2 = this.f239994b;
        synchronized (obj) {
            ((HashSet) AppBrandMonitoredBluetoothDeviceServiceCore.f239954i).remove(aVar2);
            Set set = (Set) ((HashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239955j).remove(aVar2);
        }
        AppBrandMonitoredBluetoothDeviceServiceCore.m100329a(AppBrandMonitoredBluetoothDeviceServiceCore.f239946a, this.f239994b.f239957a);
    }

    public void onSuccess() {
        Set<MonitoredBluetoothDeviceInfo> set;
        String h;
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeApp success, deviceId: " + this.f239993a);
        Object obj = AppBrandMonitoredBluetoothDeviceServiceCore.f239953h;
        AppBrandMonitoredBluetoothDeviceServiceCore.C81764a aVar2 = this.f239994b;
        synchronized (obj) {
            ((HashSet) AppBrandMonitoredBluetoothDeviceServiceCore.f239956k).add(aVar2);
            ((HashSet) AppBrandMonitoredBluetoothDeviceServiceCore.f239954i).remove(aVar2);
            set = (Set) ((HashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239955j).remove(aVar2);
        }
        if (set != null) {
            AppBrandMonitoredBluetoothDeviceServiceCore.C81764a aVar3 = this.f239994b;
            for (MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo : set) {
                aVar3.getClass();
                C87412m.m108594g(monitoredBluetoothDeviceInfo, "deviceInfo");
                AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
                C80264l b = a.mo111387b(aVar3.f239957a, aVar3.f239958b);
                if (!(b == null || (h = ((C84310k) a.mo111389d(b)).mo111363h()) == null)) {
                    C28947a.m38500a(h, monitoredBluetoothDeviceInfo, C81782f.f239974d, (C32226l) null);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
        }
    }
}
