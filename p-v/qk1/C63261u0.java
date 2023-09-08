package qk1;

import android.view.View;
import fy3.C32226l;
import gy3.C8479f0;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C64693s21;

/* renamed from: qk1.u0 */
public final class C63261u0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63252r0 f179530d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C64693s21> f179531e;

    public C63261u0(C63252r0 r0Var, C8479f0<C64693s21> f0Var) {
        this.f179530d = r0Var;
        this.f179531e = f0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDelCommentManagerAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super String, C13598b0> lVar = this.f179530d.f179492g;
        if (lVar != null) {
            String str = ((C64693s21) this.f179531e.f27484d).f185309d;
            if (str == null) {
                str = "";
            }
            lVar.invoke(str);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDelCommentManagerAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
