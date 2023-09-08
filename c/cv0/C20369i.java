package cv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cv0.i */
public class C20369i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMoveUI f57073d;

    public C20369i(BackupMoveUI backupMoveUI) {
        this.f57073d = backupMoveUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BackupMoveUI backupMoveUI = this.f57073d;
        int i = BackupMoveUI.f50057o;
        backupMoveUI.mo22687O7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
