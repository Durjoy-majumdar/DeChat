package hs1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: hs1.h */
public final class C8743h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8749n f28023d;

    public C8743h(C8749n nVar) {
        this.f28023d = nVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/notice/PayConcertLiveSecondCheckWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C12925w wVar = this.f28023d.f28031e;
        if (wVar != null) {
            wVar.mo5085n();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/notice/PayConcertLiveSecondCheckWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
