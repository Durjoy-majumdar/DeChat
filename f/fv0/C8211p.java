package fv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fv0.p */
public final class C8211p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f27139d;

    public C8211p(BackupMigratePCUI backupMigratePCUI) {
        this.f27139d = backupMigratePCUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$retryStartAndCancel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BackupMigratePCUI backupMigratePCUI = this.f27139d;
        BackupMigratePCUI.C18119a aVar = BackupMigratePCUI.f50079o;
        backupMigratePCUI.mo7681K7(1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$retryStartAndCancel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
