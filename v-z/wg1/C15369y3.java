package wg1;

import ak1.C54067f0;
import android.content.Context;
import android.view.View;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C49098d51;
import wc3.C15133e0;

/* renamed from: wg1.y3 */
public final class C15369y3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15278g3 f41725d;

    public C15369y3(C15278g3 g3Var) {
        this.f41725d = g3Var;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        HashMap hashMap = new HashMap();
        C49098d51 d512 = this.f41725d.f41548C;
        if (d512 == null || (str = d512.f132122h) == null) {
            str = "";
        }
        hashMap.put("notice_id", str);
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8607h((C8777j5) c, C54067f0.C0064m.LIVE_VISITOR_POSTER, hashMap, (String) null, "200", (String) null, 20, (Object) null);
        C15278g3 g3Var = this.f41725d;
        C77407n nVar = new C77407n((Context) g3Var.getContext(), 0, true);
        nVar.f225779n1 = false;
        nVar.f225775k1 = true;
        nVar.f225792t1 = false;
        ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0().Q60(g3Var.getActivity(), nVar, 2, (C32226l<? super Boolean, C13598b0>) null, new C15319l3(nVar, g3Var));
        nVar.f225771i = new C15309i3(nVar, g3Var);
        nVar.f225782p = new C15313j3(nVar, g3Var);
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
