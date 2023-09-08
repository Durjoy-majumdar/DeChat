package iv0;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.backup.backupui.BackupChooseBackupModeUI;

public final /* synthetic */ class d$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupChooseBackupModeUI f29005d;

    public /* synthetic */ d$$a(BackupChooseBackupModeUI backupChooseBackupModeUI) {
        this.f29005d = backupChooseBackupModeUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        BackupChooseBackupModeUI backupChooseBackupModeUI = this.f29005d;
        int i = BackupChooseBackupModeUI.f12012e;
        backupChooseBackupModeUI.finish();
        return true;
    }
}
