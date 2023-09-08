package kj1;

import android.app.Activity;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import gg1.C32444a;
import gy3.C87412m;
import ht1.C8816y1;
import java.util.ArrayList;
import java.util.Iterator;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: kj1.u1 */
public final class C10239u1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C10125e1.C10127b f31256d;

    /* renamed from: e */
    public final /* synthetic */ Activity f31257e;

    public C10239u1(C10125e1.C10127b bVar, Activity activity) {
        this.f31256d = bVar;
        this.f31257e = activity;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f31256d.f31012e;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        C10125e1.C10127b bVar = this.f31256d;
        C10125e1 e1Var = bVar.f31029v;
        C87412m.m108594g(e1Var, "<this>");
        if (C58739j4.f168176a.mo83692U() && C32444a.f86165l.mo60266n().intValue() == 1) {
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360639mo3, new Object[]{"Mb2.0:是"});
            C87412m.m108593f(string, "getContext().resources.g…bug_magiclivecard, useMb)");
            e0Var.mo107144g(e1Var.f30954A, e1Var.mo10533a(string, "Mb2.0:是"), C0966R.raw.icons_outlined_tag);
        }
        C10125e1 e1Var2 = bVar.f31029v;
        C87412m.m108594g(e1Var2, "<this>");
        if (((C8816y1) C39818r.f106831a.mo62444c(e1Var2.f30985d).mo62447c(C8816y1.class)).mo9642V1() && C32444a.f86165l.mo60266n().intValue() == 1) {
            e0Var.mo107144g(e1Var2.f30972S, "推荐信息", C0966R.raw.finder_icons_link);
        }
        Iterator it = ((ArrayList) bVar.f31025r).iterator();
        while (it.hasNext()) {
            ((C10538e) it.next()).mo10809p(e0Var);
        }
        e0Var.mo107144g(bVar.f31029v.f30995n, MMApplicationContext.getContext().getResources().getString(C0966R.string.dxw), C0966R.raw.icons_outlined_report_problem);
    }
}
