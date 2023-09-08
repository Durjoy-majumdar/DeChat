package com.tencent.p014mm.p136ui.conversation.banner;

import android.view.View;
import eb0.C75598w3;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.conversation.banner.u */
public class C74679u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f219551d;

    /* renamed from: e */
    public final /* synthetic */ int f219552e;

    /* renamed from: f */
    public final /* synthetic */ C74665a0 f219553f;

    public C74679u(C74665a0 a0Var, int i, int i2) {
        this.f219553f = a0Var;
        this.f219551d = i;
        this.f219552e = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75598w3.m90816e().mo105950b(this.f219551d, this.f219552e);
        C74665a0 a0Var = this.f219553f;
        C74665a0.m89412h(a0Var, a0Var.f230570g.get(), true);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
