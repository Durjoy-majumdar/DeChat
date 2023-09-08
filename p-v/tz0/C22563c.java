package tz0;

import com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI;
import gy3.C87412m;
import java.util.Iterator;
import nj3.C11182m0;
import nj3.C76874e0;
import te3.C118431fo;
import te3.C118435go;

/* renamed from: tz0.c */
public final class C22563c implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ CouponCardListUI f64892d;

    public C22563c(CouponCardListUI couponCardListUI) {
        this.f64892d = couponCardListUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C118435go goVar = this.f64892d.f52126C;
        C87412m.m108591d(goVar);
        Iterator<C118431fo> it = goVar.f354035d.iterator();
        while (it.hasNext()) {
            C118431fo next = it.next();
            e0Var.add(0, next.f354004d, 1, (CharSequence) next.f354006f);
        }
    }
}
