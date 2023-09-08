package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.model.C2242s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.exdevice.model.z */
public class C93370z implements C2242s0.C2243a {

    /* renamed from: a */
    public final /* synthetic */ C93367y f269470a;

    public C93370z(C93367y yVar) {
        this.f269470a = yVar;
    }

    /* renamed from: a */
    public void mo2128a(int i, Object... objArr) {
        int i2;
        if (i == 15 && objArr != null && objArr.length >= 2) {
            Integer num = objArr[0];
            if ((num instanceof Integer) && (objArr[1] instanceof byte[])) {
                int intValue = num.intValue();
                try {
                    String str = new String(objArr[1]);
                    Log.m105919d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "file transfer update json %s", str);
                    i2 = new JSONObject(str).getInt("progress");
                    try {
                        C93365i.m117893j(this.f269470a.f269447N.get(Integer.valueOf(intValue)), i2);
                        if (i2 >= 100) {
                            this.f269470a.f269447N.remove(Integer.valueOf(intValue));
                        }
                    } catch (JSONException e) {
                        e = e;
                        Log.m105921e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode failed in file transfer update callback %s", e);
                        Log.m105919d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "progress %d", Integer.valueOf(i2));
                    }
                } catch (JSONException e2) {
                    e = e2;
                    i2 = 0;
                    Log.m105921e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode failed in file transfer update callback %s", e);
                    Log.m105919d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "progress %d", Integer.valueOf(i2));
                }
                Log.m105919d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "progress %d", Integer.valueOf(i2));
            }
        }
    }
}
