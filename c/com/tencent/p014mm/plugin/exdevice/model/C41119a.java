package com.tencent.p014mm.plugin.exdevice.model;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.ExDeviceOnBluetoothStateChangeEvent;
import com.tencent.p014mm.plugin.exdevice.service.C41197h;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.exdevice.model.a */
public class C41119a extends C41197h.C41198a {

    /* renamed from: e */
    public static final C41119a f110781e = new C41119a();

    /* renamed from: Wv */
    public Bundle mo64192Wv(int i, Bundle bundle) {
        Log.m105925i("MicroMsg.exdevice.ExDeviceInvokerHandler", "onExdeviceInvoke, action code = %d", Integer.valueOf(i));
        if (bundle == null) {
            Log.m105920e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
            return null;
        } else if (i != 0) {
            return null;
        } else {
            if (bundle == null) {
                Log.m105920e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
            } else {
                int i2 = bundle.getInt("key_state");
                Log.m105925i("MicroMsg.exdevice.ExDeviceInvokerHandler", "handleOnBluetoothStateChange, state = %d", Integer.valueOf(i2));
                if (-1 == i2) {
                    Log.m105920e("MicroMsg.exdevice.ExDeviceInvokerHandler", "invalid state, just leave!!!");
                } else {
                    ExDeviceOnBluetoothStateChangeEvent exDeviceOnBluetoothStateChangeEvent = new ExDeviceOnBluetoothStateChangeEvent();
                    exDeviceOnBluetoothStateChangeEvent.f107462d.f107463a = i2;
                    if (!exDeviceOnBluetoothStateChangeEvent.publish()) {
                        Log.m105920e("MicroMsg.exdevice.ExDeviceInvokerHandler", "EventCenter.instance.publish failed!!!");
                    }
                }
            }
            return null;
        }
    }
}
