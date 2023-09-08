package q53;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p53.C11831b0;
import te3.C51310sx;

/* renamed from: q53.j2 */
public final class C12084j2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35168d;

    public C12084j2(WeCoinRechargeView weCoinRechargeView) {
        this.f35168d = weCoinRechargeView;
    }

    public void onChanged(Object obj) {
        C51310sx sxVar = (C51310sx) obj;
        WeCoinRechargeView weCoinRechargeView = this.f35168d;
        int i = WeCoinRechargeView.f21863u;
        weCoinRechargeView.getClass();
        Log.m105924i("MicroMsg.WeCoinRechargeView", "bannerContent: [bannerContent] " + sxVar);
        View view = weCoinRechargeView.f21867g;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (sxVar != null && !TextUtils.isEmpty(sxVar.f141810d)) {
                C11831b0 b0Var = weCoinRechargeView.f21864d;
                if (b0Var != null) {
                    b0Var.mo11721d3(2);
                    View view2 = weCoinRechargeView.f21867g;
                    if (view2 != null) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(0);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view4 = weCoinRechargeView.f21867g;
                        if (view4 != null) {
                            ((TextView) view4.findViewById(C0966R.C0970id.loi)).setText(sxVar.f141810d);
                            View view5 = weCoinRechargeView.f21867g;
                            if (view5 != null) {
                                WeImageView weImageView = (WeImageView) view5.findViewById(C0966R.C0970id.loh);
                                String str = sxVar.f141811e;
                                if (str == null || str.length() == 0) {
                                    weImageView.setVisibility(8);
                                    return;
                                }
                                weImageView.setVisibility(0);
                                View view6 = weCoinRechargeView.f21867g;
                                if (view6 != null) {
                                    view6.setOnClickListener(new C12132w2(weCoinRechargeView, sxVar));
                                } else {
                                    C87412m.m108603p("mBannerView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mBannerView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mBannerView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mBannerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mViewModel");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("mBannerView");
            throw null;
        }
    }
}
