package gk0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import te3.C52314zv3;

/* renamed from: gk0.u0 */
public class C45932u0 implements C87581a<Object, C52314zv3> {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f123931a;

    /* renamed from: b */
    public final /* synthetic */ int f123932b;

    /* renamed from: c */
    public final /* synthetic */ C45933v0 f123933c;

    public C45932u0(C45933v0 v0Var, C83780d1 d1Var, int i) {
        this.f123933c = v0Var;
        this.f123931a = d1Var;
        this.f123932b = i;
    }

    public Object call(Object obj) {
        C52314zv3 zv32 = (C52314zv3) obj;
        if (zv32 == null) {
            Log.m105920e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData SaveUserAutoFillInfo cgi failed, null response");
            this.f123931a.mo109647a(this.f123932b, this.f123933c.mo115109j("fail:cgi fail"));
            return null;
        }
        int i = zv32.BaseResponse.f135955d;
        if (i != 0) {
            Log.m105921e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData SaveUserAutoFillInfo cgi failed, errCode = %d, errMsg = %s", Integer.valueOf(i), zv32.BaseResponse.f135956e);
            this.f123931a.mo109647a(this.f123932b, this.f123933c.mo115109j("fail:cgi fail"));
            return null;
        }
        Log.m105924i("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData success");
        this.f123931a.mo109647a(this.f123932b, this.f123933c.mo115109j("ok"));
        return null;
    }
}
