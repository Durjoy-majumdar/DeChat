package cn3;

import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p240sx.C77808q;

/* renamed from: cn3.e */
public final class C67415e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f193330d;

    /* renamed from: e */
    public final /* synthetic */ C67413d f193331e;

    public C67415e(boolean z, C67413d dVar) {
        this.f193330d = z;
        this.f193331e = dVar;
    }

    public final void onClick(View view) {
        Class cls = C77808q.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC$updateView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f193330d) {
            this.f193331e.getActivity().startActivityForResult(((C77808q) C86312j.m106911c(cls)).mo104179cW(this.f193331e.getActivity(), this.f193331e.f193327i), 74518);
        } else {
            this.f193331e.getActivity().startActivityForResult(((C77808q) C86312j.m106911c(cls)).mo104178Vv(this.f193331e.getActivity()), 74517);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC$updateView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
