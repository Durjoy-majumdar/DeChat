package il1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qj1.C62660c;
import rx3.C13598b0;

/* renamed from: il1.b7 */
public final class C8938b7 extends C87413o implements C32227p<Long, Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9133u6 f28245d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8938b7(C9133u6 u6Var) {
        super(2);
        this.f28245d = u6Var;
    }

    public Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        C9133u6 u6Var = this.f28245d;
        if (longValue2 != u6Var.f28771h) {
            Log.m105924i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "updateWecoinBalance: requestId not match, requestId:" + longValue2 + ", wecoinBalanceRequestId:" + this.f28245d.f28771h);
        } else {
            if (longValue < 0) {
                C54795n5 n5Var = u6Var.f28775l;
                longValue = n5Var != null ? n5Var.mo75718V() : -1;
            }
            if (longValue >= 0) {
                C62660c cVar = u6Var.f28776m;
                C54991o oVar = cVar != null ? (C54991o) cVar.mo87696x0(C54991o.class) : null;
                if (oVar != null) {
                    oVar.mo76019q4(longValue);
                }
                Log.m105924i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance " + longValue);
                ViewGroup viewGroup = u6Var.f28769f;
                if (viewGroup != null) {
                    viewGroup.setBackgroundResource(C0966R.C0969drawable.f5203zq);
                }
                View view = u6Var.f28766c;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView = u6Var.f28767d;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = u6Var.f28767d;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(longValue));
                }
                View view2 = u6Var.f28768e;
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ProgressBar progressBar = u6Var.f28770g;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
