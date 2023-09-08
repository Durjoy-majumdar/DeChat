package tg3;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sandbox.updater.AppInstallerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;
import qo3.C77398g;

/* renamed from: tg3.a */
public class C90460a implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ AppInstallerUI f259983d;

    public C90460a(AppInstallerUI appInstallerUI) {
        this.f259983d = appInstallerUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        AppInstallerUI appInstallerUI = this.f259983d;
        AppInstallerUI appInstallerUI2 = AppInstallerUI.f249728n;
        appInstallerUI.getClass();
        Log.m105918d("MicroMsg.AppInstallerUI", "showInstallCancelAlert");
        C77398g gVar = appInstallerUI.f249729e;
        if (gVar != null && gVar.isShowing()) {
            appInstallerUI.f249729e.dismiss();
        }
        C77398g gVar2 = appInstallerUI.f249730f;
        if (gVar2 == null || !gVar2.isShowing()) {
            appInstallerUI.f249730f = C76879j.m92740k(appInstallerUI, C0966R.string.auo, C0966R.string.a3h, C0966R.string.aup, C0966R.string.f360322bv2, false, new C90469c(appInstallerUI), new C90470d(appInstallerUI));
            return;
        }
        Log.m105918d("MicroMsg.AppInstallerUI", "cancelDialog already shown");
    }
}
