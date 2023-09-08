package wg1;

import a14.C53934p0;
import ak1.C54067f0;
import android.view.MenuItem;
import bl3.C0317e;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.HashMap;
import nj3.C11184p0;
import qo3.C77407n;
import te3.C49098d51;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: wg1.j3 */
public final class C15313j3 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f41627d;

    /* renamed from: e */
    public final /* synthetic */ C15278g3 f41628e;

    public C15313j3(C77407n nVar, C15278g3 g3Var) {
        this.f41627d = nVar;
        this.f41628e = g3Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_VISITOR_POSTER_SUCC;
        Class cls = C8777j5.class;
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        String str5 = "";
        if (valueOf != null && valueOf.intValue() == 0) {
            C15278g3 g3Var = this.f41628e;
            C0317e.launchUI$default(g3Var, (C66212f) null, (C53934p0) null, new C15326n3(g3Var, (C15601d<? super C15326n3>) null), 3, (Object) null);
            HashMap hashMap = new HashMap();
            C49098d51 d512 = this.f41628e.f41548C;
            if (!(d512 == null || (str4 = d512.f132122h) == null)) {
                str5 = str4;
            }
            hashMap.put("notice_id", str5);
            hashMap.put("type", "1");
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8607h((C8777j5) c, mVar, hashMap, (String) null, "200", (String) null, 20, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            C15278g3 g3Var2 = this.f41628e;
            C0317e.launchUI$default(g3Var2, (C66212f) null, (C53934p0) null, new C15332o3(g3Var2, (C15601d<? super C15332o3>) null), 3, (Object) null);
            HashMap hashMap2 = new HashMap();
            C49098d51 d513 = this.f41628e.f41548C;
            if (!(d513 == null || (str3 = d513.f132122h) == null)) {
                str5 = str3;
            }
            hashMap2.put("notice_id", str5);
            hashMap2.put("type", "2");
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8607h((C8777j5) c2, mVar, hashMap2, (String) null, "200", (String) null, 20, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == 3) {
            C15278g3 g3Var3 = this.f41628e;
            C0317e.launchUI$default(g3Var3, (C66212f) null, (C53934p0) null, new C15302h3(g3Var3, (C15601d<? super C15302h3>) null), 3, (Object) null);
            HashMap hashMap3 = new HashMap();
            C49098d51 d514 = this.f41628e.f41548C;
            if (!(d514 == null || (str2 = d514.f132122h) == null)) {
                str5 = str2;
            }
            hashMap3.put("notice_id", str5);
            hashMap3.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
            C7335d c3 = C86312j.m106911c(cls);
            C87412m.m108593f(c3, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8607h((C8777j5) c3, mVar, hashMap3, (String) null, "200", (String) null, 20, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            C15278g3 g3Var4 = this.f41628e;
            C0317e.launchUI$default(g3Var4, (C66212f) null, (C53934p0) null, new C15323m3(g3Var4, this.f41627d, (C15601d<? super C15323m3>) null), 3, (Object) null);
            HashMap hashMap4 = new HashMap();
            C49098d51 d515 = this.f41628e.f41548C;
            if (!(d515 == null || (str = d515.f132122h) == null)) {
                str5 = str;
            }
            hashMap4.put("notice_id", str5);
            hashMap4.put("type", "3");
            C7335d c4 = C86312j.m106911c(cls);
            C87412m.m108593f(c4, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8607h((C8777j5) c4, mVar, hashMap4, (String) null, "200", (String) null, 20, (Object) null);
        }
        this.f41627d.mo107572p();
    }
}
