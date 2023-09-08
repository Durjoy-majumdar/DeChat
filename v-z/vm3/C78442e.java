package vm3;

import bi3.C0289a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.util.WXWebReporter;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import qm3.C77374a;
import rx3.C13598b0;
import sx3.C64197v;
import zb2.C79317n;

/* renamed from: vm3.e */
public final class C78442e extends C87413o implements C32226l<List<? extends String>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C78436b f229819d;

    /* renamed from: e */
    public final /* synthetic */ C78443f f229820e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78442e(C78436b bVar, C78443f fVar) {
        super(1);
        this.f229819d = bVar;
        this.f229820e = fVar;
    }

    public Object invoke(Object obj) {
        List list = (List) obj;
        C87412m.m108594g(list, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.SelectContactRecommendUIC", "relatedUserSearchResultListener: resultSize: " + list.size());
        WxRecyclerView g = this.f229819d.mo108388j3().mo109049g();
        C87412m.m108593f(g, "uiBinding.selectContactRv");
        MvvmList a = C79317n.m96015a(g);
        if (a != null) {
            a.mo129614r(this.f229820e);
        }
        List<C72996z1> c = C0289a.f857a.mo338c(list);
        ArrayList arrayList = new ArrayList();
        C78436b bVar = this.f229819d;
        Iterator it = ((ArrayList) c).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C72996z1 z1Var = (C72996z1) next;
                C77374a aVar = r6;
                C77374a aVar2 = new C77374a((C99681n) null, (C99672i) null, 0, 0, i, 0, (String) null, false, WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, (C8480h) null);
                String username = z1Var.getUsername();
                C87412m.m108593f(username, "contact.username");
                C77020b a2 = C77374a.f225586i.mo107495a(bVar.getActivity(), username + '-' + 2 + '-' + i, z1Var, 2, aVar);
                if (aVar.f225591e == 0) {
                    a2.f225012n = true;
                    String string = bVar.getActivity().getString(C0966R.string.f361256ij2);
                    C87412m.m108593f(string, "activity.getString(com.t…end_contact_catalog_name)");
                    a2.f225013o = string;
                }
                arrayList.add(a2);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        WxRecyclerView g2 = this.f229819d.mo108388j3().mo109049g();
        C87412m.m108593f(g2, "uiBinding.selectContactRv");
        MvvmList a3 = C79317n.m96015a(g2);
        if (a3 != null) {
            a3.mo129607j(arrayList, false);
        }
        return C13598b0.f38549a;
    }
}
