package ve1;

import android.view.View;
import cm1.C55027r;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p599lr.C61381b;

/* renamed from: ve1.l */
public final class C65620l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C55027r f188821d;

    public C65620l(C55027r rVar) {
        this.f188821d = rVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert$updateProgress$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12409b(this.f188821d.f154485d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert$updateProgress$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
