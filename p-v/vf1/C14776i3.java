package vf1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSecurityUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.C49567gj0;

/* renamed from: vf1.i3 */
public final class C14776i3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePostSecurityUI f40757d;

    /* renamed from: e */
    public final /* synthetic */ C49567gj0 f40758e;

    public C14776i3(FinderLivePostSecurityUI finderLivePostSecurityUI, C49567gj0 gj02) {
        this.f40757d = finderLivePostSecurityUI;
        this.f40758e = gj02;
    }

    public final void onClick(View view) {
        Class cls = C8777j5.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f40757d.f14543o;
        Log.m105924i(str, "confirmBtnView click, url = " + this.f40758e.f134070i);
        FinderLivePostSecurityUI finderLivePostSecurityUI = this.f40757d;
        int i = finderLivePostSecurityUI.f14551w;
        if (i == 2) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8607h((C8777j5) c, C54067f0.C0064m.LIVE_SAFETY_REVISE_GO, finderLivePostSecurityUI.mo3028P7("157"), (String) null, "157", (String) null, 20, (Object) null);
        } else if (i == 3) {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8607h((C8777j5) c2, C54067f0.C0064m.LIVE_SAFETY_GUIDE_GO, finderLivePostSecurityUI.mo3028P7("158"), (String) null, "158", (String) null, 20, (Object) null);
        } else if (i == 4) {
            C7335d c3 = C86312j.m106911c(cls);
            C87412m.m108593f(c3, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8607h((C8777j5) c3, C54067f0.C0064m.LIVE_SAFETY_PROHIBIT_KNOW, finderLivePostSecurityUI.mo3028P7("160"), (String) null, "160", (String) null, 20, (Object) null);
        }
        C49567gj0 gj02 = this.f40758e;
        if (gj02.f134069h == 1) {
            String str2 = gj02.f134070i;
            if (str2 != null) {
                FinderLivePostSecurityUI finderLivePostSecurityUI2 = this.f40757d;
                if (finderLivePostSecurityUI2.f14551w == 3) {
                    ((C54116w) C86312j.m106911c(C54116w.class)).Dy0("159", FinderLivePostSecurityUI.m2865Q7(finderLivePostSecurityUI2, (Boolean) null, (Long) null, 3, (Object) null));
                    C7335d c4 = C86312j.m106911c(cls);
                    C87412m.m108593f(c4, "getService(IHellLiveReport::class.java)");
                    C8777j5.C8778a.m8609j((C8777j5) c4, C54067f0.C0066n.LIVE_SAFETY_DETECT, finderLivePostSecurityUI2.mo3028P7("159"), (String) null, "159", (String) null, 20, (Object) null);
                    Intent intent = new Intent();
                    intent.putExtra("open_custom_style_url", true);
                    intent.putExtra("forceHideShare", true);
                    intent.putExtra("show_native_web_view", true);
                    intent.putExtra("rawUrl", str2);
                    intent.putExtra("screen_orientation", 1);
                    C88144b.m109795m(finderLivePostSecurityUI2.getContext(), "webview", ".ui.tools.WebViewUI", intent, finderLivePostSecurityUI2.f14549u);
                } else {
                    FinderLivePostSecurityUI.m2864N7(finderLivePostSecurityUI2, str2);
                }
            }
        } else {
            this.f40757d.finish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
