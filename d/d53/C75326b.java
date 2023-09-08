package d53;

import c53.C67342b;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.utils.C72516y;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75120i;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import f40.C86709a0;
import fr3.C75791m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import vt1.C78473a;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: d53.b */
public class C75326b extends C75791m {

    /* renamed from: A */
    public boolean f221491A = false;

    /* renamed from: B */
    public Orders f221492B;

    /* renamed from: C */
    public Authen f221493C;

    /* renamed from: D */
    public String f221494D;

    /* renamed from: E */
    public String f221495E;

    /* renamed from: F */
    public String f221496F;

    /* renamed from: G */
    public int f221497G;

    /* renamed from: H */
    public String f221498H;

    /* renamed from: I */
    public int f221499I;

    /* renamed from: J */
    public JSONArray f221500J;

    /* renamed from: x */
    public boolean f221501x;

    /* renamed from: y */
    public Map<String, String> f221502y;

    /* renamed from: z */
    public Map<String, String> f221503z;

    public C75326b(Authen authen, Orders orders, boolean z) {
        String str;
        Boolean bool;
        Authen authen2 = authen;
        Orders orders2 = orders;
        String str2 = null;
        this.f221494D = null;
        this.f221495E = null;
        this.f221496F = null;
        this.f221497G = 0;
        this.f221499I = 0;
        this.f221493C = authen2;
        this.f221492B = orders2;
        if (authen2 != null) {
            ArrayList arrayList = (ArrayList) orders2.f209542M;
            String str3 = arrayList.size() > 0 ? ((Orders.Commodity) arrayList.get(0)).f209606r : str2;
            String str4 = orders2.f209563e;
            PayInfo payInfo = authen2.f209382v;
            mo106090k1(str4, str3, payInfo.f212587e, payInfo.f212589g, authen2.f209370g, authen2.f209371h);
            if (authen2.f209382v != null) {
                Log.m105924i("MicroMsg.NetSceneTenpayAuthen", "pay channel :" + authen2.f209382v.f212589g);
                this.f221502y = new HashMap();
                this.f221503z = new HashMap();
                boolean z2 = !z && !Util.isNullOrNil(this.f221493C.f209369f);
                Log.m105925i("MicroMsg.NetSceneTenpayAuthen", "hy: has pwd: %b", Boolean.valueOf(z2));
                setPayInfo(authen2.f209382v, this.f221502y, this.f221503z, z2);
                if (z) {
                    ((HashMap) this.f221502y).put("brief_reg", "1");
                } else {
                    ((HashMap) this.f221502y).put("passwd", authen2.f209369f);
                }
                this.f222396u = orders2.f209553U;
                ((HashMap) this.f221502y).put("default_favorcomposedid", authen2.f209354G);
                ((HashMap) this.f221502y).put("favorcomposedid", authen2.f209355H);
                ((HashMap) this.f221502y).put("arrive_type", authen2.f209381u);
                ((HashMap) this.f221502y).put("sms_flag", authen2.f209356I);
                ((HashMap) this.f221502y).put("ban_sms_bind_serial", authen2.f209357J);
                ((HashMap) this.f221502y).put("ban_sms_bank_type", authen2.f209358K);
                ((HashMap) this.f221502y).put("busi_sms_flag", authen2.f209359L);
                Map<String, String> map = this.f221502y;
                ((HashMap) map).put("buttontype", authen2.f209382v.f212580K + "");
                ((HashMap) this.f221502y).put("mobile_area", authen2.f209360M);
                Log.m105925i("MicroMsg.NetSceneTenpayAuthen", "buttontype %s not_support_retry %s, mobile area: %s", Integer.valueOf(authen2.f209382v.f212580K), Integer.valueOf(this.f222396u), authen2.f209360M);
                int i = authen2.f209367d;
                String str5 = "";
                Object obj = "identify_card";
                Object obj2 = "true_name";
                Object obj3 = "mobile_no";
                Object obj4 = "card_tail";
                Object obj5 = "cre_expire_date";
                Object obj6 = "birth_date";
                Object obj7 = "creid_renewal";
                Object obj8 = "h_bind_serial";
                Object obj9 = "bank_card_id";
                Object obj10 = "cre_type";
                Object obj11 = Scopes.EMAIL;
                Object obj12 = "zip_code";
                Object obj13 = "address";
                switch (i) {
                    case 1:
                        str = str5;
                        Object obj14 = "cvv2";
                        Object obj15 = obj3;
                        Object obj16 = obj6;
                        Object obj17 = obj7;
                        Object obj18 = obj9;
                        Object obj19 = obj10;
                        ((HashMap) this.f221502y).put("flag", "1");
                        ((HashMap) this.f221502y).put("bank_type", authen2.f209370g);
                        ((HashMap) this.f221502y).put(obj2, authen2.f209372i);
                        ((HashMap) this.f221502y).put(obj, authen2.f209373j);
                        if (authen2.f209374n > 0) {
                            Map<String, String> map2 = this.f221502y;
                            ((HashMap) map2).put(obj19, authen2.f209374n + str);
                        }
                        ((HashMap) this.f221502y).put(obj15, authen2.f209375o);
                        ((HashMap) this.f221502y).put(obj18, authen2.f209376p);
                        if (!Util.isNullOrNil(authen2.f209377q)) {
                            ((HashMap) this.f221502y).put(obj14, authen2.f209377q);
                        }
                        if (!Util.isNullOrNil(authen2.f209378r)) {
                            ((HashMap) this.f221502y).put("valid_thru", authen2.f209378r);
                        }
                        ((HashMap) this.f221502y).put(obj17, String.valueOf(authen2.f209361N));
                        ((HashMap) this.f221502y).put(obj16, authen2.f209362P);
                        ((HashMap) this.f221502y).put(obj5, authen2.f209363Q);
                        break;
                    case 2:
                        Object obj20 = "cvv2";
                        Object obj21 = obj3;
                        Object obj22 = obj9;
                        ((HashMap) this.f221502y).put("flag", "2");
                        ((HashMap) this.f221502y).put("bank_type", authen2.f209370g);
                        ((HashMap) this.f221502y).put(obj8, authen2.f209371h);
                        ((HashMap) this.f221502y).put(obj4, authen2.f209380t);
                        if (!Util.isNullOrNil(authen2.f209372i)) {
                            ((HashMap) this.f221502y).put(obj2, authen2.f209372i);
                        }
                        if (!Util.isNullOrNil(authen2.f209373j)) {
                            ((HashMap) this.f221502y).put(obj, authen2.f209373j);
                        }
                        Map<String, String> map3 = this.f221502y;
                        StringBuilder sb = new StringBuilder();
                        sb.append(authen2.f209374n);
                        str = str5;
                        sb.append(str);
                        ((HashMap) map3).put(obj10, sb.toString());
                        ((HashMap) this.f221502y).put(obj21, authen2.f209375o);
                        ((HashMap) this.f221502y).put(obj22, authen2.f209376p);
                        if (!Util.isNullOrNil(authen2.f209377q)) {
                            ((HashMap) this.f221502y).put(obj20, authen2.f209377q);
                        }
                        if (!Util.isNullOrNil(authen2.f209378r)) {
                            ((HashMap) this.f221502y).put("valid_thru", authen2.f209378r);
                        }
                        ((HashMap) this.f221502y).put(obj7, String.valueOf(authen2.f209361N));
                        ((HashMap) this.f221502y).put(obj6, authen2.f209362P);
                        ((HashMap) this.f221502y).put(obj5, authen2.f209363Q);
                        break;
                    case 3:
                        Object obj23 = "cvv2";
                        if (authen2.f209368e == 1) {
                            ((HashMap) this.f221502y).put("reset_flag", "1");
                            if (!Util.isNullOrNil(authen2.f209375o)) {
                                ((HashMap) this.f221502y).put(obj3, authen2.f209375o);
                            }
                            if (!Util.isNullOrNil(authen2.f209377q)) {
                                ((HashMap) this.f221502y).put(obj23, authen2.f209377q);
                            }
                            if (!Util.isNullOrNil(authen2.f209378r)) {
                                ((HashMap) this.f221502y).put("valid_thru", authen2.f209378r);
                            }
                        }
                        ((HashMap) this.f221502y).put("flag", "3");
                        ((HashMap) this.f221502y).put("bank_type", authen2.f209370g);
                        ((HashMap) this.f221502y).put("bind_serial", authen2.f209371h);
                        break;
                    case 4:
                        Object obj24 = "valid_thru";
                        Object obj25 = "cvv2";
                        ((HashMap) this.f221502y).put("flag", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                        ((HashMap) this.f221502y).put("bank_type", authen2.f209370g);
                        ((HashMap) this.f221502y).put("first_name", authen2.f209383w);
                        ((HashMap) this.f221502y).put("last_name", authen2.f209384x);
                        ((HashMap) this.f221502y).put("country", authen2.f209385y);
                        ((HashMap) this.f221502y).put("area", authen2.f209386z);
                        ((HashMap) this.f221502y).put("city", authen2.f209348A);
                        ((HashMap) this.f221502y).put(obj13, authen2.f209349B);
                        ((HashMap) this.f221502y).put("phone_number", authen2.f209350C);
                        ((HashMap) this.f221502y).put(obj12, authen2.f209351D);
                        ((HashMap) this.f221502y).put(obj11, authen2.f209352E);
                        ((HashMap) this.f221502y).put(obj9, authen2.f209376p);
                        if (!Util.isNullOrNil(authen2.f209377q)) {
                            ((HashMap) this.f221502y).put(obj25, authen2.f209377q);
                        }
                        if (!Util.isNullOrNil(authen2.f209378r)) {
                            ((HashMap) this.f221502y).put(obj24, authen2.f209378r);
                            break;
                        }
                        break;
                    case 5:
                        ((HashMap) this.f221502y).put("flag", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
                        ((HashMap) this.f221502y).put("bank_type", authen2.f209370g);
                        ((HashMap) this.f221502y).put("first_name", authen2.f209383w);
                        ((HashMap) this.f221502y).put("last_name", authen2.f209384x);
                        ((HashMap) this.f221502y).put("country", authen2.f209385y);
                        ((HashMap) this.f221502y).put("area", authen2.f209386z);
                        ((HashMap) this.f221502y).put("city", authen2.f209348A);
                        ((HashMap) this.f221502y).put(obj13, authen2.f209349B);
                        ((HashMap) this.f221502y).put("phone_number", authen2.f209350C);
                        ((HashMap) this.f221502y).put(obj12, authen2.f209351D);
                        ((HashMap) this.f221502y).put(obj11, authen2.f209352E);
                        ((HashMap) this.f221502y).put(obj9, authen2.f209376p);
                        if (!Util.isNullOrNil(authen2.f209377q)) {
                            ((HashMap) this.f221502y).put("cvv2", authen2.f209377q);
                        }
                        if (!Util.isNullOrNil(authen2.f209378r)) {
                            ((HashMap) this.f221502y).put("valid_thru", authen2.f209378r);
                        }
                        ((HashMap) this.f221502y).put(obj8, authen2.f209371h);
                        ((HashMap) this.f221502y).put(obj4, authen2.f209380t);
                        break;
                    case 6:
                        if (authen2.f209368e == 1) {
                            ((HashMap) this.f221502y).put("reset_flag", "1");
                            if (!Util.isNullOrNil(authen2.f209377q)) {
                                ((HashMap) this.f221502y).put("cvv2", authen2.f209377q);
                            }
                            if (!Util.isNullOrNil(authen2.f209378r)) {
                                ((HashMap) this.f221502y).put("valid_thru", authen2.f209378r);
                            }
                        }
                        ((HashMap) this.f221502y).put("phone_number", authen2.f209375o);
                        ((HashMap) this.f221502y).put("flag", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
                        ((HashMap) this.f221502y).put("bank_type", authen2.f209370g);
                        ((HashMap) this.f221502y).put("bind_serial", authen2.f209371h);
                        break;
                }
                str = str5;
                mo105665l1(this.f221502y);
                setRequestData(this.f221502y);
                Map<String, String> vc02 = ((C78473a) C86709a0.m107533q(C78473a.class)).vc0();
                if (vc02 != null) {
                    ((HashMap) this.f221503z).putAll(vc02);
                }
                PayInfo payInfo2 = authen2.f209382v;
                String str6 = payInfo2.f212583N;
                char c = payInfo2.f212584P ? (char) 2 : 1;
                boolean z3 = payInfo2.f212603x == 1;
                Map<String, List<Integer>> map4 = C67342b.f193187a;
                if (!Util.isNullOrNil(str6)) {
                    if (((ConcurrentHashMap) C67342b.f193187a).containsKey(str6) && ((List) ((ConcurrentHashMap) C67342b.f193187a).get(str6)).size() > 0) {
                        if (c == 1) {
                            C115669n nVar = C115669n.INSTANCE;
                            C115669n nVar2 = nVar;
                            nVar2.mo175913w(965, 10, 1);
                            nVar2.mo175913w(965, 30, 1);
                            if (C67342b.m79682a(str6)) {
                                nVar.mo175913w(965, 25, 1);
                            }
                        } else if (c == 2) {
                            C115669n nVar3 = C115669n.INSTANCE;
                            C115669n nVar4 = nVar3;
                            nVar4.mo175913w(965, 11, 1);
                            nVar4.mo175913w(965, 31, 1);
                            if (C67342b.m79682a(str6)) {
                                nVar3.mo175913w(965, 26, 1);
                            }
                        }
                        if (C67342b.m79682a(str6)) {
                            C115669n.INSTANCE.mo175913w(965, 24, 1);
                        }
                        C115669n nVar5 = C115669n.INSTANCE;
                        nVar5.mo175913w(965, 29, 1);
                        if (z3) {
                            nVar5.mo175913w(965, 20, 1);
                        } else {
                            nVar5.mo175913w(965, 21, 1);
                        }
                    }
                    if (((ConcurrentHashMap) C67342b.f193188b).containsKey(str6) && (bool = (Boolean) ((ConcurrentHashMap) C67342b.f193188b).get(str6)) != null) {
                        if (bool.booleanValue()) {
                            C115669n.INSTANCE.mo175913w(965, 18, 1);
                        } else {
                            C115669n.INSTANCE.mo175913w(965, 19, 1);
                        }
                    }
                }
                if (C75133p0.f221064a) {
                    ((HashMap) this.f221503z).put("uuid_for_bindcard", C75133p0.f221066c);
                    Map<String, String> map5 = this.f221503z;
                    ((HashMap) map5).put("bindcard_scene", str + C75133p0.f221065b);
                }
                setWXRequestData(this.f221503z);
                return;
            }
            throw new IllegalArgumentException("authen.payInfo == null");
        }
        throw new IllegalArgumentException("authen == null");
    }

    public int getFuncId() {
        int i = this.f221493C.f209382v.f212587e;
        if (i == 11) {
            return 1610;
        }
        return i == 21 ? 1605 : 461;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getToken() {
        return this.f221494D;
    }

    public String getUri() {
        int i = this.f221493C.f209382v.f212587e;
        return i == 11 ? "/cgi-bin/mmpay-bin/tenpay/saveauthen" : i == 21 ? "/cgi-bin/mmpay-bin/tenpay/fetchauthen" : "/cgi-bin/mmpay-bin/tenpay/authen";
    }

    /* renamed from: j1 */
    public boolean mo105664j1() {
        int i = this.f221493C.f209382v.f212587e;
        return i == 11 || i == 21;
    }

    /* renamed from: l1 */
    public void mo105665l1(Map<String, String> map) {
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        super.onGYNetEnd(i, str, jSONObject);
        Log.m105924i("MicroMsg.NetSceneTenpayAuthen", " errCode: " + i + " errMsg :" + str);
        Log.m105919d("MicroMsg.NetSceneTenpayAuthen", "banlance_mobile: %s", this.f221495E);
        this.f221491A = "1".equals(jSONObject.optString("is_free_sms"));
        this.f221494D = jSONObject.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        this.f221495E = jSONObject.optString("balance_mobile");
        this.f221496F = jSONObject.optString("balance_help_url");
        jSONObject.optString("modify_mobile_url");
        String optString = jSONObject.optString("bind_serial");
        if (!Util.isNullOrNil(optString)) {
            Log.m105924i("MicroMsg.NetSceneTenpayAuthen", "Pay Success! saving bind_serial:" + optString);
        }
        if ("1".equals(jSONObject.optString("pay_flag"))) {
            setPaySuccess(true);
            Orders orders = this.f221492B;
            Orders.m84565g(jSONObject, orders);
            this.f221492B = orders;
        } else {
            setPaySuccess(false);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("verify_cre_tail_info");
        if (optJSONObject != null) {
            this.f221497G = optJSONObject.optInt("is_can_verify_tail", 0);
            this.f221498H = optJSONObject.optString("verify_tail_wording");
        }
        this.f221499I = jSONObject.optInt("no_reset_mobile", 0);
        Log.m105924i("MicroMsg.NetSceneTenpayAuthen", "pay_scene:" + this.f221493C.f209382v.f212587e);
        if (this.f221493C.f209382v.f212587e == 21) {
            this.f221500J = jSONObject.optJSONArray("fetch_charge_show_info");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_FETCH_CHARGE_RATE_VERSION_STRING_SYNC, jSONObject.optString("charge_rate_version"));
        }
        if (i == 0 && this.f221493C.f209382v.f212587e == 39) {
            Log.m105924i("MicroMsg.NetSceneTenpayAuthen", "it's the sns scene, parse the sns pay data");
            C72516y.m84852a(jSONObject);
        } else {
            Log.m105924i("MicroMsg.NetSceneTenpayAuthen", "it's not the sns scene or occurs error,  errCode:" + i);
        }
        Iterator it = ((ArrayList) C79143a.m95767f("PayProcess")).iterator();
        while (it.hasNext()) {
            ((C79148e) it.next()).f232423c.putInt("key_is_clear_failure", this.f222398w);
        }
    }

    public void onGYNetEnd2(C75120i iVar, JSONObject jSONObject) {
        super.onGYNetEnd2(iVar, jSONObject);
        boolean z = true;
        int i = 2;
        if (this.SVR_ERR_TYPE != 0 || this.SVR_ERR_CODE != 0) {
            PayInfo payInfo = this.f221493C.f209382v;
            String str = payInfo.f212583N;
            if (!payInfo.f212584P) {
                i = 1;
            }
            if (payInfo.f212603x != 1) {
                z = false;
            }
            C67342b.m79683b(str, i, z);
            String str2 = this.f221493C.f209382v.f212583N;
            boolean checkRecSrvResp = checkRecSrvResp();
            if (!Util.isNullOrNil(str2)) {
                ((ConcurrentHashMap) C67342b.f193188b).put(str2, Boolean.valueOf(checkRecSrvResp));
            }
        } else if (this.isPaySuccess) {
            PayInfo payInfo2 = this.f221493C.f209382v;
            String str3 = payInfo2.f212583N;
            if (!payInfo2.f212584P) {
                i = 1;
            }
            if (payInfo2.f212603x != 1) {
                z = false;
            }
            C67342b.m79683b(str3, i, z);
            String str4 = this.f221493C.f209382v.f212583N;
            boolean checkRecSrvResp2 = checkRecSrvResp();
            if (!Util.isNullOrNil(str4)) {
                ((ConcurrentHashMap) C67342b.f193188b).put(str4, Boolean.valueOf(checkRecSrvResp2));
            }
        }
    }

    public boolean resend() {
        super.resend();
        ((HashMap) this.f221502y).put("is_repeat_send", "1");
        setRequestData(this.f221502y);
        this.f221501x = true;
        return true;
    }
}
