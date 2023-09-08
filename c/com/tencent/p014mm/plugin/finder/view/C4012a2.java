package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import fy3.C32229r;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.a2 */
public final class C4012a2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderExtendReadingView f18061d;

    /* renamed from: e */
    public final /* synthetic */ String f18062e;

    /* renamed from: f */
    public final /* synthetic */ String f18063f;

    /* renamed from: g */
    public final /* synthetic */ Integer f18064g;

    /* renamed from: h */
    public final /* synthetic */ Integer f18065h;

    public C4012a2(FinderExtendReadingView finderExtendReadingView, String str, String str2, Integer num, Integer num2) {
        this.f18061d = finderExtendReadingView;
        this.f18062e = str;
        this.f18063f = str2;
        this.f18064g = num;
        this.f18065h = num2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendReadingView$updateVerifiedTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32229r<? super String, ? super String, ? super Integer, ? super Integer, C13598b0> rVar = this.f18061d.f17708f;
        if (rVar != null) {
            String str = this.f18062e;
            C87412m.m108591d(str);
            String str2 = this.f18063f;
            C87412m.m108591d(str2);
            Integer num = this.f18064g;
            C87412m.m108591d(num);
            Integer num2 = this.f18065h;
            C87412m.m108591d(num2);
            rVar.mo162I(str, str2, num, num2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView$updateVerifiedTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
