package wz0;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p823sg.C77710q;
import te3.C22498fy;
import te3.C22500hn;
import te3.C22506ko;
import te3.C22511m1;
import te3.C22513m40;
import te3.C22534xo;
import te3.C48813b60;
import te3.C52139yn;
import te3.C64680ri;
import te3.C64748ud2;
import te3.C64808wp1;
import te3.C77968n40;
import te3.g44;
import te3.ho4;
import te3.we4;

/* renamed from: wz0.h */
public class C22943h {
    /* renamed from: a */
    public static String m26964a(String str) {
        return (TextUtils.isEmpty(str) || "null".equals(str)) ? "" : str;
    }

    /* renamed from: b */
    public static C64680ri m26965b(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parseBluetoothInfo json is null");
            return null;
        }
        C64680ri riVar = new C64680ri();
        riVar.f185169d = jSONObject.optString("name");
        riVar.f185170e = jSONObject.optInt("report_time_interval", 0);
        Log.m105925i("MicroMsg.CardInfoParser", "blueToothInfo.name:%s", riVar.f185169d);
        return riVar;
    }

    /* renamed from: c */
    public static ArrayList<CardInfo> m26966c(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.CardInfoParser", "parseCardArray jsonContent is null");
            return null;
        }
        try {
            JSONArray optJSONArray = new JSONObject(str).optJSONArray("card_array");
            if (optJSONArray != null) {
                if (optJSONArray.length() != 0) {
                    ArrayList<CardInfo> arrayList = new ArrayList<>();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        CardInfo cardInfo = new CardInfo();
                        m26973j(cardInfo, optJSONObject);
                        arrayList.add(cardInfo);
                    }
                    return arrayList;
                }
            }
            Log.m105920e("MicroMsg.CardInfoParser", "parseCardArray cardItemListJson is null");
            return null;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.CardInfoParser", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public static LinkedList<C22534xo> m26967d(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        LinkedList<C22534xo> linkedList = new LinkedList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C22534xo xoVar = new C22534xo();
            xoVar.f64746d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            xoVar.f64747e = jSONObject.optString("sub_title");
            xoVar.f64748f = jSONObject.optString("tips");
            xoVar.f64749g = jSONObject.optString("url");
            xoVar.f64750h = jSONObject.optLong("show_flag");
            xoVar.f64751i = jSONObject.optString("primary_color");
            xoVar.f64752j = jSONObject.optString("secondary_color");
            xoVar.f64753n = jSONObject.optString("icon_url");
            xoVar.f64754o = jSONObject.optString("app_brand_user_name");
            xoVar.f64755p = jSONObject.optString("app_brand_pass");
            xoVar.f64756q = jSONObject.optString("finder_username");
            xoVar.f64757r = jSONObject.optString("feed_id");
            xoVar.f64758s = jSONObject.optString("nonce_id");
            linkedList.add(xoVar);
        }
        return linkedList;
    }

    /* renamed from: e */
    public static LinkedList<C22498fy> m26968e(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        LinkedList<C22498fy> linkedList = new LinkedList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            C22498fy l = m26975l(jSONArray.getJSONObject(i));
            if (l != null) {
                linkedList.add(l);
            }
        }
        return linkedList;
    }

    /* renamed from: f */
    public static LinkedList<C22511m1> m26969f(JSONArray jSONArray) {
        LinkedList<C22511m1> linkedList = new LinkedList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    C22511m1 m1Var = new C22511m1();
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    m1Var.f64198d = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
                    m1Var.f64199e = jSONObject.optString("url");
                    m1Var.f64201g = jSONObject.optString("tinyapp_path");
                    m1Var.f64200f = jSONObject.optString("tinyapp_username");
                    linkedList.add(m1Var);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.CardInfoParser", e, "", new Object[0]);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: g */
    public static C52139yn m26970g(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserannoucement json is null");
            return null;
        }
        C52139yn ynVar = new C52139yn();
        ynVar.f145413d = jSONObject.optInt("type");
        ynVar.f145414e = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
        ynVar.f145415f = jSONObject.optString("url");
        ynVar.f145416g = jSONObject.optInt("endtime");
        ynVar.f145417h = jSONObject.optInt("create_time");
        ynVar.f145418i = jSONObject.optString("thumb_url");
        return ynVar;
    }

    /* renamed from: h */
    public static C22500hn m26971h(JSONObject jSONObject) {
        LinkedList<String> linkedList = null;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserCardDataInfo json is null");
            return null;
        }
        C22500hn hnVar = new C22500hn();
        try {
            hnVar.f63942d = jSONObject.optInt("status");
            hnVar.f63943e = jSONObject.optInt("init_balance");
            hnVar.f63944f = jSONObject.optInt("init_bonus");
            JSONArray optJSONArray = jSONObject.optJSONArray("cell_list0");
            if (optJSONArray != null) {
                hnVar.f63945g = m26967d(optJSONArray);
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("cell_list1");
            if (optJSONArray2 != null) {
                hnVar.f63946h = m26967d(optJSONArray2);
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("cell_list2");
            if (optJSONArray3 != null) {
                hnVar.f63947i = m26967d(optJSONArray3);
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("acceptors");
            if (optJSONArray4 != null) {
                if (optJSONArray4.length() != 0) {
                    linkedList = new LinkedList<>();
                    for (int i = 0; i < optJSONArray4.length(); i++) {
                        linkedList.add((String) optJSONArray4.get(i));
                    }
                }
                hnVar.f63948j = linkedList;
            }
            hnVar.f63949n = jSONObject.optInt("avail_num");
            hnVar.f63951p = jSONObject.optInt("code_type");
            hnVar.f63950o = jSONObject.optString("code");
            JSONArray optJSONArray5 = jSONObject.optJSONArray("secondary_fields");
            if (optJSONArray5 != null) {
                hnVar.f63952q = m26968e(optJSONArray5);
            }
            hnVar.f63953r = jSONObject.optLong("stock_num");
            hnVar.f63954s = jSONObject.optInt("limit_num");
            hnVar.f63955t = jSONObject.optString("user_report_url");
            JSONObject optJSONObject = jSONObject.optJSONObject("third_field");
            if (optJSONObject != null) {
                hnVar.f63956u = m26975l(optJSONObject);
            }
            hnVar.f63957v = m26969f(jSONObject.optJSONArray("action_sheets"));
            JSONObject optJSONObject2 = jSONObject.optJSONObject("card_list_field");
            if (optJSONObject2 != null) {
                hnVar.f63958w = m26975l(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("operate_field");
            if (optJSONObject3 != null) {
                hnVar.f63959x = m26975l(optJSONObject3);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("limit_field");
            if (optJSONObject4 != null) {
                hnVar.f63960y = m26975l(optJSONObject4);
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("detail_table");
            if (optJSONObject5 != null) {
                hnVar.f63961z = m26977n(optJSONObject5);
            }
            hnVar.f63934A = jSONObject.optString("background_pic_url");
            JSONObject optJSONObject6 = jSONObject.optJSONObject("gifting_info_cell");
            if (optJSONObject6 != null) {
                hnVar.f63935B = m26975l(optJSONObject6);
            }
            hnVar.f63936C = jSONObject.optString("sign_number");
            JSONObject optJSONObject7 = jSONObject.optJSONObject("unavailable_qrcode_field");
            if (optJSONObject7 != null) {
                hnVar.f63937D = m26975l(optJSONObject7);
            }
            hnVar.f63938E = jSONObject.optBoolean("is_commom_card");
            hnVar.f63939F = jSONObject.optBoolean("is_location_authorized");
            hnVar.f63940G = m26975l(jSONObject.optJSONObject("finder_field"));
            hnVar.f63941H = m26975l(jSONObject.optJSONObject("feed_field"));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.CardInfoParser", e, "", new Object[0]);
        }
        return hnVar;
    }

    /* renamed from: i */
    public static void m26972i(CardInfo cardInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserCardItemJson jsonContent is null");
            return;
        }
        try {
            m26973j(cardInfo, new JSONObject(str));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.CardInfoParser", e, "", new Object[0]);
        }
    }

    /* renamed from: j */
    public static void m26973j(CardInfo cardInfo, JSONObject jSONObject) {
        g44 g44;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserCardItemJson json is null");
            return;
        }
        cardInfo.field_card_id = m26964a(jSONObject.optString("card_id"));
        cardInfo.field_card_tp_id = m26964a(jSONObject.optString("card_tp_id"));
        cardInfo.field_delete_state_flag = jSONObject.optInt("state_flag");
        cardInfo.field_updateTime = (long) jSONObject.optInt("update_time");
        cardInfo.field_updateSeq = jSONObject.optLong("sequence");
        cardInfo.field_from_username = jSONObject.optString("from_username");
        cardInfo.field_begin_time = jSONObject.optLong("begin_time", 0);
        cardInfo.field_end_time = jSONObject.optLong("end_time", 0);
        cardInfo.f51611V0 = jSONObject.optString("encrypt_code");
        JSONObject optJSONObject = jSONObject.optJSONObject("card_data_info");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("card_tp_info");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("share_info");
        cardInfo.f51608S0 = m26971h(optJSONObject);
        cardInfo.f51607R0 = m26974k(optJSONObject2);
        if (optJSONObject3 == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserShareInfo json is null");
            g44 = null;
        } else {
            g44 g442 = new g44();
            g442.f133848d = optJSONObject3.optString("gift_msg_title");
            g44 = g442;
        }
        cardInfo.f51609T0 = g44;
        C22506ko koVar = cardInfo.f51607R0;
        if (koVar != null) {
            cardInfo.f51607R0 = koVar;
            try {
                cardInfo.field_cardTpInfoData = koVar.toByteArray();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.CardInfo", "setCardTpInfo fail, ex = %s", e.getMessage());
            }
            cardInfo.field_block_mask = Integer.toString(cardInfo.f51607R0.f64104B);
            cardInfo.field_card_type = cardInfo.f51607R0.f64141i;
            if (TextUtils.isEmpty(cardInfo.field_card_tp_id)) {
                cardInfo.field_card_tp_id = cardInfo.f51607R0.f64136d;
            }
            if (cardInfo.field_begin_time == 0 && optJSONObject2 != null) {
                cardInfo.field_begin_time = optJSONObject2.optLong("begin_time");
            }
            if (cardInfo.field_end_time == 0 && optJSONObject2 != null) {
                cardInfo.field_end_time = optJSONObject2.optLong("end_time");
            }
            C48813b60 b602 = cardInfo.f51607R0.f64146p0;
            if (b602 != null) {
                cardInfo.field_is_dynamic = b602.f130976d;
            }
        }
        C22500hn hnVar = cardInfo.f51608S0;
        if (hnVar != null) {
            cardInfo.mo23273U0(hnVar);
            cardInfo.field_status = cardInfo.f51608S0.f63942d;
        }
        g44 g443 = cardInfo.f51609T0;
        if (g443 != null) {
            cardInfo.f51609T0 = g443;
            try {
                cardInfo.field_shareInfoData = g443.toByteArray();
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.CardInfo", "setShareInfo fail, ex = %s", e2.getMessage());
                Log.printErrStackTrace("MicroMsg.CardInfo", e2, "", new Object[0]);
            }
        }
        cardInfo.field_local_updateTime = (long) ((int) (System.currentTimeMillis() / 1000));
    }

    /* renamed from: k */
    public static C22506ko m26974k(JSONObject jSONObject) {
        C22511m1 m1Var = null;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserCardTpInfo json is null");
            return null;
        }
        C22506ko koVar = new C22506ko();
        try {
            koVar.f64136d = jSONObject.optString("card_tp_id");
            koVar.f64137e = jSONObject.optString("logo_url");
            koVar.f64138f = jSONObject.optString("appid");
            koVar.f64139g = jSONObject.optString("app_username");
            koVar.f64140h = jSONObject.optInt("card_category");
            koVar.f64141i = jSONObject.optInt("card_type");
            koVar.f64142j = jSONObject.optString("brand_name");
            koVar.f64143n = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            koVar.f64144o = jSONObject.optString("sub_title");
            koVar.f64145p = jSONObject.optString("color");
            koVar.f64147q = jSONObject.optString("notice");
            koVar.f64148r = jSONObject.optString("service_phone");
            koVar.f64151u = jSONObject.optString("image_text_url");
            koVar.f64152v = jSONObject.optString("source_icon");
            koVar.f64153w = jSONObject.optString(FirebaseAnalytics.C113379b.SOURCE);
            koVar.f64129V0 = jSONObject.optString("brand_icon_url");
            JSONArray optJSONArray = jSONObject.optJSONArray("primary_fields");
            if (optJSONArray != null) {
                koVar.f64149s = m26968e(optJSONArray);
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("introduce_fields");
            if (optJSONArray2 != null) {
                koVar.f64150t = m26968e(optJSONArray2);
            }
            koVar.f64154x = jSONObject.optInt("shop_count");
            koVar.f64158z = jSONObject.optString("limit_wording");
            koVar.f64156y = jSONObject.optString("card_type_name");
            koVar.f64103A = jSONObject.optString("h5_show_url");
            koVar.f64104B = jSONObject.optInt("block_mask");
            koVar.f64105C = jSONObject.optString("middle_icon");
            koVar.f64106D = jSONObject.optString("accept_wording");
            koVar.f64107E = jSONObject.optLong("control_flag");
            koVar.f64108F = jSONObject.optString("advertise_wording");
            koVar.f64109G = jSONObject.optString("advertise_url");
            koVar.f64110H = jSONObject.optString("public_service_name");
            koVar.f64111I = m26970g(jSONObject.optJSONObject("announcement"));
            koVar.f64112J = jSONObject.optString("public_service_tip");
            koVar.f64113K = jSONObject.optString("primary_sub_title");
            koVar.f64114L = jSONObject.optInt("gen_type");
            koVar.f64115M = m26976m(jSONObject.optJSONObject("detail_struct"));
            koVar.f64116N = m26983t(jSONObject.optJSONObject("use_condition"));
            koVar.f64117P = m26979p(jSONObject.optJSONObject("follow_box"));
            JSONObject optJSONObject = jSONObject.optJSONObject("guidance");
            if (optJSONObject == null) {
                Log.m105920e("MicroMsg.CardInfoParser", "parserActionSheet json is null");
            } else {
                m1Var = new C22511m1();
                m1Var.f64198d = optJSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
                m1Var.f64199e = optJSONObject.optString("url");
            }
            koVar.f64118Q = m1Var;
            koVar.f64120R = jSONObject.optInt("need_direct_jump", 0);
            koVar.f64122S = jSONObject.optInt("is_acceptable", 0);
            koVar.f64124T = jSONObject.optString("unacceptable_wording");
            koVar.f64126U = jSONObject.optInt("has_hongbao", 0);
            koVar.f64128V = jSONObject.optString("accept_ui_title");
            koVar.f64130W = jSONObject.optInt("show_accept_view", 0);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("brand_field");
            if (optJSONObject2 != null) {
                koVar.f64132X = m26975l(optJSONObject2);
            }
            koVar.f64134Y = jSONObject.optString("shop_name");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("pay_and_qrcode_field");
            if (optJSONObject3 != null) {
                koVar.f64135Z = m26975l(optJSONObject3);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("dynamic_qr_code_info");
            if (optJSONObject4 != null) {
                koVar.f64146p0 = m26978o(optJSONObject4);
            }
            koVar.f64155x0 = jSONObject.optBoolean("is_card_code_exposed");
            koVar.f64157y0 = jSONObject.optInt("qrcode_correct_level");
            koVar.f64119Q0 = jSONObject.optBoolean("dismiss_qrcode_icon_on_card");
            koVar.f64121R0 = jSONObject.optBoolean("need_location");
            JSONObject optJSONObject5 = jSONObject.optJSONObject("bluetooth_info");
            if (optJSONObject5 != null) {
                koVar.f64123S0 = m26965b(optJSONObject5);
            }
            koVar.f64125T0 = jSONObject.optString("biz_nickname");
            koVar.f64127U0 = jSONObject.optString("gift_title");
            koVar.f64129V0 = jSONObject.optString("brand_icon_url");
            koVar.f64133X0 = jSONObject.optString("advertise_tinyapp_path");
            koVar.f64131W0 = jSONObject.optString("advertise_tinyapp_username");
            Log.m105919d("MicroMsg.CardInfoParser", "parse gift title: %s", koVar.f64127U0);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.CardInfoParser", e, "", new Object[0]);
        }
        return koVar;
    }

    /* renamed from: l */
    public static C22498fy m26975l(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserThirdFiled json is null");
            return null;
        }
        C22498fy fyVar = new C22498fy();
        fyVar.f63884d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        fyVar.f63886f = jSONObject.optString("aux_title");
        fyVar.f63885e = jSONObject.optString("sub_title");
        fyVar.f63887g = jSONObject.optString("url");
        fyVar.f63888h = jSONObject.optLong("show_flag");
        fyVar.f63889i = jSONObject.optString("primary_color");
        fyVar.f63890j = jSONObject.optString("secondary_color");
        fyVar.f63891n = jSONObject.optString("icon_url");
        fyVar.f63895r = jSONObject.optString("cell_icon_url");
        fyVar.f63896s = jSONObject.optString("cell_link_icon_url");
        fyVar.f63897t = jSONObject.optString("finder_username");
        fyVar.f63898u = jSONObject.optString("cell_cover_url");
        fyVar.f63899v = jSONObject.optString("cell_center_icon_url");
        fyVar.f63900w = jSONObject.optString("feed_id");
        fyVar.f63901x = jSONObject.optString("nonce_id");
        JSONObject optJSONObject = jSONObject.optJSONObject("gifting_info");
        if (optJSONObject != null) {
            Log.m105919d("MicroMsg.CardInfoParser", "parserGitfInfo:%s", optJSONObject);
            C64748ud2 ud22 = new C64748ud2();
            ud22.f185725d = C77710q.m93739b(optJSONObject.optString("biz_uin"));
            ud22.f185726e = optJSONObject.optString("order_id");
            fyVar.f63892o = ud22;
        }
        fyVar.f63893p = jSONObject.optString("app_brand_user_name");
        fyVar.f63894q = jSONObject.optString("app_brand_pass");
        return fyVar;
    }

    /* renamed from: m */
    public static C22513m40 m26976m(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserDetailStruct json is null");
            return null;
        }
        C22513m40 m402 = new C22513m40();
        m402.f64220d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        m402.f64221e = jSONObject.optString("url");
        m402.f64222f = jSONObject.optString("abstract");
        m402.f64224h = jSONObject.optString("detail");
        m402.f64225i = jSONObject.optString("ad_title");
        JSONArray optJSONArray = jSONObject.optJSONArray("icon_url_list");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserDetailStruct icon_url_list is null");
        } else {
            LinkedList<String> linkedList = new LinkedList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    str = optJSONArray.getString(i);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.CardInfoParser", e, "", new Object[0]);
                    Log.m105920e("MicroMsg.CardInfoParser", "getMessage:" + e.getMessage());
                    str = "";
                }
                linkedList.add(str);
            }
            m402.f64223g = linkedList;
        }
        return m402;
    }

    /* renamed from: n */
    public static C77968n40 m26977n(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserDetailTable json is null");
            return null;
        }
        C77968n40 n402 = new C77968n40();
        n402.f227877d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        n402.f227878e = jSONObject.optString("sub_title");
        n402.f227879f = jSONObject.optInt("show_num", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("rows");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserDetailTable jsonArray is  null");
        } else {
            try {
                n402.f227880g = m26968e(optJSONArray);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.CardInfoParser", e, "", new Object[0]);
                Log.m105920e("MicroMsg.CardInfoParser", e.getMessage());
            }
        }
        return n402;
    }

    /* renamed from: o */
    public static C48813b60 m26978o(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserDynamicQrCodeInfo json is null");
            return null;
        }
        C48813b60 b602 = new C48813b60();
        b602.f130976d = jSONObject.optBoolean("is_dynamic");
        b602.f130977e = jSONObject.optBoolean("can_refresh");
        b602.f130978f = jSONObject.optString("refresh_wording");
        Log.m105924i("MicroMsg.CardInfoParser", "is_dynamic:" + b602.f130976d + "　can_refresh:" + b602.f130977e + "　refresh_wording:" + b602.f130978f);
        return b602;
    }

    /* renamed from: p */
    public static C64808wp1 m26979p(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserFollowBox json is null");
            return null;
        }
        C64808wp1 wp12 = new C64808wp1();
        wp12.f186150d = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
        wp12.f186151e = jSONObject.optInt("follow");
        Log.m105924i("MicroMsg.CardInfoParser", "follow:" + wp12.f186151e + "　text:" + wp12.f186150d);
        return wp12;
    }

    /* renamed from: q */
    public static void m26980q(ShareCardInfo shareCardInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
            return;
        }
        try {
            m26981r(shareCardInfo, new JSONObject(str).optJSONObject("share_card"));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.CardInfoParser", e, "", new Object[0]);
            Log.m105920e("MicroMsg.CardInfoParser", e.getMessage());
        }
    }

    /* renamed from: r */
    public static void m26981r(ShareCardInfo shareCardInfo, JSONObject jSONObject) {
        g44 g44;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserShareCardItemJson json is null");
            return;
        }
        shareCardInfo.field_card_id = m26964a(jSONObject.optString("card_id"));
        shareCardInfo.field_card_tp_id = m26964a(jSONObject.optString("card_tp_id"));
        shareCardInfo.field_app_id = jSONObject.optString("app_id");
        shareCardInfo.field_consumer = jSONObject.optString("consumer");
        shareCardInfo.field_share_time = (long) jSONObject.optInt("share_time");
        shareCardInfo.field_updateTime = (long) jSONObject.optInt("update_time");
        shareCardInfo.field_status = jSONObject.optInt("state_flag");
        shareCardInfo.field_updateSeq = jSONObject.optLong("sequence");
        shareCardInfo.field_from_username = jSONObject.optString("from_user_name");
        shareCardInfo.field_begin_time = jSONObject.optLong("begin_time");
        shareCardInfo.field_end_time = (long) jSONObject.optInt("end_time");
        JSONObject optJSONObject = jSONObject.optJSONObject("card_data_info");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("card_tp_info");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("share_info");
        shareCardInfo.f51614Z = m26971h(optJSONObject);
        shareCardInfo.f51613Y = m26974k(optJSONObject2);
        if (optJSONObject3 == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserShareInfo json is null");
            g44 = null;
        } else {
            g44 g442 = new g44();
            g442.f133848d = optJSONObject3.optString("gift_msg_title");
            g44 = g442;
        }
        shareCardInfo.f51615p0 = g44;
        C22500hn hnVar = shareCardInfo.f51614Z;
        if (hnVar != null) {
            shareCardInfo.mo23273U0(hnVar);
        }
        C22506ko koVar = shareCardInfo.f51613Y;
        if (koVar != null) {
            shareCardInfo.f51613Y = koVar;
            try {
                shareCardInfo.field_cardTpInfoData = koVar.toByteArray();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ShareCardInfo", "setCardTpInfo fail, ex = %s", e.getMessage());
            }
            shareCardInfo.field_end_time = (long) optJSONObject2.optInt("end_time");
            shareCardInfo.field_begin_time = (long) optJSONObject2.optInt("begin_time");
        }
        g44 g443 = shareCardInfo.f51615p0;
        if (g443 != null) {
            shareCardInfo.f51615p0 = g443;
            try {
                shareCardInfo.field_shareInfoData = g443.toByteArray();
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.ShareCardInfo", "setShareInfo fail, ex = %s", e2.getMessage());
                Log.printErrStackTrace("MicroMsg.ShareCardInfo", e2, "", new Object[0]);
            }
        }
        shareCardInfo.field_local_updateTime = (long) ((int) (System.currentTimeMillis() / 1000));
    }

    /* renamed from: s */
    public static we4 m26982s(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
            return null;
        }
        we4 we4 = new we4();
        we4.f144003d = jSONObject.optString("tag");
        we4.f144004e = jSONObject.optString("color");
        return we4;
    }

    /* renamed from: t */
    public static ho4 m26983t(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
            return null;
        }
        ho4 ho4 = new ho4();
        ho4.f134796d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        JSONArray optJSONArray = jSONObject.optJSONArray("outer_tag_list");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserUseCondition outer_tag_list is null");
        } else {
            ho4.f134797e = new LinkedList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                we4 s = m26982s(optJSONArray.optJSONObject(i));
                if (s != null) {
                    ho4.f134797e.add(s);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("inner_tag_list");
        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserUseCondition inner_tag_list is null");
        } else {
            ho4.f134798f = new LinkedList<>();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                we4 s2 = m26982s(optJSONArray2.optJSONObject(i2));
                if (s2 != null) {
                    ho4.f134798f.add(s2);
                }
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("detail_field");
        if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
            Log.m105920e("MicroMsg.CardInfoParser", "parserUseCondition detail_field is null");
        } else {
            ho4.f134799g = m26968e(optJSONArray3);
        }
        return ho4;
    }
}
