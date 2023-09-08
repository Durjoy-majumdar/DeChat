package rl1;

import a14.C53872d1;
import a14.C53934p0;
import bl3.C0317e;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C52204z21;
import wx3.C15601d;

/* renamed from: rl1.i */
public final class C13041i extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63463e f37146d;

    /* renamed from: e */
    public final /* synthetic */ C52204z21 f37147e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13041i(C63463e eVar, C52204z21 z212) {
        super(1);
        this.f37146d = eVar;
        this.f37147e = z212;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        C63463e eVar = this.f37146d;
        C0317e.launch$default(eVar, C53872d1.f151119c, (C53934p0) null, new C13038h(eVar, str, this.f37147e, (C15601d<? super C13038h>) null), 2, (Object) null);
        return C13598b0.f38549a;
    }
}
