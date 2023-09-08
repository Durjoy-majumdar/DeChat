package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import gy3.C87412m;
import java.util.HashMap;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.a0 */
public final class C1614a0 extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 996;
    private static final String NAME = "createVestUser";

    /* renamed from: g */
    public final int f11217g = C87687a.m109085a(this);

    /* renamed from: w */
    public static final void m1652w(C1614a0 a0Var, Intent intent, C81925i2 i2Var, int i, int i2) {
        if (intent == null) {
            i2Var.mo109647a(i, a0Var.mo115109j("fail"));
        } else if (i2 == 0) {
            i2Var.mo109647a(i, a0Var.mo115109j("fail cancel"));
        } else {
            a0Var.getClass();
            int intExtra = intent.getIntExtra("id", -1);
            String stringExtra = intent.getStringExtra("desc");
            String str = "";
            if (stringExtra == null) {
                stringExtra = str;
            }
            String stringExtra2 = intent.getStringExtra("nickname");
            if (stringExtra2 == null) {
                stringExtra2 = str;
            }
            String stringExtra3 = intent.getStringExtra("avatarurl");
            if (stringExtra3 != null) {
                str = stringExtra3;
            }
            boolean z = false;
            if (!(stringExtra2.length() == 0)) {
                if (str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("headImg", str);
                    hashMap2.put("nickname", stringExtra2);
                    hashMap2.put("id", Integer.valueOf(intExtra));
                    hashMap2.put("desc", stringExtra);
                    hashMap.put("userInfo", hashMap2);
                    i2Var.mo109647a(i, a0Var.mo115112m("ok", hashMap));
                    return;
                }
            }
            i2Var.mo109647a(i, a0Var.mo115109j("fail"));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null) {
            if (jSONObject == null) {
                i2Var.mo109647a(i, mo115109j("fail:invalid data"));
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(jSONObject);
            if (i2Var.mo114344o0() == null) {
                i2Var.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            }
            jSONObject.optInt("sessionId", 0);
            String optString = jSONObject.optString("defaultAvatarUrl", "");
            String optString2 = jSONObject.optString("defaultAvatarFileId", "");
            String appId = i2Var.getAppId();
            Activity o0 = i2Var.mo114344o0();
            C87412m.m108593f(o0, "env.pageContext");
            C87412m.m108593f(optString, "defaultAvatarUrl");
            C87412m.m108593f(optString2, "defaultAvatarFileId");
            Intent intent = new Intent();
            intent.putExtra("0", appId);
            intent.putExtra("extra_call_by_appbrand", true);
            intent.putExtra("default_fileid", optString2);
            if (o0 instanceof MMActivity) {
                C88144b.m109803u((MMActivity) o0, ".plugin.webview.ui.tools.CreateAvatarUI", intent, this.f11217g, new C1626y(this, i2Var, i));
            } else if (o0 instanceof AppBrandUI) {
                C89916g.m112446a(o0).mo124232f(new C1627z(this, i2Var, i));
                C88144b.m109802t(o0, ".plugin.webview.ui.tools.CreateAvatarUI", intent, this.f11217g);
            }
        }
    }
}
