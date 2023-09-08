package vl2;

import android.content.DialogInterface;
import android.os.Bundle;
import ml2.C10931f;
import qy2.C101318t;

/* renamed from: vl2.l */
public class C102214l implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public final /* synthetic */ C102212j f300993b;

    /* renamed from: d */
    public final /* synthetic */ C101318t f300994d;

    public C102214l(C102212j jVar, C101318t tVar) {
        this.f300993b = jVar;
        this.f300994d = tVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f300994d.cancel();
        C10931f.C10933a aVar = this.f300993b.f300947t;
        if (aVar != null) {
            aVar.mo361b(1, (Bundle) null);
        }
    }
}
