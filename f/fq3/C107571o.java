package fq3;

import android.content.Context;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import p004b0.C103941f;
import p157gk.C59480d;
import p157gk.C59491j;
import p175j0.C108504h;
import p435a0.C103166l0;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p544h2.C108014f;
import p544h2.C32659e;
import p560i2.C108322d;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import rx3.C13598b0;
import ta0.C110954a;
import va0.C111504g;

/* renamed from: fq3.o */
public final class C107571o extends C87413o implements C32228q<C103941f, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59480d f321858d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107571o(C59480d dVar) {
        super(3);
        this.f321858d = dVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        int intValue = ((Number) obj3).intValue();
        C87412m.m108594g((C103941f) obj, "$this$stickyHeader");
        if ((intValue & 81) != 16 || !hVar.mo51575a()) {
            String str = this.f321858d.f169959a;
            long F = ((C108322d) hVar.mo51598m(C103645l0.f306124e)).mo143031F((float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3879hn)));
            int i = C59491j.f169996a ? C0966R.color.FG_0 : C0966R.color.BW_100_Alpha_0_8;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            long b = C110954a.m151254b(i, context);
            int i2 = C65503j.f188489K0;
            float f = (float) 8;
            float f2 = ((float) 0.75d) * f;
            C111504g.m152005a(str, C103166l0.m136523g(C65503j.C65504a.f188490d, ((float) 1.5d) * f, f2, 0.0f, f2, 4, (Object) null), b, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar, 48, 0, 65520);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
