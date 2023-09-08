package com.tencent.p014mm.plugin.finder.extension.reddot;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.m */
public final class C2476m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C2469j f12941d;

    /* renamed from: e */
    public final /* synthetic */ int f12942e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2476m(C2469j jVar, int i) {
        super(0);
        this.f12941d = jVar;
        this.f12942e = i;
    }

    public Object invoke() {
        C13598b0 b0Var;
        C55718s0 G5 = this.f12941d.f12929a.mo77227G5("finder_wx_private_msg_entrance");
        if (G5 != null) {
            C2469j jVar = this.f12941d;
            int i = this.f12942e;
            C64586nn1 o2 = G5.mo77308o2("finder_wx_private_msg_entrance");
            if (o2 != null) {
                o2.f184503e = i;
            }
            C64586nn1 o25 = G5.mo77308o2("TLWxPrivateMsgBubble");
            if (o25 != null) {
                String str = jVar.f12930b;
                if (!(str == null || str.length() == 0)) {
                    o25.f184505g = jVar.f12930b;
                }
            }
            C51978xi1 xi12 = new C51978xi1();
            C51978xi1 xi13 = G5.field_ctrInfo;
            xi12.f144679q = xi13.f144679q;
            String str2 = G5.field_tipsId;
            if (str2 == null) {
                str2 = "";
            }
            xi12.f144673h = str2;
            xi12.f144669d = 400000;
            xi12.f144670e = 1008;
            xi12.f144672g.addAll(xi13.f144672g);
            jVar.f12929a.mo77230I(xi12, "updateWxMessageRedDot", new C2474l(jVar));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f12941d.f12929a.mo77241N5(1008, "");
        }
        return C13598b0.f38549a;
    }
}
