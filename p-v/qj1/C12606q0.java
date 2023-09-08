package qj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import androidx.recyclerview.widget.RecyclerView;
import b50.C54405b;
import bl3.C39818r;
import c30.C104289g;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58115i;
import di3.C7335d;
import di3.C86312j;
import fh1.C8048h;
import gy3.C87412m;
import ht1.C8777j5;
import il1.C9077o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C11184p0;
import nj3.C76912y0;
import wg1.C15257b1;
import xk1.C15775s1;
import zj1.C16217b;

/* renamed from: qj1.q0 */
public final class C12606q0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C62889n0 f36138d;

    public C12606q0(C62889n0 n0Var) {
        this.f36138d = n0Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C58115i liveStatus;
        C9077o oVar;
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        int itemId = menuItem.getItemId();
        C62889n0 n0Var = this.f36138d;
        if (itemId == n0Var.f178465W) {
            n0Var.getClass();
            C0073g0 g0Var = C0073g0.LIVE_AUDIO_MODE;
            Class cls = C54108o.class;
            Class cls2 = C54991o.class;
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.SWITCH, n0Var.f178460R0, (String) null, 4, (Object) null);
            Log.m105924i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "clickAudioMode showScene:" + n0Var.f178472q);
            C15257b1.f41498a.mo14159a(((C54991o) n0Var.mo87696x0(cls2)).mo75960G3() ? 2 : 1);
            if (n0Var.f178472q == 0) {
                if (((C54991o) n0Var.mo87696x0(cls2)).mo75960G3()) {
                    C76912y0.m92768g(n0Var.f166287d.getContext(), n0Var.f166287d.getContext().getResources().getString(C0966R.string.f360634mo2));
                    ((C54991o) n0Var.mo87696x0(cls2)).mo76020r4(0);
                    n0Var.mo87833h1();
                    C39818r rVar = C39818r.f106831a;
                    Context context = n0Var.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    C15775s1 s1Var = (C15775s1) rVar.mo62443b(context).mo62449e(C15775s1.class);
                    if (!(s1Var == null || (recyclerView = s1Var.f42527d) == null || (adapter = recyclerView.getAdapter()) == null)) {
                        adapter.notifyDataSetChanged();
                    }
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8600a((C8777j5) c2, 20, "2", (String) null, 4, (Object) null);
                } else {
                    C76912y0.m92768g(n0Var.f166287d.getContext(), n0Var.f166287d.getContext().getResources().getString(C0966R.string.f360634mo2));
                    ((C54991o) n0Var.mo87696x0(cls2)).mo76020r4(1);
                    n0Var.mo87825b1();
                    C7335d c3 = C86312j.m106911c(cls);
                    C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8600a((C8777j5) c3, 20, "1", (String) null, 4, (Object) null);
                }
            } else if (((C54991o) n0Var.mo87696x0(cls2)).mo75960G3()) {
                n0Var.mo87833h1();
                ((C54991o) n0Var.mo87696x0(cls2)).mo76020r4(0);
                C12490l0 l0Var = (C12490l0) n0Var.mo87687E0(C12490l0.class);
                if (!(l0Var == null || (oVar = l0Var.f35934x) == null)) {
                    C8048h.f26771n.mo9137b(oVar.f28637c.mo87684A0());
                }
                C7335d c4 = C86312j.m106911c(cls);
                C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c4, g0Var, "2", (String) null, 4, (Object) null);
            } else {
                C76912y0.m92768g(n0Var.f166287d.getContext(), n0Var.f166287d.getContext().getResources().getString(C0966R.string.f360634mo2));
                ((C54991o) n0Var.mo87696x0(cls2)).mo76020r4(1);
                n0Var.mo87825b1();
                C7335d c5 = C86312j.m106911c(cls);
                C87412m.m108593f(c5, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c5, g0Var, "1", (String) null, 4, (Object) null);
                C54405b c1 = n0Var.mo87827c1();
                if ((c1 == null || (liveStatus = c1.getLiveStatus()) == null || !liveStatus.f166264k) ? false : true) {
                    C104289g gVar = new C104289g();
                    gVar.mo145967r("type", 5);
                    C7335d c6 = C86312j.m106911c(cls);
                    C87412m.m108593f(c6, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c6, C0073g0.SCREEN_SHARE, gVar.toString(), (String) null, 4, (Object) null);
                }
            }
            Context context2 = n0Var.f166287d.getContext();
            C0125s sVar = context2 instanceof C0125s ? (C0125s) context2 : null;
            View view = n0Var.f178466W0;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "clickAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                View view2 = view;
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "clickAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (((C54991o) n0Var.mo87696x0(cls2)).mo75960G3()) {
                    if (n0Var.mo87831f1()) {
                        C16217b bVar = C16217b.f43438a;
                        C16217b.m15108i(bVar, sVar, "anchorlive.bottom.audiosetting", view2, (View) null, (TextView) null, 24, (Object) null);
                        bVar.mo14754k(sVar, "anchorlive.bottom.videosetting", true);
                        return;
                    }
                    C16217b bVar2 = C16217b.f43438a;
                    C16217b.m15108i(bVar2, sVar, "startlive.bottom.audiosetting", view2, (View) null, (TextView) null, 24, (Object) null);
                    bVar2.mo14754k(sVar, "startlive.bottom.videosetting", true);
                } else if (n0Var.mo87831f1()) {
                    C16217b bVar3 = C16217b.f43438a;
                    C16217b.m15108i(bVar3, sVar, "anchorlive.bottom.videosetting", view2, (View) null, (TextView) null, 24, (Object) null);
                    bVar3.mo14754k(sVar, "anchorlive.bottom.audiosetting", true);
                } else {
                    C16217b bVar4 = C16217b.f43438a;
                    C16217b.m15108i(bVar4, sVar, "startlive.bottom.videosetting", view2, (View) null, (TextView) null, 24, (Object) null);
                    bVar4.mo14754k(sVar, "startlive.bottom.audiosetting", true);
                }
            }
        }
    }
}
