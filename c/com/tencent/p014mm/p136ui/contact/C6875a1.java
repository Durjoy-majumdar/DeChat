package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.contact.a1 */
public class C6875a1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74585x0 f24509d;

    public C6875a1(C74585x0 x0Var) {
        this.f24509d = x0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/FMessageContactView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.FMessageContactView", "initMultiNew, goto FMessageConversationUI");
        C97625j3.m125812b().mo105906u().mo119676J(143618, 0);
        C88144b.m109791i(this.f24509d.f219237d, "subapp", ".ui.friend.FMessageConversationUI", new Intent(), (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/FMessageContactView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
