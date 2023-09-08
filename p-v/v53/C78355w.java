package v53;

import b63.C67210w;
import com.tencent.p014mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;
import rm0.C90026e;

/* renamed from: v53.w */
public class C78355w extends C75790l {

    /* renamed from: d */
    public BindCardOrder f229612d;

    /* renamed from: e */
    public String f229613e;

    public C78355w(C67210w wVar) {
        this(wVar, -1, "");
    }

    public int getFuncId() {
        return C90026e.CTRL_INDEX;
    }

    public int getTenpayCgicmd() {
        return 13;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/bindverify";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        BindCardOrder bindCardOrder = new BindCardOrder();
        this.f229612d = bindCardOrder;
        bindCardOrder.mo99402a(jSONObject);
        this.f229613e = jSONObject.optString("action");
    }

    public C78355w(C67210w wVar, int i, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        setPayInfo(wVar.f192996n, hashMap, hashMap2);
        hashMap.put("flag", wVar.f192983a);
        if ("2".equals(wVar.f192983a)) {
            hashMap.put("passwd", wVar.f192984b);
        }
        hashMap.put("verify_code", wVar.f192985c);
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, wVar.f192986d);
        PayInfo payInfo = wVar.f192996n;
        if (payInfo != null && !Util.isNullOrNil(payInfo.f212592j)) {
            hashMap.put("req_key", wVar.f192996n.f212592j);
        }
        if (i >= 0) {
            hashMap.put("realname_scene", i + "");
            Log.m105925i(C75790l.TAG, "realname_scene=%d", Integer.valueOf(i));
        }
        if (!Util.isNullOrNil(wVar.f192987e)) {
            hashMap.put("bank_type", wVar.f192987e + "");
        }
        if (wVar.f192983a == "2" && wVar.f192997o == 1 && !Util.isNullOrNil(wVar.f192998p)) {
            hashMap.put("verify_user_token", "1");
            hashMap.put("usertoken", wVar.f192998p);
        }
        hashMap.put("session_id", str);
        if (C75133p0.f221064a) {
            hashMap2.put("uuid_for_bindcard", C75133p0.f221066c);
            hashMap2.put("bindcard_scene", "" + C75133p0.f221065b);
        }
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }
}
