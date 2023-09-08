package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.e */
public final class C81780e extends C87413o implements C32226l<IPCInteger, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C81785g0, C13598b0> f239973d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81780e(C32226l<? super C81785g0, C13598b0> lVar) {
        super(1);
        this.f239973d = lVar;
    }

    public Object invoke(Object obj) {
        C81785g0 g0Var;
        IPCInteger iPCInteger = (IPCInteger) obj;
        C87412m.m108594g(iPCInteger, "flattenValHolder");
        int i = iPCInteger.f10313d;
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, flattenVal: " + i);
        C32226l<C81785g0, C13598b0> lVar = this.f239973d;
        C81785g0[] values = C81785g0.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                g0Var = null;
                break;
            }
            g0Var = values[i2];
            if (i == g0Var.f239990d) {
                break;
            }
            i2++;
        }
        if (g0Var == null) {
            g0Var = C81785g0.NOT_ALIVE;
        }
        lVar.invoke(g0Var);
        return C13598b0.f38549a;
    }
}
