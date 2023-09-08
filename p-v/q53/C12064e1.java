package q53;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: q53.e1 */
public final class C12064e1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f35147d;

    public C12064e1(C101218e0 e0Var) {
        this.f35147d = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$showTaxCutConfirmHalfPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WeCoinEncashView", "click close");
        this.f35147d.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$showTaxCutConfirmHalfPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
