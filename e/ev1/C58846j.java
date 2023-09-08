package ev1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ev1.j */
public final class C58846j extends C87413o implements C32226l<C58848l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58843i f168457d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58846j(C58843i iVar) {
        super(1);
        this.f168457d = iVar;
    }

    public Object invoke(Object obj) {
        C58848l lVar = (C58848l) obj;
        C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
        this.f168457d.f168454a.offer(lVar);
        this.f168457d.f168455b.add(lVar.f168434d);
        return C13598b0.f38549a;
    }
}
