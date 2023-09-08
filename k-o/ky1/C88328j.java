package ky1;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.sdk.platformtools.Log;
import ky1.C88329k;
import u24.C90598g;

/* renamed from: ky1.j */
public class C88328j implements C83164h {

    /* renamed from: a */
    public final /* synthetic */ C88329k f255317a;

    public C88328j(C88329k kVar) {
        this.f255317a = kVar;
    }

    /* renamed from: a */
    public void mo69211a(String str, String str2) {
        Log.m105921e("MicroMsg.LuggageGameJsRuntimeImpl", "handleException, message : %s\n, stackTrace : %s", str, str2);
        String format = String.format("try {WxGameJsCoreBridge.invokeError(\"%s\");} catch(e) {console.log(e);}", new Object[]{C90598g.m113502a("exception : " + str + " ; stack : " + str2)});
        Log.m105925i("MicroMsg.LuggageGameJsRuntimeImpl", "handleException, js = %s", format);
        C88329k kVar = this.f255317a;
        kVar.f255319e.mo112500d(format, new C88329k.C88330a(kVar, (ValueCallback) null));
    }
}
