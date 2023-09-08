package tz0;

import com.tencent.p014mm.plugin.card.p031ui.p033v3.VipCardListUI;
import gy3.C87412m;
import java.util.Iterator;
import nj3.C11182m0;
import nj3.C76874e0;
import te3.C118431fo;
import te3.C118435go;

/* renamed from: tz0.g */
public final class C22570g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ VipCardListUI f64901d;

    public C22570g(VipCardListUI vipCardListUI) {
        this.f64901d = vipCardListUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C118435go goVar = this.f64901d.f52188D;
        C87412m.m108591d(goVar);
        Iterator<C118431fo> it = goVar.f354035d.iterator();
        while (it.hasNext()) {
            C118431fo next = it.next();
            e0Var.add(0, next.f354004d, 1, (CharSequence) next.f354006f);
        }
    }
}
