package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.r65;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.z3 */
public class C40565z3 implements l0$$e {
    public C40565z3(AppBrandVoIPDeviceListAuthorizeUI appBrandVoIPDeviceListAuthorizeUI) {
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105925i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "WxaModVoipDeviceAuthResp errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            if (((r65) cVar.f127056b.f127083a) == null) {
                Log.m105920e("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "WxaModVoipDeviceAuthResp failed, response is null!");
            } else {
                Log.m105920e("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "WxaModVoipDeviceAuthResp success");
            }
        }
        return 0;
    }
}
