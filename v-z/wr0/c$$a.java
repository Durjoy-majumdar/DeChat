package wr0;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.C115288p;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import p910lj.C76701a;
import pe3.C47465a;
import qo3.C89779i0;
import te3.yc4;
import zq0.C91919w;
import zt3.C119157j;

public final /* synthetic */ class c$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI.C115267a.C115268a.C115269a f355340d;

    /* renamed from: e */
    public final /* synthetic */ int f355341e;

    /* renamed from: f */
    public final /* synthetic */ int f355342f;

    /* renamed from: g */
    public final /* synthetic */ C47350c f355343g;

    /* renamed from: h */
    public final /* synthetic */ String f355344h;

    /* renamed from: i */
    public final /* synthetic */ String f355345i;

    public /* synthetic */ c$$a(AppBrandIDCardUI.C115267a.C115268a.C115269a aVar, int i, int i2, C47350c cVar, String str, String str2) {
        this.f355340d = aVar;
        this.f355341e = i;
        this.f355342f = i2;
        this.f355343g = cVar;
        this.f355344h = str;
        this.f355345i = str2;
    }

    public final void run() {
        C47465a aVar;
        PhoneItem phoneItem;
        AppBrandIDCardUI.C115267a.C115268a.C115269a aVar2 = this.f355340d;
        int i = this.f355341e;
        int i2 = this.f355342f;
        C47350c cVar = this.f355343g;
        String str = this.f355344h;
        String str2 = this.f355345i;
        C89779i0 i0Var = AppBrandIDCardUI.this.f345460z;
        if (i0Var != null && i0Var.isShowing()) {
            AppBrandIDCardUI.this.f345460z.dismiss();
        }
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            yc4 yc4 = (yc4) aVar;
            if (yc4.f186486d == null) {
                Log.m105920e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is err");
                AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
                C76701a.makeText((Context) appBrandIDCardUI, (CharSequence) appBrandIDCardUI.getString(C0966R.string.f7713p2), 0).show();
                return;
            }
            Log.m105925i("MicroMsg.AppBrandIDCardUI", "resp.auth_status:%d", Integer.valueOf(yc4.f186487e));
            int i3 = yc4.f186487e;
            if (i3 == 0) {
                Log.m105919d("MicroMsg.AppBrandIDCardUI", "resq.auth_token", yc4.f186489g);
                C115669n.INSTANCE.mo160131h(14943, AppBrandIDCardUI.this.f345442e, 9, AppBrandIDCardUI.this.f345449o.f354574s);
                AppBrandIDCardUI appBrandIDCardUI2 = AppBrandIDCardUI.this;
                int i4 = appBrandIDCardUI2.f345456v;
                if ((i4 == 1 || i4 == 2) && (phoneItem = appBrandIDCardUI2.f345439A) != null) {
                    C91919w.f263170a.mo125750e(phoneItem);
                }
                Intent intent = new Intent();
                intent.putExtra("intent_err_code", yc4.f186486d.f183091d);
                intent.putExtra("intent_auth_token", yc4.f186489g);
                AppBrandIDCardUI.this.setResult(-1, intent);
                AppBrandIDCardUI.this.finish();
            } else if (i3 == 1) {
                C115669n.INSTANCE.mo160131h(14943, AppBrandIDCardUI.this.f345442e, 5, AppBrandIDCardUI.this.f345449o.f354574s);
                AppBrandIDCardUI appBrandIDCardUI3 = AppBrandIDCardUI.this;
                appBrandIDCardUI3.f345453s = str2;
                appBrandIDCardUI3.f345450p = yc4.f186488f;
                Log.m105924i("MicroMsg.AppBrandIDCardUI", "switchToVerifyFragment");
                ((C119157j) C119157j.f356862d).mo183895z(new C115288p(appBrandIDCardUI3));
            }
        } else {
            Log.m105921e("MicroMsg.AppBrandIDCardUI", "SubmitAuthorizeUserID cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", Integer.valueOf(i), Integer.valueOf(i2), str, cVar.f127056b.f127083a);
        }
    }
}
