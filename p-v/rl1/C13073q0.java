package rl1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import nj3.C76912y0;
import ot1.C11767a;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C48779ay0;

/* renamed from: rl1.q0 */
public final class C13073q0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C48779ay0 f37222d;

    /* renamed from: e */
    public final /* synthetic */ String f37223e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<C48779ay0, C13598b0> f37224f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13073q0(C48779ay0 ay02, String str, C32226l<? super C48779ay0, C13598b0> lVar) {
        super(0);
        this.f37222d = ay02;
        this.f37223e = str;
        this.f37224f = lVar;
    }

    public Object invoke() {
        C48779ay0 ay02 = this.f37222d;
        int i = ay02.f130840d;
        String str = null;
        boolean z = false;
        if (i == 1) {
            String str2 = ay02.f130841e;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                str = str2;
            }
            if (str == null) {
                str = this.f37223e;
            }
            C87412m.m108593f(str, "errPage.wording.takeIf {…ty() } ?: defaultToastMsg");
            C77426q qVar = new C77426q(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76771JP());
            qVar.mo107595g(str);
            qVar.mo107601m(C0966R.string.lkg);
            qVar.mo107589a(true);
            qVar.mo107600l(C11767a.C11768a.f34454a);
            qVar.mo107603o();
        } else if (i == 2) {
            C32226l<C48779ay0, C13598b0> lVar = this.f37224f;
            if (lVar != null) {
                lVar.invoke(ay02);
            }
        } else if (i == 3) {
            String str3 = ay02.f130841e;
            if (str3 == null || str3.length() == 0) {
                z = true;
            }
            if (!z) {
                str = str3;
            }
            if (str == null) {
                str = this.f37223e;
            }
            C87412m.m108593f(str, "errPage.wording.takeIf {…ty() } ?: defaultToastMsg");
            C76912y0.m92773l(MMApplicationContext.getContext(), str);
        }
        return C13598b0.f38549a;
    }
}
