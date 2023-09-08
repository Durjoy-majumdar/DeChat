package bp1;

import cl1.C39970c;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C8802s1;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49205dz0;
import te3.C49353ez0;
import te3.C50721or3;
import te3.C51445tt3;

/* renamed from: bp1.h */
public final class C39828h extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f106846f = "ReplayPreviewSlice";

    /* renamed from: g */
    public CopyOnWriteArrayList<C50721or3> f106847g = new CopyOnWriteArrayList<>();

    /* renamed from: h */
    public LinkedList<C51445tt3> f106848h = new LinkedList<>();

    /* renamed from: i */
    public C89349b f106849i;

    /* renamed from: j */
    public String f106850j;

    /* renamed from: n */
    public boolean f106851n;

    /* renamed from: bp1.h$a */
    public static final class C39829a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C39828h f106852a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<String, C13598b0> f106853b;

        public C39829a(C39828h hVar, C32226l<? super String, C13598b0> lVar) {
            this.f106852a = hVar;
            this.f106853b = lVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C39828h hVar = this.f106852a;
                C49353ez0 ez02 = (C49353ez0) cVar.f256796d;
                hVar.f106849i = ez02.f133204f;
                hVar.f106851n = ez02.f133202d;
                hVar.f106847g.addAll(ez02.f133203e);
                String str = ((C49353ez0) cVar.f256796d).f133205g;
                if (!(str == null || str.length() == 0)) {
                    C39828h hVar2 = this.f106852a;
                    C49353ez0 ez03 = (C49353ez0) cVar.f256796d;
                    hVar2.f106850j = ez03.f133205g;
                    LinkedList<C51445tt3> linkedList = ez03.f133207i;
                    C87412m.m108593f(linkedList, "it.resp.resolution_node_list");
                    hVar2.f106848h = linkedList;
                    C32226l<String, C13598b0> lVar = this.f106853b;
                    if (lVar != null) {
                        String str2 = this.f106852a.f106850j;
                        C87412m.m108591d(str2);
                        lVar.invoke(str2);
                    }
                }
            } else {
                String str3 = this.f106852a.f106846f;
                Log.m105918d(str3, "get thumb err type = " + cVar.f256793a + " err code = " + cVar.f256794b + " err msg = " + cVar.f256795c);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39828h(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: c3 */
    public final void mo62459c3(C32226l<? super String, C13598b0> lVar) {
        Class cls = C55001u.class;
        C49205dz0 dz02 = new C49205dz0();
        dz02.f132585g = this.f106849i;
        dz02.f132583e = ((C55001u) business(cls)).f154416j;
        dz02.f132584f = ((C55001u) business(cls)).f154420q.f182392d;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 10123;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetallreplaythumb";
        bVar.f127066a = dz02;
        bVar.f127067b = new C49353ez0();
        C47350c a = bVar.mo72403a();
        C89132b ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        ui.mo9225i().mo123420E(new C39829a(this, lVar));
    }

    public void onCleared() {
        super.onCleared();
        this.f106847g.clear();
        this.f106849i = null;
        this.f106850j = null;
        this.f106851n = false;
    }
}
