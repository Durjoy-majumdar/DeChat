package xk1;

import cl1.C54979h1;
import cm1.C0740i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import np1.C61882w;
import ok1.C62042e;
import p40.C62192a;
import rx3.C13598b0;

/* renamed from: xk1.t1 */
public final class C66349t1 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15775s1 f190982d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66349t1(C15775s1 s1Var) {
        super(1);
        this.f190982d = s1Var;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Class cls = C54979h1.class;
        StringBuilder sb = new StringBuilder();
        sb.append("prepare shopping:");
        sb.append(booleanValue);
        sb.append(",list empty:");
        C45795b bVar = this.f190982d.f42528e;
        if (bVar != null) {
            C62192a<C0740i2> aVar = ((C54979h1) bVar.mo71262a(cls)).f154140o;
            sb.append(aVar != null ? Boolean.valueOf(aVar.mo87254e()) : null);
            Log.m105924i("Finder.FinderLivePostUIC", sb.toString());
            if (booleanValue) {
                C61882w wVar = C61882w.f175962a;
                C45795b bVar2 = this.f190982d.f42528e;
                if (bVar2 != null) {
                    wVar.mo86816c(bVar2, C62042e.f176370a.mo87017K(((C54979h1) bVar2.mo71262a(cls)).f154139n), false);
                } else {
                    C87412m.m108603p("liveData");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("liveData");
        throw null;
    }
}
