package vf1;

import ak1.C54067f0;
import ak1.C54116w;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSecurityUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49567gj0;

/* renamed from: vf1.j3 */
public final class C14781j3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePostSecurityUI f40763d;

    /* renamed from: e */
    public final /* synthetic */ C49567gj0 f40764e;

    public C14781j3(FinderLivePostSecurityUI finderLivePostSecurityUI, C49567gj0 gj02) {
        this.f40763d = finderLivePostSecurityUI;
        this.f40764e = gj02;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f40763d.f14543o;
        Log.m105924i(str, "appealView click, url = " + this.f40764e.f134071j);
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8607h((C8777j5) c, C54067f0.C0064m.LIVE_SAFETY_PROHIBIT_APPEAL, this.f40763d.mo3028P7("160"), (String) null, "160", (String) null, 20, (Object) null);
        ((C54116w) C86312j.m106911c(C54116w.class)).Dy0("161", FinderLivePostSecurityUI.m2865Q7(this.f40763d, (Boolean) null, (Long) null, 3, (Object) null));
        String str2 = this.f40764e.f134071j;
        if (str2 != null) {
            FinderLivePostSecurityUI.m2864N7(this.f40763d, str2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
