package vf1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePrecheckLicenseUI;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import tf0.C13883o1;

/* renamed from: vf1.p3 */
public final class C14810p3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePrecheckLicenseUI f40798d;

    public C14810p3(FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI) {
        this.f40798d = finderLivePrecheckLicenseUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePrecheckLicenseUI$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI = this.f40798d;
        String str = finderLivePrecheckLicenseUI.f14569u;
        int i = C87412m.m108589b(str, "TYPE_LICENSE") ? 9 : C87412m.m108589b(str, "TYPE_STANDARD") ? 11 : 0;
        if (!(finderLivePrecheckLicenseUI.f14573y == 0 || finderLivePrecheckLicenseUI.f14574z == 0 || i == 0)) {
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8601b((C8777j5) c, i, finderLivePrecheckLicenseUI.f14573y, finderLivePrecheckLicenseUI.f14574z, (Map) null, 8, (Object) null);
        }
        String str2 = finderLivePrecheckLicenseUI.f14569u;
        if (C87412m.m108589b(str2, "TYPE_LICENSE")) {
            Intent intent = new Intent();
            intent.putExtra("KEY_PATH", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_up_privacy");
            intent.putExtra("KEY_TYPE", "TYPE_STANDARD");
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", finderLivePrecheckLicenseUI.f14573y);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", finderLivePrecheckLicenseUI.f14574z);
            intent.putExtra("KEY_COUNTDOWN_FINISH", finderLivePrecheckLicenseUI.f14572x);
            ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13265OD(finderLivePrecheckLicenseUI, intent, 1001);
        } else if (C87412m.m108589b(str2, "TYPE_STANDARD")) {
            finderLivePrecheckLicenseUI.setResult(-1);
            finderLivePrecheckLicenseUI.finish();
        } else {
            finderLivePrecheckLicenseUI.mo3032O7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePrecheckLicenseUI$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
