package gk0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import te3.C48806b40;

/* renamed from: gk0.b */
public class C45919b implements C87581a<Object, C48806b40> {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f123899a;

    /* renamed from: b */
    public final /* synthetic */ int f123900b;

    /* renamed from: c */
    public final /* synthetic */ C45920c f123901c;

    public C45919b(C45920c cVar, C83780d1 d1Var, int i) {
        this.f123901c = cVar;
        this.f123899a = d1Var;
        this.f123900b = i;
    }

    public Object call(Object obj) {
        C48806b40 b402 = (C48806b40) obj;
        if (b402 == null) {
            Log.m105920e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData cgi failed, null response");
            this.f123899a.mo109647a(this.f123900b, this.f123901c.mo115109j("fail:cgi fail"));
            return null;
        }
        int i = b402.BaseResponse.f135955d;
        if (i != 0) {
            Log.m105921e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData cgi failed, errCode = %d, errMsg = %s", Integer.valueOf(i), b402.BaseResponse.f135956e);
            this.f123899a.mo109647a(this.f123900b, this.f123901c.mo115109j("fail:cgi fail"));
            return null;
        }
        Log.m105924i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData success");
        this.f123899a.mo109647a(this.f123900b, this.f123901c.mo115109j("ok"));
        return null;
    }
}
