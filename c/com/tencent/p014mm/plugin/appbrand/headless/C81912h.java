package com.tencent.p014mm.plugin.appbrand.headless;

import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81801r;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo;
import di0.C86299o;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: com.tencent.mm.plugin.appbrand.headless.h */
public final class C81912h {

    /* renamed from: a */
    public static final C13601g f240262a = C36568h.m40985a(C81913a.f240263d);

    /* renamed from: com.tencent.mm.plugin.appbrand.headless.h$a */
    public static final class C81913a extends C87413o implements C32224a<C86299o> {

        /* renamed from: d */
        public static final C81913a f240263d = new C81913a();

        public C81913a() {
            super(0);
        }

        public Object invoke() {
            MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new MonitoredBluetoothDeviceInfo();
            monitoredBluetoothDeviceInfo.field_appId = "wxf7b95b7c62ccbe6e";
            monitoredBluetoothDeviceInfo.field_versionType = 0;
            monitoredBluetoothDeviceInfo.field_entryPackage = "";
            monitoredBluetoothDeviceInfo.field_bluetoothDeviceId = "F8:8A:5E:53:8F:11";
            monitoredBluetoothDeviceInfo.field_wechatToken = "F8:8A:5E:53:8F:11";
            return C81801r.m100368b(monitoredBluetoothDeviceInfo, false);
        }
    }
}
