package p152f0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p009c2.C104247d;
import p009c2.C104249e;
import p009c2.C28482z;
import rx3.C13598b0;

/* renamed from: f0.o1 */
public final class C107389o1 extends C87413o implements C32226l<List<? extends C104247d>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104249e f321307d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C28482z, C13598b0> f321308e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107389o1(C104249e eVar, C32226l<? super C28482z, C13598b0> lVar) {
        super(1);
        this.f321307d = eVar;
        this.f321308e = lVar;
    }

    public Object invoke(Object obj) {
        List list = (List) obj;
        C87412m.m108594g(list, LocaleUtil.ITALIAN);
        this.f321308e.invoke(this.f321307d.mo145867a(list));
        return C13598b0.f38549a;
    }
}
