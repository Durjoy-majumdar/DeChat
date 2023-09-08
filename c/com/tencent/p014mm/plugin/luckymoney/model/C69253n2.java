package com.tencent.p014mm.plugin.luckymoney.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C64801wf2;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.n2 */
public class C69253n2 {

    /* renamed from: a */
    public C69248m2 f199286a;

    /* renamed from: b */
    public C77994sf2 f199287b;

    /* renamed from: c */
    public ArrayList<C64801wf2> f199288c;

    /* renamed from: a */
    public static C69253n2 m81627a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            C69253n2 n2Var = new C69253n2();
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("operation");
            if (optJSONObject != null) {
                n2Var.f199286a = C69232i1.m81584h(optJSONObject);
            }
            n2Var.f199287b = C69232i1.m81578b(jSONObject.optJSONObject(FirebaseAnalytics.C113379b.SOURCE));
            n2Var.f199288c = C69232i1.m81585i(jSONObject.optJSONArray("upright_corner_list"));
            return n2Var;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.ShowSourceOpen", e, "", new Object[0]);
            return null;
        }
    }
}
