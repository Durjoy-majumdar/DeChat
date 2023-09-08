package gk0;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import p225rc.g$$e;

/* renamed from: gk0.i0 */
public class C8329i0 implements g$$e {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f27289a;

    /* renamed from: b */
    public final /* synthetic */ int f27290b;

    /* renamed from: c */
    public final /* synthetic */ C8330j0 f27291c;

    public C8329i0(C8330j0 j0Var, C83780d1 d1Var, int i) {
        this.f27291c = j0Var;
        this.f27289a = d1Var;
        this.f27290b = i;
    }

    /* renamed from: a */
    public void mo1626a(int i, Intent intent) {
        Log.m105925i("MicroMsg.JsApiOpenRealnameAuth", "mmOnActivityResult resultCode:%d", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        if (i == -1) {
            Log.m105924i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth ok");
            String stringExtra = intent.getStringExtra("intent_auth_token");
            if (!Util.isNullOrNil(stringExtra)) {
                hashMap.put("errCode", 0);
                hashMap.put("auth_token", stringExtra);
                this.f27289a.mo109647a(this.f27290b, this.f27291c.mo115112m("ok", hashMap));
                Log.m105919d("MicroMsg.JsApiOpenRealnameAuth", "authToken:%s", stringExtra);
                return;
            }
            this.f27289a.mo109647a(this.f27290b, this.f27291c.mo115112m("fail", hashMap));
        } else if (i == 0) {
            Log.m105924i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth cancel");
            this.f27289a.mo109647a(this.f27290b, this.f27291c.mo115109j("cancel"));
        } else if (i == 1) {
            Log.m105924i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth fail");
            if (intent != null) {
                int intExtra = intent.getIntExtra("intent_err_code", -1);
                String stringExtra2 = intent.getStringExtra("intent_err_msg");
                hashMap.put("errCode", Integer.valueOf(intExtra));
                C83780d1 d1Var = this.f27289a;
                int i2 = this.f27290b;
                C8330j0 j0Var = this.f27291c;
                d1Var.mo109647a(i2, j0Var.mo115112m("fail:" + Util.nullAsNil(stringExtra2), hashMap));
                Log.m105925i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth errCode:%d, errMsg:%s", Integer.valueOf(intExtra), stringExtra2);
                return;
            }
            this.f27289a.mo109647a(this.f27290b, this.f27291c.mo115112m("fail", hashMap));
        }
    }
}
