package pj1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import pj1.C62312d;

/* renamed from: pj1.f */
public final class C62317f extends C87413o implements C32226l<C62312d.C62313a, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ int f177143d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62317f(int i) {
        super(1);
        this.f177143d = i;
    }

    public Object invoke(Object obj) {
        C62312d.C62313a aVar = (C62312d.C62313a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        return Boolean.valueOf(aVar.f177137a == this.f177143d);
    }
}
