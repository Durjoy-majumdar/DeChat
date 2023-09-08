package x53;

import b63.C28269p;
import b63.C67176b;
import b63.C67180c;
import b63.C67203r0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C7088m0;
import d63.C75342a;
import di3.C86312j;
import dr3.C45440a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ob0.C11385n;
import org.json.JSONArray;
import org.json.JSONObject;
import p281yz.C79173v;

/* renamed from: x53.a */
public class C78770a extends C45440a {

    /* renamed from: d */
    public boolean f230507d;

    public C78770a() {
        this("", true);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        return super.doScene(gVar, nVar);
    }

    /* renamed from: j1 */
    public int mo70937j1() {
        return 1;
    }

    /* renamed from: k1 */
    public final Bankcard mo108694k1(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        Bankcard bankcard = new Bankcard(1);
        bankcard.f209415j2 = ((double) jSONObject.optInt("avail_balance")) / 100.0d;
        bankcard.f209417l2 = ((double) jSONObject.optInt("fetch_balance")) / 100.0d;
        bankcard.field_bankcardType = jSONObject.optString("balance_bank_type");
        bankcard.field_bindSerial = jSONObject.optString("balance_bind_serial");
        bankcard.field_forbidWord = jSONObject.optString("balance_forbid_word");
        bankcard.field_desc = MMApplicationContext.getContext().getString(C0966R.string.kto);
        bankcard.field_cardType |= 8;
        return bankcard;
    }

    /* renamed from: l1 */
    public final ArrayList<Bankcard> mo108695l1(JSONArray jSONArray) {
        ArrayList<Bankcard> arrayList = new ArrayList<>();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                jSONObject.put("extra_bind_flag", "NORMAL");
                if (C75342a.f221507b == null) {
                    C75342a.f221507b = new C75342a();
                }
                arrayList.add(C75342a.f221507b.mo91284c(jSONObject));
            }
        }
        return arrayList;
    }

    /* renamed from: m1 */
    public final C67203r0 mo108696m1(JSONObject jSONObject) {
        C67203r0 r0Var = new C67203r0();
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        r0Var.field_is_reg = Util.getInt(jSONObject.optString("is_reg"), 0);
        r0Var.field_true_name = jSONObject.optString("true_name");
        r0Var.field_main_card_bind_serialno = jSONObject.optString("main_card_bind_serialno");
        r0Var.field_ftf_pay_url = jSONObject.optString("transfer_url");
        ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91314D(r0Var.field_main_card_bind_serialno);
        return r0Var;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        Class cls = C79173v.class;
        Log.m105925i("MicroMsg.NetScenePayUQueryBoundBankcard", "hy: payu query bind on gy net end. errCode: %d, errMsg: %s", Integer.valueOf(i), str);
        if (i == 0) {
            try {
                long optLong = jSONObject2.optLong("time_stamp");
                if (optLong > 0) {
                    C7088m0.m7308b("" + optLong);
                } else {
                    Log.m105928w("MicroMsg.NetScenePayUQueryBoundBankcard", "no time_stamp in bindquerynew.");
                }
                C67203r0 m1 = mo108696m1(jSONObject2.getJSONObject("user_info"));
                m1.field_switchConfig = jSONObject2.getJSONObject("switch_info").getInt("switch_bit");
                ((C79173v) C86312j.m106911c(cls)).Ex0().mo91313C(m1, mo108695l1(jSONObject2.optJSONArray("Array")), (ArrayList<Bankcard>) null, mo108694k1(jSONObject2.optJSONObject("balance_info")), (Bankcard) null, (C28269p) null, (C67176b) null, (Bankcard) null, 0, 0, (List<C67180c>) null);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.NetScenePayUQueryBoundBankcard", e, "", new Object[0]);
            }
            if (this.f230507d && !((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w()) {
                this.callback.onSceneEnd(1000, -100869, "", this);
                this.isChildConsume = true;
            }
        }
    }

    public C78770a(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("req_key", str);
        setRequestData(hashMap);
        this.f230507d = z;
    }
}
