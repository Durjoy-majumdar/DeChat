package sl0;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C76328d;
import ob0.C47350c;
import te3.C49491fz3;

/* renamed from: sl0.o */
public class C90226o implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C76328d.C76329a f259042a;

    public C90226o(C90227p pVar, C76328d.C76329a aVar) {
        this.f259042a = aVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        Log.m105924i("MicroMsg.JsApiSecureTunnel", "onGYNetEnd errType :" + i + " errCode: " + i2 + " errMsg :" + str);
        if (i == 0 && i2 == 0 && cVar.f127056b.f127083a != null) {
            Log.m105924i("MicroMsg.JsApiSecureTunnel", "secureTunnel cgi success");
            this.f259042a.onSuccess(((C49491fz3) cVar.f127056b.f127083a).f133753d);
            return;
        }
        Log.m105920e("MicroMsg.JsApiSecureTunnel", "secureTunnel cgi failed");
        this.f259042a.mo7300b(str);
    }
}
