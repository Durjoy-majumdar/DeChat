package q53;

import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import gy3.C87412m;
import p53.C11831b0;

/* renamed from: q53.k2 */
public final class C12088k2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35175d;

    public C12088k2(WeCoinRechargeView weCoinRechargeView) {
        this.f35175d = weCoinRechargeView;
    }

    public void onChanged(Object obj) {
        if (((C11831b0.C11832a) obj).f34602b) {
            WeCoinRechargeView weCoinRechargeView = this.f35175d;
            C11831b0 b0Var = weCoinRechargeView.f21864d;
            if (b0Var == null) {
                C87412m.m108603p("mViewModel");
                throw null;
            } else if (!b0Var.f34599q) {
                WeCoinRechargeView.m5532H7(weCoinRechargeView);
            }
        } else {
            C11831b0 b0Var2 = this.f35175d.f21864d;
            if (b0Var2 == null) {
                C87412m.m108603p("mViewModel");
                throw null;
            } else if (!b0Var2.f34599q) {
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WECOIN_PAGE_HAS_SHOW_TUTORIAL_BOOLEAN_SYNC;
                Boolean bool = Boolean.FALSE;
                Object f = i.mo119685f(aVar, bool);
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
                if (!((Boolean) f).booleanValue()) {
                    WeCoinRechargeView.m5533I7(this.f35175d);
                    WeCoinRechargeView weCoinRechargeView2 = this.f35175d;
                    weCoinRechargeView2.getClass();
                    if (bool != null) {
                        TextView textView = weCoinRechargeView2.f21876s;
                        if (textView != null) {
                            textView.setText(weCoinRechargeView2.getString(C0966R.string.ljz));
                        } else {
                            C87412m.m108603p("mSwitchDeviceTipsView");
                            throw null;
                        }
                    }
                    if (this.f35175d.f21864d != null) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                    } else {
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                }
            }
        }
    }
}
