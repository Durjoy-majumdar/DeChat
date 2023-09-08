package qj1;

import ak1.C0073g0;
import ak1.C0076j0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import cj1.C54795n5;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qj1.qa */
public final class C12622qa implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12389fa f36178d;

    public C12622qa(C12389fa faVar) {
        this.f36178d = faVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin$initListener$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        C12389fa faVar = this.f36178d;
        if (faVar.f35690p.getLiveRole() == 1) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.SEE_GIFT_LIST, String.valueOf(2), (String) null, 4, (Object) null);
        } else if (faVar.f35690p.getLiveRole() == 0) {
            ((C54116w) C86312j.m106911c(C54116w.class)).nv0(C0076j0.CLICK_Y_IN_HOT_LIST, "", 0);
        }
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=support/we-coin/protocol/index");
        C54795n5 D0 = faVar.mo14476D0();
        if (D0 != null) {
            Context context = faVar.mo14484z0().getContext();
            C87412m.m108593f(context, "basePluginLayout.context");
            D0.mo75714R(context, intent, (Integer) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin$initListener$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
