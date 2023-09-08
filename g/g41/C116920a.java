package g41;

import a41.C112756b;
import android.os.Message;
import android.view.View;
import android.view.ViewParent;
import b41.C113144b;
import c41.C79932a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import h41.C117067b;
import i41.C117140a;
import i41.C117141b;
import j41.C117298c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k31.C117373a;
import l31.C61213g;
import m41.C117534a;
import m41.C117535e;
import m41.C117536f;
import o41.C117709a;
import op3.C117882j;
import p31.C117924b;
import r31.C118218a;
import r31.C118219b;
import u31.C118568a;
import v31.C118643c;
import y31.C118914a;
import y31.C118915b;

/* renamed from: g41.a */
public class C116920a extends C79932a implements C113144b, C61213g.C61215b {

    /* renamed from: d */
    public C117140a f350350d;

    /* renamed from: e */
    public WeakHashMap<View, Long> f350351e = new WeakHashMap<>();

    /* renamed from: f */
    public WeakHashMap<View, String> f350352f = new WeakHashMap<>();

    /* renamed from: g */
    public C117709a<View> f350353g = new C117709a<>();

    /* renamed from: h */
    public C117709a<View> f350354h = new C117709a<>();

    /* renamed from: i */
    public MMHandler f350355i = C117536f.m165803e(new a$$b(this));

    /* renamed from: A */
    public void mo32636A(View view) {
        if (view != null && C117373a.xx0().Ex0()) {
            mo180889M(view);
        }
    }

    /* renamed from: H */
    public void mo32639H(View view) {
        if (view != null && C117373a.xx0().Ex0()) {
            mo180889M(view);
        }
    }

    /* renamed from: J */
    public void mo77122J(View view, int i) {
        if (view != null && C117373a.xx0().Ex0()) {
            if (this.f350353g.contains(view)) {
                this.f350353g.mo182402h(view);
                return;
            }
            WeakHashMap<View, String> weakHashMap = this.f350352f;
            C117373a.xx0().getClass();
            String str = null;
            if (!C117534a.m165789l(view)) {
                Log.m105920e("Amoeba.DataReportService", "[getViewUniqueId] target is not a view!!!");
            } else {
                C118643c g = C118568a.m167240g(view, false);
                if (g != null) {
                    str = g.f355024b;
                }
            }
            weakHashMap.put(view, str);
            long currentTimeMillis = System.currentTimeMillis();
            this.f350351e.put(view, Long.valueOf(currentTimeMillis));
            if (C118568a.m167243j(view) && !C117535e.m165798i("view_exp", C117373a.xx0().Bx0(view))) {
                if ((C117373a.xx0().Bx0(view) & 16) == 0 || C118568a.m167236c(view, "view_exp_count") <= 0) {
                    C118568a.m167245l(view, "view_exp");
                    if (currentTimeMillis - C117373a.xx0().yx0(view, "view_exp") >= C117373a.xx0().Ax0(view, "view_exp")) {
                        C117373a.xx0().Jx0(view, "view_exp", currentTimeMillis);
                        HashMap hashMap = new HashMap();
                        hashMap.put("expose_type", Integer.valueOf(i));
                        Message obtainMessage = this.f350355i.obtainMessage(1008);
                        obtainMessage.obj = C117882j.m166287f(C118219b.m166775b("view_exp", view), C117534a.m165780c(view), hashMap, C117373a.xx0().Cx0(view, "view_exp"), Long.valueOf(currentTimeMillis));
                        this.f350355i.sendMessage(obtainMessage);
                        return;
                    }
                    return;
                }
                C118568a.m167245l(view, "view_exp");
            }
        }
    }

    /* renamed from: K */
    public void mo32641K(View view) {
        if (view != null && C117373a.xx0().Ex0()) {
            mo180889M(view);
        }
    }

    /* renamed from: L */
    public void mo32642L(View view) {
        if (view != null && C117373a.xx0().Ex0()) {
            mo180889M(view);
        }
    }

    /* renamed from: M */
    public final void mo180889M(View view) {
        ArrayList arrayList;
        if (view != null && C117373a.xx0().Ex0()) {
            Log.m105918d("Amoeba.ViewEventMonitor", "[onViewClk]");
            C117067b.wx0().zx0(1, 500);
            View view2 = view;
            int i = 0;
            while (true) {
                if (i >= 99) {
                    break;
                }
                int i2 = C118568a.m167242i(view2);
                if ((i2 & 1) != 0) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    if ((i2 & 4) != 0) {
                        arrayList.add(4);
                    }
                    if ((i2 & 8) != 0) {
                        arrayList.add(8);
                    }
                    if ((i2 & 2) != 0) {
                        arrayList.add(2);
                    }
                }
                if (arrayList != null && arrayList.size() > 0) {
                    view = view2;
                    break;
                }
                ViewParent parent = view2.getParent();
                if (parent == null || !(parent instanceof View)) {
                    break;
                }
                view2 = (View) parent;
                i++;
            }
            C118643c g = C118568a.m167240g(view, false);
            C117536f.m165800b(new a$$a(g == null ? null : g.f355023a));
            if (C118568a.m167243j(view) && !C117535e.m165798i("view_clk", C117373a.xx0().Bx0(view))) {
                if ((C117373a.xx0().Bx0(view) & 4) == 0 || C118568a.m167236c(view, "view_clk_count") <= 0) {
                    C118568a.m167245l(view, "view_clk");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - C117373a.xx0().yx0(view, "view_clk") >= C117373a.xx0().Ax0(view, "view_clk")) {
                        C117373a.xx0().Jx0(view, "view_clk", currentTimeMillis);
                        Message obtainMessage = this.f350355i.obtainMessage(1007);
                        obtainMessage.obj = C117882j.m166287f(C118219b.m166775b("view_clk", view), C117534a.m165780c(view), null, C117373a.xx0().Cx0(view, "view_clk"), Long.valueOf(currentTimeMillis));
                        this.f350355i.sendMessage(obtainMessage);
                        return;
                    }
                    return;
                }
                C118568a.m167245l(view, "view_clk");
            }
        }
    }

    /* renamed from: N */
    public final void mo180890N(List<C118218a> list, C112756b bVar, Map<String, Object> map, List<C117924b> list2, long j) {
        if (this.f350350d != null) {
            Map<String, Object> map2 = null;
            C118915b bVar2 = C117373a.xx0().f351380f.f353453c;
            if (bVar2 != null) {
                map2 = ((C118914a) bVar2).mo183599a(list, C118219b.m166774a("view_clk", C118219b.m166777d(bVar)), map, false);
            }
            ((C117141b) this.f350350d).getClass();
            Log.m105925i("Amoeba.StandardEventMonitor", "[onViewClk] time : %d", Long.valueOf(j));
            long j2 = j;
            C117373a.xx0().Ix0(j2, "view_clk", map2, list2);
            C117298c.m165377a().mo181967b(j2, "view_clk", (Object) null, map2);
        }
    }

    /* renamed from: O */
    public final void mo180891O(List<C118218a> list, C112756b bVar, Map<String, Object> map, List<C117924b> list2, long j) {
        if (this.f350350d != null) {
            Map<String, Object> map2 = null;
            C118915b bVar2 = C117373a.xx0().f351380f.f353453c;
            if (bVar2 != null) {
                map2 = ((C118914a) bVar2).mo183599a(list, C118219b.m166774a("view_exp", C118219b.m166777d(bVar)), map, false);
            }
            Log.m105924i("Amoeba.ViewEventMonitor", "[viewExp] viewId : " + map2.get("view_id"));
            ((C117141b) this.f350350d).getClass();
            long j2 = j;
            C117373a.xx0().Ix0(j2, "view_exp", map2, list2);
            C117298c.m165377a().mo181967b(j2, "view_exp", (Object) null, map2);
        }
    }

    /* renamed from: P */
    public final void mo180892P(List<C118218a> list, C112756b bVar, Map<String, Object> map, List<C117924b> list2, long j) {
        if (this.f350350d != null) {
            Map<String, Object> map2 = null;
            C118915b bVar2 = C117373a.xx0().f351380f.f353453c;
            if (bVar2 != null) {
                map2 = ((C118914a) bVar2).mo183599a(list, C118219b.m166774a("view_unexp", C118219b.m166777d(bVar)), map, false);
            }
            Log.m105924i("Amoeba.ViewEventMonitor", "[viewUnExp] viewId : " + map2.get("view_id"));
            ((C117141b) this.f350350d).getClass();
            long j2 = j;
            C117373a.xx0().Ix0(j2, "view_unexp", map2, list2);
            C117298c.m165377a().mo181967b(j2, "view_unexp", (Object) null, map2);
        }
    }

    /* renamed from: a */
    public void mo32643a(View view) {
        if (view != null && C117373a.xx0().Ex0()) {
            mo180889M(view);
        }
    }

    /* renamed from: l */
    public void mo77123l(View view, int i) {
        long j;
        if (view != null && C117373a.xx0().Ex0()) {
            if (this.f350354h.contains(view)) {
                this.f350354h.mo182402h(view);
                return;
            }
            this.f350352f.remove(view);
            this.f350353g.mo182402h(view);
            this.f350354h.mo182402h(view);
            Long l = this.f350351e.get(view);
            long j2 = 0;
            if (l == null || !(l instanceof Long)) {
                j = 0;
            } else {
                j = l.longValue();
                this.f350351e.remove(view);
            }
            if (C118568a.m167243j(view) && !C117535e.m165798i("view_unexp", C117373a.xx0().Bx0(view))) {
                if ((C117373a.xx0().Bx0(view) & 64) == 0 || C118568a.m167236c(view, "view_unexp_count") <= 0) {
                    C118568a.m167245l(view, "view_unexp");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - C117373a.xx0().yx0(view, "view_unexp") >= C117373a.xx0().Ax0(view, "view_unexp")) {
                        C117373a.xx0().Jx0(view, "view_unexp", currentTimeMillis);
                        HashMap hashMap = new HashMap();
                        hashMap.put("expose_type", Integer.valueOf(i));
                        long j3 = currentTimeMillis - j;
                        if (j3 > 0 && j != 0) {
                            j2 = j3;
                        }
                        hashMap.put("expose_time", Long.valueOf(j2));
                        Message obtainMessage = this.f350355i.obtainMessage(1009);
                        obtainMessage.obj = C117882j.m166287f(C118219b.m166775b("view_unexp", view), C117534a.m165780c(view), hashMap, C117373a.xx0().Cx0(view, "view_unexp"), Long.valueOf(currentTimeMillis));
                        this.f350355i.sendMessage(obtainMessage);
                        return;
                    }
                    return;
                }
                C118568a.m167245l(view, "view_unexp");
            }
        }
    }

    /* renamed from: r */
    public void mo32656r(View view) {
        if (view != null && C117373a.xx0().Ex0()) {
            mo180889M(view);
        }
    }

    /* renamed from: u */
    public void mo32659u(View view) {
        if (view != null && C117373a.xx0().Ex0()) {
            mo180889M(view);
        }
    }

    /* renamed from: y */
    public void mo32663y(View view) {
        if (view != null && C117373a.xx0().Ex0()) {
            mo180889M(view);
        }
    }

    /* renamed from: z */
    public void mo32664z(View view) {
        if (view != null && C117373a.xx0().Ex0()) {
            mo180889M(view);
        }
    }
}
