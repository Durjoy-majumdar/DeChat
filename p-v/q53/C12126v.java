package q53;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q53.v */
public final class C12126v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12049b0 f35225d;

    public C12126v(C12049b0 b0Var) {
        this.f35225d = b0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("WeCoinConsumePanel", "click balance button");
        C12049b0 b0Var = this.f35225d;
        b0Var.f35095b.f35121d.invoke(b0Var);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
