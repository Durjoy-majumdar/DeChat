package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;
import p156gj.C87203t;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.wallet_core.model.a0 */
public class C75100a0 extends C75790l {

    /* renamed from: d */
    public String f221010d;

    public C75100a0(String str) {
        this.f221010d = str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("crt_no", C117627q.m165908a(str));
        hashMap.put("deviceid", C87203t.m108270f(false));
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        return 1568;
    }

    public int getTenpayCgicmd() {
        return 1568;
    }

    public int getType() {
        return 1568;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/deletedigitalcert";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneDeletedigitalcert", "onGYNetEnd %d %s", Integer.valueOf(i), str);
    }

    public void onGYNetEnd2(C75120i iVar, JSONObject jSONObject) {
        super.onGYNetEnd2(iVar, jSONObject);
    }
}
