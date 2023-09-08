package kf1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.C49821ia3;

/* renamed from: kf1.m4 */
public final class C9853m4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9765h4 f30430d;

    /* renamed from: e */
    public final /* synthetic */ C49821ia3 f30431e;

    public C9853m4(C9765h4 h4Var, C49821ia3 ia32) {
        this.f30430d = h4Var;
        this.f30431e = ia32;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$setTopRightBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f30431e.f135192e);
        intent.putExtra("convertActivityFromTranslucent", true);
        C88144b.m109791i(this.f30430d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$setTopRightBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
