package vl2;

import android.content.DialogInterface;
import android.os.Bundle;
import f40.C86709a0;
import ml2.C10931f;
import ob0.C117747y;

public class j$$g implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public final /* synthetic */ C102212j f300962b;

    /* renamed from: d */
    public final /* synthetic */ C117747y f300963d;

    public j$$g(C102212j jVar, C117747y yVar) {
        this.f300962b = jVar;
        this.f300963d = yVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f300963d);
        C10931f.C10933a aVar = this.f300962b.f300947t;
        if (aVar != null) {
            aVar.mo361b(1, (Bundle) null);
        }
    }
}
