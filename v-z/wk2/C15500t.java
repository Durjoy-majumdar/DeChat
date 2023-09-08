package wk2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import ke3.C88144b;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;
import zt3.C119157j;

/* renamed from: wk2.t */
public final class C15500t extends C15805b {

    /* renamed from: f */
    public static final C15500t f42037f = new C15500t();

    /* renamed from: g */
    public static final String f42038g = "send";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) ((HashMap) h1Var.f38983a).get("content");
        if (str == null) {
            str = "";
        }
        Log.m105924i("MicroMsg.JsApiSend", "ScanJsApi-Call:send");
        if (str.length() == 0) {
            Log.m105920e("MicroMsg.JsApiSend", "ScanJsApi-Call:send text is empty");
        } else {
            Intent intent = new Intent();
            intent.putExtra("Retr_Msg_content", str);
            intent.putExtra("Retr_Msg_Type", 4);
            intent.putExtra("Retr_show_success_tips", false);
            Context context = jVar.f38998a;
            if (context instanceof MMActivity) {
                Context context2 = jVar.f38998a;
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                C88144b.m109803u((MMActivity) context2, "com.tencent.mm.ui.transmit.MsgRetransmitUI", intent, hashCode() & 65535, new C15499s(this, jVar));
            } else {
                C88144b.m109801s(context, "com.tencent.mm.ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
                ((C119157j) C119157j.f356862d).mo183895z(new C15498r(jVar));
            }
        }
        C13849g gVar = jVar.f39001d;
        String str2 = h1Var.f38990c;
        gVar.mo10774a(str2, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42038g;
    }
}
