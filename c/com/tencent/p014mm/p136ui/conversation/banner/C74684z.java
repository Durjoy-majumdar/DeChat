package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import eb0.C75598w3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.conversation.banner.z */
public class C74684z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f219566d;

    /* renamed from: e */
    public final /* synthetic */ int f219567e;

    /* renamed from: f */
    public final /* synthetic */ C74665a0 f219568f;

    public C74684z(C74665a0 a0Var, int i, int i2) {
        this.f219568f = a0Var;
        this.f219566d = i;
        this.f219567e = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75598w3.m90816e().mo105950b(this.f219566d, this.f219567e);
        C74665a0 a0Var = this.f219568f;
        a0Var.getClass();
        C88144b.m109791i(a0Var.f230570g.get(), "subapp", ".ui.autoadd.AutoAddFriendUI", new Intent(), (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
