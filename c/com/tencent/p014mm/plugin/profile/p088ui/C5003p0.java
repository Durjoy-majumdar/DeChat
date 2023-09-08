package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.profile.ui.p0 */
public class C5003p0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f20309d;

    /* renamed from: e */
    public final /* synthetic */ C42660o0 f20310e;

    public C5003p0(C42660o0 o0Var, String str) {
        this.f20310e = o0Var;
        this.f20309d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("tel:" + this.f20309d));
        if (Util.isIntentAvailable(this.f20310e.f115487d, intent, true)) {
            try {
                MMActivity mMActivity = this.f20310e.f115487d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(mMActivity, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo$16", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMActivity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(mMActivity, "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo$16", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ContactWidgetBizInfo", e, "", new Object[0]);
            }
        }
    }
}
