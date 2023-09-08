package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82262v;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/MonitoredBluetoothDeviceInfo;", "kotlin.jvm.PlatformType", "passedInfo", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/MonitoredBluetoothDeviceInfo;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.f */
final class C81782f<InputType, ResultType> implements C80883e {

    /* renamed from: d */
    public static final C81782f<InputType, ResultType> f239974d = new C81782f<>();

    public void invoke(Object obj, C1256g gVar) {
        MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = (MonitoredBluetoothDeviceInfo) obj;
        boolean z = true;
        if (monitoredBluetoothDeviceInfo == null || true != monitoredBluetoothDeviceInfo.isValid()) {
            z = false;
        }
        if (!z) {
            C79708a aVar = C79708a.f233619a;
            aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onBluetoothDeviceFound, passedInfo: " + monitoredBluetoothDeviceInfo + " is invalid");
            return;
        }
        C87412m.m108593f(monitoredBluetoothDeviceInfo, "passedInfo");
        new C82262v(monitoredBluetoothDeviceInfo).mo114660p((C32226l<? super C81925i2, C13598b0>) null);
    }
}
