package kj1;

import ak1.C54067f0;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kj1.C10125e1;
import lj1.C10535c;
import lj1.C10536d;
import ok1.C62042e;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: kj1.m2 */
public final class C10195m2 extends C10535c {

    /* renamed from: h */
    public final String f31173h = "audience.more.morefunction.minimize";

    /* renamed from: kj1.m2$a */
    public static final class C10196a implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ C10195m2 f31174a;

        public C10196a(C10195m2 m2Var) {
            this.f31174a = m2Var;
        }

        public final void onStatusChange(boolean z) {
            C10119d1.f30943a.mo10530a(4, 0, 1, z ? 2 : 3);
            C62042e.f176370a.getClass();
            Log.m105924i("FinderLiveUtil", "savePlayDesktopSwitch " + z);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_PLAY_DESKTOP_BOOLEAN_SYNC, Boolean.valueOf(z));
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_PLAY_SETTING_SWITCH;
            C13604l[] lVarArr = new C13604l[1];
            lVarArr[0] = new C13604l("button_click_type", z ? "1" : "0");
            C8777j5.C8778a.m8606g(j5Var, mVar, C90364q0.m113148g(lVarArr), (String) null, 4, (Object) null);
            C10536d.m10457e(this.f31174a, false, 1, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10195m2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31173h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        C10125e1.C10127b bVar = this.f31809a.f30988g;
        return bVar != null && bVar.f31011d;
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "bottomSheet");
        C10119d1.f30943a.mo10530a(4, 0, 1, 1);
        View view = v0Var.f18463f;
        View findViewById = view.findViewById(C0966R.C0970id.bm5);
        View findViewById2 = view.findViewById(C0966R.C0970id.bm6);
        MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) view.findViewById(C0966R.C0970id.f359330o42);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorPlayDesktopOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/VisitorPlayDesktopOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorPlayDesktopOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/moreaction/VisitorPlayDesktopOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C62042e.f176370a.getClass();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_PLAY_DESKTOP_BOOLEAN_SYNC, Boolean.TRUE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) f).booleanValue();
        Log.m105924i("FinderLiveUtil", "getPlayDesktopSwitch " + booleanValue);
        mMSwitchBtn.setCheck(booleanValue);
        mMSwitchBtn.setSwitchListener(new C10196a(this));
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8608i((C8777j5) c, C54067f0.C0066n.LIVE_PLAY_SETTING_SWITCH, (Map) null, 2, (Object) null);
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.lmw);
    }
}
