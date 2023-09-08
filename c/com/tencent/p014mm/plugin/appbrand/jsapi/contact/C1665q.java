package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p225rc.C89922k;
import p918s2.C90111a;
import wq0.C91085v;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.q */
public class C1665q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82381f f11336d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f11337e;

    /* renamed from: f */
    public final /* synthetic */ int f11338f;

    /* renamed from: g */
    public final /* synthetic */ C1667r f11339g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.q$a */
    public class C1666a implements C90111a.C90113b {
        public C1666a() {
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i == 48) {
                if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                    C1665q qVar = C1665q.this;
                    C82381f fVar = qVar.f11336d;
                    int i2 = qVar.f11338f;
                    C1667r rVar = qVar.f11339g;
                    rVar.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 3, "fail:system permission denied");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errno", 3);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    fVar.mo109647a(i2, rVar.mo115115p("fail:system permission denied", jSONObject));
                    return;
                }
                C1665q qVar2 = C1665q.this;
                qVar2.f11339g.mo1688w(qVar2.f11336d, qVar2.f11337e, qVar2.f11338f, true);
            }
        }
    }

    public C1665q(C1667r rVar, C82381f fVar, JSONObject jSONObject, int i) {
        this.f11339g = rVar;
        this.f11336d = fVar;
        this.f11337e = jSONObject;
        this.f11338f = i;
    }

    public void run() {
        C91085v.m114266a(this.f11336d.getAppId(), new C1666a());
        Context context = this.f11336d.getContext();
        if (context == null || !(context instanceof Activity)) {
            this.f11336d.mo109647a(this.f11338f, this.f11339g.mo115109j("fail:internal error invalid android context"));
        } else if (C89922k.m112464a((Activity) context, this.f11336d, "android.permission.READ_CONTACTS", 48, "", "")) {
            C91085v.m114268c(this.f11336d.getAppId());
        }
    }
}
