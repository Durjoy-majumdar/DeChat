package ao1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: ao1.z */
public final class C0195z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0192y f670d;

    public C0195z(C0192y yVar) {
        this.f670d = yVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostExtendLinkUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> aVar = this.f670d.f663h;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
