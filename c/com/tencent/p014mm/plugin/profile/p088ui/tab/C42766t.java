package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kf2.C46720a;
import kf2.C46721b;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.t */
public final class C42766t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42734m f115790d;

    public C42766t(C42734m mVar) {
        this.f115790d = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFriend$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = ContactWidgetTabBizHeaderController.this;
        contactWidgetTabBizHeaderController.getClass();
        Log.m105924i("MicroMsg.ContactWidgetTabBizHeaderController", "click friend also read");
        C46721b bVar = new C46721b();
        bVar.f125775a = 2102;
        bVar.f125776b = false;
        C46720a.f125771a.mo71961a(bVar);
        Intent intent = new Intent();
        intent.putExtra("hide_option_menu", true);
        intent.putExtra("rawUrl", contactWidgetTabBizHeaderController.f115562p.f131708e.f142147j);
        intent.putExtra("useJs", true);
        intent.putExtra("geta8key_scene", 3);
        C88144b.m109791i(contactWidgetTabBizHeaderController.f115556g, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFriend$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
