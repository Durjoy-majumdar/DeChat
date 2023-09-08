package fh1;

import a14.C0000n0;
import ak1.C0073g0;
import ak1.C54108o;
import android.view.MenuItem;
import android.view.View;
import c30.C104289g;
import cj1.C0581o5;
import com.tencent.p014mm.plugin.finder.view.C4061g7;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C8777j5;
import nj3.C11184p0;
import qj1.C12322e5;
import rx3.C13598b0;

/* renamed from: fh1.v0 */
public final class C8089v0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Integer, C13598b0> f26915d;

    /* renamed from: e */
    public final /* synthetic */ C0581o5 f26916e;

    /* renamed from: f */
    public final /* synthetic */ C45795b f26917f;

    /* renamed from: g */
    public final /* synthetic */ C0000n0 f26918g;

    /* renamed from: h */
    public final /* synthetic */ View f26919h;

    /* renamed from: i */
    public final /* synthetic */ C12322e5 f26920i;

    /* renamed from: j */
    public final /* synthetic */ View f26921j;

    public C8089v0(C32226l<? super Integer, C13598b0> lVar, C0581o5 o5Var, C45795b bVar, C0000n0 n0Var, View view, C12322e5 e5Var, View view2) {
        this.f26915d = lVar;
        this.f26916e = o5Var;
        this.f26917f = bVar;
        this.f26918g = n0Var;
        this.f26919h = view;
        this.f26920i = e5Var;
        this.f26921j = view2;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C0073g0 g0Var = C0073g0.LIVE_DANMAKU_OPERATION;
        Class cls = C54108o.class;
        int itemId = menuItem.getItemId();
        int i2 = 0;
        if (itemId == 165) {
            this.f26915d.invoke(Integer.valueOf(menuItem.getItemId()));
            int n = this.f26916e.mo584n();
            if (n == 2) {
                i2 = 2;
            } else if (n == 3) {
                i2 = 1;
            }
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C104289g gVar = new C104289g();
            gVar.mo145953n("type", 2);
            gVar.mo145953n("barrage_type", i2);
            C13598b0 b0Var = C13598b0.f38549a;
            C8777j5.C8778a.m8605f((C8777j5) c, g0Var, gVar.toString(), (String) null, 4, (Object) null);
        } else if (itemId != 166) {
            C4061g7.f18189a.mo4954b(2, this.f26917f, this.f26918g, this.f26919h, this.f26920i, this.f26921j, menuItem, i, this.f26916e);
        } else {
            this.f26915d.invoke(Integer.valueOf(menuItem.getItemId()));
            int n2 = this.f26916e.mo584n();
            if (n2 == 2) {
                i2 = 2;
            } else if (n2 == 3) {
                i2 = 1;
            }
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C104289g gVar2 = new C104289g();
            gVar2.mo145953n("type", 8);
            gVar2.mo145953n("barrage_type", i2);
            C13598b0 b0Var2 = C13598b0.f38549a;
            C8777j5.C8778a.m8605f((C8777j5) c2, g0Var, gVar2.toString(), (String) null, 4, (Object) null);
        }
        C41573e3.f111902a.mo64658a();
    }
}
