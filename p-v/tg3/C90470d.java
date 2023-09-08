package tg3;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sandbox.updater.AppInstallerUI;
import qo3.C77398g;

/* renamed from: tg3.d */
public class C90470d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppInstallerUI f260023d;

    public C90470d(AppInstallerUI appInstallerUI) {
        this.f260023d = appInstallerUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.idkeyStat(405, 75, 1, true);
        C77398g gVar = this.f260023d.f249729e;
        if (gVar != null && !gVar.isShowing()) {
            this.f260023d.f249729e.show();
        }
    }
}
