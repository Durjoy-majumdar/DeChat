package cv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cv0.j */
public class C20370j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMoveUI f57074d;

    public C20370j(BackupMoveUI backupMoveUI) {
        this.f57074d = backupMoveUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BackupMoveUI backupMoveUI = this.f57074d;
        int i = BackupMoveUI.f50057o;
        backupMoveUI.mo7681K7(1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
