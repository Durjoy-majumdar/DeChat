package b63;

import android.text.TextUtils;
import b63.C67176b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C7088m0;
import com.tencent.p014mm.wallet_core.p137ui.C45129w;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import te3.C49815i9;
import te3.C49961j9;
import te3.C64485k53;
import te3.C77938h9;
import te3.C77951j53;
import te3.C77959ki3;
import ub3.C78144b;

/* renamed from: b63.n0 */
public class C67196n0 {
    /* renamed from: a */
    public static Bankcard m79474a(JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_BALANCE_ENTRANCE_INFO_STRING_SYNC;
        Class<C78144b> cls = C78144b.class;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WALLET_BALANCE_MENU_INFO_STRING_SYNC;
        Object[] objArr = new Object[1];
        objArr[0] = jSONObject2 == null ? "" : jSONObject2;
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "Bankcard getBalance %s", objArr);
        if (jSONObject2 == null || jSONObject.length() <= 0) {
            Log.m105924i("MicroMsg.WalletQueryBankcardParser", "getBalance() json == null or json.length() == 0");
            return null;
        }
        Bankcard bankcard = new Bankcard(1);
        C72994y1.C72995a aVar3 = aVar;
        Class<C78144b> cls2 = cls;
        C67194m0 m0Var = r10;
        C67194m0 m0Var2 = new C67194m0(jSONObject2.optLong("time_out", 7200), jSONObject2.optLong("balance_version", -1), (long) jSONObject2.optInt("avail_balance"), bankcard);
        Pattern pattern = C75228t.f221346a;
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C45129w(new String[]{"wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance"}, m0Var), (String) null));
        bankcard.f209415j2 = C75228t.m90250i(jSONObject2.optString("avail_balance", "0"), "100", 2, RoundingMode.HALF_UP);
        bankcard.f209416k2 = jSONObject2.optString("balance_show_wording");
        bankcard.f209421p2 = jSONObject2.optString("max_fetch_wording");
        bankcard.f209422q2 = jSONObject2.optString("avail_fetch_wording");
        bankcard.f209417l2 = C75228t.m90250i(jSONObject2.optString("fetch_balance", "0"), "100", 2, RoundingMode.HALF_UP);
        bankcard.field_cardType |= 8;
        bankcard.field_bankcardType = jSONObject2.optString("balance_bank_type");
        bankcard.field_bindSerial = jSONObject2.optString("balance_bind_serial");
        int optInt = jSONObject2.optInt("default_card_state", 0);
        bankcard.field_defaultCardState = optInt;
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "balance default stats：%s", Integer.valueOf(optInt));
        String optString = jSONObject2.optString("balance_forbid_word");
        bankcard.field_forbidWord = optString;
        if (!Util.isNullOrNil(optString)) {
            bankcard.field_bankcardState = 8;
        } else {
            bankcard.field_bankcardState = 0;
        }
        bankcard.field_fetchArriveTime = jSONObject2.optLong("fetch_arrive_time");
        bankcard.field_mobile = jSONObject2.optString("mobile");
        bankcard.field_support_micropay = jSONObject2.optInt("support_micropay", 0) == 1;
        Log.m105924i("MicroMsg.WalletQueryBankcardParser", "getBalance() support_micropay:" + jSONObject2.optInt("support_micropay", 0));
        String optString2 = jSONObject2.optString("balance_list_url");
        bankcard.f209418m2 = optString2;
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "carson balance_list_url: %s", optString2);
        String string = MMApplicationContext.getContext().getString(C0966R.string.kkn);
        bankcard.field_desc = string;
        bankcard.field_bankName = string;
        bankcard.field_bankcardTail = "10000";
        bankcard.field_forbid_title = jSONObject2.optString("forbid_title");
        bankcard.field_forbid_url = jSONObject2.optString("forbid_url");
        JSONObject optJSONObject = jSONObject2.optJSONObject("prompt_info");
        if (optJSONObject != null) {
            bankcard.field_prompt_info_prompt_text = optJSONObject.optString("prompt_text");
            bankcard.field_prompt_info_jump_text = optJSONObject.optString("jump_text");
            bankcard.field_prompt_info_jump_url = optJSONObject.optString("jump_url");
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("balance_menu_info");
        if (optJSONObject2 != null) {
            String jSONObject3 = optJSONObject2.toString();
            Log.m105919d("MicroMsg.WalletQueryBankcardParser", "balance menu info: %s", jSONObject3);
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, jSONObject3);
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, "");
        }
        if (i == 10) {
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("lqp_entrance_info");
            if (optJSONObject3 != null) {
                String jSONObject4 = optJSONObject3.toString();
                Log.m105919d("MicroMsg.WalletQueryBankcardParser", "balance entrance info: %s", jSONObject4);
                ((C78144b) C86312j.m106911c(cls2)).mo107980OI().mo119993e(aVar3, jSONObject4);
            } else {
                ((C78144b) C86312j.m106911c(cls2)).mo107980OI().mo119993e(aVar3, "");
            }
        }
        return bankcard;
    }

    /* renamed from: b */
    public static Bankcard m79475b(C77938h9 h9Var) {
        int i;
        C77938h9 h9Var2 = h9Var;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_BALANCE_MENU_INFO_STRING_SYNC;
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "Bankcard getBalance from balance info %s", h9Var2);
        if (h9Var2 == null) {
            return null;
        }
        Bankcard bankcard = new Bankcard(1);
        C67194m0 m0Var = r6;
        C67194m0 m0Var2 = new C67194m0((long) h9Var2.f227542u, h9Var2.f227541t, Util.getLong(h9Var2.f227533i, 0), bankcard);
        Pattern pattern = C75228t.f221346a;
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C45129w(new String[]{"wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance"}, m0Var), (String) null));
        bankcard.f209415j2 = C75228t.m90250i(h9Var2.f227533i, "100", 2, RoundingMode.HALF_UP);
        bankcard.f209416k2 = h9Var2.f227546y;
        bankcard.f209421p2 = h9Var2.f227540s;
        bankcard.f209422q2 = h9Var2.f227539r;
        bankcard.f209417l2 = C75228t.m90250i(h9Var2.f227535n, "100", 2, RoundingMode.HALF_UP);
        bankcard.field_cardType |= 8;
        bankcard.field_bankcardType = h9Var2.f227529e;
        bankcard.field_bindSerial = h9Var2.f227530f;
        String str = h9Var2.f227531g;
        bankcard.field_forbidWord = str;
        if (!Util.isNullOrNil(str)) {
            bankcard.field_bankcardState = 8;
        } else {
            bankcard.field_bankcardState = 0;
        }
        bankcard.field_mobile = h9Var2.f227536o;
        bankcard.field_support_micropay = Util.getInt(h9Var2.f227537p, 0) == 1;
        Log.m105924i("MicroMsg.WalletQueryBankcardParser", "getBalance() support_micropay:" + h9Var2.f227537p);
        bankcard.f209418m2 = h9Var2.f227538q;
        String string = MMApplicationContext.getContext().getString(C0966R.string.kkn);
        bankcard.field_desc = string;
        bankcard.field_bankName = string;
        bankcard.field_bankcardTail = "10000";
        bankcard.field_forbid_title = h9Var2.f227544w;
        bankcard.field_forbid_url = h9Var2.f227545x;
        C77959ki3 ki32 = h9Var2.f227527B;
        if (ki32 != null) {
            bankcard.field_prompt_info_prompt_text = ki32.f227742d;
            bankcard.field_prompt_info_jump_text = ki32.f227743e;
            bankcard.field_prompt_info_jump_url = ki32.f227744f;
        }
        C49815i9 i9Var = h9Var2.f227526A;
        if (i9Var != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_show_menu", i9Var.f135175d);
                LinkedList<C49961j9> linkedList = i9Var.f135176e;
                JSONArray jSONArray = new JSONArray();
                for (C49961j9 next : linkedList) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, next.f135931d);
                    jSONObject2.put("jump_type", next.f135932e);
                    jSONObject2.put("jump_h5_url", next.f135933f);
                    jSONObject2.put("tinyapp_username", next.f135934g);
                    jSONObject2.put("tinyapp_path", next.f135935h);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("balance_menu_item", jSONArray);
                i = 1;
            } catch (Exception e) {
                i = 1;
                Log.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", e, "Bankcard getBalance from balance, assemble menuInfoJson error: %s", e.getMessage());
            }
            Object[] objArr = new Object[i];
            objArr[0] = jSONObject.toString();
            Log.m105919d("MicroMsg.WalletQueryBankcardParser", "balance menu info: %s", objArr);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, jSONObject.toString());
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
        }
        return bankcard;
    }

    /* renamed from: c */
    public static C67176b m79476c(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is null");
            return null;
        }
        Log.m105920e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is valid");
        C67176b bVar = new C67176b();
        bVar.f192848a = jSONObject.optString("fetch_charge_title");
        Log.m105924i("MicroMsg.WalletQueryBankcardParser", "fetch_charge_title:" + bVar.f192848a);
        if (z) {
            Log.m105924i("MicroMsg.WalletQueryBankcardParser", "isBindQuery true");
            bVar.f192851d = jSONObject.optInt("is_cal_charge", 0);
            bVar.f192850c = jSONObject.optInt("is_show_charge", 0);
            bVar.f192852e = jSONObject.optInt("is_full_fetch_direct", 0);
            bVar.f192854g = C75228t.m90250i(jSONObject.optString("min_charge_fee", "0"), "100", 2, RoundingMode.HALF_UP);
            bVar.f192853f = C75228t.m90250i(jSONObject.optString("remain_fee", "0"), "100", 2, RoundingMode.HALF_UP);
            bVar.f192855h = jSONObject.optString("card_list_wording_title", "");
            bVar.f192856i = jSONObject.optString("card_list_wording_content", "");
            if (jSONObject.has("withdraw_sector")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("withdraw_sector");
                C67176b.C67177a aVar = new C67176b.C67177a();
                if (optJSONObject != null) {
                    try {
                        optJSONObject.optString("sector_title", "");
                        JSONArray optJSONArray = optJSONObject.optJSONArray("label");
                        if (optJSONArray != null) {
                            aVar.f192858a = new C67176b.C67179c[optJSONArray.length()];
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                                C67176b.C67179c cVar = new C67176b.C67179c();
                                cVar.f192861a = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                                cVar.f192862b = jSONObject2.optString("desc", "");
                                jSONObject2.optString("logo_url", "");
                                cVar.f192863c = jSONObject2.optInt("jump_type");
                                cVar.f192864d = jSONObject2.optString("jump_url", "");
                                cVar.f192865e = jSONObject2.optString("username", "");
                                cVar.f192866f = jSONObject2.optString("path", "");
                                aVar.f192858a[i] = cVar;
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                bVar.f192857j = aVar;
            }
            Log.m105924i("MicroMsg.WalletQueryBankcardParser", " is_cal_charge:" + bVar.f192851d + " is_show_charge:" + bVar.f192850c + " min_charge_fee:" + bVar.f192854g + " remain_fee:" + bVar.f192853f + " is_full_fetch_direct:" + bVar.f192852e);
        } else {
            Log.m105924i("MicroMsg.WalletQueryBankcardParser", "isBindQuery false");
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("item");
        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
            Log.m105920e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), itemJsonArray is null");
        } else {
            bVar.f192849b = new LinkedList<>();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    C67176b.C67178b bVar2 = new C67176b.C67178b();
                    bVar2.f192859a = optJSONObject2.optString("key");
                    bVar2.f192860b = optJSONObject2.optString("value");
                    Log.m105924i("MicroMsg.WalletQueryBankcardParser", "feeItem.key is " + bVar2.f192859a + " , feeItem.value is " + bVar2.f192860b);
                    if (!TextUtils.isEmpty(bVar2.f192859a) && !TextUtils.isEmpty(bVar2.f192860b)) {
                        bVar.f192849b.add(bVar2);
                    }
                } else {
                    Log.m105920e("MicroMsg.WalletQueryBankcardParser", "item index " + i2 + " is empty");
                }
            }
            Log.m105924i("MicroMsg.WalletQueryBankcardParser", "itemsList size is " + bVar.f192849b.size());
        }
        return bVar;
    }

    /* renamed from: d */
    public static C28269p m79477d(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo json is null");
            return null;
        }
        Log.m105924i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo()");
        C28269p pVar = new C28269p();
        pVar.field_title = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        pVar.field_loan_jump_url = jSONObject.optString("loan_jump_url");
        Log.m105924i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo() field_loan_jump_url:" + pVar.field_loan_jump_url);
        pVar.field_is_show_entry = jSONObject.optInt("is_show_entry", 0);
        pVar.field_tips = jSONObject.optString("tips");
        pVar.field_is_overdue = jSONObject.optInt("is_overdue", 0);
        if (jSONObject.has("available_otb")) {
            pVar.field_available_otb = C75228t.m90258m(jSONObject.optDouble("available_otb") / 100.0d, "CNY");
        }
        if (jSONObject.has(FirebaseAnalytics.C113379b.INDEX)) {
            pVar.field_red_dot_index = jSONObject.optInt(FirebaseAnalytics.C113379b.INDEX);
        }
        Log.m105924i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo() field_index:" + pVar.field_red_dot_index + "  field_is_overdue:" + pVar.field_is_overdue + "  field_is_show_entry:" + pVar.field_is_show_entry);
        return pVar;
    }

    /* renamed from: e */
    public static Bankcard m79478e(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.WalletQueryBankcardParser", "getLqtInfo, json object is null!");
            return null;
        }
        boolean z = true;
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "now get getLqtInfo: %s", jSONObject.toString());
        Bankcard bankcard = new Bankcard(1);
        bankcard.field_bankcardType = jSONObject.optString("lqt_bank_type");
        bankcard.field_bindSerial = jSONObject.optString("lqt_bind_serial");
        int optInt = jSONObject.optInt("default_card_state", 0);
        bankcard.field_defaultCardState = optInt;
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "lqt default stats：%s", Integer.valueOf(optInt));
        bankcard.field_bankName = jSONObject.optString("lqt_bank_name");
        bankcard.f209415j2 = ((double) jSONObject.optLong("total_balance")) / 100.0d;
        bankcard.f209417l2 = ((double) jSONObject.optLong("avail_balance")) / 100.0d;
        C67183e eVar = new C67183e();
        bankcard.f209427v2 = eVar;
        eVar.f192875a = jSONObject.optString("lqt_logo_url");
        bankcard.field_forbidWord = jSONObject.optString("lqt_forbid_word");
        bankcard.field_forbid_title = jSONObject.optString("forbid_title");
        bankcard.field_forbid_url = jSONObject.optString("forbid_url");
        bankcard.f209416k2 = jSONObject.optString("lqt_show_wording");
        bankcard.field_mobile = jSONObject.optString("mobile");
        if (jSONObject.optInt("support_micropay", 0) != 1) {
            z = false;
        }
        bankcard.field_support_micropay = z;
        bankcard.field_cardType |= 64;
        if (Util.isNullOrNil(bankcard.field_bankName)) {
            bankcard.field_bankName = MMApplicationContext.getContext().getString(C0966R.string.f361576kz1);
        }
        bankcard.field_desc = bankcard.field_bankName;
        if (!Util.isNullOrNil(bankcard.field_forbidWord)) {
            bankcard.field_bankcardState = 8;
        } else {
            bankcard.field_bankcardState = 0;
        }
        return bankcard;
    }

    /* renamed from: f */
    public static C67203r0 m79479f(JSONObject jSONObject, int i) {
        Class cls = C79173v.class;
        Log.m105924i("MicroMsg.WalletQueryBankcardParser", "getUserInfo()");
        C67203r0 r0Var = new C67203r0();
        if (jSONObject == null || jSONObject.length() <= 0) {
            Log.m105920e("MicroMsg.WalletQueryBankcardParser", "getUserInfo() json == null or json.length() == 0");
            return null;
        }
        r0Var.field_is_reg = jSONObject.getInt("is_reg");
        r0Var.field_true_name = jSONObject.optString("true_name");
        r0Var.field_cre_type = jSONObject.optInt("cre_type", -1);
        String optString = jSONObject.optString("last_card_bind_serialno");
        r0Var.field_main_card_bind_serialno = optString;
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "mUserInfo.field_main_card_bind_serialno ：%s", optString);
        r0Var.field_cre_name = jSONObject.optString("cre_name");
        r0Var.field_ftf_pay_url = jSONObject.optString("transfer_url");
        r0Var.field_reset_passwd_flag = jSONObject.optString("reset_passwd_flag");
        r0Var.field_find_passwd_url = jSONObject.optString("reset_passwd_url");
        r0Var.field_forget_passwd_url = jSONObject.optString("forget_passwd_url");
        ((C79173v) C86312j.m106911c(cls)).Ex0().mo91314D(r0Var.field_main_card_bind_serialno);
        r0Var.field_isDomesticUser = "2".equals(jSONObject.optString("icard_user_flag", "2"));
        r0Var.field_authen_account_type = jSONObject.optInt("authen_account_type", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("touch_info");
        if (optJSONObject != null) {
            r0Var.field_is_open_touch = optJSONObject.optInt("is_open_touch", 0);
            r0Var.field_soter_pay_open_type = optJSONObject.optInt("soter_pay_open_type", 0);
            Log.m105919d("MicroMsg.WalletQueryBankcardParser", "getUserInfo field_is_open_touch() is %s, %s", Integer.valueOf(r0Var.field_is_open_touch), Integer.valueOf(r0Var.field_soter_pay_open_type));
        } else {
            Log.m105920e("MicroMsg.WalletQueryBankcardParser", "touch_info is null ");
            r0Var.field_is_open_touch = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91340v() ? 1 : 0;
            r0Var.field_soter_pay_open_type = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91317G();
            Log.m105920e("MicroMsg.WalletQueryBankcardParser", "old field_is_open_touch is " + r0Var.field_is_open_touch);
        }
        r0Var.field_lct_wording = jSONObject.optString("lct_wording");
        r0Var.field_lct_url = jSONObject.optString("lct_url");
        Log.m105924i("MicroMsg.WalletQueryBankcardParser", "field_lct_wording: " + r0Var.field_lct_wording + ", field_lct_url:" + r0Var.field_lct_url);
        r0Var.field_lqt_state = jSONObject.optInt("lqt_state", -1);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("lqb_show_info");
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "field_lqt_state: %s, lqb_show_info: %s", Integer.valueOf(r0Var.field_lqt_state), optJSONObject2);
        if (optJSONObject2 != null) {
            r0Var.field_is_show_lqb = optJSONObject2.optInt("is_show_lqb");
            r0Var.field_is_open_lqb = optJSONObject2.optInt("is_open_lqb");
            r0Var.field_lqb_open_url = optJSONObject2.optString("lqb_open_url");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("lqt_cell_info");
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "lqt_cell_info: %s", optJSONObject3);
        if (optJSONObject3 != null) {
            r0Var.field_lqt_cell_is_show = optJSONObject3.optInt("is_show_cell");
            r0Var.field_lqt_cell_icon = optJSONObject3.optString("cell_icon");
            r0Var.field_lqt_cell_is_open_lqt = optJSONObject3.optInt("is_open_lqt");
            r0Var.field_lqt_cell_lqt_open_url = optJSONObject3.optString("lqt_open_url");
            r0Var.field_lqt_cell_lqt_title = optJSONObject3.optString("lqt_title");
            r0Var.field_lqt_cell_lqt_wording = optJSONObject3.optString("lqt_wording");
        }
        if (m79481h(i) || i == 3 || i == 4) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_LQT_OPEN_FLAG_INT_SYNC, Integer.valueOf(r0Var.field_lqt_state));
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_LQT_ENTRY_WORDING_STRING_SYNC, r0Var.field_lct_wording);
        }
        return r0Var;
    }

    /* renamed from: g */
    public static ArrayList<Bankcard> m79480g(JSONArray jSONArray) {
        ArrayList<Bankcard> arrayList = new ArrayList<>();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Bankcard bankcard = new Bankcard();
                bankcard.field_cardType |= 4;
                bankcard.field_bankName = jSONObject.getString("bank_name");
                bankcard.field_bankcardType = jSONObject.getString("bank_type");
                bankcard.field_bankcardTypeName = jSONObject.optString("bankacc_type_name");
                bankcard.f209410e2 = jSONObject.getString("card_id");
                bankcard.field_bizUsername = jSONObject.getString("app_username");
                int i2 = jSONObject.getInt("card_status");
                bankcard.field_wxcreditState = i2;
                if (i2 != 2) {
                    bankcard.field_bankcardState = 9;
                } else {
                    bankcard.field_bankcardState = 0;
                }
                bankcard.field_desc = MMApplicationContext.getContext().getString(C0966R.string.lbu, new Object[]{bankcard.field_bankName, bankcard.field_bankcardTail});
                C67183e eVar = new C67183e();
                bankcard.f209427v2 = eVar;
                eVar.f192875a = jSONObject.getString("logo_url");
                bankcard.f209427v2.f192876b = jSONObject.getString("background_logo_url");
                bankcard.f209427v2.f192877c = jSONObject.getString("big_logo_url");
                arrayList.add(bankcard);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static boolean m79481h(int i) {
        return i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17 || i == 18 || i == 19 || i == 20 || i == 21 || i == 22 || i == 23;
    }

    /* renamed from: i */
    public static List<C67180c> m79482i(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("bankinfo_array");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        C67180c cVar = new C67180c();
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        cVar.f192867a = jSONObject2.optString("bind_serial");
                        cVar.f192868b = jSONObject2.optString("polling_forbid_word");
                        arrayList.add(cVar);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", e, "", new Object[0]);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static C77951j53 m79483j(JSONObject jSONObject) {
        if (jSONObject.has("guide_bar")) {
            try {
                C77951j53 j532 = new C77951j53();
                JSONObject optJSONObject = jSONObject.optJSONObject("guide_bar");
                j532.f227645d = optJSONObject.optInt("guide_type");
                if (optJSONObject.has("guide_data")) {
                    j532.f227646e = new C64485k53();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("guide_data");
                    j532.f227646e.f183895d = optJSONObject2.optString("bind_serial");
                }
                j532.f227647f = optJSONObject.optInt("is_show_guide");
                j532.f227648g = optJSONObject.optString("guide_content");
                j532.f227649h = optJSONObject.optString("guide_content_color");
                j532.f227650i = optJSONObject.optString("guide_btn_text");
                j532.f227651j = optJSONObject.optString("guide_btn_text_color");
                j532.f227652n = optJSONObject.optString("guide_btn_bg_color");
                j532.f227653o = optJSONObject.optString("guide_logo");
                j532.f227654p = optJSONObject.optString("background_color");
                j532.f227655q = optJSONObject.optString("attach_info_left_wording");
                j532.f227656r = optJSONObject.optString("attach_info_right_wording");
                j532.f227657s = optJSONObject.optInt("btn_jump_mode");
                j532.f227658t = optJSONObject.optString("btn_jump_h5");
                j532.f227659u = optJSONObject.optString("btn_jump_tinyapp_username");
                j532.f227660v = optJSONObject.optString("btn_jump_tinyapp_path");
                j532.f227661w = optJSONObject.optString("dark_guide_btn_text_color");
                j532.f227662x = optJSONObject.optString("dark_guide_btn_bg_color");
                j532.f227663y = optJSONObject.optString("dark_background_color");
                return j532;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WalletQueryBankcardParser", "parseOfflineGuideBar Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: k */
    public static void m79484k(JSONObject jSONObject, int i, boolean z, boolean z2) {
        String str;
        Bankcard bankcard;
        C67176b bVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        boolean z3 = z;
        Class cls = C79173v.class;
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard(): %s, %s", Integer.valueOf(i), Boolean.valueOf(z));
        try {
            long optLong = jSONObject2.optLong("time_stamp");
            if (optLong > 0) {
                C7088m0.m7308b("" + optLong);
            } else {
                Log.m105928w("MicroMsg.WalletQueryBankcardParser", "no time_stamp at WalletQueryBankcardParser.");
            }
            C67203r0 f = m79479f(jSONObject2.getJSONObject("user_info"), i2);
            if (z3) {
                f.field_switchConfig = jSONObject2.getJSONObject("switch_info").getInt("switch_bit");
            } else {
                f.field_switchConfig = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_switchConfig;
            }
            int optInt = jSONObject2.optInt("paymenu_use_new");
            f.field_paymenu_use_new = optInt;
            Log.m105925i("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard, paymenu_use_new: %s", Integer.valueOf(optInt));
            String optString = jSONObject2.optString("support_bank_word");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_SUPPORT_BANK_WORD_STRING, Util.nullAsNil(optString));
            JSONArray optJSONArray = jSONObject2.optJSONArray("Array");
            Log.m105925i("MicroMsg.WalletQueryBankcardParser", "getBankcards()：%s", optJSONArray);
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    Bankcard c = C67181d.m79454a().mo91284c(optJSONArray.getJSONObject(i3));
                    if (c != null) {
                        C67181d.m79458f(c);
                        arrayList.add(c);
                    }
                }
            }
            ArrayList<Bankcard> g = m79480g(jSONObject2.optJSONArray("virtual_card_array"));
            Bankcard a = m79474a(jSONObject2.optJSONObject("balance_info"), i2);
            if (a != null && i2 == 10) {
                Log.m105925i("MicroMsg.WalletQueryBankcardParser", "carson: entry_url: %s、entry_word：%s", a.f209419n2, a.f209420o2);
                JSONObject optJSONObject = jSONObject2.optJSONObject("bill_entry");
                if (optJSONObject != null) {
                    a.f209419n2 = optJSONObject.optString("entry_url");
                    a.f209420o2 = optJSONObject.optString("entry_word");
                }
            }
            int optInt2 = jSONObject2.optInt("query_cache_time");
            Log.m105925i("MicroMsg.WalletQueryBankcardParser", "hy: cache time: %d", Integer.valueOf(optInt2));
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("complex_switch_info");
            if (optJSONObject2 != null) {
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("bind_newcard_switch");
                optJSONObject3.optInt("forbid_bind_card");
                optJSONObject3.optString("forbid_word");
            }
            C67185g.m79463a().mo91289c(optJSONObject2);
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("history_card_array");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                Log.m105920e("MicroMsg.WalletQueryBankcardParser", "getHistroyBankcard() json == null or json.length() == 0");
                bankcard = null;
            } else {
                bankcard = C67181d.m79454a().mo91284c(optJSONArray2.getJSONObject(0));
                int i4 = bankcard.field_cardType;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = Bankcard.f209387V2;
                bankcard.field_cardType = i4 | 16;
            }
            Bankcard bankcard2 = bankcard;
            m79486m(jSONObject);
            JSONObject optJSONObject4 = jSONObject2.optJSONObject("bank_priority");
            if (optJSONObject4 != null) {
                f.field_bank_priority = optJSONObject4.toString();
            }
            List<C67180c> i5 = m79482i(optJSONObject4);
            f.field_unipay_order_state = jSONObject2.optInt("unipayorderstate", 0);
            m79485l(jSONObject2, f, z3);
            if (z2) {
                ((C79173v) C86312j.m106911c(cls)).Ex0().mo91316F(m79483j(jSONObject));
            }
            jSONObject2.optString("query_order_time");
            C28269p d = m79477d(jSONObject2.optJSONObject("loan_entry_info"));
            JSONObject optJSONObject5 = jSONObject2.optJSONObject("fetch_info");
            C67176b bVar2 = ((C79173v) C86312j.m106911c(cls)).Ex0().f192958k;
            str = "";
            try {
                Log.m105919d("MicroMsg.WalletQueryBankcardParser", "fetchInfo: %s", bVar2);
                if (optJSONObject5 != null) {
                    bVar = m79476c(optJSONObject5, true);
                } else {
                    Log.m105920e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard() fetch_info is null");
                    bVar = bVar2;
                }
                Bankcard e = m79478e(jSONObject2.optJSONObject("lqt_info"));
                if (i2 == 4) {
                    Log.m105918d("MicroMsg.WalletQueryBankcardParser", "update fetch scene data");
                    C67205s0 Ex0 = ((C79173v) C86312j.m106911c(cls)).Ex0();
                    jSONObject2.optInt("is_use_dynamic_free_fee");
                    Ex0.getClass();
                    C67205s0 Ex02 = ((C79173v) C86312j.m106911c(cls)).Ex0();
                    jSONObject2.optInt("dynamic_free_fee_hold_time");
                    Ex02.getClass();
                }
                ((C79173v) C86312j.m106911c(cls)).Ex0().mo91313C(f, arrayList, g, a, bankcard2, d, bVar, e, optInt2, i, i5);
            } catch (Exception e2) {
                e = e2;
                Log.m105920e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard Exception :" + e.getMessage());
                Log.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", e, str, new Object[0]);
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            Log.m105920e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard Exception :" + e.getMessage());
            Log.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", e, str, new Object[0]);
        }
    }

    /* renamed from: l */
    public static void m79485l(JSONObject jSONObject, C67203r0 r0Var, boolean z) {
        Class cls = C79173v.class;
        if (z) {
            JSONObject optJSONObject = jSONObject.optJSONObject("wallet_info");
            if (optJSONObject != null) {
                r0Var.field_wallet_balance = optJSONObject.optLong("wallet_balance", -1);
                r0Var.field_wallet_entrance_balance_switch_state = optJSONObject.optInt("wallet_entrance_balance_switch_state", -1);
                ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_NEW_BALANCE_LONG_SYNC, Long.valueOf(r0Var.field_wallet_balance));
                return;
            }
            return;
        }
        r0Var.field_wallet_balance = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_wallet_balance;
        r0Var.field_wallet_entrance_balance_switch_state = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_wallet_entrance_balance_switch_state;
    }

    /* renamed from: m */
    public static void m79486m(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("balance_notice");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("fetch_notice");
        String str = "";
        String nullAs = optJSONArray != null ? Util.nullAs(optJSONArray.toString(), str) : str;
        if (optJSONArray2 != null) {
            str = Util.nullAs(optJSONArray2.toString(), str);
        }
        Log.m105925i("MicroMsg.WalletQueryBankcardParser", "hy: balance notice: %s, fetchNotice: %s", nullAs, str);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_BALANCE_NOTICE_STRING, nullAs);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_FETCH_NOTICE_STRING, str);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }
}
