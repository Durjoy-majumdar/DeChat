package v23;

import android.content.DialogInterface;
import gy3.C8479f0;
import nj3.C76879j;

/* renamed from: v23.y */
public final class C111381y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111379x f333438d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f333439e;

    public C111381y(C111379x xVar, C8479f0<String> f0Var) {
        this.f333438d = xVar;
        this.f333439e = f0Var;
    }

    public final void run() {
        C111379x xVar = this.f333438d;
        xVar.f333436h = C76879j.m92723Q(xVar.f333434f, "", (String) this.f333439e.f27484d, true, false, (DialogInterface.OnCancelListener) null);
    }
}
