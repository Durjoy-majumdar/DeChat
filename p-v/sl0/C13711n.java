package sl0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C76328d;
import java.util.HashMap;

/* renamed from: sl0.n */
public class C13711n implements C76328d.C76329a {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f38792a;

    /* renamed from: b */
    public final /* synthetic */ int f38793b;

    /* renamed from: c */
    public final /* synthetic */ C90227p f38794c;

    public C13711n(C90227p pVar, C81925i2 i2Var, int i) {
        this.f38794c = pVar;
        this.f38792a = i2Var;
        this.f38793b = i;
    }

    /* renamed from: b */
    public void mo7300b(String str) {
        Log.m105924i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback fail");
        HashMap hashMap = new HashMap();
        hashMap.put("err_desc", str);
        this.f38792a.mo109647a(this.f38793b, this.f38794c.mo115112m("fail", hashMap));
    }

    public void onSuccess(String str) {
        Log.m105925i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback success: %s", str);
        HashMap hashMap = new HashMap();
        hashMap.put("respbuf", str);
        this.f38792a.mo109647a(this.f38793b, this.f38794c.mo115112m("ok", hashMap));
    }
}
