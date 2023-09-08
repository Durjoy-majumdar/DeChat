package rs1;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.hk4;

/* renamed from: rs1.u9 */
public final class C13479u9 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ hk4 f38198d;

    /* renamed from: e */
    public final /* synthetic */ C13146c9 f38199e;

    public C13479u9(hk4 hk4, C13146c9 c9Var) {
        this.f38198d = hk4;
        this.f38199e = c9Var;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$needCompleteAccountUi$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hk4 hk4 = this.f38198d;
        if (hk4 == null || (str = hk4.f134711g) == null) {
            str = "";
        }
        if (str.length() > 0) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109795m(this.f38199e.getActivity(), "webview", ".ui.tools.WebViewUI", intent, 31121);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$needCompleteAccountUi$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
