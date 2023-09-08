package m70;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86174d;
import d42.C86177e;
import e42.C31415g;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: m70.h */
public final class C88712h implements C86177e<View, C88710f> {
    /* renamed from: a */
    public void mo120575a(Object obj, Object obj2, C86174d dVar) {
        C87412m.m108594g((View) obj, "view");
        C87412m.m108594g((C88710f) obj2, "viewAttribute");
        C87412m.m108594g(dVar, "callback");
        Log.m105924i("zbqzbqzbq", "onRequestUpdateCoverViewPositionAndSize");
        C86174d.C86175a.m106688a(dVar, C31415g.C7595b.f25862a, (Object) null, 2, (Object) null);
    }

    /* renamed from: b */
    public void mo120576b(Object obj, C86174d dVar) {
        C87412m.m108594g((View) obj, "view");
        C87412m.m108594g(dVar, "callback");
        C86174d.C86175a.m106688a(dVar, C31415g.C7595b.f25864c, (Object) null, 2, (Object) null);
    }

    /* renamed from: c */
    public void mo120577c(Object obj, Object obj2, C86174d dVar) {
        C87412m.m108594g((View) obj, "view");
        C87412m.m108594g((C88710f) obj2, "viewAttribute");
        C87412m.m108594g(dVar, "callback");
        C86174d.C86175a.m106688a(dVar, C31415g.C7595b.f25864c, (Object) null, 2, (Object) null);
    }

    /* renamed from: d */
    public C86177e.C86178a mo120578d(Object obj) {
        C87412m.m108594g((View) obj, "view");
        return new C88711g();
    }

    /* renamed from: e */
    public Object mo120579e(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return new C88710f(0, 0, 0, 0, 0);
    }
}
