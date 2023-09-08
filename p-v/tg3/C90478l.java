package tg3;

import android.content.DialogInterface;
import com.tencent.p014mm.sandbox.monitor.C85705h;
import com.tencent.p014mm.sandbox.updater.AppUpdaterUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: tg3.l */
public class C90478l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C85705h f260032d;

    /* renamed from: e */
    public final /* synthetic */ AppUpdaterUI f260033e;

    public C90478l(AppUpdaterUI appUpdaterUI, C85705h hVar) {
        this.f260033e = appUpdaterUI;
        this.f260032d = hVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105918d("MicroMsg.AppUpdaterUI", "click download button");
        AppUpdaterUI.m105873G7(this.f260033e, 11);
        C85705h hVar = this.f260032d;
        if (hVar != null) {
            hVar.mo119307b();
        }
        C90461a0 a0Var = this.f260033e.f249739g;
        a0Var.f260007s = true;
        a0Var.mo124632l(false);
    }
}
