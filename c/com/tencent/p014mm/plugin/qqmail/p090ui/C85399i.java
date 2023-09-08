package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.i */
public class C85399i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f248856d;

    /* renamed from: e */
    public final /* synthetic */ ReadMailUI.C85382a f248857e;

    public C85399i(ReadMailUI.C85382a aVar, Bundle bundle) {
        this.f248857e = aVar;
        this.f248856d = bundle;
    }

    public void run() {
        Bundle bundle = this.f248856d;
        if (bundle != null) {
            ReadMailUI.this.f248805A = bundle.getString("mail_app_download_url", "");
            ReadMailUI.this.f248814J = this.f248856d.getString("mail_app_enter_url", "");
            ReadMailUI.this.f248836z = this.f248856d.getBoolean("mail_app_show_recommend", false);
            ReadMailUI readMailUI = ReadMailUI.this;
            if (!readMailUI.f248836z) {
                View view = readMailUI.f248832v;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$13$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$13$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Log.m105921e("MicroMsg.ReadMailUI", "promote qq mail error:MailAppRecomend = %s", Boolean.valueOf(ReadMailUI.this.f248836z));
            }
        }
    }
}
