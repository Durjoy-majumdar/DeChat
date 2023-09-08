package b63;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.io.UnsupportedEncodingException;
import java.math.RoundingMode;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C77909bp;
import te3.C77959ki3;

/* renamed from: b63.d */
public class C67181d {

    /* renamed from: a */
    public static C67181d f192869a;

    /* renamed from: a */
    public static C67181d m79454a() {
        if (f192869a == null) {
            f192869a = new C67181d();
        }
        return f192869a;
    }

    /* renamed from: b */
    public static Bankcard m79455b(C77909bp bpVar) {
        boolean z = true;
        Log.m105925i("MicroMsg.BankcardParser", "parseFromBindQueryRecord %s", bpVar);
        Bankcard bankcard = new Bankcard();
        try {
            bankcard.field_bankName = bpVar.f227080f;
            bankcard.field_bankcardTypeName = bpVar.f227052P;
            bankcard.field_bankcardType = bpVar.f227084h;
            String str = bpVar.f227095o;
            bankcard.field_bindSerial = str;
            Log.m105919d("MicroMsg.BankcardParser", "bind_serial: %s", str);
            if (2 == Util.getInt(bpVar.f227086i, 2)) {
                bankcard.field_cardType |= 2;
            }
            if (!"NORMAL".equals(bpVar.f227041D)) {
                bankcard.field_cardType |= 4;
            }
            if (!Util.isNullOrNil(bpVar.f227103v)) {
                bankcard.field_mobile = URLDecoder.decode(bpVar.f227103v.replaceAll("x", "%"), "utf-8");
            }
            bankcard.field_onceQuotaKind = C75228t.m90250i(bpVar.f227107y, "100", 2, RoundingMode.HALF_UP);
            bankcard.field_onceQuotaVirtual = C75228t.m90250i(bpVar.f227104w, "100", 2, RoundingMode.HALF_UP);
            bankcard.field_dayQuotaKind = C75228t.m90250i(bpVar.f227101t, "100", 2, RoundingMode.HALF_UP);
            bankcard.field_dayQuotaVirtual = C75228t.m90250i(bpVar.f227099r, "100", 2, RoundingMode.HALF_UP);
            bankcard.field_bankcardTail = bpVar.f227096p;
            String str2 = bpVar.f227039B;
            bankcard.field_forbidWord = str2;
            bankcard.field_repay_url = bpVar.f227043F;
            bankcard.field_wxcreditState = 2;
            if (!Util.isNullOrNil(str2)) {
                bankcard.field_bankcardState = 8;
            } else if (1 == Util.getInt(bpVar.f227102u, 0)) {
                bankcard.field_bankcardState = 1;
            } else if (Util.getInt(bpVar.f227078e, 1) == 0) {
                bankcard.field_bankcardState = 2;
            } else {
                bankcard.field_bankcardState = 0;
            }
            bankcard.field_bankPhone = bpVar.f227082g;
            bankcard.field_fetchArriveTime = Util.getLong(bpVar.f227047J, 0) * 1000;
            bankcard.field_fetchArriveTimeWording = bpVar.f227067X;
            int i = Util.getInt(bpVar.f227109z, 1);
            bankcard.field_bankcardTag = i;
            if (i == 2) {
                bankcard.field_cardType |= 1;
            }
            if (bpVar.f227044G != 1) {
                z = false;
            }
            bankcard.field_support_micropay = z;
            Log.m105924i("MicroMsg.BankcardParser", "getBalance() support_micropay:" + bpVar.f227044G);
            bankcard.field_arrive_type = bpVar.f227055R;
            bankcard.field_avail_save_wording = bpVar.f227059T;
            int i2 = bpVar.f227069Y;
            Log.m105924i("MicroMsg.BankcardParser", "fetch_charge_rate:" + i2);
            bankcard.field_fetch_charge_rate = ((double) i2) / 10000.0d;
            Log.m105924i("MicroMsg.BankcardParser", "field_fetch_charge_rate:" + bankcard.field_fetch_charge_rate);
            int i3 = bpVar.f227071Z;
            Log.m105924i("MicroMsg.BankcardParser", "full_fetch_charge_fee:" + bankcard.field_full_fetch_charge_fee);
            bankcard.field_full_fetch_charge_fee = ((double) i3) / 100.0d;
            bankcard.field_fetch_charge_info = bpVar.f227097p0;
            bankcard.field_tips = bpVar.f227106x0;
            bankcard.field_forbid_title = bpVar.f227054Q0;
            bankcard.field_forbid_url = bpVar.f227056R0;
            bankcard.field_no_micro_word = bpVar.f227057S;
            bankcard.field_card_bottom_wording = bpVar.f227066W0;
            bankcard.field_support_lqt_turn_in = bpVar.f227072Z0;
            bankcard.field_support_lqt_turn_out = bpVar.f227073a1;
            bankcard.field_is_hightlight_pre_arrive_time_wording = bpVar.f227070Y0;
            C77959ki3 ki32 = bpVar.f227079e1;
            if (ki32 != null) {
                bankcard.field_prompt_info_prompt_text = ki32.f227742d;
                bankcard.field_prompt_info_jump_text = ki32.f227743e;
                bankcard.field_prompt_info_jump_url = ki32.f227744f;
            }
            m79458f(bankcard);
            return bankcard;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BankcardParser", e, "parseFromBindQueryRecord() error:" + e.getMessage(), new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public static void m79456d(Bankcard bankcard, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("minimch_info");
        if (optJSONObject != null) {
            bankcard.field_minimch_key = optJSONObject.optString("minimch_key");
            bankcard.field_minimch_avail_balance = optJSONObject.optLong("minimch_avail_balance");
            bankcard.field_minimch_user_state = optJSONObject.optInt("minimch_user_state");
            bankcard.field_minimch_system_state = optJSONObject.optInt("minimch_system_state");
            bankcard.field_minimch_ext_msg = optJSONObject.optString("minimch_ext_msg");
        }
    }

    /* renamed from: e */
    public static void m79457e(Bankcard bankcard, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("yht_info");
        if (optJSONObject != null) {
            bankcard.field_yht_related_bank = optJSONObject.optString("yht_related_bank");
            bankcard.field_yht_avail_balance = optJSONObject.optLong("yht_avail_balance");
            bankcard.field_yht_system_state = optJSONObject.optInt("yht_system_state");
            bankcard.field_yht_user_state = optJSONObject.optInt("yht_user_state");
            bankcard.field_yht_ext_msg = optJSONObject.optString("yht_ext_msg");
        }
    }

    /* renamed from: f */
    public static void m79458f(Bankcard bankcard) {
        if (bankcard != null) {
            if (bankcard.mo99388n2()) {
                bankcard.field_desc = bankcard.field_bankName;
            } else if (bankcard.mo99392r2()) {
                bankcard.field_desc = MMApplicationContext.getContext().getString(C0966R.string.ktp, new Object[]{bankcard.f209390C2, C75228t.m90246g(bankcard.f209431z2, 8)});
            } else if (bankcard.mo99389o2()) {
                bankcard.field_desc = MMApplicationContext.getContext().getString(C0966R.string.krn, new Object[]{bankcard.field_bankName, bankcard.field_bankcardTail});
            } else if (bankcard.mo99394u2()) {
                bankcard.field_desc = MMApplicationContext.getContext().getString(C0966R.string.lbu, new Object[]{bankcard.field_bankName, bankcard.field_bankcardTail});
            } else if (bankcard.mo99391q2()) {
                bankcard.field_desc = bankcard.f209396I2;
            } else if (bankcard.field_bankcardType.equals("YHT")) {
                bankcard.field_desc = String.format("%s(%s)", new Object[]{bankcard.field_bankName, bankcard.field_yht_ext_msg});
            } else if (bankcard.field_bankcardType.equals("MINIMCH")) {
                bankcard.field_desc = String.format("%s(%s)", new Object[]{bankcard.field_bankName, bankcard.field_minimch_ext_msg});
            } else {
                bankcard.field_desc = MMApplicationContext.getContext().getString(C0966R.string.ksd, new Object[]{bankcard.field_bankName, bankcard.field_bankcardTail});
            }
        }
    }

    /* renamed from: c */
    public Bankcard mo91284c(JSONObject jSONObject) {
        Object[] objArr = new Object[1];
        objArr[0] = jSONObject == null ? "" : jSONObject;
        Log.m105925i("MicroMsg.BankcardParser", "parseJson jsonBankcard %s", objArr);
        Bankcard bankcard = new Bankcard();
        try {
            bankcard.field_bankName = jSONObject.getString("bank_name");
            bankcard.field_bankcardTypeName = jSONObject.optString("bankacc_type_name");
            bankcard.field_bankcardType = jSONObject.getString("bank_type");
            bankcard.field_bindSerial = jSONObject.optString("bind_serial");
            int optInt = jSONObject.optInt("default_card_state", 0);
            bankcard.field_defaultCardState = optInt;
            Log.m105925i("MicroMsg.BankcardParser", "bankcard bind_serial: %s，default stats：%s", bankcard.field_bindSerial, Integer.valueOf(optInt));
            bankcard.f209413h2 = jSONObject.optString("h_bind_serialno");
            if (2 == jSONObject.optInt("bankacc_type", 0)) {
                bankcard.field_cardType |= 2;
            }
            if (!"NORMAL".equals(jSONObject.optString("extra_bind_flag"))) {
                bankcard.field_cardType |= 4;
            }
            if ("QMF".equals(bankcard.field_bankcardType)) {
                bankcard.field_cardType |= 128;
                JSONObject optJSONObject = jSONObject.optJSONObject("qmfCardInfo");
                if (optJSONObject != null) {
                    bankcard.f209428w2 = optJSONObject.optLong("total_credit_line", 0);
                    bankcard.f209429x2 = optJSONObject.optLong("use_credit_line", 0);
                    bankcard.f209430y2 = optJSONObject.optLong("unuse_credit_line", 0);
                    bankcard.f209431z2 = optJSONObject.optString("payer_username", "");
                    bankcard.f209388A2 = optJSONObject.optInt("hide_credit_line", 0);
                    bankcard.f209389B2 = optJSONObject.optInt("card_type", 0);
                    bankcard.f209390C2 = optJSONObject.optString("card_type_name", "");
                    bankcard.f209391D2 = optJSONObject.optString("icon_url", "");
                }
            }
            String decode = URLDecoder.decode(jSONObject.optString("mobile").replaceAll("x", "%"), "utf-8");
            bankcard.field_mobile = decode;
            if (Util.isNullOrNil(decode)) {
                bankcard.field_mobile = jSONObject.optString("mobile_mask");
            }
            bankcard.field_onceQuotaKind = jSONObject.optDouble("once_quota_3") / 100.0d;
            bankcard.field_onceQuotaVirtual = jSONObject.optDouble("once_quota_1") / 100.0d;
            bankcard.field_dayQuotaKind = jSONObject.optDouble("day_quota_3") / 100.0d;
            bankcard.field_dayQuotaVirtual = jSONObject.optDouble("day_quota_1") / 100.0d;
            String optString = jSONObject.optString("bind_tail");
            bankcard.field_bankcardTail = optString;
            if (Util.isNullOrNil(optString)) {
                bankcard.field_bankcardTail = jSONObject.optString("card_tail");
            }
            bankcard.f209410e2 = jSONObject.optString("card_mask");
            bankcard.field_forbidWord = jSONObject.optString("forbid_word");
            bankcard.field_repay_url = jSONObject.optString("repay_url");
            bankcard.field_wxcreditState = 2;
            if (!Util.isNullOrNil(bankcard.field_forbidWord)) {
                bankcard.field_bankcardState = 8;
            } else if (1 == jSONObject.optInt("expired_flag", 0)) {
                bankcard.field_bankcardState = 1;
            } else if (jSONObject.optInt("bank_flag", 1) == 0) {
                bankcard.field_bankcardState = 2;
            } else {
                bankcard.field_bankcardState = 0;
            }
            if (Util.isEqual("FQF", bankcard.field_bankcardType)) {
                bankcard.field_cardType |= 256;
                JSONObject optJSONObject2 = jSONObject.optJSONObject("fqf_info");
                if (optJSONObject2 != null) {
                    bankcard.f209395H2 = optJSONObject2.optString("fqf_pay_desk_title", "");
                    bankcard.f209396I2 = optJSONObject2.optString("fqf_title", "");
                    bankcard.f209397J2 = optJSONObject2.optString("fqf_sub_title", "");
                }
            }
            bankcard.f209398K2 = jSONObject.optString("tinyapp_username", "");
            bankcard.f209399L2 = jSONObject.optString("tinyapp_path", "");
            bankcard.field_bankPhone = jSONObject.optString("bank_phone");
            bankcard.field_fetchArriveTime = jSONObject.optLong("fetch_pre_arrive_time") * 1000;
            bankcard.field_fetchArriveTimeWording = jSONObject.optString("fetch_pre_arrive_time_wording");
            int optInt2 = jSONObject.optInt("bank_card_tag", 1);
            bankcard.field_bankcardTag = optInt2;
            if (optInt2 == 2) {
                bankcard.field_cardType |= 1;
            }
            String optString2 = jSONObject.optString("support_micropay");
            if (TextUtils.isEmpty(optString2)) {
                bankcard.field_support_micropay = true;
            }
            if ("1".equals(optString2)) {
                bankcard.field_support_micropay = true;
            } else if ("0".equals(optString2)) {
                bankcard.field_support_micropay = false;
            }
            bankcard.field_arrive_type = jSONObject.optString("arrive_type");
            bankcard.field_avail_save_wording = jSONObject.optString("avail_save_wording");
            Log.m105924i("MicroMsg.BankcardParser", "getBalance() support_micropay:" + jSONObject.optString("support_micropay"));
            int optInt3 = jSONObject.optInt("fetch_charge_rate", 0);
            Log.m105924i("MicroMsg.BankcardParser", "fetch_charge_rate:" + optInt3);
            bankcard.field_fetch_charge_rate = ((double) optInt3) / 10000.0d;
            Log.m105924i("MicroMsg.BankcardParser", "field_fetch_charge_rate:" + bankcard.field_fetch_charge_rate);
            int optInt4 = jSONObject.optInt("full_fetch_charge_fee", 0);
            Log.m105924i("MicroMsg.BankcardParser", "full_fetch_charge_fee:" + bankcard.field_full_fetch_charge_fee);
            bankcard.field_full_fetch_charge_fee = ((double) optInt4) / 100.0d;
            bankcard.field_fetch_charge_info = jSONObject.optString("fetch_charge_info");
            bankcard.field_tips = jSONObject.optString("tips");
            bankcard.field_forbid_title = jSONObject.optString("forbid_title");
            bankcard.field_forbid_url = jSONObject.optString("forbid_url");
            bankcard.field_no_micro_word = jSONObject.optString("no_micro_word");
            bankcard.field_card_bottom_wording = jSONObject.optString("card_bottom_wording");
            bankcard.field_support_lqt_turn_in = jSONObject.optInt("support_lqt_turn_in", 0);
            bankcard.field_support_lqt_turn_out = jSONObject.optInt("support_lqt_turn_out", 0);
            bankcard.field_is_hightlight_pre_arrive_time_wording = jSONObject.optInt("is_hightlight_pre_arrive_time_wording", 0);
            bankcard.f209392E2 = jSONObject.optInt("support_foreign_mobile", 0);
            bankcard.field_card_state_name = jSONObject.optString("card_state_name");
            bankcard.f209393F2 = jSONObject.optString("card_fetch_wording");
            bankcard.f209394G2 = jSONObject.optLong("card_min_charge_fee");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("prompt_info");
            if (optJSONObject3 != null) {
                bankcard.field_prompt_info_prompt_text = optJSONObject3.optString("prompt_text");
                bankcard.field_prompt_info_jump_text = optJSONObject3.optString("jump_text");
                bankcard.field_prompt_info_jump_url = optJSONObject3.optString("jump_url");
            }
            String optString3 = jSONObject.optString("fetch_limit_title");
            bankcard.f209400M2 = optString3;
            if (!Util.isNullOrNil(optString3)) {
                bankcard.f209401N2 = jSONObject.optString("fetch_limit_popup_title");
                bankcard.f209402O2 = jSONObject.optString("fetch_limit_popup_wording");
                JSONArray optJSONArray = jSONObject.optJSONArray("fetch_limit_array");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    bankcard.f209403P2 = new ArrayList<>();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        bankcard.f209403P2.add(i, optJSONArray.optString(i));
                    }
                }
            }
            String optString4 = jSONObject.optString("fetch_limit_recommend_wording");
            bankcard.f209404Q2 = optString4;
            if (!Util.isNullOrNil(optString4)) {
                bankcard.f209405R2 = jSONObject.optString("fetch_limit_recommend_bank_logo");
                bankcard.f209407T2 = jSONObject.optString("fetch_limit_recommend_action_wording");
                bankcard.f209406S2 = jSONObject.optInt("fetch_limit_recommend_action", 0);
                JSONArray optJSONArray2 = jSONObject.optJSONArray("fetch_limit_recommend_bind_serial");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    bankcard.f209408U2 = new ArrayList<>();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        bankcard.f209408U2.add(i2, optJSONArray2.optString(i2));
                    }
                }
            }
            m79457e(bankcard, jSONObject);
            m79456d(bankcard, jSONObject);
            m79458f(bankcard);
            return bankcard;
        } catch (JSONException e) {
            Log.m105924i("MicroMsg.BankcardParser", "parseJson() JSONException:" + e.getMessage());
            Log.printErrStackTrace("MicroMsg.BankcardParser", e, "", new Object[0]);
            return null;
        } catch (UnsupportedEncodingException e2) {
            Log.m105924i("MicroMsg.BankcardParser", "parseJson() UnsupportedEncodingException :" + e2.getMessage());
            Log.printErrStackTrace("MicroMsg.BankcardParser", e2, "", new Object[0]);
            return null;
        } catch (Exception e3) {
            Log.m105924i("MicroMsg.BankcardParser", "parseJson() Exception:" + e3.getMessage());
            Log.printErrStackTrace("MicroMsg.BankcardParser", e3, "", new Object[0]);
            return null;
        }
    }
}
