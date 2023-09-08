package qj1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qj1.oe */
public final class C62916oe implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62850ke f178538d;

    public C62916oe(C62850ke keVar) {
        this.f178538d = keVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveShoppingBubblePlugin$shoppingWidget$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C62850ke.m73957a1(this.f178538d, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShoppingBubblePlugin$shoppingWidget$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
