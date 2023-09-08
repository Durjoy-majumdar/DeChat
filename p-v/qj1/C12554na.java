package qj1;

import ak1.C0073g0;
import ak1.C54108o;
import android.view.View;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qj1.na */
public final class C12554na implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12389fa f36045d;

    public C12554na(C12389fa faVar) {
        this.f36045d = faVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin$initListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f36045d.f35673J.mo78802a();
        if (this.f36045d.f35690p.getLiveRole() == 1) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.SEE_GIFT_LIST, String.valueOf(3), (String) null, 4, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin$initListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
