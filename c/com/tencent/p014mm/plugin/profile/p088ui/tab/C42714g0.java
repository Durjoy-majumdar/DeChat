package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Intent;
import android.os.Bundle;
import c00.C0405n;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import ke3.C88144b;
import kf2.C10073d;
import kf2.C46723f;
import kr0.C76630x0;
import org.json.JSONException;
import org.json.JSONObject;
import p248ug.C52558c;
import qo3.C101218e0;
import rb0.C47984k;
import rx3.C13598b0;
import te3.C52262zh;
import u73.C101987v0;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.g0 */
public final class C42714g0 extends C87413o implements C32228q<C52262zh, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ContactWidgetTabBizInfo f115683d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42714g0(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        super(3);
        this.f115683d = contactWidgetTabBizInfo;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C52262zh zhVar = (C52262zh) obj;
        int intValue = ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        C87412m.m108594g(zhVar, "serviceInfo");
        C72996z1 z1Var = this.f115683d.f115610i;
        C87412m.m108591d(z1Var);
        String username = z1Var.getUsername();
        ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f115683d;
        C46723f.m52019a(username, 1100, contactWidgetTabBizInfo.f115612n, contactWidgetTabBizInfo.f115608g, contactWidgetTabBizInfo.f115605d.getIntent());
        Log.m105925i("MicroMsg.ContactWidgetTabBizInfo", "onClick serviceInfo.type:%d", Integer.valueOf(zhVar.f145949e));
        int i = zhVar.f145949e;
        if (i == 2) {
            ContactWidgetTabBizInfo contactWidgetTabBizInfo2 = this.f115683d;
            ContactInfoUI contactInfoUI = contactWidgetTabBizInfo2.f115605d;
            C72996z1 z1Var2 = contactWidgetTabBizInfo2.f115610i;
            C87412m.m108591d(z1Var2);
            String username2 = z1Var2.getUsername();
            Intent intent = new Intent();
            intent.putExtra("rawUrl", zhVar.f145952h);
            intent.putExtra("geta8key_username", username2);
            intent.putExtra("geta8key_scene", 59);
            intent.putExtra("key_enable_teen_mode_check", true);
            C88144b.m109791i(contactInfoUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C72996z1 z1Var3 = this.f115683d.f115610i;
            C87412m.m108591d(z1Var3);
            C10073d.m9917b(z1Var3.getUsername(), String.valueOf(zhVar.f145948d), zhVar.f145951g, "menu_click", 0, 0, 126, zhVar.f145950f, C10073d.m9916a(intValue, -1), zhVar.f145955n);
        } else if (i == 5) {
            ContactWidgetTabBizInfo contactWidgetTabBizInfo3 = this.f115683d;
            ContactInfoUI contactInfoUI2 = contactWidgetTabBizInfo3.f115605d;
            C72996z1 z1Var4 = contactWidgetTabBizInfo3.f115610i;
            C87412m.m108591d(z1Var4);
            String username3 = z1Var4.getUsername();
            if (Util.isNullOrNil(zhVar.f145952h)) {
                Log.m105919d("MicroMsg.NewBizInfoUtil", "jumpToWeApp serviceInfo.id:%s value is null", Integer.valueOf(zhVar.f145948d));
            } else {
                Log.m105919d("MicroMsg.NewBizInfoUtil", "jumpToWeApp value:%s", zhVar.f145952h);
                try {
                    JSONObject jSONObject = new JSONObject(zhVar.f145952h);
                    C52558c b = C47984k.m53328b(username3);
                    String format = String.format("%s:%s:%s:%s", new Object[]{username3, Integer.valueOf(!Util.isNullOrNil(zhVar.f145951g) ? zhVar.f145951g.length() - zhVar.f145951g.replace("_", "").length() : 0), zhVar.f145950f, jSONObject.optString("pagePath")});
                    Log.m105919d("MicroMsg.NewBizInfoUtil", "sceneNote = %s", format);
                    AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                    appBrandStatObject.f245533f = 1102;
                    appBrandStatObject.f245534g = format;
                    Log.m105919d("MicroMsg.NewBizInfoUtil", "sceneNote = %s", format);
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).Rg0(contactInfoUI2, jSONObject.optString("userName"), (String) null, 0, 0, jSONObject.optString("pagePath"), appBrandStatObject, b == null ? null : b.field_appId);
                } catch (JSONException e) {
                    Log.m105920e("MicroMsg.NewBizInfoUtil", e.getMessage());
                }
            }
            C72996z1 z1Var5 = this.f115683d.f115610i;
            C87412m.m108591d(z1Var5);
            C10073d.m9917b(z1Var5.getUsername(), String.valueOf(zhVar.f145948d), zhVar.f145951g, "menu_click", 0, 0, 126, zhVar.f145950f, C10073d.m9916a(intValue, -1), zhVar.f145952h);
        } else if (i == 6) {
            ContactWidgetTabBizInfo contactWidgetTabBizInfo4 = this.f115683d;
            ContactInfoUI contactInfoUI3 = contactWidgetTabBizInfo4.f115605d;
            C72996z1 z1Var6 = contactWidgetTabBizInfo4.f115610i;
            C87412m.m108591d(z1Var6);
            String username4 = z1Var6.getUsername();
            Class cls = C0405n.class;
            if (Util.isNullOrNil(zhVar.f145952h)) {
                Log.m105919d("MicroMsg.NewBizInfoUtil", "jumpToSearch serviceInfo.id: %s value is null", Integer.valueOf(zhVar.f145948d));
            } else {
                String str = zhVar.f145952h;
                Log.m105925i("MicroMsg.NewBizInfoUtil", "jumpToSearch username: %s, suggestData: %s", username4, str);
                Intent O20 = ((C0405n) C86312j.m106911c(cls)).O20();
                O20.putExtra("ftsneedkeyboard", true);
                O20.putExtra("ftsbizscene", 76);
                O20.putExtra("ftsType", 2);
                Map<String, String> hn = ((C0405n) C86312j.m106911c(cls)).mo280hn(76, false, 2);
                hn.put("userName", username4);
                if (!Util.isNullOrNil(str)) {
                    hn.put("thirdExtParam", str);
                }
                O20.putExtra("rawUrl", C101987v0.m134270d(hn, 0));
                O20.putExtra("key_load_js_without_delay", true);
                O20.putExtra("ftsbizusername", username4);
                O20.addFlags(67108864);
                C88144b.m109806x(contactInfoUI3, O20, (Bundle) null);
            }
            C72996z1 z1Var7 = this.f115683d.f115610i;
            C87412m.m108591d(z1Var7);
            C10073d.m9917b(z1Var7.getUsername(), String.valueOf(zhVar.f145948d), zhVar.f145951g, "menu_click", 0, 0, 126, zhVar.f145950f, C10073d.m9916a(intValue, -1), zhVar.f145952h);
        }
        C101218e0 e0Var = this.f115683d.f115594M;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        return C13598b0.f38549a;
    }
}
