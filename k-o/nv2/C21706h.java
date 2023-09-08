package nv2;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: nv2.h */
public class C21706h implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C21696b f61426d;

    public C21706h(C21696b bVar) {
        this.f61426d = bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy: user cancelled auth");
        C21696b bVar = this.f61426d;
        if (bVar.f61432d != null) {
            bVar.mo33976a();
            bVar.f61432d.obtainMessage(1, bVar.f61430b).sendToTarget();
            return;
        }
        Log.m105920e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
}
