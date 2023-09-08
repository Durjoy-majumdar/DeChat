package m70;

import d42.C86174d;
import d42.C86177e;
import e42.C31415g;
import e42.C86428f;
import gy3.C87412m;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: m70.a */
public final class C88701a implements C86174d<C13598b0> {

    /* renamed from: a */
    public final /* synthetic */ C88702b<Object, C86428f<Object>> f256050a;

    /* renamed from: b */
    public final /* synthetic */ Object f256051b;

    /* renamed from: c */
    public final /* synthetic */ JSONObject f256052c;

    /* renamed from: d */
    public final /* synthetic */ C86177e<Object, Object> f256053d;

    public C88701a(C88702b<Object, C86428f<Object>> bVar, Object obj, JSONObject jSONObject, C86177e<Object, Object> eVar) {
        this.f256050a = bVar;
        this.f256051b = obj;
        this.f256052c = jSONObject;
        this.f256053d = eVar;
    }

    /* renamed from: a */
    public void mo120570a(C31415g gVar, Object obj) {
        C13598b0 b0Var = (C13598b0) obj;
        C87412m.m108594g(gVar, "errInfo");
        this.f256050a.mo123141r(gVar);
        this.f256050a.mo123144v(this.f256051b, this.f256052c, this.f256053d);
    }
}
