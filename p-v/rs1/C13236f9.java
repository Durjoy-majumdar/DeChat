package rs1;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import dp1.C58413v0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C64586nn1;

/* renamed from: rs1.f9 */
public final class C13236f9<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f37587d;

    public C13236f9(C13146c9 c9Var) {
        this.f37587d = c9Var;
    }

    public void onChanged(Object obj) {
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        Class cls = FinderCommonFeatureService.class;
        StringBuilder sb = new StringBuilder();
        sb.append("[finderWxMessage] red=");
        boolean z = true;
        sb.append(aVar != null && aVar.f12908a);
        Log.m105924i(C54492n.TAG, sb.toString());
        if (aVar == null || !aVar.f12908a) {
            z = false;
        }
        if (z) {
            C64586nn1 nn12 = aVar.f12909b;
            int i = nn12 != null ? nn12.f184503e : 0;
            if (i > 0) {
                TextView textView = (TextView) this.f37587d.findViewById(C0966R.C0970id.f358293e91);
                if (textView != null) {
                    C13146c9 c9Var = this.f37587d;
                    textView.setVisibility(0);
                    textView.setText(i > 999 ? "· · ·" : String.valueOf(i));
                    textView.setBackgroundResource(C45081s1.m49933b(c9Var.getActivity(), i));
                    textView.setTextSize(0, ((float) C76577a.m92155f(c9Var.getActivity(), C0966R.dimen.ary)) * C76577a.m92161l(c9Var.getActivity()));
                }
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("finder_wx_private_msg_entrance");
                C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("finder_wx_private_msg_entrance");
                if (R5 != null && G5 != null) {
                    String str = G5.field_ctrInfo.f144673h;
                    if (str == null) {
                        str = "";
                    }
                    if (!C87412m.m108589b(str, this.f37587d.f37398C)) {
                        C13146c9 c9Var2 = this.f37587d;
                        c9Var2.getClass();
                        c9Var2.f37398C = str;
                        C58413v0 v0Var = C58413v0.f167346a;
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f37587d.getActivity());
                        C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 1, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                        return;
                    }
                    return;
                }
                return;
            }
            View findViewById = this.f37587d.findViewById(C0966R.C0970id.f358293e91);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$11", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$11", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("FinderWXMessageConversation");
            return;
        }
        View findViewById2 = this.f37587d.findViewById(C0966R.C0970id.f358293e91);
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$11", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$11", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
