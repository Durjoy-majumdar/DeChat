package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.profile.ui.d0 */
public class C4982d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactMoreInfoUI f20266d;

    public C4982d0(ContactMoreInfoUI contactMoreInfoUI) {
        this.f20266d = contactMoreInfoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f20266d.f20158x);
        intent.putExtra("geta8key_username", C75592q0.m90789s());
        C88144b.m109791i(this.f20266d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
