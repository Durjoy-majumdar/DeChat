package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.wallet_core.model.C75108e;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.wallet_core.model.s0 */
public class C75138s0 {

    /* renamed from: a */
    public String f221080a = "";

    /* renamed from: b */
    public String f221081b = "";

    /* renamed from: c */
    public String f221082c = "";

    /* renamed from: d */
    public int f221083d = 0;

    public C75138s0() {
    }

    public C75138s0(JSONObject jSONObject) {
        jSONObject.optString(TPDownloadProxyEnum.USER_DEVICE_ID);
        this.f221080a = jSONObject.optString("device_name");
        this.f221081b = jSONObject.optString("device_os");
        this.f221083d = jSONObject.optInt("Is_cur_device");
        this.f221082c = jSONObject.optString("crt_no");
        C75108e.C75110b bVar = C75108e.C75110b.values()[jSONObject.optInt("cert_encrypt_type")];
    }
}
