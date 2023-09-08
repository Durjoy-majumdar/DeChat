package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import java.util.Map;
import ke3.C88144b;
import lg3.C76697h;
import nj3.C76879j;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.j3 */
public class C19425j3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f54850d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f54851e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.j3$a */
    public class C19426a implements DialogInterface.OnClickListener {
        public C19426a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C88144b.m109789g(C19425j3.this.f54851e.f22697d, "setting", ".ui.setting.SettingsAboutSystemUI");
            C19425j3 j3Var = C19425j3.this;
            j3Var.f54851e.mo7210k5(j3Var.f54850d, "nfcCheckState:nfc_wechat_setting_off", (Map<String, Object>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.j3$b */
    public class C19427b implements DialogInterface.OnClickListener {
        public C19427b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C19425j3 j3Var = C19425j3.this;
            j3Var.f54851e.mo7210k5(j3Var.f54850d, "nfcCheckState:nfc_wechat_setting_off", (Map<String, Object>) null);
        }
    }

    public C19425j3(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f54851e = msgHandler;
        this.f54850d = h1Var;
    }

    public void run() {
        Context context = this.f54851e.f22697d;
        C76879j.m92707A(context, C76697h.m92348a(context).getString(C0966R.string.h8y), "", C76697h.m92348a(this.f54851e.f22697d).getString(C0966R.string.f361099h93), C76697h.m92348a(this.f54851e.f22697d).getString(C0966R.string.f7926wf), new C19426a(), new C19427b());
    }
}
