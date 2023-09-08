package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.conversation.banner.k$$a */
public final /* synthetic */ class k$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74670k f219535d;

    /* renamed from: e */
    public final /* synthetic */ String f219536e;

    public /* synthetic */ k$$a(C74670k kVar, String str) {
        this.f219535d = kVar;
        this.f219536e = str;
    }

    public final void onClick(View view) {
        C74670k kVar = this.f219535d;
        String str = this.f219536e;
        kVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/ChattingSecurityBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", kVar, array);
        Intent intent = new Intent();
        intent.putExtra("k_username", kVar.f219532h);
        int i = 39;
        if (kVar.f219534j) {
            i = 36;
        }
        intent.putExtra("showShare", false);
        if (!Util.isNullOrNil(str)) {
            intent.putExtra("rawUrl", str);
        } else {
            intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{Integer.valueOf(i)}));
        }
        if (kVar.f230570g.get() != null) {
            C88144b.m109791i(kVar.f230570g.get(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C117292a.m165361g(kVar, "com/tencent/mm/ui/conversation/banner/ChattingSecurityBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
