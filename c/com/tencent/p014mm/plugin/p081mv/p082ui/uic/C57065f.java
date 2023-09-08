package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kb2.C60995i;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.f */
public final class C57065f extends C87413o implements C32226l<ArrayList<C60995i>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60995i f163404d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57065f(C60995i iVar) {
        super(1);
        this.f163404d = iVar;
    }

    public Object invoke(Object obj) {
        ArrayList<C60995i> arrayList = (ArrayList) obj;
        C87412m.m108594g(arrayList, LocaleUtil.ITALIAN);
        C60995i iVar = this.f163404d;
        for (C60995i iVar2 : arrayList) {
            iVar2.f173716i = C87412m.m108589b(iVar2.mo344Oa(), iVar.mo344Oa());
        }
        return C13598b0.f38549a;
    }
}
