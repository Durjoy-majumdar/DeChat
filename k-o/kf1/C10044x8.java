package kf1;

import android.view.View;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p145dx.C7525r;

/* renamed from: kf1.x8 */
public final class C10044x8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f30784d;

    public C10044x8(String str) {
        this.f30784d = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter$bindRingtoneTimelineUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f30784d;
        C87412m.m108593f(str, "feedId");
        ((C7525r) C86312j.m106911c(C7525r.class)).sl0(str, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter$bindRingtoneTimelineUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
