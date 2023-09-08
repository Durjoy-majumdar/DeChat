package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.view.MenuItem;
import java.util.Map;
import nj3.C11184p0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$f */
public class MsgHandler$$f implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f22771d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f22772e;

    public MsgHandler$$f(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f22772e = msgHandler;
        this.f22771d = h1Var;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.f22772e.mo7213m5(MsgHandler.f22664b1, 0);
            MsgHandler msgHandler = this.f22772e;
            C13851h1 h1Var = this.f22771d;
            Context context = msgHandler.f22697d;
            if (context == null) {
                msgHandler.mo7210k5(h1Var, "chooseIdCard:fail", (Map<String, Object>) null);
                return;
            }
            if (!msgHandler.f22675D.mo7013b("identity_pay_auth", context, new C6205b0(msgHandler, h1Var))) {
                msgHandler.mo7210k5(h1Var, "chooseIdCard:fail", (Map<String, Object>) null);
            }
        } else if (itemId == 2) {
            this.f22772e.mo7213m5(MsgHandler.f22663a1, 0);
            this.f22772e.mo7237y5(this.f22771d);
        }
    }
}
