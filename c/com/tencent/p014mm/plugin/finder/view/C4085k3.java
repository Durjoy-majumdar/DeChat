package com.tencent.p014mm.plugin.finder.view;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import qj1.C12677tg;

/* renamed from: com.tencent.mm.plugin.finder.view.k3 */
public final class C4085k3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f18218d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveVisitorFansRightView f18219e;

    public C4085k3(String str, FinderLiveVisitorFansRightView finderLiveVisitorFansRightView) {
        this.f18218d = str;
        this.f18219e = finderLiveVisitorFansRightView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView$updateAnnouncement$2$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Yx0((C54116w) c, C54067f0.C0069t0.FANS_CLUB_ANNOUNCEMENT_IMAGE_CLICK, (Boolean) null, (C12677tg.C12678a) null, 6, (Object) null);
        Intent intent = new Intent();
        intent.putExtra("nowUrl", this.f18218d);
        intent.putExtra("thumbUrl", this.f18218d);
        intent.putExtra("urlList", new String[]{this.f18218d});
        intent.putExtra("isFromWebView", false);
        intent.putExtra("ShowIndicator", false);
        intent.putExtra("BottomSheetStyle", 0);
        intent.putExtra("shouldShowScanQrCodeMenu", true);
        C88144b.m109791i(this.f18219e.getContext(), "subapp", ".ui.gallery.GestureGalleryUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView$updateAnnouncement$2$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
