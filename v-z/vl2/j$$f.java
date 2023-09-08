package vl2;

import android.content.DialogInterface;
import android.os.Bundle;
import f40.C86709a0;
import ml2.C10931f;
import ob0.C117747y;

public class j$$f implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C117747y f300960d;

    /* renamed from: e */
    public final /* synthetic */ C102212j f300961e;

    public j$$f(C102212j jVar, C117747y yVar) {
        this.f300961e = jVar;
        this.f300960d = yVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f300960d);
        C10931f.C10933a aVar = this.f300961e.f300947t;
        if (aVar != null) {
            aVar.mo361b(1, (Bundle) null);
        }
    }
}
