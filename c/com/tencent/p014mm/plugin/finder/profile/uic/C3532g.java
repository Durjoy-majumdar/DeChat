package com.tencent.p014mm.plugin.finder.profile.uic;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58417y0;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.g */
public final class C3532g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f16386d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileFeedUIC f16387e;

    public C3532g(View view, FinderProfileFeedUIC finderProfileFeedUIC) {
        this.f16386d = view;
        this.f16387e = finderProfileFeedUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$8$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = this.f16386d.getContext();
        C87412m.m108593f(context, "context");
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ly0(context, true, true);
        C58408t0 t0Var = C58408t0.f167336a;
        t0Var.mo83266l(13, false);
        t0Var.mo83264j(C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond());
        this.f16387e.jumpToSnsAlbumPicker();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$8$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
