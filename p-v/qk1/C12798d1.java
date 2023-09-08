package qk1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C12794c1;

/* renamed from: qk1.d1 */
public final class C12798d1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12794c1.C12795a f36634d;

    public C12798d1(C12794c1.C12795a aVar) {
        this.f36634d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentAdapter$bindComment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f36634d.f36628z.setText("");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentAdapter$bindComment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
