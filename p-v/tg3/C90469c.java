package tg3;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sandbox.updater.AppInstallerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77398g;
import tg3.C90461a0;

/* renamed from: tg3.c */
public class C90469c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppInstallerUI f260022d;

    public C90469c(AppInstallerUI appInstallerUI) {
        this.f260022d = appInstallerUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105918d("MicroMsg.AppInstallerUI", "install dialog had been canceled");
        C77398g gVar = this.f260022d.f249729e;
        if (gVar != null && gVar.isShowing()) {
            this.f260022d.f249729e.dismiss();
        }
        C90461a0.C90464c.f260018a.mo124631k(2, true);
        AppInstallerUI appInstallerUI = this.f260022d;
        if (appInstallerUI.f249733i == 2) {
            C90499y.m113322h(appInstallerUI, 4, 0);
        }
        C115669n.INSTANCE.idkeyStat(405, 74, 1, true);
        C90499y.m113320f();
        this.f260022d.finish();
    }
}
