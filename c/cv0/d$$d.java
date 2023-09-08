package cv0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveChooseUI;
import yu0.C102913k;

public final /* synthetic */ class d$$d implements MMFilterDialog.C74985f {

    /* renamed from: a */
    public final /* synthetic */ BackupMoveChooseUI f57061a;

    public /* synthetic */ d$$d(BackupMoveChooseUI backupMoveChooseUI) {
        this.f57061a = backupMoveChooseUI;
    }

    /* renamed from: a */
    public final void mo31857a(int i) {
        BackupMoveChooseUI backupMoveChooseUI = this.f57061a;
        if (i == 0) {
            backupMoveChooseUI.mo22645U7(backupMoveChooseUI.f49995u, backupMoveChooseUI.f49997w, backupMoveChooseUI.f49998x, 0);
        } else if (i == 1) {
            backupMoveChooseUI.mo22645U7(backupMoveChooseUI.f49995u, backupMoveChooseUI.f49997w, backupMoveChooseUI.f49998x, 1);
        }
        C20365c cVar = backupMoveChooseUI.f49982e;
        int i2 = backupMoveChooseUI.f49996v;
        if (i2 != cVar.f57047g) {
            cVar.f57047g = i2;
            cVar.notifyDataSetChanged();
        }
        long O7 = backupMoveChooseUI.mo22639O7(backupMoveChooseUI.f49982e.f57045e);
        if (backupMoveChooseUI.f49979E && O7 > 0) {
            backupMoveChooseUI.f49992r.setVisibility(0);
            backupMoveChooseUI.f49992r.setText(backupMoveChooseUI.getResources().getString(C0966R.string.mjo, new Object[]{C102913k.m136058w((float) O7)}));
        } else if (O7 == 0) {
            backupMoveChooseUI.f49992r.setVisibility(8);
        }
    }
}
