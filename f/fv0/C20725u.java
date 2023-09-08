package fv0;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import com.tencent.p014mm.plugin.backup.backupui.PCChooseConversationUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fv0.u */
public final class C20725u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f58591d;

    public C20725u(BackupMigratePCUI backupMigratePCUI) {
        this.f58591d = backupMigratePCUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$startBackup$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BackupMigratePCUI backupMigratePCUI = this.f58591d;
        BackupMigratePCUI.C18119a aVar = BackupMigratePCUI.f50079o;
        backupMigratePCUI.getClass();
        Intent intent = new Intent(backupMigratePCUI, PCChooseConversationUI.class);
        intent.putExtra("isMigrate", true);
        MMWizardActivity.m7017L7(backupMigratePCUI, intent);
        backupMigratePCUI.mo22694N7().mo140765b();
        backupMigratePCUI.mo22694N7().mo140766c();
        backupMigratePCUI.mo22694N7().mo140764a(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$startBackup$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
