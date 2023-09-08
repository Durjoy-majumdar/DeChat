package fv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fv0.o */
public final class C107591o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f321893d;

    public C107591o(BackupMigratePCUI backupMigratePCUI) {
        this.f321893d = backupMigratePCUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$retryStartAndCancel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f321893d.mo22696P7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$retryStartAndCancel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
