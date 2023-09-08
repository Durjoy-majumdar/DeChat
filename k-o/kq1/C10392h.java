package kq1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import rx3.C13598b0;

/* renamed from: kq1.h */
public final class C10392h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f31606d;

    /* renamed from: e */
    public final /* synthetic */ C12925w f31607e;

    public C10392h(C32224a<C13598b0> aVar, C12925w wVar) {
        this.f31606d = aVar;
        this.f31607e = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f31606d.invoke();
        this.f31607e.mo5085n();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
