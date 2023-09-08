package com.tencent.p014mm.plugin.account.p024ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Process;
import androidx.appcompat.app.AppCompatActivity;
import bd2.C79690d;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MMNativeJpeg;
import di3.C86312j;
import f40.C75681p0;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.account.ui.j0 */
public class C68501j0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f196772d;

    public C68501j0(LoginHistoryUI loginHistoryUI) {
        this.f196772d = loginHistoryUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent;
        Log.m105924i("MicroMsg.LoginHistoryUI", "db dangerous and auto logout");
        LoginHistoryUI loginHistoryUI = this.f196772d;
        int i2 = LoginHistoryUI.f344496X;
        loginHistoryUI.getClass();
        MMEntryLock.unlock("welcome_page_show");
        C75681p0.m90934a(loginHistoryUI, true);
        BackupProcessMgrExitEvent backupProcessMgrExitEvent = new BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f78724d.f78725a = false;
        backupProcessMgrExitEvent.publish();
        MMNotification mMNotification = (MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA();
        mMNotification.getClass();
        Log.m105918d("MicroMsg.MMNotification", "force cancelNotification");
        mMNotification.f194719f = false;
        mMNotification.f194722i.f194756a.mo93232b();
        loginHistoryUI.finish();
        AppCompatActivity context = loginHistoryUI.getContext();
        Log.appenderFlush();
        MMNativeJpeg.Destroy();
        try {
            intent = new Intent().setClass(context, Class.forName(MMApplicationContext.getLaunchName()));
        } catch (ClassNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.LoginHistoryUI", e, "", new Object[0]);
            intent = null;
        }
        intent.addFlags(67108864);
        intent.putExtra("absolutely_exit_pid", Process.myPid());
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "exitApplication", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "exitApplication", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
