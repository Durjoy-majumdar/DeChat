package s50;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: s50.p */
public final class C63713p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110747k f180601d;

    /* renamed from: e */
    public final /* synthetic */ int f180602e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63713p(C110747k kVar, int i) {
        super(0);
        this.f180601d = kVar;
        this.f180602e = i;
    }

    public Object invoke() {
        C110760u uVar = this.f180601d.f331238j;
        if (uVar != null) {
            int i = this.f180602e;
            Log.m105924i("MicroMsg.LiveTexEditRenderer", "updateMirrorMode mirrorMode:" + i + " mirror:" + uVar.f331390o);
            uVar.f331284N = i;
        }
        return C13598b0.f38549a;
    }
}
