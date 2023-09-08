package lg1;

import android.os.Bundle;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C7335d;
import di3.C86312j;
import fh1.C8083t2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kj1.C10125e1;
import kj1.C10264x1;
import rx3.C13598b0;
import tf0.C13883o1;
import wc3.C15133e0;

/* renamed from: lg1.d */
public final class C10508d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10509e f31740d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10508d(C10509e eVar) {
        super(0);
        this.f31740d = eVar;
    }

    public Object invoke() {
        C10125e1 e1Var;
        C10125e1.C10127b bVar;
        C8083t2 t2Var = (C8083t2) this.f31740d.mo87685B0(C8083t2.class);
        if (!(t2Var == null || (e1Var = t2Var.f26907q) == null || (bVar = e1Var.f30988g) == null)) {
            Bundle bundle = new Bundle();
            bundle.putInt("requestCode", 16);
            Class cls = C54991o.class;
            MMActivity mMActivity = bVar.f31029v.f30985d;
            int i = bundle.getInt("requestCode");
            FinderObject finderObject = ((C54991o) bVar.f31029v.mo10534b(cls)).f154341n;
            if (finderObject != null) {
                C10125e1 e1Var2 = bVar.f31029v;
                e1Var2.mo10540h(finderObject, ((C55001u) e1Var2.mo10534b(C55001u.class)).f154420q);
                FinderItem a = FinderItem.Companion.mo79056a(finderObject, 16384);
                a.setEcSource(((C54991o) e1Var2.mo10534b(cls)).f154199F1);
                Bundle bundle2 = new Bundle();
                C15133e0 e0Var = bVar.f31019l;
                bundle2.putInt("quick_share_item_count", e0Var != null ? e0Var.getItemCount() : 0);
                bundle2.putInt("Select_Conv_Type", 16);
                bundle2.putIntArray("search_range", new int[]{131075});
                C7335d c = C86312j.m106911c(C13883o1.class);
                C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
                C13883o1.C13884a.m13254f((C13883o1) c, mMActivity, a, bundle2, 0, new C10264x1(e1Var2, i), 8, (Object) null);
                e1Var2.mo10538f();
            }
        }
        return C13598b0.f38549a;
    }
}
