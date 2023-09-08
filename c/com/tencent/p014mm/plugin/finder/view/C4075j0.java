package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13442s8;
import te3.C51538uf1;

/* renamed from: com.tencent.mm.plugin.finder.view.j0 */
public final class C4075j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderBaseMediaBanner<View> f18202d;

    public C4075j0(FinderBaseMediaBanner<View> finderBaseMediaBanner) {
        this.f18202d = finderBaseMediaBanner;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner$refreshRefUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        C51538uf1 refFeedInfo = this.f18202d.getRefFeedInfo();
        C87412m.m108591d(refFeedInfo);
        FinderContact finderContact = refFeedInfo.f142830f;
        if (finderContact == null || (str = finderContact.username) == null) {
            str = "";
        }
        intent.putExtra("finder_username", str);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = this.f18202d.getContext();
        C87412m.m108593f(context, "context");
        aVar.mo12871c(context, intent);
        Context context2 = this.f18202d.getContext();
        C87412m.m108593f(context2, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner$refreshRefUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
