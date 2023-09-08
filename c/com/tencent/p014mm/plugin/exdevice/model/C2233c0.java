package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.model.C2242s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.exdevice.model.c0 */
public class C2233c0 implements C2242s0.C2243a {

    /* renamed from: a */
    public final /* synthetic */ C93367y f12301a;

    public C2233c0(C93367y yVar) {
        this.f12301a = yVar;
    }

    /* renamed from: a */
    public void mo2128a(int i, Object... objArr) {
        if (i == 13 && objArr != null && objArr.length >= 2) {
            String str = objArr[0];
            if (str instanceof String) {
                Integer num = objArr[1];
                if (num instanceof Integer) {
                    String str2 = str;
                    int intValue = num.intValue();
                    String str3 = null;
                    try {
                        JSONObject jSONObject = new JSONObject(new String(str2));
                        str3 = jSONObject.getString("deviceId");
                        jSONObject.getString("deviceType");
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e, "", new Object[0]);
                        Log.m105920e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode failed in device ConnState notify callback");
                    }
                    if (intValue == -2 || intValue == -1 || intValue == 0) {
                        this.f12301a.f269434A.put(str3, Boolean.FALSE);
                        Log.m105920e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "device not connect stateCode = " + intValue);
                    } else if (intValue == 1) {
                        this.f12301a.f269434A.put(str3, Boolean.TRUE);
                        Log.m105924i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "device connect");
                    }
                }
            }
        }
    }
}
