package id2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75117g0;
import com.tencent.p014mm.wallet_core.model.C75120i;
import f40.C86709a0;
import fr3.C75790l;
import gy3.C87412m;
import java.util.HashMap;
import kd2.C76554b;
import kd2.C76555c;
import kd2.C76559f;
import org.json.JSONObject;
import v53.C78342e0;
import y43.C79029b0;

/* renamed from: id2.r */
public class C76312r extends C75790l {

    /* renamed from: h */
    public static final /* synthetic */ int f223547h = 0;

    /* renamed from: d */
    public C76310o f223548d;

    /* renamed from: e */
    public C78342e0 f223549e;

    /* renamed from: f */
    public C75120i f223550f;

    /* renamed from: g */
    public C75120i f223551g;

    public C76312r(int i, String str, int i2, int i3, String str2) {
        C76310o oVar = new C76310o("" + System.currentTimeMillis(), i);
        this.f223548d = oVar;
        setRequestData(oVar.f223546i);
        C78342e0 e0Var = new C78342e0(str, i2);
        this.f223549e = e0Var;
        e0Var.f229556D = true;
        HashMap hashMap = (HashMap) e0Var.f229573w;
        hashMap.put("event_id", String.valueOf(i3));
        hashMap.put("event_feature", str2);
        C76559f.m92116l();
        hashMap.put("is_new_authcodes", "1");
        Bankcard a = C76555c.f224079a.mo106804a(false);
        if (a != null) {
            hashMap.put("prefer_bind_serial", a.field_bindSerial);
            hashMap.put("prefer_bank_type", a.field_bankcardType);
        } else {
            C76555c.C76556a aVar = C76555c.f224080b;
            if (aVar != null) {
                String c = aVar.mo106801c();
                if (!Util.isNullOrNil(c)) {
                    hashMap.put("prefer_bind_serial", c);
                    if (c.equalsIgnoreCase("LQT")) {
                        hashMap.put("prefer_bank_type", "LQT");
                    }
                }
            } else {
                C87412m.m108603p("sImpl");
                throw null;
            }
        }
        addRequestData(hashMap);
        setWXRequestData(this.f223549e.f229574x);
        Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "do offline user bind query");
    }

    public int getFuncId() {
        return 1742;
    }

    public int getTenpayCgicmd() {
        return 1742;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineuserbindquery";
    }

    /* renamed from: j1 */
    public C75120i mo106545j1(JSONObject jSONObject) {
        int i;
        C75120i iVar = new C75120i();
        iVar.f221054c = MMApplicationContext.getContext().getString(C0966R.string.krp);
        String string = MMApplicationContext.getContext().getString(C0966R.string.krp);
        try {
            i = jSONObject.getInt("retcode");
            string = jSONObject.optString("retmsg");
        } catch (Exception e) {
            Log.m105928w("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: json resolve error: error when resolving error code : " + e.toString());
            i = C75117g0.ERR_RETCODE_JSON_RESOLVE_ERROR;
        }
        if (i != 0) {
            Log.m105928w("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: resolve busi error: retCode is error");
            if (i != -10089) {
                iVar.mo104849a(1000, i, string, 2);
            } else {
                iVar.mo104849a(1000, 2, string, 2);
            }
        } else {
            Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: all's OK");
        }
        return iVar;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_PAY_OFFLINE_JUMPINFOPAGE_DATA_STRING_SYNC;
        JSONObject optJSONObject = jSONObject.optJSONObject("jump_info");
        if (optJSONObject != null) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, optJSONObject.toString());
        } else {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
        }
        if (i == 0) {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("queryuser_resp");
            C75120i j1 = mo106545j1(optJSONObject2);
            this.f223550f = j1;
            this.f223548d.onGYNetEnd(j1.f221053b, j1.f221054c, optJSONObject2);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("bindquerynew_resp");
            C75120i j15 = mo106545j1(optJSONObject3);
            this.f223551g = j15;
            this.f223549e.onGYNetEnd(j15.f221053b, j15.f221054c, optJSONObject3);
            if (optJSONObject2 != null) {
                String optString = optJSONObject2.optString("card_list");
                if (optString != null) {
                    C69963m.wx0().Cx0(196656, optString);
                    C76559f.f224085c = optString;
                }
                Log.m105919d("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "card_list: %s", optString);
                JSONObject optJSONObject4 = optJSONObject2.optJSONObject("prefer_card");
                if (optJSONObject4 != null) {
                    String optString2 = optJSONObject4.optString("bind_serial");
                    if (!Util.isNullOrNil(optString2)) {
                        C79029b0.vx0().wx0().getClass();
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, optString2);
                        C76555c cVar = C76555c.f224079a;
                        C76555c.C76556a aVar2 = C76555c.f224080b;
                        if (aVar2 == null) {
                            C87412m.m108603p("sImpl");
                            throw null;
                        } else if (aVar2 instanceof C76554b) {
                            cVar.mo106806c();
                        }
                    }
                }
                String optString3 = optJSONObject2.optString("prefer_card_changed_wording");
                Log.m105919d("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "prefer_card_changed_wording: %s", optString3);
                if (!Util.isNullOrNil(optString3)) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, optString3);
                }
            }
        }
    }

    public boolean shouldResolveJsonWhenError() {
        return true;
    }

    public C76312r(int i, String str, int i2, int i3, String str2, int i4) {
        C76310o oVar = new C76310o("" + System.currentTimeMillis(), i);
        this.f223548d = oVar;
        setRequestData(oVar.f223546i);
        C78342e0 e0Var = new C78342e0(str, i2);
        this.f223549e = e0Var;
        e0Var.f229556D = true;
        HashMap hashMap = (HashMap) e0Var.f229573w;
        hashMap.put("event_id", String.valueOf(i3));
        hashMap.put("event_feature", str2);
        hashMap.put("is_first_show", String.valueOf(i4));
        C76559f.m92116l();
        hashMap.put("is_new_authcodes", "1");
        Bankcard a = C76555c.f224079a.mo106804a(false);
        if (a != null) {
            hashMap.put("prefer_bind_serial", a.field_bindSerial);
            hashMap.put("prefer_bank_type", a.field_bankcardType);
        }
        addRequestData(hashMap);
        setWXRequestData(this.f223549e.f229574x);
        Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "do offline user bind query");
    }

    public C76312r(int i, String str, int i2, int i3, String str2, String str3, String str4) {
        C76310o oVar = new C76310o("" + System.currentTimeMillis(), i);
        this.f223548d = oVar;
        setRequestData(oVar.f223546i);
        C78342e0 e0Var = new C78342e0(str, i2);
        this.f223549e = e0Var;
        e0Var.f229556D = true;
        HashMap hashMap = (HashMap) e0Var.f229573w;
        hashMap.put("event_id", String.valueOf(i3));
        hashMap.put("event_feature", str2);
        hashMap.put("package", str4);
        hashMap.put("appId", str3);
        C76559f.m92116l();
        hashMap.put("is_new_authcodes", "1");
        Bankcard a = C76555c.f224079a.mo106804a(false);
        if (a != null) {
            hashMap.put("prefer_bind_serial", a.field_bindSerial);
            hashMap.put("prefer_bank_type", a.field_bankcardType);
        }
        addRequestData(hashMap);
        setWXRequestData(this.f223549e.f229574x);
        Log.m105924i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "do offline user bind query");
    }
}
