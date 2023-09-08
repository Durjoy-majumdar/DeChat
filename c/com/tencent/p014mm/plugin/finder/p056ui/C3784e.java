package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C52271zj0;

/* renamed from: com.tencent.mm.plugin.finder.ui.e */
public final class C3784e extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderActivityDescUI f17259d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3784e(FinderActivityDescUI finderActivityDescUI) {
        super(1);
        this.f17259d = finderActivityDescUI;
    }

    public Object invoke(Object obj) {
        C13598b0 b0Var;
        FinderJumpInfo finderJumpInfo;
        C87412m.m108594g((String) obj, "<anonymous parameter 0>");
        FinderActivityDescUI finderActivityDescUI = this.f17259d;
        C52271zj0 zj02 = finderActivityDescUI.f16733G;
        if (zj02 == null || (finderJumpInfo = zj02.f146024z) == null) {
            b0Var = null;
        } else {
            finderActivityDescUI.mo4005Q7(zj02, finderJumpInfo);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            FinderActivityDescUI.m3817P7(this.f17259d);
        }
        return C13598b0.f38549a;
    }
}
