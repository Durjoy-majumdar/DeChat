package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.autogen.events.ExDeviceLanDeviceRecvDataEvent;
import com.tencent.p014mm.plugin.exdevice.model.C2242s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.exdevice.model.k0 */
public class C115395k0 implements C2242s0.C2243a {
    public C115395k0(ExdeviceWCLanSDKUtil exdeviceWCLanSDKUtil) {
    }

    /* renamed from: a */
    public void mo2128a(int i, Object... objArr) {
        String str;
        if (i == 16 && objArr != null && objArr.length >= 2) {
            String str2 = objArr[0];
            if (str2 instanceof String) {
                byte[] bArr = objArr[1];
                if (bArr instanceof byte[]) {
                    byte[] bArr2 = bArr;
                    String str3 = null;
                    try {
                        JSONObject jSONObject = new JSONObject(new String(str2));
                        str = jSONObject.getString("deviceType");
                        try {
                            str3 = jSONObject.getString("deviceId");
                        } catch (Exception e) {
                            e = e;
                            Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", e, "", new Object[0]);
                            Log.m105920e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in receive notify callback");
                            Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "receive data = " + new String(bArr2));
                            ExDeviceLanDeviceRecvDataEvent exDeviceLanDeviceRecvDataEvent = new ExDeviceLanDeviceRecvDataEvent();
                            ExDeviceLanDeviceRecvDataEvent.C114673a aVar = exDeviceLanDeviceRecvDataEvent.f343551d;
                            aVar.f343553b = str3;
                            aVar.f343554c = bArr2;
                            aVar.f343552a = str;
                            exDeviceLanDeviceRecvDataEvent.publish();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str = null;
                        Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", e, "", new Object[0]);
                        Log.m105920e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in receive notify callback");
                        Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "receive data = " + new String(bArr2));
                        ExDeviceLanDeviceRecvDataEvent exDeviceLanDeviceRecvDataEvent2 = new ExDeviceLanDeviceRecvDataEvent();
                        ExDeviceLanDeviceRecvDataEvent.C114673a aVar2 = exDeviceLanDeviceRecvDataEvent2.f343551d;
                        aVar2.f343553b = str3;
                        aVar2.f343554c = bArr2;
                        aVar2.f343552a = str;
                        exDeviceLanDeviceRecvDataEvent2.publish();
                    }
                    Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "receive data = " + new String(bArr2));
                    ExDeviceLanDeviceRecvDataEvent exDeviceLanDeviceRecvDataEvent22 = new ExDeviceLanDeviceRecvDataEvent();
                    ExDeviceLanDeviceRecvDataEvent.C114673a aVar22 = exDeviceLanDeviceRecvDataEvent22.f343551d;
                    aVar22.f343553b = str3;
                    aVar22.f343554c = bArr2;
                    aVar22.f343552a = str;
                    exDeviceLanDeviceRecvDataEvent22.publish();
                }
            }
        }
    }
}
