package com.tencent.p014mm.mj_template.sns.compose.widget;

import android.content.Context;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.paging.compose.C54222c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import p004b0.C103937e;
import p004b0.C103953l0;
import p004b0.C103960n0;
import p175j0.C108504h;
import p175j0.C60667k2;
import p435a0.C103111a;
import p435a0.C103166l0;
import p435a0.C103177n0;
import p436a1.C103272w;
import p721v0.C111294a;
import p721v0.C111299g;
import p721v0.C65503j;
import p759y.C112195b0;
import rx3.C13598b0;
import ta0.C110954a;
import te3.o74;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.a0 */
public final class C104653a0 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55341p0 f310782d;

    /* renamed from: e */
    public final /* synthetic */ C54222c<C28971l<o74>> f310783e;

    /* renamed from: f */
    public final /* synthetic */ float f310784f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104653a0(C55341p0 p0Var, C54222c<C28971l<o74>> cVar, float f) {
        super(2);
        this.f310782d = p0Var;
        this.f310783e = cVar;
        this.f310784f = f;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C60667k2<C28971l<o74>> k2Var = this.f310782d.f157607n;
            C103953l0 a = C103960n0.m138697a(0, 0, hVar, 0, 3);
            int i = C111294a.f333218a;
            C111294a.C37633b bVar = C111294a.C111295a.f333229k;
            C103111a.C103116e g = C103111a.f304234a.mo142861g((float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3627k)));
            C103177n0 a2 = C103166l0.m136517a(0.0f, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3956le)), 1, (Object) null);
            int i2 = C65503j.f188489K0;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            int f = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3895i6);
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C103272w wVar = new C103272w(C110954a.m151254b(C0966R.color.f2948a5, context));
            C87412m.m108594g(a, "lazyListState");
            C103937e.m138656a(C111299g.m151786a(aVar, C103612c1.f306063a, new C104667i(wVar, (float) C76577a.m92152c(MMApplicationContext.getContext(), f), a)), a, a2, false, g, bVar, (C112195b0) null, false, new C55371z(this.f310783e, this.f310784f, this.f310782d, k2Var), hVar, 196608, 200);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
