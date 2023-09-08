package qk1;

import ak1.C54067f0;
import ak1.C54108o;
import android.view.View;
import di3.C86312j;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C12855y1;
import rx3.C13598b0;
import te3.C49765hx0;

/* renamed from: qk1.b2 */
public final class C12793b2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12855y1 f36617d;

    /* renamed from: e */
    public final /* synthetic */ C12855y1.C12858c f36618e;

    public C12793b2(C12855y1 y1Var, C12855y1.C12858c cVar) {
        this.f36617d = y1Var;
        this.f36618e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$bindMember$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super C49765hx0, C13598b0> lVar = this.f36617d.f36809y;
        if (lVar != null) {
            lVar.invoke(this.f36618e.f36812a);
        }
        ((C54108o) C86312j.m106911c(C54108o.class)).Zx0(C54067f0.C0059h0.CLICK_LIST_ITEM_USER);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$bindMember$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
