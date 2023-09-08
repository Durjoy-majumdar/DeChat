package xm1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import te3.C51942x91;

/* renamed from: xm1.l */
public final class C15841l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15834h f42664d;

    /* renamed from: e */
    public final /* synthetic */ int f42665e;

    public C15841l(C15834h hVar, int i) {
        this.f42664d = hVar;
        this.f42665e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$renderDefault$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C15834h hVar = this.f42664d;
        hVar.mo14507c3(this.f42665e, hVar.getContext(), (C51942x91) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$renderDefault$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
