package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: com.tencent.mm.plugin.finder.ui.v3 */
public final class C3880v3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedDetailUI f17434d;

    public C3880v3(FinderShareFeedDetailUI finderShareFeedDetailUI) {
        this.f17434d = finderShareFeedDetailUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI$onResume$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C20480e0.f57583a.mo32031d();
        ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).getClass();
        Log.m105924i("Finder.FinderCommonFeatureService", "reset timeline auto refresh time");
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        ((C58417y0) C86312j.m106911c(C58417y0.class)).N40(uuid, "Enter");
        Intent intent = new Intent();
        intent.putExtra("key_context_id", uuid);
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        C58684b.by0((C58684b) c, this.f17434d, intent, 1, false, 8, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI$onResume$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
