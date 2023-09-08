package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.e1 */
public final class C2214e1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f12250d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f12251e;

    public C2214e1(C101218e0 e0Var, C32224a<C13598b0> aVar) {
        this.f12250d = e0Var;
        this.f12251e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmotionRecommendPrivacyPolicyDialog$Companion$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f12250d.mo140680z();
        this.f12251e.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmotionRecommendPrivacyPolicyDialog$Companion$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
