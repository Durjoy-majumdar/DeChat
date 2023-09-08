package gl1;

import cl1.C54979h1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import np1.C61817a;
import np1.C61882w;
import ok1.C62042e;
import qj1.C62924pe;
import rx3.C13598b0;

/* renamed from: gl1.j2 */
public final class C59558j2 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170198d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59558j2(C59559k kVar) {
        super(1);
        this.f170198d = kVar;
    }

    public Object invoke(Object obj) {
        C62924pe peVar;
        C61817a aVar;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Class cls = C54979h1.class;
        String str = this.f170198d.f170243j;
        Log.m105924i(str, "prepare shopping:" + booleanValue + ",list empty:" + ((C54979h1) this.f170198d.mo83051g(cls)).f154140o.mo87254e());
        if (booleanValue) {
            if (!(!((C54979h1) this.f170198d.mo83051g(cls)).mo75938d3() || (peVar = this.f170198d.f170200B) == null || (aVar = peVar.f178556r) == null)) {
                aVar.mo86768x();
            }
            C61882w wVar = C61882w.f175962a;
            C59559k kVar = this.f170198d;
            wVar.mo86816c(kVar.f166851d, C62042e.f176370a.mo87017K(((C54979h1) kVar.mo83051g(cls)).f154139n), false);
        }
        return C13598b0.f38549a;
    }
}
