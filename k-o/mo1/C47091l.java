package mo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileDraftUIC;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8477a0;
import hp3.C87581a;
import java.util.LinkedList;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50008jm0;
import te3.C64621p23;

/* renamed from: mo1.l */
public final class C47091l<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C8477a0 f126533a;

    /* renamed from: b */
    public final /* synthetic */ LinkedList<FinderObject> f126534b;

    /* renamed from: c */
    public final /* synthetic */ FinderProfileDraftUIC f126535c;

    /* renamed from: d */
    public final /* synthetic */ C32226l<C64621p23, C13598b0> f126536d;

    /* renamed from: e */
    public final /* synthetic */ C64621p23 f126537e;

    public C47091l(C8477a0 a0Var, LinkedList<FinderObject> linkedList, FinderProfileDraftUIC finderProfileDraftUIC, C32226l<? super C64621p23, C13598b0> lVar, C64621p23 p232) {
        this.f126533a = a0Var;
        this.f126534b = linkedList;
        this.f126535c = finderProfileDraftUIC;
        this.f126536d = lVar;
        this.f126537e = p232;
    }

    public Object call(Object obj) {
        LinkedList<FinderObject> linkedList;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("cgi ");
        FinderObject finderObject = null;
        sb.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
        sb.append(", ");
        sb.append(cVar.f256794b);
        Log.m105924i("Finder.FinderProfileDraftUIC", sb.toString());
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C50008jm0 jm02 = (C50008jm0) cVar.f256796d;
            if (jm02 != null) {
                finderObject = jm02.f136184e;
            }
            if (finderObject != null) {
                if (!(jm02 == null || (linkedList = jm02.f136192p) == null)) {
                    this.f126534b.addAll(linkedList);
                }
                C61926c.m72668M(new C47089k(this.f126533a, this.f126535c, this.f126536d, this.f126537e));
                return C13598b0.f38549a;
            }
        }
        this.f126533a.f27482d = false;
        C61926c.m72668M(new C47089k(this.f126533a, this.f126535c, this.f126536d, this.f126537e));
        return C13598b0.f38549a;
    }
}
