package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.profile.ui.e0 */
public class C4985e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactMoreInfoUI f20269d;

    public C4985e0(ContactMoreInfoUI contactMoreInfoUI) {
        this.f20269d = contactMoreInfoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (Util.isNullOrNil(this.f20269d.f20154t)) {
            ContactMoreInfoUI contactMoreInfoUI = this.f20269d;
            contactMoreInfoUI.f20154t = contactMoreInfoUI.f20142e.f149521W0;
        }
        if (!Util.isNullOrNil(this.f20269d.f20154t)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f20269d.f20154t);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            C88144b.m109791i(this.f20269d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
