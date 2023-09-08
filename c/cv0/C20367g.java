package cv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveRecoverUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cv0.g */
public class C20367g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMoveRecoverUI f57071d;

    public C20367g(BackupMoveRecoverUI backupMoveRecoverUI) {
        this.f57071d = backupMoveRecoverUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BackupMoveRecoverUI backupMoveRecoverUI = this.f57071d;
        boolean z = BackupMoveRecoverUI.f50019q;
        backupMoveRecoverUI.mo22662P7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
