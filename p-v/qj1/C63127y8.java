package qj1;

import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import hl1.C59988k;
import vk1.C65762c;

/* renamed from: qj1.y8 */
public final class C63127y8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C62949r8 f179135d;

    /* renamed from: e */
    public final /* synthetic */ String f179136e;

    public C63127y8(C62949r8 r8Var, String str) {
        this.f179135d = r8Var;
        this.f179136e = str;
    }

    public final void run() {
        C59988k startUIC;
        C56032b z0 = this.f179135d.mo14484z0();
        C65762c cVar = z0 instanceof C65762c ? (C65762c) z0 : null;
        if (cVar != null && (startUIC = cVar.getStartUIC()) != null) {
            startUIC.mo84882Q(this.f179136e);
        }
    }
}
