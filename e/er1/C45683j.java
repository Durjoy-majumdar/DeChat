package er1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import sx3.C110818d0;
import te3.C50991qo2;
import te3.C51977xi;

/* renamed from: er1.j */
public final class C45683j extends C87413o implements C32226l<C50991qo2, CharSequence> {

    /* renamed from: d */
    public static final C45683j f123487d = new C45683j();

    public C45683j() {
        super(1);
    }

    public Object invoke(Object obj) {
        C50991qo2 qo22 = (C50991qo2) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("liveId:");
        sb.append(qo22.f140438d);
        sb.append(", boxContext: ");
        LinkedList<C51977xi> linkedList = qo22.f140439e;
        C87412m.m108593f(linkedList, "it.boxContextList");
        C51977xi xiVar = (C51977xi) C110818d0.m150916N(linkedList);
        sb.append(xiVar != null ? C45684k.f123488a.mo71182c(xiVar) : null);
        return sb.toString();
    }
}
