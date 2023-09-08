package fv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fv0.h */
public final class C107583h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f321885d;

    public C107583h(BackupMigratePCUI backupMigratePCUI) {
        this.f321885d = backupMigratePCUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$recoverFinish$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.BackupPcUI", "onUpdateUIProgress user click start merge.");
        this.f321885d.mo22710d8();
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$recoverFinish$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
