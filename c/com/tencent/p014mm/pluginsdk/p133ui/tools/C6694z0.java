package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import j20.C117292a;
import k20.C9556a;
import qo3.C47883u;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.z0 */
public class C6694z0 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Context f24057a;

    public C6694z0(Context context) {
        this.f24057a = context;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("wxwork://jump"));
        intent.setPackage("com.tencent.wework");
        intent.setFlags(268435456);
        Context context = this.f24057a;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/OpenBusinessViewUtil$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/pluginsdk/ui/tools/OpenBusinessViewUtil$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
