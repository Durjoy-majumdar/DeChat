package cv0;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveChooseUI;
import java.util.Calendar;

public final /* synthetic */ class d$$i implements C19877i.C19878a {

    /* renamed from: a */
    public final /* synthetic */ BackupMoveChooseUI f57067a;

    /* renamed from: b */
    public final /* synthetic */ boolean f57068b;

    public /* synthetic */ d$$i(BackupMoveChooseUI backupMoveChooseUI, boolean z) {
        this.f57067a = backupMoveChooseUI;
        this.f57068b = z;
    }

    public final void onResult(boolean z, int i, int i2, int i3) {
        View view;
        BackupMoveChooseUI backupMoveChooseUI = this.f57067a;
        boolean z2 = this.f57068b;
        int i4 = BackupMoveChooseUI.f49974H;
        backupMoveChooseUI.getClass();
        if (z) {
            Calendar instance = Calendar.getInstance();
            instance.set(i, i2 - 1, i3);
            if (z2) {
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                long timeInMillis = instance.getTimeInMillis();
                backupMoveChooseUI.f50000z = timeInMillis;
                backupMoveChooseUI.mo22646V7(backupMoveChooseUI.f49976B, timeInMillis);
            } else {
                instance.set(11, 23);
                instance.set(12, 59);
                instance.set(13, 59);
                instance.set(14, 999);
                long timeInMillis2 = instance.getTimeInMillis();
                backupMoveChooseUI.f49975A = timeInMillis2;
                backupMoveChooseUI.mo22646V7(backupMoveChooseUI.f49977C, timeInMillis2);
            }
            if (backupMoveChooseUI.f49975A != 0 && backupMoveChooseUI.f50000z != 0 && (view = backupMoveChooseUI.f49978D) != null) {
                view.setEnabled(true);
            }
        }
    }
}
