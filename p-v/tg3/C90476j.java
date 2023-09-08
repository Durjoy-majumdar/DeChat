package tg3;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sandbox.updater.AppUpdaterUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import lg3.C76697h;
import nj3.C76879j;

/* renamed from: tg3.j */
public class C90476j implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ AppUpdaterUI f260029d;

    public C90476j(AppUpdaterUI appUpdaterUI) {
        this.f260029d = appUpdaterUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        AppUpdaterUI appUpdaterUI = this.f260029d;
        AppUpdaterUI appUpdaterUI2 = AppUpdaterUI.f249736j;
        appUpdaterUI.getClass();
        Log.m105918d("MicroMsg.AppUpdaterUI", "showDownloadCancelAlert");
        C90461a0 a0Var = appUpdaterUI.f249739g;
        if (a0Var.f260012x) {
            C90474h hVar = new C90474h(appUpdaterUI);
            C90475i iVar = new C90475i(appUpdaterUI);
            C76879j.m92714H(appUpdaterUI, C76697h.m92349b(appUpdaterUI, C0966R.string.aul), C76697h.m92349b(appUpdaterUI, C0966R.string.a3h), false, hVar, iVar);
            return;
        }
        if (a0Var.f260006r == 1) {
            C90499y.m113322h(appUpdaterUI, 7, 0);
            if (appUpdaterUI.f249739g.f260009u) {
                C115669n.INSTANCE.idkeyStat(614, 57, 1, true);
                Log.m105918d("MicroMsg.AppUpdaterUI", "HdiffApk, isTinkerPatch boots download cancel.");
            }
        }
        C90499y.m113323i(appUpdaterUI, 6);
        appUpdaterUI.f249739g.mo124631k(2, true);
        appUpdaterUI.mo119311H7();
    }
}
