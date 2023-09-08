package fv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fv0.d */
public final class C107581d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f321883d;

    public C107581d(BackupMigratePCUI backupMigratePCUI) {
        this.f321883d = backupMigratePCUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f321883d.mo22709c8();
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
