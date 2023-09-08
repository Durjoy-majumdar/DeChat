package ao1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: ao1.w */
public final class C0188w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f653d;

    public C0188w(C12925w wVar) {
        this.f653d = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostEditUIC$showShortTitleTipsDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f653d.mo5085n();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostEditUIC$showShortTitleTipsDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
