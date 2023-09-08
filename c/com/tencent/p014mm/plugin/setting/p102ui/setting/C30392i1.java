package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p605mj.C34575a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.i1 */
public class C30392i1 implements DialogInterface.OnClickListener {

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.i1$a */
    public class C30393a implements Runnable {
        public C30393a(C30392i1 i1Var) {
        }

        public void run() {
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$2$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$2$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }

    public C30392i1(SettingsAboutSystemUI settingsAboutSystemUI) {
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C34575a.m40397b(!C34575a.m40396a());
        C86709a0.m107528h().mo121100o();
        MMHandlerThread.postToMainThread(new C30393a(this));
    }
}
