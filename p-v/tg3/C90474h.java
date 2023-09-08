package tg3;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sandbox.updater.AppUpdaterUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77398g;

/* renamed from: tg3.h */
public class C90474h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppUpdaterUI f260027d;

    public C90474h(AppUpdaterUI appUpdaterUI) {
        this.f260027d = appUpdaterUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105918d("MicroMsg.AppUpdaterUI", "update dialog had been canceled");
        C77398g gVar = this.f260027d.f249737e;
        if (gVar != null && gVar.isShowing()) {
            this.f260027d.f249737e.dismiss();
        }
        AppUpdaterUI.m105873G7(this.f260027d, 6);
        if (this.f260027d.f249739g.f260009u) {
            C115669n.INSTANCE.idkeyStat(614, 59, 1, true);
            Log.m105918d("MicroMsg.AppUpdaterUI", "isTinkerPatch boots download cancel when downloading.");
        }
        this.f260027d.f249739g.mo124630j();
        this.f260027d.f249739g.mo124631k(2, true);
        this.f260027d.mo119311H7();
    }
}
