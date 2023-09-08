package g23;

import ac3.C103355g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: g23.d */
public final class C107699d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107701f f322231d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107699d(C107701f fVar) {
        super(0);
        this.f322231d = fVar;
    }

    public Object invoke() {
        Log.m105918d("MicroMsg.VLogDirector", "VLogRelease into VLogDirector#release 3");
        C107713n nVar = this.f322231d.f322238e;
        nVar.getClass();
        Log.m105918d("MicroMsg.VLogScriptReader", "VLogRelease into VLogScriptReader#release");
        C103355g1 g1Var = nVar.f322284c;
        if (g1Var != null) {
            g1Var.destroy();
        }
        nVar.mo158123c(false);
        nVar.f322286e.clear();
        C107714o oVar = nVar.f322287f;
        oVar.getClass();
        Log.m105918d("MicroMsg.VLogScriptTexCache", "VLogRelease into VLogScriptTexCache#clearCache");
        Log.m105924i("MicroMsg.VLogScriptTexCache", "VLogRelease release clearCache, " + oVar.f322293a.length + ", " + oVar.f322294b.length);
        for (C110194c cVar : oVar.f322293a) {
            if (cVar != null) {
                cVar.close();
            }
        }
        for (C110194c cVar2 : oVar.f322294b) {
            if (cVar2 != null) {
                cVar2.close();
            }
        }
        return C13598b0.f38549a;
    }
}
