package q53;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q53.u */
public final class C12123u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12049b0 f35221d;

    public C12123u(C12049b0 b0Var) {
        this.f35221d = b0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("WeCoinConsumePanel", "click close button");
        C12049b0 b0Var = this.f35221d;
        b0Var.f35095b.f35122e.invoke(b0Var);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
