package wf1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: wf1.b */
public final class C15167b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f41307d;

    public C15167b(C101218e0 e0Var) {
        this.f41307d = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f41307d.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
