package xn0;

import android.os.Bundle;
import d93.C45310h;

/* renamed from: xn0.a0 */
public class C53390a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f150232d;

    /* renamed from: e */
    public final /* synthetic */ C53437j0 f150233e;

    public C53390a0(C53437j0 j0Var, Bundle bundle) {
        this.f150233e = j0Var;
        this.f150232d = bundle;
    }

    public void run() {
        C45310h hVar;
        C53437j0 j0Var = this.f150233e;
        if (j0Var.f150339e != null && (hVar = j0Var.f150340f) != null && hVar.mo70860c().mo69447f(42)) {
            this.f150233e.f150339e.mo73207D(this.f150232d, "download_succ");
        }
    }
}
