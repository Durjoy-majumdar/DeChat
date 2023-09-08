package fv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fv0.e */
public final class C8209e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f27137d;

    public C8209e(BackupMigratePCUI backupMigratePCUI) {
        this.f27137d = backupMigratePCUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$noRecordsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BackupMigratePCUI backupMigratePCUI = this.f27137d;
        BackupMigratePCUI.C18119a aVar = BackupMigratePCUI.f50079o;
        backupMigratePCUI.mo7681K7(1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$noRecordsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
