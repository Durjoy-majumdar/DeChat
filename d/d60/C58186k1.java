package d60;

import a43.C103310i;
import android.os.Bundle;
import d60.C58124b;

/* renamed from: d60.k1 */
public final class C58186k1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C58169j1 f166641d;

    public C58186k1(C58169j1 j1Var) {
        this.f166641d = j1Var;
    }

    public final void run() {
        this.f166641d.mo82941B0();
        ((C103310i) this.f166641d.f166620w).mo143086b("playend", true, 1, true);
        C58124b.C7172a.m7372a(this.f166641d.f166606f, C58124b.C58125b.LIVE_START_MIC_SDK, (Bundle) null, 2, (Object) null);
    }
}
