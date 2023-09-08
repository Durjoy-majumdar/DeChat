package rs1;

import android.view.View;
import android.widget.TextView;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2492u0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import dp1.C58413v0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: rs1.i9 */
public final class C13278i9 extends C2492u0 {

    /* renamed from: e */
    public final /* synthetic */ C13146c9 f37690e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13278i9(C13146c9 c9Var) {
        super(false, 1, (C8480h) null);
        this.f37690e = c9Var;
    }

    /* renamed from: a */
    public void mo2472a(C2479n0.C2480a aVar) {
        String str;
        String str2;
        C51978xi1 xi12;
        C2479n0.C2480a aVar2 = aVar;
        Class cls = FinderCommonFeatureService.class;
        View findViewById = this.f37690e.findViewById(C0966R.C0970id.bwi);
        View findViewById2 = this.f37690e.findViewById(C0966R.C0970id.bwd);
        TextView textView = (TextView) this.f37690e.findViewById(C0966R.C0970id.bwh);
        StringBuilder sb = new StringBuilder();
        sb.append("finderCreatorEntrance, reddot show:");
        sb.append(aVar2 != null ? Boolean.valueOf(aVar2.f12908a) : null);
        Log.m105924i(C54492n.TAG, sb.toString());
        if (aVar2 != null && aVar2.f12908a) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("CreatorCenter");
            C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("CreatorCenter");
            String str3 = "";
            if (G5 == null || (xi12 = G5.field_ctrInfo) == null || (str = xi12.f144673h) == null) {
                str = str3;
            }
            if (!C87412m.m108589b(str, this.f37690e.f37400E)) {
                C13146c9 c9Var = this.f37690e;
                c9Var.getClass();
                c9Var.f37400E = str;
                C13146c9 c9Var2 = this.f37690e;
                if (!(G5 == null || R5 == null)) {
                    C58413v0 v0Var = C58413v0.f167346a;
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(c9Var2.getActivity());
                    C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 1, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("finderCreatorEntrance, showtype:");
            sb4.append(R5 != null ? Integer.valueOf(R5.f184502d) : null);
            sb4.append(",title:");
            sb4.append(R5 != null ? R5.f184504f : null);
            Log.m105924i(C54492n.TAG, sb4.toString());
            Integer valueOf = R5 != null ? Integer.valueOf(R5.f184502d) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                textView.setVisibility(8);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (valueOf != null && valueOf.intValue() == 17) {
                textView.setVisibility(0);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view3 = findViewById2;
                C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                String str4 = R5.f184504f;
                if (str4 != null) {
                    str3 = str4;
                }
                textView.setText(str3);
            } else if (valueOf != null && valueOf.intValue() == 3) {
                textView.setVisibility(0);
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                View view4 = findViewById2;
                C117292a.m165358d(view4, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                String str5 = R5.f184504f;
                if (str5 != null) {
                    str3 = str5;
                }
                textView.setText(str3);
            } else {
                textView.setVisibility(8);
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view5 = findViewById2;
                C117292a.m165358d(view5, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (!(R5 == null || (str2 = R5.f184504f) == null)) {
                    str3 = str2;
                }
                textView.setText(str3);
            }
        } else {
            C9556a aVar8 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar8.mo10233c(4);
            View view6 = findViewById;
            C117292a.m165358d(view6, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(8);
            View view7 = findViewById2;
            C117292a.m165358d(view7, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$14", "onRedDotChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f37690e.mo12642F3();
        }
    }
}
