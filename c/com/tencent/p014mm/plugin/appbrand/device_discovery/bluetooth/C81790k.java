package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "appIdHolder", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k */
final class C81790k<InputType, ResultType> implements C80883e {

    /* renamed from: d */
    public static final C81790k<InputType, ResultType> f239997d = new C81790k<>();

    public void invoke(Object obj, C1256g gVar) {
        IPCString iPCString = (IPCString) obj;
        String str = iPCString != null ? iPCString.f10315d : null;
        if (str == null) {
            AppBrandMonitoredBluetoothDeviceServiceCore appBrandMonitoredBluetoothDeviceServiceCore = AppBrandMonitoredBluetoothDeviceServiceCore.f239946a;
            C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "statWeAppSuspend, passedAppId is null");
            return;
        }
        AppBrandMonitoredBluetoothDeviceServiceCore.m100329a(AppBrandMonitoredBluetoothDeviceServiceCore.f239946a, str);
    }
}
