package pk1;

import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87413o;
import nk1.C61788m;
import pk1.C11952i;
import rx3.C13598b0;

/* renamed from: pk1.j */
public final class C11959j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11952i.C11957d f34904d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11959j(C11952i.C11957d dVar) {
        super(0);
        this.f34904d = dVar;
    }

    public Object invoke() {
        C61788m mVar;
        Class cls = C54991o.class;
        StringBuilder sb = new StringBuilder();
        sb.append("executeSingleMockCommand thread ");
        C45795b bVar = C45795b.f123698n;
        sb.append(bVar != null ? ((C54991o) bVar.mo71262a(cls)).f154316g : null);
        Log.m105924i("Finder.FinderLiveGiftMockUtil", sb.toString());
        C45795b bVar2 = C45795b.f123698n;
        if (!(bVar2 == null || (mVar = ((C54991o) bVar2.mo71262a(cls)).f154316g) == null)) {
            mVar.mo86704b(this.f34904d.mo11824a());
        }
        return C13598b0.f38549a;
    }
}
