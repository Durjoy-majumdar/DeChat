package ve1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: ve1.e3 */
public final class C14502e3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14477c3 f40198d;

    public C14502e3(C14477c3 c3Var) {
        this.f40198d = c3Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14477c3 c3Var = this.f40198d;
        C32226l<Integer, C13598b0> lVar = c3Var.f40123e;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(c3Var.f40127i));
        }
        this.f40198d.mo13734j();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
