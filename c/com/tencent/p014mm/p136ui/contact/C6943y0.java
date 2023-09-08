package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.contact.y0 */
public class C6943y0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74585x0 f24639d;

    public C6943y0(C74585x0 x0Var) {
        this.f24639d = x0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/FMessageContactView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.FMessageContactView", "initNoNew, goto FMessageConversationUI");
        C88144b.m109791i(this.f24639d.f219237d, "subapp", ".ui.friend.FMessageConversationUI", new Intent(), (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/FMessageContactView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
