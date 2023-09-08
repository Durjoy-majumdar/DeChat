package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C77907be0;
import te3.C77912ce0;
import te3.C77925f4;

/* renamed from: com.tencent.mm.plugin.remittance.model.a */
public class C70580a {
    /* renamed from: a */
    public static JSONArray m83107a(List<C77912ce0> list, C77912ce0 ce02) {
        if (list == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 0;
            for (C77912ce0 d : list) {
                jSONArray.put(i, m83110d(d));
                i++;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e, "", new Object[0]);
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static JSONObject m83108b(C77925f4 f4Var) {
        if (f4Var == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("channel", f4Var.f227324f);
            jSONObject.put("favor_compose_info", m83109c(f4Var.f227328j));
            jSONObject.put("f2f_id", f4Var.f227322d);
            jSONObject.put("payok_checksign", f4Var.f227327i);
            jSONObject.put("receiver_openid", f4Var.f227330o);
            jSONObject.put("receiver_username", f4Var.f227329n);
            jSONObject.put("scan_scene", f4Var.f227325g);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, f4Var.f227326h);
            jSONObject.put("total_amount", f4Var.f227331p);
            jSONObject.put("trans_id", f4Var.f227323e);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e, "", new Object[0]);
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static JSONObject m83109c(C77907be0 be02) {
        if (be02 == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("favor_compose_id", be02.f226995d);
            jSONObject.put("favor_info_list,", m83107a(be02.f226996e, new C77912ce0()));
            jSONObject.put("show_favor_amount,", be02.f226997f);
            jSONObject.put("show_pay_amount,", be02.f226998g);
            jSONObject.put("total_favor_amount,", be02.f226999h);
            jSONObject.put("favor_desc", be02.f227000i);
            jSONObject.put("compose_sort_flag", be02.f227001j);
            jSONObject.put("extend_str", be02.f227002n);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e, "", new Object[0]);
        }
        return jSONObject;
    }

    /* renamed from: d */
    public static JSONObject m83110d(C77912ce0 ce02) {
        if (ce02 == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fav_type", ce02.f227117d);
            jSONObject.put("fav_sub_type", ce02.f227118e);
            jSONObject.put("fav_property", ce02.f227119f);
            jSONObject.put("favor_type_desc", ce02.f227120g);
            jSONObject.put("fav_id", ce02.f227121h);
            jSONObject.put("fav_name", ce02.f227122i);
            jSONObject.put("fav_desc", ce02.f227123j);
            jSONObject.put("favor_use_manual", ce02.f227124n);
            jSONObject.put("favor_remarks", ce02.f227125o);
            jSONObject.put("fav_price", ce02.f227126p);
            jSONObject.put("real_fav_fee", ce02.f227127q);
            jSONObject.put("fav_scope_type", ce02.f227128r);
            jSONObject.put("business_receipt_no", ce02.f227129s);
            jSONObject.put("unavailable", ce02.f227130t);
            return jSONObject;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e, "", new Object[0]);
            return jSONObject;
        }
    }
}
