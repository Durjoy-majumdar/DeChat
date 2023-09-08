package cv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveChooseUI;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class d$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMoveChooseUI f57059d;

    public /* synthetic */ d$$b(BackupMoveChooseUI backupMoveChooseUI) {
        this.f57059d = backupMoveChooseUI;
    }

    public final void onClick(View view) {
        BackupMoveChooseUI backupMoveChooseUI = this.f57059d;
        int i = BackupMoveChooseUI.f49974H;
        backupMoveChooseUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupMoveChooseUI, array);
        backupMoveChooseUI.mo22638N7();
        C117292a.m165361g(backupMoveChooseUI, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
