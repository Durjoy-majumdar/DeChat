package com.tencent.p014mm.mj_template.sns.compose.widget;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C24565l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.v0 */
public final /* synthetic */ class C55357v0 extends C24565l implements C32224a<C13598b0> {
    public C55357v0(Object obj) {
        super(0, obj, C55304k.class, "onClosed", "onClosed()V", 0);
    }

    public Object invoke() {
        C55304k kVar = (C55304k) this.receiver;
        kVar.getClass();
        Log.m105924i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onClosed");
        kVar.f157515b.invoke();
        kVar.mo76614a(kVar.f157520g);
        return C13598b0.f38549a;
    }
}
