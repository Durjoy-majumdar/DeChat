package hs1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: hs1.o */
public final class C8750o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8756u f28032d;

    public C8750o(C8756u uVar) {
        this.f28032d = uVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C12925w wVar = this.f28032d.f28040e;
        if (wVar != null) {
            wVar.mo5085n();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
