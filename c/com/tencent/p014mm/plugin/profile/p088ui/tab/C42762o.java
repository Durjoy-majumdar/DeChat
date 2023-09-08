package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kf2.C46723f;
import p248ug.C52558c;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.o */
public final class C42762o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42734m f115779d;

    public C42762o(C42734m mVar) {
        this.f115779d = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = ContactWidgetTabBizHeaderController.this;
        C52558c cVar = contactWidgetTabBizHeaderController.f115561o;
        if (cVar == null || cVar.mo73500r2(false) == null || contactWidgetTabBizHeaderController.f115561o.mo73500r2(false).mo73515h() == null) {
            Log.m105924i("MicroMsg.ContactWidgetTabBizHeaderController", "registerSource is null, return");
        } else {
            String str = contactWidgetTabBizHeaderController.f115561o.mo73500r2(false).mo73515h().f146851d;
            if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.ContactWidgetTabBizHeaderController", "bizInfo aboutBizUrl is null, will not jump webView");
            } else {
                C46723f.m52019a(contactWidgetTabBizHeaderController.f115559j.getUsername(), 1600, contactWidgetTabBizHeaderController.f115568v, contactWidgetTabBizHeaderController.f115541D, contactWidgetTabBizHeaderController.f115556g.getIntent());
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("useJs", true);
                intent.putExtra("vertical_scroll", true);
                intent.putExtra("geta8key_scene", 3);
                C88144b.m109791i(contactWidgetTabBizHeaderController.f115556g, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
