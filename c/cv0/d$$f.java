package cv0;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveChooseUI;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Date;
import qo3.C12925w;

public final /* synthetic */ class d$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupMoveChooseUI f57063d;

    /* renamed from: e */
    public final /* synthetic */ C12925w f57064e;

    public /* synthetic */ d$$f(BackupMoveChooseUI backupMoveChooseUI, C12925w wVar) {
        this.f57063d = backupMoveChooseUI;
        this.f57064e = wVar;
    }

    public final void onClick(View view) {
        BackupMoveChooseUI backupMoveChooseUI = this.f57063d;
        C12925w wVar = this.f57064e;
        int i = BackupMoveChooseUI.f49974H;
        backupMoveChooseUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(wVar);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupMoveChooseUI, array);
        long j = backupMoveChooseUI.f50000z;
        long j2 = backupMoveChooseUI.f49975A;
        if (j >= j2) {
            backupMoveChooseUI.f49993s.setVisibility(0);
            C117292a.m165361g(backupMoveChooseUI, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        backupMoveChooseUI.mo22645U7(1, j, j2, backupMoveChooseUI.f49996v);
        wVar.mo5085n();
        MMFilterDialog.C74986g.C74987a aVar = backupMoveChooseUI.f49980F;
        aVar.f220588b = backupMoveChooseUI.f49999y.format(new Date(backupMoveChooseUI.f49997w)) + "~" + backupMoveChooseUI.f49999y.format(new Date(backupMoveChooseUI.f49998x));
        aVar.f220589c = true;
        C117292a.m165361g(backupMoveChooseUI, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
