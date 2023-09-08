package com.tencent.p014mm.p136ui.conversation.banner;

import android.view.View;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.conversation.banner.l */
public class C74671l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74670k f219537d;

    public C74671l(C74670k kVar) {
        this.f219537d = kVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/ChattingSecurityBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f219537d.mo103829i();
        C97625j3.m125812b().mo105905t().mo106156b(this.f219537d.f219532h);
        C97625j3.m125812b().mo105905t().mo106156b(this.f219537d.f219533i);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/ChattingSecurityBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
