package hs1;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import qo3.C12925w;

/* renamed from: hs1.i */
public final class C8744i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8749n f28024d;

    public C8744i(C8749n nVar) {
        this.f28024d = nVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/notice/PayConcertLiveSecondCheckWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C88144b.m109792j(this.f28024d.getContext(), "wallet", ".wecoin.ui.WeCoinRechargeView", new Intent(), true);
        C12925w wVar = this.f28024d.f28031e;
        if (wVar != null) {
            wVar.mo5085n();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/notice/PayConcertLiveSecondCheckWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
