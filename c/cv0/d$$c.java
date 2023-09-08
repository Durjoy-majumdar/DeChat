package cv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveChooseUI;
import qo3.C12925w;
import yu0.C102913k;

public final /* synthetic */ class d$$c implements MMFilterDialog.C74985f {

    /* renamed from: a */
    public final /* synthetic */ BackupMoveChooseUI f57060a;

    public /* synthetic */ d$$c(BackupMoveChooseUI backupMoveChooseUI) {
        this.f57060a = backupMoveChooseUI;
    }

    /* renamed from: a */
    public final void mo31857a(int i) {
        View view;
        BackupMoveChooseUI backupMoveChooseUI = this.f57060a;
        int i2 = BackupMoveChooseUI.f49974H;
        if (i == 0) {
            backupMoveChooseUI.mo22645U7(0, 0, 0, backupMoveChooseUI.f49996v);
        } else if (i == 1) {
            backupMoveChooseUI.getClass();
            backupMoveChooseUI.mo22645U7(1, System.currentTimeMillis() - 7862400000L, System.currentTimeMillis(), backupMoveChooseUI.f49996v);
        } else if (i == 2) {
            C12925w wVar = new C12925w(backupMoveChooseUI.getContext());
            View inflate = LayoutInflater.from(backupMoveChooseUI.getContext()).inflate(C0966R.C0971layout.cxi, (ViewGroup) null);
            inflate.findViewById(C0966R.C0970id.bec).setOnClickListener(new d$$e(wVar));
            backupMoveChooseUI.f49978D = inflate.findViewById(C0966R.C0970id.n68);
            backupMoveChooseUI.f49993s = (TextView) inflate.findViewById(C0966R.C0970id.n65);
            backupMoveChooseUI.f49978D.setOnClickListener(new d$$f(backupMoveChooseUI, wVar));
            backupMoveChooseUI.f49978D.setEnabled(false);
            backupMoveChooseUI.f49976B = (TextView) inflate.findViewById(C0966R.C0970id.n67);
            backupMoveChooseUI.f49977C = (TextView) inflate.findViewById(C0966R.C0970id.f357489n60);
            long j = backupMoveChooseUI.f50000z;
            if (j > 0) {
                backupMoveChooseUI.mo22646V7(backupMoveChooseUI.f49976B, j);
            }
            long j2 = backupMoveChooseUI.f49975A;
            if (j2 > 0) {
                backupMoveChooseUI.mo22646V7(backupMoveChooseUI.f49977C, j2);
            }
            if (!(backupMoveChooseUI.f49975A == 0 || backupMoveChooseUI.f50000z == 0 || (view = backupMoveChooseUI.f49978D) == null)) {
                view.setEnabled(true);
            }
            backupMoveChooseUI.f49976B.setOnClickListener(new d$$g(backupMoveChooseUI));
            backupMoveChooseUI.f49977C.setOnClickListener(new d$$h(backupMoveChooseUI));
            wVar.mo12471k(inflate);
            wVar.mo5086o();
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
