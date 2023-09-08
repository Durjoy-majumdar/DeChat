package q53;

import android.widget.ScrollView;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import gy3.C87412m;

/* renamed from: q53.z0 */
public final class C47769z0 implements C75217h {

    /* renamed from: a */
    public final /* synthetic */ WeCoinEncashView f128288a;

    public C47769z0(WeCoinEncashView weCoinEncashView) {
        this.f128288a = weCoinEncashView;
    }

    public final void onVisibleStateChange(boolean z) {
        if (z) {
            WeCoinEncashView weCoinEncashView = this.f128288a;
            ScrollView scrollView = weCoinEncashView.f117269h;
            if (scrollView != null) {
                scrollView.postDelayed(new C47767x0(weCoinEncashView), 100);
            } else {
                C87412m.m108603p("rootView");
                throw null;
            }
        } else {
            ScrollView scrollView2 = this.f128288a.f117269h;
            if (scrollView2 != null) {
                scrollView2.scrollTo(0, 0);
            } else {
                C87412m.m108603p("rootView");
                throw null;
            }
        }
    }
}
