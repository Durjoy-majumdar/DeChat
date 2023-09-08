package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.bluetooth.BluetoothGatt;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o */
public final class C81796o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BluetoothGatt f240014d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81796o(BluetoothGatt bluetoothGatt) {
        super(0);
        this.f240014d = bluetoothGatt;
    }

    public Object invoke() {
        this.f240014d.disconnect();
        this.f240014d.close();
        return C13598b0.f38549a;
    }
}
