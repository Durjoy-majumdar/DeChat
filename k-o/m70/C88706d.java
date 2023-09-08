package m70;

import d42.C86174d;
import d42.C86177e;
import e42.C31415g;
import e42.C86428f;
import gy3.C87412m;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: m70.d */
public abstract class C88706d<ViewType, T extends C86428f<ViewType>> extends C88704c<ViewType, T> {

    /* renamed from: m70.d$a */
    public static final class C88707a implements C86174d<C13598b0> {

        /* renamed from: a */
        public final /* synthetic */ C88706d<ViewType, T> f256060a;

        public C88707a(C88706d<ViewType, T> dVar) {
            this.f256060a = dVar;
        }

        /* renamed from: a */
        public void mo120570a(C31415g gVar, Object obj) {
            C13598b0 b0Var = (C13598b0) obj;
            C87412m.m108594g(gVar, "errInfo");
            this.f256060a.mo123141r(gVar);
        }
    }

    /* renamed from: u */
    public void mo123143u(JSONObject jSONObject, ViewType viewtype, C86177e<ViewType, Object> eVar) {
        C86428f.C86429a aVar;
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(viewtype, "view");
        C87412m.m108594g(eVar, "parent");
        super.mo123143u(jSONObject, viewtype, eVar);
        C86428f fVar = (C86428f) this.f251227a;
        if (!(fVar == null || (aVar = fVar.f251224a) == null)) {
            aVar.mo120838b(mo123142s(jSONObject));
        }
        eVar.mo120576b(viewtype, new C88707a(this));
    }
}
