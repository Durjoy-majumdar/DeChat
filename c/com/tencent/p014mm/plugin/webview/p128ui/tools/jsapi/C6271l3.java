package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.Map;
import k20.C9556a;
import lg3.C76697h;
import nj3.C76879j;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.l3 */
public class C6271l3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23075d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23076e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.l3$a */
    public class C6272a implements DialogInterface.OnClickListener {
        public C6272a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Context context = C6271l3.this.f23076e.f22697d;
            Intent intent = new Intent("android.settings.NFC_SETTINGS");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler$90$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler$90$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C6271l3 l3Var = C6271l3.this;
            l3Var.f23076e.mo7210k5(l3Var.f23075d, "nfcCheckState:nfc_off", (Map<String, Object>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.l3$b */
    public class C6273b implements DialogInterface.OnClickListener {
        public C6273b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C6271l3 l3Var = C6271l3.this;
            l3Var.f23076e.mo7210k5(l3Var.f23075d, "nfcCheckState:nfc_off", (Map<String, Object>) null);
        }
    }

    public C6271l3(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23076e = msgHandler;
        this.f23075d = h1Var;
    }

    public void run() {
        Context context = this.f23076e.f22697d;
        C76879j.m92707A(context, C76697h.m92348a(context).getString(C0966R.string.f361098h92), "", C76697h.m92348a(this.f23076e.f22697d).getString(C0966R.string.f361099h93), C76697h.m92348a(this.f23076e.f22697d).getString(C0966R.string.f7926wf), new C6272a(), new C6273b());
    }
}
