package m23;

import android.os.Bundle;
import fy3.C32227p;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: m23.g */
public final class C109483g extends C87413o implements C32227p<Integer, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109475c f327708d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109483g(C109475c cVar) {
        super(2);
        this.f327708d = cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        this.f327708d.f327696v.get(intValue).f263432g.clear();
        this.f327708d.f327689o.setVisibility(booleanValue ? 0 : 4);
        C109475c cVar = this.f327708d;
        cVar.f327697w = booleanValue;
        C101198e eVar = cVar.f291492d;
        C101198e.C101199b bVar = C101198e.C101199b.EDIT_DELETE_CAPTION;
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_1_INT", intValue);
        C13598b0 b0Var = C13598b0.f38549a;
        eVar.mo14585p(bVar, bundle);
        return C13598b0.f38549a;
    }
}
