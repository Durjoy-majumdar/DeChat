package xn0;

import android.os.Bundle;
import d93.C45310h;

/* renamed from: xn0.c0 */
public class C53404c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f150257d;

    /* renamed from: e */
    public final /* synthetic */ C53437j0 f150258e;

    public C53404c0(C53437j0 j0Var, Bundle bundle) {
        this.f150258e = j0Var;
        this.f150257d = bundle;
    }

    public void run() {
        C45310h hVar;
        C53437j0 j0Var = this.f150258e;
        if (j0Var.f150339e != null && (hVar = j0Var.f150340f) != null && hVar.mo70860c().mo69447f(42)) {
            this.f150258e.f150339e.mo73207D(this.f150257d, "download_removed");
        }
    }
}
