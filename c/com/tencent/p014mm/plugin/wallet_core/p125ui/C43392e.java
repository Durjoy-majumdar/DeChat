package com.tencent.p014mm.plugin.wallet_core.p125ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import org.json.JSONException;
import org.json.JSONObject;
import p227rn.C48052u;
import p227rn.C48054w;
import rb0.C47967f0;
import rb0.C47968g0;
import rb0.C48000p0;
import te3.C49525g72;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.e */
public class C43392e implements C47968g0 {

    /* renamed from: a */
    public final /* synthetic */ C43383c f117339a;

    public C43392e(C43383c cVar) {
        this.f117339a = cVar;
    }

    /* renamed from: a */
    public void mo67591a(int i, int i2, String str, C47967f0 f0Var) {
        JSONObject jSONObject;
        Class cls = C48054w.class;
        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "onSceneEnd errType = " + i + ", errCode = " + i2 + ",errMsg = " + str);
        if (i == 0 && i2 == 0) {
            C49525g72 g722 = ((C48000p0) f0Var).f128746f;
            if (g722 == null) {
                g722 = new C49525g72();
            }
            Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "resp : %s", g722.f133903d);
            C48052u uVar = ((C48054w) C86312j.m106911c(cls)).get(this.f117339a.f117324e.getUsername());
            try {
                jSONObject = Util.isNullOrNil(uVar.mo72808E1()) ? new JSONObject() : new JSONObject(uVar.mo72808E1());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "create Json object from extInfo error. %s.", e);
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("MMBizMenu", g722.f133903d);
            } catch (JSONException e2) {
                Log.m105921e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "updateExtInfoAttrs MMBizMenu failed：value(%s), exception : %s.", g722.f133903d, e2);
            }
            if (!Util.isNullOrNil(g722.f133903d)) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WX_PAY_REVEIVE_PLUGIN_MENU_STRING_SYNC, g722.f133903d);
            }
            uVar.mo72814r0(jSONObject.toString());
            ((C48054w) C86312j.m106911c(cls)).mo72620Nf(uVar);
            Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "Update bizInfo attributes successfully.");
            return;
        }
        f0Var.getClass();
        Log.m105921e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "scene.getType() = %s", 1769);
    }
}
