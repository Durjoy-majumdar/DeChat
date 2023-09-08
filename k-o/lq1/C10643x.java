package lq1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: lq1.x */
public final class C10643x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Integer, C13598b0> f32055d;

    /* renamed from: e */
    public final /* synthetic */ int f32056e;

    public C10643x(C32226l<? super Integer, C13598b0> lVar, int i) {
        this.f32055d = lVar;
        this.f32056e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$initSelectItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f32055d.invoke(Integer.valueOf(this.f32056e));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$initSelectItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
