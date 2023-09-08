package wr0;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.C115283k;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C47350c;
import p910lj.C76701a;
import pe3.C47465a;
import te3.C64360f8;
import te3.iq4;
import zq0.C91919w;

public final /* synthetic */ class e$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C115283k f355351d;

    /* renamed from: e */
    public final /* synthetic */ int f355352e;

    /* renamed from: f */
    public final /* synthetic */ int f355353f;

    /* renamed from: g */
    public final /* synthetic */ C47350c f355354g;

    /* renamed from: h */
    public final /* synthetic */ String f355355h;

    public /* synthetic */ e$$a(C115283k kVar, int i, int i2, C47350c cVar, String str) {
        this.f355351d = kVar;
        this.f355352e = i;
        this.f355353f = i2;
        this.f355354g = cVar;
        this.f355355h = str;
    }

    public final void run() {
        C47465a aVar;
        PhoneItem phoneItem;
        C115283k kVar = this.f355351d;
        int i = this.f355352e;
        int i2 = this.f355353f;
        C47350c cVar = this.f355354g;
        String str = this.f355355h;
        kVar.getClass();
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            iq4 iq4 = (iq4) aVar;
            C64360f8 f8Var = iq4.f183727d;
            if (f8Var != null) {
                Log.m105925i("MicroMsg.AppBrandIDCardUI", "VerifySmsCodeResp.auth_base_response errcode:%s, errMsg:%s", Integer.valueOf(f8Var.f183091d), Util.nullAsNil(iq4.f183727d.f183092e));
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(14943, AppBrandIDCardUI.this.f345442e, 8, AppBrandIDCardUI.this.f345449o.f354574s);
                int i3 = iq4.f183727d.f183091d;
                if (i3 == 0) {
                    nVar.mo160131h(14943, AppBrandIDCardUI.this.f345442e, 9, AppBrandIDCardUI.this.f345449o.f354574s);
                    Log.m105924i("MicroMsg.AppBrandIDCardUI", "verify success");
                    Log.m105919d("MicroMsg.AppBrandIDCardUI", "resq.auth_token", iq4.f183728e);
                    AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
                    int i4 = appBrandIDCardUI.f345456v;
                    if ((i4 == 1 || i4 == 2) && (phoneItem = appBrandIDCardUI.f345439A) != null) {
                        C91919w.f263170a.mo125750e(phoneItem);
                    }
                    Intent intent = new Intent();
                    intent.putExtra("intent_err_code", iq4.f183727d.f183091d);
                    intent.putExtra("intent_auth_token", iq4.f183728e);
                    AppBrandIDCardUI.this.setResult(-1, intent);
                    AppBrandIDCardUI.this.finish();
                } else if (i3 == 40013) {
                    AppBrandIDCardUI.C115267a aVar2 = kVar.f345494a;
                    AppBrandIDCardUI.C115267a.m162024a(aVar2, AppBrandIDCardUI.this.getString(C0966R.string.f7718p7));
                } else {
                    AppBrandIDCardUI.C115267a aVar3 = kVar.f345494a;
                    AppBrandIDCardUI.C115267a.m162024a(aVar3, AppBrandIDCardUI.this.getString(C0966R.string.f7717p6));
                }
            } else {
                Log.m105920e("MicroMsg.AppBrandIDCardUI", "VerifySmsCodeResp.auth_base_response is null");
            }
        } else {
            Log.m105921e("MicroMsg.AppBrandIDCardUI", "SubmitAuthorizeUserID cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", Integer.valueOf(i), Integer.valueOf(i2), str, cVar.f127056b.f127083a);
            AppBrandIDCardUI appBrandIDCardUI2 = AppBrandIDCardUI.this;
            C76701a.makeText((Context) appBrandIDCardUI2, (CharSequence) appBrandIDCardUI2.getString(C0966R.string.f7713p2), 0).show();
        }
    }
}
