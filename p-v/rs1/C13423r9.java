package rs1;

import android.view.View;
import androidx.lifecycle.C0120a0;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C64586nn1;

/* renamed from: rs1.r9 */
public final class C13423r9<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f38001d;

    public C13423r9(C13146c9 c9Var) {
        this.f38001d = c9Var;
    }

    public void onChanged(Object obj) {
        C55718s0 s0Var;
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("[SHOW first_fav] red=");
        boolean z = true;
        sb.append(aVar != null && aVar.f12908a);
        Log.m105924i(C54492n.TAG, sb.toString());
        if (aVar == null || !aVar.f12908a) {
            z = false;
        }
        if (z) {
            View findViewById = this.f38001d.findViewById(C0966R.C0970id.d_1);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$8", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$8", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C49712hj1 hj12 = null;
            String str = (aVar == null || (s0Var = aVar.f12910c) == null) ? null : s0Var.field_tipsId;
            if (str == null) {
                str = "";
            }
            if (!C87412m.m108589b(str, this.f38001d.f37410P)) {
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0 y0Var = (C58417y0) c;
                C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
                C13442s8 f = aVar3.mo12873f(this.f38001d.getActivity());
                C58417y0.Nx0(y0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, 6, 1, 0, 0, 0, (String) null, (String) null, 0, f != null ? f.mo12861q3() : null, 0, 0, 3520, (Object) null);
                C13146c9 c9Var = this.f38001d;
                c9Var.f37410P = str;
                C55718s0 s0Var2 = aVar.f12910c;
                C64586nn1 nn12 = aVar.f12909b;
                if (s0Var2 != null && nn12 != null) {
                    C58413v0 v0Var = C58413v0.f167346a;
                    C13442s8 f2 = aVar3.mo12873f(c9Var.getActivity());
                    if (f2 != null) {
                        hj12 = f2.mo12861q3();
                    }
                    C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, s0Var2, nn12, 1, hj12, 0, (String) null, 0, 0, 480, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        View findViewById2 = this.f38001d.findViewById(C0966R.C0970id.d_1);
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar4.mo10233c(8);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$8", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$8", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
