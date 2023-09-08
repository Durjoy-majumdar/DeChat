package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;
import qo3.C47883u;

/* renamed from: com.tencent.mm.ui.conversation.InitHelper$$f */
public class InitHelper$$f implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Activity f24647a;

    public InitHelper$$f(InitHelper initHelper, Activity activity) {
        this.f24647a = activity;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        if (z) {
            C115669n.INSTANCE.mo160131h(15181, 3);
            Intent intent = new Intent();
            intent.setClassName(MMApplicationContext.getPackageName(), "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI");
            Activity activity = this.f24647a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Activity activity2 = activity;
            C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/InitHelper$8", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity2, "com/tencent/mm/ui/conversation/InitHelper$8", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        C115669n.INSTANCE.mo160131h(15181, 2);
    }
}
