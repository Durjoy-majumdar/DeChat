package h43;

import com.tencent.p014mm.sdk.platformtools.Log;
import e43.C107225c;
import fy3.C32224a;
import g43.C107731c;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: h43.p */
public final class C108104p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108115u f323709d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108104p(C108115u uVar) {
        super(0);
        this.f323709d = uVar;
    }

    public Object invoke() {
        C108115u uVar = this.f323709d;
        C108107q0 q0Var = uVar.f323741d;
        if (q0Var != null) {
            boolean z = true;
            if (uVar.f323754q == 2) {
                if (q0Var.f323712B == null) {
                    q0Var.f323712B = new C107731c();
                }
                q0Var.f323716F = true;
                Log.m105924i("MicroMsg.VoipRenderProcExternalTexture", "render YT face-beauty algorithm");
            } else {
                C107225c cVar = C107225c.f320827a;
                if (C107225c.f320828b == null) {
                    z = false;
                }
                if (z) {
                    if (q0Var.f323712B == null) {
                        q0Var.f323712B = new C107731c();
                    }
                    q0Var.f323716F = false;
                } else {
                    q0Var.f323716F = false;
                }
            }
            q0Var.f332750e = 2;
        }
        return C13598b0.f38549a;
    }
}
