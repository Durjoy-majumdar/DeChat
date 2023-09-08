package u93;

import android.content.MutableContextWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.WebChromeClient;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import t83.C48574a1;

/* renamed from: u93.q */
public final class C52506q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C52497i f146663d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52506q(C52497i iVar) {
        super(0);
        this.f146663d = iVar;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "start run preload task " + this.f146663d.f146653a);
        C52505p pVar = new C52505p(new MutableContextWrapper(MMApplicationContext.getContext()));
        pVar.setPreload(true);
        pVar.mo67633c0((WebChromeClient) null, new C52502n(this.f146663d, pVar));
        C48574a1 a1Var = new C48574a1();
        pVar.addJavascriptInterface(a1Var, "__wx");
        C52480c cVar = new C52480c(new C52504o(pVar));
        pVar.addJavascriptInterface(cVar, "webSearchJSApi");
        C52496h hVar = C52495g.f146647a;
        if (hVar != null) {
            hVar.f146649b = pVar;
        }
        if (hVar != null) {
            hVar.f146650c = a1Var;
        }
        if (hVar != null) {
            hVar.f146651d = cVar;
        }
        pVar.loadUrl(this.f146663d.f146653a);
        return C13598b0.f38549a;
    }
}
