package cv0;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveChooseUI;

public final /* synthetic */ class d$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMoveChooseUI f57058d;

    public /* synthetic */ d$$a(BackupMoveChooseUI backupMoveChooseUI) {
        this.f57058d = backupMoveChooseUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        BackupMoveChooseUI backupMoveChooseUI = this.f57058d;
        int i = BackupMoveChooseUI.f49974H;
        backupMoveChooseUI.finish();
        return false;
    }
}
