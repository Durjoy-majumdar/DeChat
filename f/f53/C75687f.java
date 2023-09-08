package f53;

import b63.C67196n0;
import c53.C67344d;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C7088m0;
import com.tencent.p014mm.wallet_core.model.C75120i;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import di3.C86312j;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p281yz.C79173v;
import vt1.C78473a;

/* renamed from: f53.f */
public class C75687f extends C75790l {

    /* renamed from: d */
    public Orders f222291d = null;

    /* renamed from: e */
    public String f222292e = null;

    /* renamed from: f */
    public int f222293f = 0;

    /* renamed from: g */
    public String f222294g;

    /* renamed from: h */
    public String f222295h;

    /* renamed from: i */
    public String f222296i;

    /* renamed from: j */
    public String f222297j;

    /* renamed from: n */
    public String f222298n;

    /* renamed from: o */
    public C67344d f222299o = null;

    /* renamed from: p */
    public int f222300p = 0;

    /* renamed from: q */
    public String f222301q;

    public C75687f(PayInfo payInfo, int i) {
        if (payInfo == null) {
            Log.m105921e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "error payinfo is null %s", Util.getStack().toString());
            this.f222292e = "";
        } else {
            this.f222292e = payInfo.f212592j;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("support_cardtag3", "1");
        hashMap.put("req_key", this.f222292e);
        hashMap.put("bind_query_scene", "" + i);
        hashMap.put("is_merge", "1");
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        if (aVar == null || !aVar.isRoot()) {
            hashMap.put("is_root", "0");
        } else {
            hashMap.put("is_root", "1");
        }
        if (aVar == null || (!aVar.iw0() && !aVar.mo107913l3())) {
            hashMap.put("is_device_open_touch", "0");
            Log.m105924i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "is_device_open_touch is false");
        } else {
            hashMap.put("is_device_open_touch", "1");
            Map<String, String> t0 = aVar.mo107915t0();
            if (t0 != null) {
                hashMap.putAll(t0);
            }
            Log.m105924i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "is_device_open_touch is true");
        }
        if (payInfo != null) {
            this.f222300p = payInfo.f212587e;
        }
        setPayInfo(payInfo, hashMap, hashMap2);
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        return 1593;
    }

    public int getTenpayCgicmd() {
        return 112;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/qrcodeusebindquery";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Class cls = C79173v.class;
        try {
            this.f222301q = str;
            Orders a = Orders.m84559a(jSONObject);
            this.f222291d = a;
            if (a != null) {
                a.f209563e = this.f222292e;
            }
            long optLong = jSONObject.optJSONObject("bindqueryresp").optLong("time_stamp");
            if (optLong > 0) {
                C7088m0.m7308b("" + optLong);
            } else {
                Log.m105928w("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "no time_stamp in qrcodeusebindquery.");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("query_order_info");
            if (optJSONObject != null) {
                Log.m105924i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "get query_order_info");
                ((C79173v) C86312j.m106911c(cls)).Ex0().f192965r = optJSONObject.optInt("query_order_time", 5) * 1000;
                ((C79173v) C86312j.m106911c(cls)).Ex0().f192966s = optJSONObject.optInt("query_order_count", 0);
                ((C79173v) C86312j.m106911c(cls)).Ex0().f192967t = optJSONObject.optString("default_query_order_wording", "");
            }
            ((C79173v) C86312j.m106911c(cls)).Ex0().f192968u = jSONObject.optString("pay_remind_wording");
            C67196n0.m79484k(jSONObject.optJSONObject("bindqueryresp"), this.f222300p, false, false);
            C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
            if (aVar != null) {
                Log.m105924i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "IFingerPrintMgr is not null");
                aVar.mo107909dx();
                int G = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91317G();
                if (G == 0) {
                    if (aVar.mo107921ys()) {
                        aVar.mo107878Fg(((C79173v) C86312j.m106911c(cls)).Ex0().mo91340v());
                        aVar.W00(false);
                    } else if (aVar.Fk0()) {
                        aVar.W00(((C79173v) C86312j.m106911c(cls)).Ex0().mo91340v());
                        aVar.mo107878Fg(false);
                    }
                } else if (G == 1 && aVar.mo107921ys()) {
                    aVar.mo107878Fg(((C79173v) C86312j.m106911c(cls)).Ex0().mo91340v());
                    aVar.W00(false);
                } else if (G == 2 && aVar.Fk0()) {
                    aVar.W00(((C79173v) C86312j.m106911c(cls)).Ex0().mo91340v());
                    aVar.mo107878Fg(false);
                }
            } else {
                Log.m105920e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "IFingerPrintMgr is null");
            }
            if (jSONObject.has("real_name_info")) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("real_name_info");
                this.f222294g = optJSONObject2.optString("guide_flag");
                this.f222295h = optJSONObject2.optString("guide_wording");
                this.f222296i = optJSONObject2.optString("left_button_wording");
                this.f222297j = optJSONObject2.optString("right_button_wording");
                this.f222298n = optJSONObject2.optString("upload_credit_url");
                this.f222293f = optJSONObject2.optInt("guide_type", 0);
            }
            if (jSONObject.has("user_notify_info")) {
                this.f222299o = C67344d.m79686a(jSONObject.optJSONObject("user_notify_info"));
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "hy: " + e.toString());
        }
    }

    public void onGYNetEnd2(C75120i iVar, JSONObject jSONObject) {
        int i;
        super.onGYNetEnd2(iVar, jSONObject);
        if (iVar.f221052a == 0 && (i = iVar.f221053b) == 0) {
            C75155x0.m90136b(this.f222300p, this.f222292e, i);
        } else {
            C75155x0.m90136b(this.f222300p, this.f222292e, iVar.f221053b);
        }
    }
}
