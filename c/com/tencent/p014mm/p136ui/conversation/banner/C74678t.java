package com.tencent.p014mm.p136ui.conversation.banner;

import android.view.View;
import eb0.C75598w3;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.conversation.banner.t */
public class C74678t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f219548d;

    /* renamed from: e */
    public final /* synthetic */ int f219549e;

    /* renamed from: f */
    public final /* synthetic */ C74665a0 f219550f;

    public C74678t(C74665a0 a0Var, int i, int i2) {
        this.f219550f = a0Var;
        this.f219548d = i;
        this.f219549e = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75598w3.m90816e().mo105950b(this.f219548d, this.f219549e);
        C74665a0 a0Var = this.f219550f;
        C74665a0.m89412h(a0Var, a0Var.f230570g.get(), false);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
