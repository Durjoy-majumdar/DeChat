package hs1;

import android.view.View;
import er1.C58739j4;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import rx3.C13598b0;

/* renamed from: hs1.q */
public final class C8752q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8756u f28034d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f28035e;

    public C8752q(C8756u uVar, C32224a<C13598b0> aVar) {
        this.f28034d = uVar;
        this.f28035e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58739j4.f168176a.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C12925w wVar = this.f28034d.f28040e;
        if (wVar != null) {
            wVar.mo5085n();
        }
        this.f28035e.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
