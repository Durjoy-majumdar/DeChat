package q53;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import z04.C112551y;

/* renamed from: q53.l2 */
public final class C12092l2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35179d;

    public C12092l2(WeCoinRechargeView weCoinRechargeView) {
        this.f35179d = weCoinRechargeView;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        WeCoinRechargeView weCoinRechargeView = this.f35179d;
        C87412m.m108593f(bool, LocaleUtil.ITALIAN);
        boolean booleanValue = bool.booleanValue();
        int i = WeCoinRechargeView.f21863u;
        View findViewById = weCoinRechargeView.findViewById(C0966R.C0970id.m4i);
        LinearLayout linearLayout = (LinearLayout) weCoinRechargeView.findViewById(C0966R.C0970id.m96);
        TextView textView = (TextView) weCoinRechargeView.findViewById(C0966R.C0970id.m97);
        if (booleanValue && (!C112551y.m153809i("CN", C86709a0.m107535s().mo121142i().mo119674H(274436, "CN"), true))) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(0);
            textView.setVisibility(0);
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
