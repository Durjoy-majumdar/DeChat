package wr0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.C115282j;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import p910lj.C76701a;
import pe3.C47465a;
import te3.C64360f8;
import te3.C64618p04;

public final /* synthetic */ class d$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C115282j f355346d;

    /* renamed from: e */
    public final /* synthetic */ int f355347e;

    /* renamed from: f */
    public final /* synthetic */ int f355348f;

    /* renamed from: g */
    public final /* synthetic */ C47350c f355349g;

    /* renamed from: h */
    public final /* synthetic */ String f355350h;

    public /* synthetic */ d$$a(C115282j jVar, int i, int i2, C47350c cVar, String str) {
        this.f355346d = jVar;
        this.f355347e = i;
        this.f355348f = i2;
        this.f355349g = cVar;
        this.f355350h = str;
    }

    public final void run() {
        C47465a aVar;
        C115282j jVar = this.f355346d;
        int i = this.f355347e;
        int i2 = this.f355348f;
        C47350c cVar = this.f355349g;
        String str = this.f355350h;
        jVar.getClass();
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            C64618p04 p042 = (C64618p04) aVar;
            C64360f8 f8Var = p042.f184726d;
            if (f8Var != null) {
                Log.m105925i("MicroMsg.AppBrandIDCardUI", "SendSmsResp.auth_base_response.err_code:%d", Integer.valueOf(f8Var.f183091d));
                if (p042.f184726d.f183091d == 0) {
                    AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
                    String str2 = p042.f184727e;
                    appBrandIDCardUI.f345454t = str2;
                    Log.m105925i("MicroMsg.AppBrandIDCardUI", "send success, verifyToken:%s", str2);
                    return;
                }
                AppBrandIDCardUI.C115267a aVar2 = jVar.f345493a;
                AppBrandIDCardUI.C115267a.m162024a(aVar2, AppBrandIDCardUI.this.getString(C0966R.string.f7719p8));
                return;
            }
            Log.m105924i("MicroMsg.AppBrandIDCardUI", "SendSmsResp.auth_base_response is null");
            AppBrandIDCardUI.C115267a aVar3 = jVar.f345493a;
            AppBrandIDCardUI.C115267a.m162024a(aVar3, AppBrandIDCardUI.this.getString(C0966R.string.f7719p8));
            return;
        }
        Log.m105921e("MicroMsg.AppBrandIDCardUI", "sendSms cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", Integer.valueOf(i), Integer.valueOf(i2), str, cVar.f127056b.f127083a);
        AppBrandIDCardUI appBrandIDCardUI2 = AppBrandIDCardUI.this;
        C76701a.makeText((Context) appBrandIDCardUI2, (CharSequence) appBrandIDCardUI2.getString(C0966R.string.f7713p2), 0).show();
    }
}
