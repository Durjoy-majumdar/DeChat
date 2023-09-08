package ao1;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: ao1.h */
public final class C0155h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0166l f599d;

    public C0155h(C0166l lVar) {
        this.f599d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostCreateContactUIC$initView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f599d.mo156c3();
        C12925w wVar = this.f599d.f619d;
        if (wVar != null) {
            wVar.f36933o = true;
            wVar.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostCreateContactUIC$initView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("bottomSheet");
        throw null;
    }
}
