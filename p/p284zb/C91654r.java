package p284zb;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.plugin.appbrand.debugger.C81695a0;
import com.tencent.p014mm.plugin.appbrand.debugger.C81738h0;
import com.tencent.p014mm.plugin.appbrand.debugger.C81745v;
import com.tencent.p014mm.sdk.platformtools.Log;
import p284zb.C91635f;
import te3.kw4;

/* renamed from: zb.r */
public class C91654r<SERVICE extends C91635f> {

    /* renamed from: a */
    public C81745v f262633a;

    public C91654r(SERVICE service) {
    }

    @JavascriptInterface
    public void sendCustomMessage(String str, String str2) {
        C81745v vVar = this.f262633a;
        if (vVar != null) {
            C81695a0 a0Var = vVar.f239914h;
            a0Var.getClass();
            Log.m105919d("MicroMsg.RemoteDebugMsgMrg", "sendCustomMsg payload:%s", str2);
            kw4 kw4 = new kw4();
            kw4.f183992d = str;
            kw4.f183993e = str2;
            a0Var.mo114052h(C81738h0.m100298d(kw4, a0Var.f239778b, "customMessage"));
        }
    }

    @JavascriptInterface
    public void sendMessage(String str, String str2) {
    }
}
