package com.tencent.p014mm.plugin.remittance.model;

import ar3.C67104a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wechat.aff.ting.TingClientProto;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.remittance.model.u */
public class C70613u extends C67104a {

    /* renamed from: f */
    public String f204287f;

    /* renamed from: g */
    public String f204288g;

    /* renamed from: h */
    public String f204289h;

    /* renamed from: i */
    public String f204290i;

    /* renamed from: j */
    public long f204291j;

    /* renamed from: n */
    public int f204292n;

    /* renamed from: o */
    public int f204293o;

    /* renamed from: p */
    public String f204294p;

    /* renamed from: q */
    public String f204295q;

    /* renamed from: r */
    public String f204296r;

    /* renamed from: s */
    public String f204297s;

    /* renamed from: t */
    public String f204298t;

    public C70613u(String str) {
        HashMap hashMap = new HashMap();
        try {
            if (!Util.isNullOrNil(str)) {
                hashMap.put("qrcode_url", URLEncoder.encode(str, "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            Log.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferScanQrCode", e, "", new Object[0]);
        }
        setRequestData(hashMap);
        Log.m105925i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "qrcode_url: %s", str);
    }

    public int getType() {
        return TingClientProto.TingScene.TingScene_ChatHistory_VALUE;
    }

    /* renamed from: j1 */
    public String mo91201j1() {
        return "/cgi-bin/mmpay-bin/h5f2ftransferscanqrcode";
    }

    /* renamed from: k1 */
    public int mo91202k1() {
        return TingClientProto.TingScene.TingScene_ChatHistory_VALUE;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f204287f = jSONObject.optString("recv_username", "");
        this.f204288g = jSONObject.optString("recv_realname", "");
        this.f204289h = jSONObject.optString("recv_nickname", "");
        this.f204290i = jSONObject.optString("desc", "");
        this.f204291j = jSONObject.optLong("amount", 0);
        this.f204292n = jSONObject.optInt("set_amount", 0);
        this.f204293o = jSONObject.optInt(FirebaseAnalytics.C113379b.CURRENCY, 0);
        this.f204294p = jSONObject.optString("currencyunit", "");
        this.f204295q = jSONObject.optString("qrcodeid", "");
        this.f204296r = jSONObject.optString("notice", "");
        this.f204297s = jSONObject.optString("notice_url", "");
        this.f204298t = jSONObject.optString("recv_headimgurl", "");
        Log.m105925i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "recv_username: %s, recv_nickname: %s, desc: %s, amount: %s, setAmount: %s, currencyunit: %s recv_headimgurl: %s", this.f204287f, this.f204289h, this.f204290i, Long.valueOf(this.f204291j), Integer.valueOf(this.f204292n), this.f204294p, this.f204298t);
        Log.m105919d("MicroMsg.NetSceneH5F2fTransferScanQrCode", "recv_realname: %s", this.f204288g);
    }
}
