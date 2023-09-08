package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.Map;
import k20.C9556a;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.s2 */
public class C6311s2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f23177d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23178e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23179f;

    public C6311s2(MsgHandler msgHandler, String str, C13851h1 h1Var) {
        this.f23179f = msgHandler;
        this.f23177d = str;
        this.f23178e = h1Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.f23177d));
        intent.addFlags(268435456);
        boolean z = false;
        try {
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler$6", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler$6", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C115669n.INSTANCE.kvStat(10112, "1");
            dialogInterface.dismiss();
            z = true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MsgHandler", e, "", new Object[0]);
        }
        if (z) {
            this.f23179f.mo7210k5(this.f23178e, "makePhoneCall:succ", (Map<String, Object>) null);
        } else {
            this.f23179f.mo7210k5(this.f23178e, "makePhoneCall:fail", (Map<String, Object>) null);
        }
    }
}
