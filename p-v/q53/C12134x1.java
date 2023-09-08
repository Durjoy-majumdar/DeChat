package q53;

import android.view.View;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q53.x1 */
public final class C12134x1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35237d;

    public C12134x1(WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f35237d = weCoinIncomeDetailView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f35237d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
