package q53;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C87412m;
import j20.C117292a;
import java.math.RoundingMode;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;

/* renamed from: q53.o1 */
public final class C12103o1<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35193d;

    public C12103o1(WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f35193d = weCoinIncomeDetailView;
    }

    public void onChanged(Object obj) {
        Long l = (Long) obj;
        C87412m.m108593f(l, "pendingBlance");
        if (l.longValue() > 0) {
            String n = C75228t.m90260n(C75228t.m90248h(C61926c.m72691p(l.longValue()), "100", 2, RoundingMode.HALF_UP).doubleValue());
            View view = this.f35193d.f21859y;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            WeCoinIncomeDetailView weCoinIncomeDetailView = this.f35193d;
            TextView textView = weCoinIncomeDetailView.f21860z;
            if (textView != null) {
                textView.setText(weCoinIncomeDetailView.getResources().getString(C0966R.string.mpx, new Object[]{n}));
            }
            WeCoinIncomeDetailView weCoinIncomeDetailView2 = this.f35193d;
            View view3 = weCoinIncomeDetailView2.f21859y;
            if (view3 != null) {
                view3.setOnClickListener(new C12099n1(weCoinIncomeDetailView2));
                return;
            }
            return;
        }
        View view4 = this.f35193d.f21859y;
        if (view4 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
