package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;
import p225rc.C89916g;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.q */
public abstract class C82910q extends C82913r {

    /* renamed from: f */
    public Activity f242391f;

    /* renamed from: g */
    public int f242392g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.q$a */
    public class C82911a implements g$$f {
        public C82911a() {
        }

        /* renamed from: b */
        public boolean mo1596b(int i, int i2, Intent intent) {
            C82910q qVar = C82910q.this;
            int i3 = qVar.f242392g;
            if (i != i3) {
                return false;
            }
            if (i3 != i) {
                return true;
            }
            if (i2 == -1) {
                qVar.mo115154c(i2, intent);
                return true;
            } else if (intent == null || !intent.hasExtra("result_error_msg")) {
                qVar.mo115153b(-1, "fail:system error {{unknow error}}");
                return true;
            } else {
                qVar.mo115153b(intent.getIntExtra("result_error_code", -1), intent.getStringExtra("result_error_msg"));
                return true;
            }
        }
    }

    public C82910q(C82870p pVar, C81925i2 i2Var, C83780d1 d1Var, JSONObject jSONObject, int i) {
        super(pVar, i2Var, d1Var, jSONObject, i);
        Activity R = i2Var.getRuntime().mo113026R();
        this.f242391f = R;
        if (R != null) {
            this.f242392g = pVar.hashCode() & 65535;
            return;
        }
        throw new IllegalArgumentException("JsApiActivityResultRequest. Activity is null");
    }

    /* renamed from: a */
    public abstract boolean mo115152a(Activity activity, JSONObject jSONObject, int i);

    /* renamed from: b */
    public abstract void mo115153b(int i, String str);

    /* renamed from: c */
    public abstract void mo115154c(int i, Intent intent);

    /* renamed from: d */
    public void mo115155d() {
        C89916g.m112446a(this.f242391f).mo124232f(new C82911a());
        if (!mo115152a(this.f242391f, this.f242397c, this.f242392g)) {
            mo115153b(-1, "fail:system error {{launch fail}}");
        }
    }
}
