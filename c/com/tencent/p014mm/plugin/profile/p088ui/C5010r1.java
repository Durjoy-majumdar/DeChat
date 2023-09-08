package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.profile.ui.r1 */
public class C5010r1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C5005q1 f20322d;

    public C5010r1(C5005q1 q1Var) {
        this.f20322d = q1Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (ChannelUtil.channelId == 1) {
            Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.tencent.qqpim")).addFlags(268435456);
            if (Util.isIntentAvailable(this.f20322d.f20312d, addFlags, true)) {
                try {
                    Context context = this.f20322d.f20312d;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(addFlags);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactWidgetQQSync$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/profile/ui/ContactWidgetQQSync$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ContactWidgetQQSync", e, "", new Object[0]);
                }
            }
        }
    }
}
