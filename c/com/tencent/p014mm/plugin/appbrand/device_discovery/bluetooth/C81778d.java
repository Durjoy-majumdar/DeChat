package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import kotlin.Metadata;
import li0.C88509c;
import rx3.C13603j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "appIdHolder", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d */
final class C81778d<InputType, ResultType> implements C80883e {

    /* renamed from: d */
    public static final C81778d<InputType, ResultType> f239971d = new C81778d<>();

    public void invoke(Object obj, C1256g gVar) {
        C81785g0 g0Var;
        IPCString iPCString = (IPCString) obj;
        C88509c cVar = null;
        String str = iPCString != null ? iPCString.f10315d : null;
        if (str == null) {
            C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, passedAppId is null");
            gVar.mo894a(new IPCInteger(3));
            return;
        }
        AppBrandRuntimeWC b = C81682d.m100222b(str);
        if (b != null) {
            cVar = b.f238113K;
        }
        if (cVar == null) {
            C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, runningStateController is null");
            gVar.mo894a(new IPCInteger(3));
            return;
        }
        int ordinal = cVar.mo122980c().ordinal();
        if (ordinal == 0) {
            g0Var = C81785g0.FOREGROUND;
        } else if (ordinal == 1) {
            g0Var = C81785g0.BACKGROUND;
        } else if (ordinal == 2) {
            g0Var = C81785g0.SUSPEND;
        } else if (ordinal == 3) {
            g0Var = C81785g0.NOT_ALIVE;
        } else {
            throw new C13603j();
        }
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, runningState: " + g0Var);
        gVar.mo894a(new IPCInteger(g0Var.f239990d));
    }
}
