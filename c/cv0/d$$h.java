package cv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveChooseUI;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class d$$h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMoveChooseUI f57066d;

    public /* synthetic */ d$$h(BackupMoveChooseUI backupMoveChooseUI) {
        this.f57066d = backupMoveChooseUI;
    }

    public final void onClick(View view) {
        BackupMoveChooseUI backupMoveChooseUI = this.f57066d;
        int i = BackupMoveChooseUI.f49974H;
        backupMoveChooseUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupMoveChooseUI, array);
        backupMoveChooseUI.mo22643S7(false);
        if (!(backupMoveChooseUI.f49975A == 0 || backupMoveChooseUI.f50000z == 0)) {
            backupMoveChooseUI.f49978D.setEnabled(true);
        }
        C117292a.m165361g(backupMoveChooseUI, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
