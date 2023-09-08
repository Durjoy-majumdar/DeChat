package qj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.view.MenuItem;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C8777j5;
import nj3.C11184p0;
import org.json.JSONObject;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: qj1.zb */
public final class C12771zb implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C12707vb f36572d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f36573e;

    public C12771zb(C12707vb vbVar, C32224a<C13598b0> aVar) {
        this.f36572d = vbVar;
        this.f36573e = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C54108o.class;
        C87412m.m108594g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        C12707vb vbVar = this.f36572d;
        if (itemId == vbVar.f36417r) {
            this.f36573e.invoke();
            C77407n nVar = this.f36572d.f36404A;
            if (nVar != null) {
                nVar.mo107572p();
            }
            if (this.f36572d.f36415p.getLiveRole() == 1) {
                ((C54108o) C86312j.m106911c(cls)).getClass();
                C54067f0 f0Var = C54108o.f151869h;
                f0Var.f151443Y.f151844u++;
                JSONObject jSONObject = new JSONObject();
                String valueOf = String.valueOf(5);
                String str = this.f36572d.f36406C;
                if (str == null) {
                    str = "";
                }
                jSONObject.put(valueOf, str);
                C0073g0 g0Var = C0073g0.LIVE_ANCHOR_ACTION_BARRAGE;
                ((C54108o) C86312j.m106911c(cls)).getClass();
                if (f0Var.f151448b0) {
                    g0Var = C0073g0.LIVE_ANCHOR_ACTION_AUDIENCE;
                }
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
                return;
            }
            return;
        }
        C77407n nVar2 = vbVar.f36404A;
        if (nVar2 != null) {
            nVar2.mo107572p();
        }
        this.f36572d.mo12274Z0();
    }
}
