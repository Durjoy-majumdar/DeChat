package kj1;

import ak1.C54067f0;
import ak1.C54116w;
import al1.C54130j;
import android.os.Bundle;
import cj1.C54795n5;
import cj1.C54820t;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: kj1.u2 */
public final class C10240u2 extends C10538e {

    /* renamed from: h */
    public final int f31258h;

    /* renamed from: i */
    public final String f31259i = "";

    /* renamed from: kj1.u2$a */
    public static final class C10241a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f31260d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10241a(MMActivity mMActivity) {
            super(0);
            this.f31260d = mMActivity;
        }

        public Object invoke() {
            FinderLiveService.f159376d.getClass();
            C54795n5 n5Var = FinderLiveService.f159396y;
            if (n5Var != null) {
                ((C54820t) n5Var).mo75713Q(this.f31260d, false);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10240u2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31258h = e1Var.f30997p;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31259i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        C62042e eVar = C62042e.f176370a;
        C45795b bVar = this.f31809a.f30982b;
        eVar.getClass();
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "buContext");
        boolean u = C61926c.m72696u(((C54991o) bVar.mo71262a(cls)).f154388y0, 67108864);
        Log.m105924i("FinderLiveUtil", "[isDisableContactSwitch] isDisable = " + u + ", flag = " + ((C54991o) bVar.mo71262a(cls)).f154388y0);
        if (!u) {
            C10125e1.C10127b bVar2 = this.f31809a.f30988g;
            if (bVar2 != null && bVar2.f31010c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        String str = ((C54991o) e1Var.mo10534b(C54991o.class)).mo75986U3().f183213d;
        if (str == null) {
            str = "";
        }
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360703ea1, new Object[]{str});
        C87412m.m108593f(string, "getContext().resources.g…ole_ui_new_tips, curRole)");
        e0Var.mo107144g(this.f31258h, e1Var.mo10533a(string, str), C0966R.raw.icons_outlined_exchange);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 2);
        jSONObject.put("type", 1);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31258h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        T t;
        C10125e1.C10126a aVar;
        C10125e1.C10126a aVar2;
        C10125e1 e1Var2 = e1Var;
        Class cls = C54963d0.class;
        C87412m.m108594g(e1Var2, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 2);
        jSONObject.put("type", 2);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        MMActivity mMActivity = e1Var2.f30985d;
        List<C54130j> list = ((C54963d0) e1Var2.mo10534b(cls)).f154074q;
        C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Util.isEqual(((C54130j) t).f151997a, ((C54991o) e1Var2.mo10534b(C54991o.class)).mo76015n4())) {
                    break;
                }
            }
        }
        if (t != null) {
            Log.m105924i(e1Var2.f30980a, "chooseVisitorRole linking");
            C10125e1.C10127b bVar = e1Var2.f30988g;
            C56032b h = (bVar == null || (aVar2 = bVar.f31008a) == null) ? null : aVar2.mo10549h();
            C56032b bVar2 = h instanceof C56032b ? h : null;
            if (bVar2 != null) {
                C56032b.showAlertDialog$default(bVar2, mMActivity, "", MMApplicationContext.getContext().getResources().getString(C0966R.string.e_w), "", false, 16, (Object) null);
            }
        } else if (((C54963d0) e1Var2.mo10534b(cls)).mo75913U3()) {
            e1Var2.mo10539g(C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null);
            Log.m105924i(e1Var2.f30980a, "chooseVisitorRole linkWaiting");
        } else {
            Log.m105924i(e1Var2.f30980a, "chooseVisitorRole isLandscape:" + e1Var2.f30987f);
            if (e1Var2.f30987f) {
                C10125e1.C10127b bVar3 = e1Var2.f30988g;
                if (bVar3 != null && (aVar = bVar3.f31008a) != null) {
                    aVar.mo10541a(new C10241a(mMActivity));
                    return;
                }
                return;
            }
            FinderLiveService.f159376d.getClass();
            C54795n5 n5Var = FinderLiveService.f159396y;
            if (n5Var != null) {
                ((C54820t) n5Var).mo75713Q(mMActivity, false);
            }
        }
    }
}
