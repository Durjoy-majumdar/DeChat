package com.tencent.p014mm.plugin.finder.live.view;

import al1.C54130j;
import cl1.C54963d0;
import com.tencent.p014mm.plugin.finder.live.view.C56081l;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.s */
public final class C56095s extends C87413o implements C32226l<C54130j, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C56081l f159957d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56095s(C56081l lVar) {
        super(1);
        this.f159957d = lVar;
    }

    public Object invoke(Object obj) {
        C54130j jVar = (C54130j) obj;
        C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
        int F4 = this.f159957d.f159919B.mo88149F4(jVar);
        if (F4 != -1 && F4 < this.f159957d.f159919B.getItemCount()) {
            jVar.mo74949p();
            C45795b bVar = this.f159957d.f159920C;
            if (bVar != null) {
                ((C54963d0) bVar.mo71262a(C54963d0.class)).mo75917Y3(jVar);
            }
            C56081l.C56084d onVisitorApplyListListener = this.f159957d.getOnVisitorApplyListListener();
            if (onVisitorApplyListListener != null) {
                onVisitorApplyListListener.mo78178c(jVar);
            }
            this.f159957d.f159919B.notifyItemChanged(F4);
        }
        return C13598b0.f38549a;
    }
}
