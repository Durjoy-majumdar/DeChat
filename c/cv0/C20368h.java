package cv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveRecoverUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cv0.h */
public class C20368h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMoveRecoverUI f57072d;

    public C20368h(BackupMoveRecoverUI backupMoveRecoverUI) {
        this.f57072d = backupMoveRecoverUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.BackupMoveRecoverUI", "minimize BackupMoveRecoverUI");
        BackupMoveRecoverUI backupMoveRecoverUI = this.f57072d;
        boolean z = BackupMoveRecoverUI.f50019q;
        backupMoveRecoverUI.mo7681K7(1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
