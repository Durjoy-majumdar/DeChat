package xn0;

import android.os.Bundle;

/* renamed from: xn0.z */
public class C53446z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f150349d;

    /* renamed from: e */
    public final /* synthetic */ C53437j0 f150350e;

    public C53446z(C53437j0 j0Var, Bundle bundle) {
        this.f150350e = j0Var;
        this.f150349d = bundle;
    }

    public void run() {
        if (this.f150350e.f150339e != null) {
            this.f150350e.f150339e.mo73225V(this.f150349d.getString("webview_network_type"));
        }
    }
}
