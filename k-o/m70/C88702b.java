package m70;

import d42.C86177e;
import e42.C86428f;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: m70.b */
public abstract class C88702b<ViewType, T extends C86428f<ViewType>> extends C88704c<ViewType, T> {

    /* renamed from: m70.b$a */
    public static final class C88703a extends C87413o implements C32226l<ViewType, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88702b<ViewType, T> f256054d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f256055e;

        /* renamed from: f */
        public final /* synthetic */ C86177e<ViewType, Object> f256056f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88703a(C88702b<ViewType, T> bVar, JSONObject jSONObject, C86177e<ViewType, Object> eVar) {
            super(1);
            this.f256054d = bVar;
            this.f256055e = jSONObject;
            this.f256056f = eVar;
        }

        public Object invoke(Object obj) {
            C86428f.C86429a aVar;
            C87412m.m108594g(obj, "view");
            C88702b<ViewType, T> bVar = this.f256054d;
            C86428f fVar = (C86428f) bVar.f251227a;
            if (!(fVar == null || (aVar = fVar.f251224a) == null)) {
                aVar.mo120837a(bVar.mo123142s(this.f256055e), obj);
            }
            C86177e<ViewType, Object> eVar = this.f256056f;
            eVar.mo120577c(obj, eVar.mo120579e(this.f256055e), new C88701a(this.f256054d, obj, this.f256055e, this.f256056f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: t */
    public void mo123140t(JSONObject jSONObject, C86177e<ViewType, Object> eVar) {
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(eVar, "coverViewDelegate");
        super.mo123140t(jSONObject, eVar);
        mo120879w(jSONObject, new C88703a(this, jSONObject, eVar));
    }

    /* renamed from: w */
    public abstract void mo120879w(JSONObject jSONObject, C32226l<? super ViewType, C13598b0> lVar);
}
