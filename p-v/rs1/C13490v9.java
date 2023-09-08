package rs1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C113200q;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderNewStyleTimelineUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.C4105m5;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58739j4;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8791o4;
import kg3.C76577a;
import o40.C61926c;
import te3.C49712hj1;
import up1.C37521f;
import z04.C112551y;

@C113200q(initialMode = 2)
/* renamed from: rs1.v9 */
public final class C13490v9 extends UIComponent implements C8791o4 {

    /* renamed from: d */
    public C4105m5<BaseFinderFeed> f38220d;

    /* renamed from: rs1.v9$a */
    public static final class C13491a implements PopupWindow.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C13490v9 f38221d;

        public C13491a(C13490v9 v9Var) {
            this.f38221d = v9Var;
        }

        public final void onDismiss() {
            this.f38221d.f38220d = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13490v9(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final boolean mo12898c3(View view, long j, int i) {
        View view2 = view;
        C87412m.m108594g(view, "anchor");
        C39818r rVar = C39818r.f106831a;
        Context context = view.getContext();
        C87412m.m108593f(context, "anchor.context");
        C13554z zVar = (C13554z) rVar.mo62443b(context).mo62449e(C13554z.class);
        if (zVar != null && zVar.f38450t) {
            return false;
        }
        if (getActivity() instanceof FinderNewStyleTimelineUI) {
            Log.m105924i("FinderShareTipsBubbleUIC", "checkShowShareTips: do not show tips");
            return false;
        }
        C37521f.f99374d.getClass();
        boolean z = ((Number) C37521f.f99487p7.mo60266n()).intValue() == 1;
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_SET_SHARE_BUBBLE_TIPS_INT_SYNC;
        int j2 = i2.mo119689j(aVar, 0);
        Log.m105924i("FinderShareTipsBubbleUIC", "checkShowShareTips open: " + z + ", count: " + j2);
        if (z && j2 < 3) {
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_SHARE_BUBBLE_TIPS_LAST_TIME_LONG_SYNC;
            long G = i3.mo119673G(aVar2, 0);
            long F = C58739j4.f168176a.mo83678F();
            Log.m105924i("FinderShareTipsBubbleUIC", "checkShowShareTips lastTime: " + G + ", startTime: " + F);
            if (F >= G) {
                C49712hj1 hj12 = null;
                C4105m5<BaseFinderFeed> m5Var = new C4105m5<>(getContext(), (C4105m5.C4106a) null, 2, (C8480h) null);
                m5Var.f18267q = -1;
                m5Var.f18266p = C76577a.m92151b(getContext(), 68);
                m5Var.f18261h.setText(m5Var.f18259f.getString(C0966R.string.ltr));
                m5Var.f18261h.setTextSize(0, getContext().getResources().getDimension(C0966R.dimen.f3879hn));
                m5Var.mo4987c(view);
                m5Var.mo4986b();
                m5Var.setOnDismissListener(new C13491a(this));
                this.f38220d = m5Var;
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(System.currentTimeMillis()));
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(j2 + 1));
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                Activity context2 = getContext();
                String p = C61926c.m72691p(j);
                y0Var.getClass();
                C87412m.m108594g(context2, "context");
                C104289g gVar = new C104289g();
                gVar.put("feedid", p);
                gVar.mo145953n("trigger_reason", i);
                String gVar2 = gVar.toString();
                C87412m.m108593f(gVar2, "kvJson.toString()");
                String n = C112551y.m153814n(gVar2, ",", ";", false);
                C13442s8 f = C13442s8.f38060Q0.mo12873f(context2);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                y0Var.Cx0(0, "forward_edu", n, hj12);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d3 */
    public final boolean mo12899d3() {
        C37521f.f99374d.getClass();
        return (((Number) C37521f.f99487p7.mo60266n()).intValue() == 1) && C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_SET_SHARE_BUBBLE_TIPS_INT_SYNC, 0) < 3 && C58739j4.f168176a.mo83678F() >= C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_SHARE_BUBBLE_TIPS_LAST_TIME_LONG_SYNC, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13490v9(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
