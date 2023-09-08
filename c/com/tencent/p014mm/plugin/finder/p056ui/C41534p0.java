package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.p056ui.C41540v0;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87413o;
import ht1.C8794p5;
import rx3.C13598b0;
import te3.C64707sc1;

/* renamed from: com.tencent.mm.plugin.finder.ui.p0 */
public final class C41534p0 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFansListUI f111840d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41534p0(FinderFansListUI finderFansListUI) {
        super(1);
        this.f111840d = finderFansListUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C4191v0 v0Var = this.f111840d.f111799x;
        if (v0Var != null) {
            v0Var.mo5072g();
        }
        C32228q<String, Context, C8794p5<C64707sc1>, C13598b0> qVar = C41540v0.f111850a;
        FinderFansListUI finderFansListUI = this.f111840d;
        ((C41540v0.C3878a) qVar).invoke(str, finderFansListUI, finderFansListUI);
        return C13598b0.f38549a;
    }
}
