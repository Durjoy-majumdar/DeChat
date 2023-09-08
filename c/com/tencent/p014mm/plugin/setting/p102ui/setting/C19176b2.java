package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.wcdb.support.CancellationSignal;
import di3.C86312j;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76879j;
import p275xz.C79012e;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.b2 */
public class C19176b2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsChattingUI f53979d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.b2$a */
    public class C19177a implements DialogInterface.OnCancelListener {
        public C19177a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            SettingsChattingUI settingsChattingUI = C19176b2.this.f53979d;
            settingsChattingUI.f205713f = true;
            settingsChattingUI.f205714g.cancel();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.b2$b */
    public class C19178b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f53981d;

        public C19178b(ArrayList arrayList) {
            this.f53981d = arrayList;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14553, 5, 4, "");
            SettingsChattingUI settingsChattingUI = C19176b2.this.f53979d;
            settingsChattingUI.f205713f = true;
            settingsChattingUI.f205714g.cancel();
            if (this.f53981d.size() <= 1) {
                Intent intent = new Intent();
                intent.putExtra("Chat_User", (String) this.f53981d.get(0));
                intent.addFlags(67108864);
                C88144b.m109801s(C19176b2.this.f53979d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                return;
            }
            Intent intent2 = new Intent();
            intent2.putStringArrayListExtra("key_conversation_list", this.f53981d);
            C88144b.m109801s(C19176b2.this.f53979d, ".ui.conversation.SettingCheckUnProcessWalletConvUI", intent2, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.b2$c */
    public class C19179c implements DialogInterface.OnClickListener {
        public C19179c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14553, 5, 3, "");
            C19176b2.this.f53979d.f205712e.show();
            SettingsChattingUI settingsChattingUI = C19176b2.this.f53979d;
            settingsChattingUI.f205713f = false;
            settingsChattingUI.f205714g = new CancellationSignal();
            SettingsChattingUI settingsChattingUI2 = C19176b2.this.f53979d;
            settingsChattingUI2.getClass();
            ThreadPool.post(new C19180c2(settingsChattingUI2), "doResetChatHistory");
        }
    }

    public C19176b2(SettingsChattingUI settingsChattingUI) {
        this.f53979d = settingsChattingUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.SettingsChattingUI", "Clean all messages confirmed.");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(14553, 5, 2, "");
        nVar.idkeyStat(324, 0, 1, false);
        SettingsChattingUI settingsChattingUI = this.f53979d;
        settingsChattingUI.f205713f = false;
        settingsChattingUI.f205714g = new CancellationSignal();
        SettingsChattingUI settingsChattingUI2 = this.f53979d;
        settingsChattingUI2.f205712e = C76879j.m92723Q(settingsChattingUI2, settingsChattingUI2.getString(C0966R.string.a3h), this.f53979d.getString(C0966R.string.a4d), true, true, new C19177a());
        ArrayList<String> wQ = ((C79012e) C86312j.m106911c(C79012e.class)).mo61653wQ();
        if (wQ == null || wQ.size() <= 0) {
            SettingsChattingUI settingsChattingUI3 = this.f53979d;
            settingsChattingUI3.getClass();
            ThreadPool.post(new C19180c2(settingsChattingUI3), "doResetChatHistory");
            return;
        }
        this.f53979d.f205712e.dismiss();
        SettingsChattingUI settingsChattingUI4 = this.f53979d;
        C76879j.m92718L(settingsChattingUI4, false, settingsChattingUI4.getString(C0966R.string.krd, new Object[]{Integer.valueOf(wQ.size())}), (String) null, this.f53979d.getString(C0966R.string.fey), this.f53979d.getString(C0966R.string.bfe), new C19178b(wQ), new C19179c(), -1, C0966R.color.f3041d1);
    }
}
