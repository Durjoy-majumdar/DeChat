package qj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.view.MenuItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C8777j5;
import nj3.C11184p0;
import org.json.JSONObject;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C49765hx0;

/* renamed from: qj1.ia */
public final class C12450ia implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C12389fa f35832d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f35833e;

    public C12450ia(C12389fa faVar, C32224a<C13598b0> aVar) {
        this.f35832d = faVar;
        this.f35833e = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        FinderContact finderContact;
        Class cls = C54108o.class;
        C87412m.m108594g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        C12389fa faVar = this.f35832d;
        if (itemId == faVar.f35695t) {
            this.f35833e.invoke();
            C77407n nVar = this.f35832d.f35688Y;
            if (nVar != null) {
                nVar.mo107572p();
            }
            if (this.f35832d.f35690p.getLiveRole() == 1) {
                ((C54108o) C86312j.m106911c(cls)).getClass();
                C54067f0 f0Var = C54108o.f151869h;
                f0Var.f151443Y.f151844u++;
                JSONObject jSONObject = new JSONObject();
                String valueOf = String.valueOf(5);
                C49765hx0 hx02 = this.f35832d.f35686W;
                if (hx02 == null || (finderContact = hx02.f134919d) == null || (str = finderContact.username) == null) {
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
        C77407n nVar2 = faVar.f35688Y;
        if (nVar2 != null) {
            nVar2.mo107572p();
        }
    }
}
