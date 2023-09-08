package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.dbbackup.DBRecoveryUI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.InitHelper$$c */
public class InitHelper$$c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ InitHelper f219459d;

    public InitHelper$$c(InitHelper initHelper) {
        this.f219459d = initHelper;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f219459d.f219440e.dismiss();
        Intent intent = new Intent(this.f219459d.f219447o, DBRecoveryUI.class);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        Activity activity = this.f219459d.f219447o;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/InitHelper$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/ui/conversation/InitHelper$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
