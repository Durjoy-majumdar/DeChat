package p152f0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p009c2.C28482z;
import p152f0.C107394p2;
import p735w1.C37958a;
import p735w1.C38006x;
import p735w1.C38007y;
import rx3.C13598b0;

/* renamed from: f0.w */
public final class C107430w extends C87413o implements C32226l<C37958a, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C107394p2 f321435d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107430w(C107394p2 p2Var) {
        super(1);
        this.f321435d = p2Var;
    }

    public Object invoke(Object obj) {
        C37958a aVar = (C37958a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        C32226l<C28482z, C13598b0> lVar = this.f321435d.f321327o;
        String str = aVar.f100413d;
        int length = str.length();
        ((C107394p2.C107396b) lVar).invoke(new C28482z(str, C38007y.m41701a(length, length), (C38006x) null, 4, (C8480h) null));
        return Boolean.TRUE;
    }
}
