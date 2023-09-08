package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import qo3.C47883u;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.n0 */
public final class C6363n0 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Uri f23287a;

    /* renamed from: b */
    public final /* synthetic */ Context f23288b;

    public C6363n0(Uri uri, Context context) {
        this.f23287a = uri;
        this.f23288b = context;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        if (z) {
            Intent intent = new Intent("android.intent.action.SENDTO", this.f23287a);
            intent.addFlags(268435456);
            try {
                Context context = this.f23288b;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SMSQueryHelper$Companion$showDialog$build$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/SMSQueryHelper$Companion$showDialog$build$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewUI.SMSQueryHelper", "start sms app failed:[%s]", e.getMessage());
            }
        }
    }
}
