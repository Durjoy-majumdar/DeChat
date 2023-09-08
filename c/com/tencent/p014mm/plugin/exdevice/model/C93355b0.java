package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.model.C2242s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.exdevice.model.b0 */
public class C93355b0 implements C2242s0.C2243a {

    /* renamed from: a */
    public final /* synthetic */ C93367y f269399a;

    public C93355b0(C93367y yVar) {
        this.f269399a = yVar;
    }

    /* renamed from: a */
    public void mo2128a(int i, Object... objArr) {
        String str;
        if (i == 12 && objArr != null && objArr.length >= 2) {
            Integer num = objArr[0];
            if ((num instanceof Integer) && (objArr[1] instanceof byte[])) {
                int intValue = num.intValue();
                byte[] bArr = objArr[1];
                if (intValue <= 0 || (str = this.f269399a.f269447N.get(Integer.valueOf(intValue))) == null) {
                    Log.m105918d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "receive cmdId =" + intValue);
                    return;
                }
                try {
                    String str2 = new String(bArr);
                    Log.m105919d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "receive response json %s", str2);
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.isNull("errcode") || jSONObject.getInt("errcode") == 0) {
                        C93365i.m117894k(str, "send_data_sucess");
                        Log.m105918d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "send data success!");
                        return;
                    }
                    C93365i.m117894k(str, "send_data_failed");
                    Log.m105921e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "send msg failed data %s", str2);
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode mUseWCLanDeviceServiceCmdId failed %s", e);
                }
            }
        }
    }
}
