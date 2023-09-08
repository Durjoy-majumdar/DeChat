package al1;

import a14.C53895h;
import al1.C39612t;
import bl1.C39786k;
import bl1.C39798m;
import bl1.C39799n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C48862bj;
import te3.C49335eu3;
import te3.C50195kz0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: al1.u */
public final class C39618u<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C39612t.C39613a<C49335eu3> f106374a;

    /* renamed from: b */
    public final /* synthetic */ C89132b<C49335eu3> f106375b;

    /* renamed from: c */
    public final /* synthetic */ C15601d<C39612t.C39616c> f106376c;

    public C39618u(C39612t.C39613a<C49335eu3> aVar, C89132b<C49335eu3> bVar, C15601d<? super C39612t.C39616c> dVar) {
        this.f106374a = aVar;
        this.f106375b = bVar;
        this.f106376c = dVar;
    }

    public Object call(Object obj) {
        long j;
        C50195kz0 kz02;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C39612t.C39613a<C49335eu3> aVar = this.f106374a;
        C89132b<C49335eu3> bVar = this.f106375b;
        C87412m.m108593f(cVar, "cgiBack");
        C39786k.C39791e eVar = (C39786k.C39791e) aVar;
        eVar.getClass();
        C87412m.m108594g(bVar, "cgi");
        if (cVar.f256793a == 0 && cVar.f256794b == 0 && (kz02 = (C50195kz0) cVar.f256796d) != null) {
            C39786k kVar = eVar.f106779c;
            j = (long) kz02.f137104d;
            C39786k.C39788b bVar2 = C39786k.f106760i;
            StringBuilder sb = new StringBuilder();
            sb.append("polling reddot resp, ");
            LinkedList<C48862bj> linkedList = kz02.f137105e;
            C87412m.m108593f(linkedList, "resp.box_readdot_list");
            sb.append(C110818d0.m150921S(linkedList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C39798m.f106799d, 31, (Object) null));
            String sb4 = sb.toString();
            C87412m.m108594g(sb4, "str");
            Log.m105924i("Finder.BoxDataStore", "redDotFlowLog " + sb4);
            if (kz02.f137105e.size() > 0) {
                C53895h.m60468f((C66212f) null, new C39799n(kz02, kVar, bVar, (C15601d<? super C39799n>) null), 1, (Object) null);
            }
        } else {
            j = 1000;
        }
        this.f106376c.resumeWith(Result.m168114constructorimpl(new C39612t.C39616c(true, j)));
        return C13598b0.f38549a;
    }
}
