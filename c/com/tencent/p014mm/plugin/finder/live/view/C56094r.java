package com.tencent.p014mm.plugin.finder.live.view;

import al1.C54130j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.r */
public final class C56094r extends C87413o implements C32226l<C54130j, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C56081l f159956d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56094r(C56081l lVar) {
        super(1);
        this.f159956d = lVar;
    }

    public Object invoke(Object obj) {
        C54130j jVar;
        C54130j jVar2 = (C54130j) obj;
        C87412m.m108594g(jVar2, "selectedUser");
        Iterator<C54130j> it = this.f159956d.f159940y.iterator();
        while (true) {
            if (!it.hasNext()) {
                jVar = null;
                break;
            }
            jVar = it.next();
            if (Util.isEqual(jVar.f151997a, jVar2.f151997a)) {
                break;
            }
        }
        if (jVar == null) {
            C76912y0.makeText(this.f159956d.getContext(), (CharSequence) this.f159956d.getContext().getResources().getString(C0966R.string.dry), 0).show();
        } else if (C56081l.m64025o(this.f159956d)) {
            C56081l lVar = this.f159956d;
            C56081l.m64024n(lVar, lVar.f159919B.mo88149F4(jVar2), this.f159956d.f159919B, jVar2);
        }
        return C13598b0.f38549a;
    }
}
