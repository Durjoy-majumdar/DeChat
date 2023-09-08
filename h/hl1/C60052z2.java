package hl1;

import android.view.ViewGroup;
import qj1.C12399ff;
import qj1.C12522mf;

/* renamed from: hl1.z2 */
public final class C60052z2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171379d;

    public C60052z2(C59988k kVar) {
        this.f171379d = kVar;
    }

    public final void run() {
        ViewGroup viewGroup;
        C12522mf mfVar;
        C59988k kVar = this.f171379d;
        C12399ff ffVar = kVar.f171244u;
        if (ffVar != null && (viewGroup = ffVar.f166287d) != null && (mfVar = kVar.f171234p0) != null) {
            mfVar.f36002y = viewGroup;
            mfVar.mo12154c1(viewGroup);
        }
    }
}
