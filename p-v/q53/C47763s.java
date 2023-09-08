package q53;

import android.view.View;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinBalanceDetailView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q53.s */
public final class C47763s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinBalanceDetailView f128282d;

    public C47763s(WeCoinBalanceDetailView weCoinBalanceDetailView) {
        this.f128282d = weCoinBalanceDetailView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView$updateData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WeCoinBalanceDetailView weCoinBalanceDetailView = this.f128282d;
        int i = WeCoinBalanceDetailView.f117250s;
        weCoinBalanceDetailView.mo67559H7(22);
        this.f128282d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView$updateData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
