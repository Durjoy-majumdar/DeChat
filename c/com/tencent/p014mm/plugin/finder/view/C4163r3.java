package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.finder.view.r3 */
public final class C4163r3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f18396d;

    public C4163r3(Context context) {
        this.f18396d = context;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPoiClaimPanel$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=poi_claim_portal");
        C88144b.m109791i(this.f18396d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPoiClaimPanel$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
