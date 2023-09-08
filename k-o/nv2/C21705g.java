package nv2;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import vt3.C22793a;

/* renamed from: nv2.g */
public class C21705g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C21696b f61425d;

    public C21705g(C21696b bVar) {
        this.f61425d = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.SoterControllerFingerprint", "hy: user cancelled auth by click button");
        C22793a aVar = this.f61425d.f61408j;
        if (aVar != null) {
            aVar.mo35943a(true);
        }
        C21696b bVar = this.f61425d;
        if (bVar.f61432d != null) {
            bVar.mo33976a();
            bVar.f61432d.obtainMessage(1, bVar.f61430b).sendToTarget();
            return;
        }
        Log.m105920e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
}
