package dt0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64186f0;
import xt0.C78978c;
import xt0.C78980e;
import xt0.C78983j;
import xt0.C78985l;

/* renamed from: dt0.j */
public final class C75450j extends C75449i {

    /* renamed from: a */
    public C68585h1 f221766a;

    /* renamed from: a */
    public List<C68691e.C68692a> mo105787a() {
        List<LocalUsageInfo> list;
        ArrayList arrayList = new ArrayList();
        if (this.f221766a == null) {
            this.f221766a = C78980e.f231921a.mo108957a();
        }
        C68585h1 h1Var = this.f221766a;
        if (h1Var != null) {
            C78985l lVar = C78983j.f231933a;
            list = ((C78978c) h1Var).mo94245pM(lVar.f231936b, lVar.f231937c);
        } else {
            list = null;
        }
        if (list != null) {
            for (T t : C110818d0.m150912J(list)) {
                C68691e.C68692a aVar = new C68691e.C68692a(2);
                aVar.f197340a = t;
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo105788b(C32226l<? super List<? extends C68691e.C68692a>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        lVar.invoke(C64186f0.f181907d);
    }

    /* renamed from: d */
    public String mo105790d() {
        String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.a54);
        C87412m.m108593f(q, "getString(MMApplicationC…ring.appbrand_desktop_my)");
        return q;
    }

    /* renamed from: e */
    public int mo105791e() {
        return 2;
    }
}
