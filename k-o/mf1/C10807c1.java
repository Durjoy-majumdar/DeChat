package mf1;

import android.content.Context;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import org.json.JSONObject;
import pf1.C11916o;
import pf1.C11917o0;
import pf1.C11918p;
import pf1.C11920q;
import rf1.C12982a;
import rs1.C13448t;
import rx3.C13598b0;

/* renamed from: mf1.c1 */
public final class C10807c1 extends C87413o implements C32226l<C12982a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f32297d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f32298e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10807c1(C60905o oVar, BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f32297d = oVar;
        this.f32298e = baseFinderFeed;
    }

    public Object invoke(Object obj) {
        C12982a aVar = (C12982a) obj;
        C87412m.m108594g(aVar, "observer");
        C11917o0 o0Var = aVar.f37020i;
        String simpleName = o0Var == null ? "null" : o0Var.getClass().getSimpleName();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("viewEventHandler", simpleName);
        C11920q qVar = aVar.f37015d;
        C11916o oVar = null;
        C11918p pVar = qVar != null ? qVar.f34832f : null;
        if (pVar instanceof C11916o) {
            oVar = (C11916o) pVar;
        }
        long j = oVar != null ? oVar.f34786i : 0;
        C39818r rVar = C39818r.f106831a;
        Context context = this.f32297d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13448t tVar = (C13448t) rVar.mo62443b(context).mo62449e(C13448t.class);
        if (tVar != null) {
            tVar.mo12876c3(this.f32298e.getItemId(), "observer.onPause", jSONObject, j);
        }
        return C13598b0.f38549a;
    }
}
