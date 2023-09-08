package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.n */
public final class C14798n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4191v0 f40784d;

    public C14798n(C4191v0 v0Var) {
        this.f40784d = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderCreateAccountStarterActivity$initDialog$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f40784d.mo5072g();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderCreateAccountStarterActivity$initDialog$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
