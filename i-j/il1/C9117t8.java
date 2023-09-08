package il1;

import ak1.C54067f0;
import ak1.C54108o;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import cj1.C54795n5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import ky2.C10432i;
import l31.C61212e;
import nj3.C76912y0;
import qj1.C62660c;

/* renamed from: il1.t8 */
public final class C9117t8 implements View.OnClickListener {

    /* renamed from: d */
    public final ViewGroup f28727d;

    /* renamed from: e */
    public final C58124b f28728e;

    /* renamed from: f */
    public final C62660c f28729f;

    /* renamed from: g */
    public final String f28730g = "Finder.FinderLiveVisitorLuckyMoneyEntranceWidget";

    public C9117t8(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        Class cls = C61212e.class;
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f28727d = viewGroup;
        this.f28728e = bVar;
        this.f28729f = cVar;
        ((C61212e) C86312j.m106911c(cls)).o30(viewGroup, "finder_live_link_red_packet");
        if (bVar.getLiveRole() == 0) {
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(viewGroup, 8, 25561);
        }
        viewGroup.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo9932a(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f28727d.setVisibility(8);
            Log.m105928w(this.f28730g, "setVisible return for isTeenMode");
            return;
        }
        if (this.f28727d.getVisibility() != 0 && i == 0) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8608i((C8777j5) c, C54067f0.C0066n.REDPACKET, (Map) null, 2, (Object) null);
        }
        this.f28727d.setVisibility(i);
    }

    public void onClick(View view) {
        C54795n5 D0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLuckyMoneyEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dr4) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.REDPACKET, (Map) null, (String) null, 6, (Object) null);
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) f).intValue();
            if (intValue != 0 && intValue != 1) {
                C76912y0.makeText(this.f28727d.getContext(), (CharSequence) this.f28727d.getContext().getResources().getString(C0966R.string.dur), 0).show();
            } else if ((this.f28727d.getContext() instanceof Activity) && (D0 = this.f28729f.mo14476D0()) != null) {
                Context context = this.f28727d.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                D0.mo75717U((Activity) context);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLuckyMoneyEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
