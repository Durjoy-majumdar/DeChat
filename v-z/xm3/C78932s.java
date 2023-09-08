package xm3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import om3.C77020b;
import rx3.C13598b0;
import tm3.C78069w;

/* renamed from: xm3.s */
public final class C78932s extends C87413o implements C32226l<ArrayList<C77020b>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C78069w f231802d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78932s(C78069w wVar) {
        super(1);
        this.f231802d = wVar;
    }

    public Object invoke(Object obj) {
        ArrayList<C77020b> arrayList = (ArrayList) obj;
        C87412m.m108594g(arrayList, LocaleUtil.ITALIAN);
        C78069w wVar = this.f231802d;
        for (C77020b bVar : arrayList) {
            bVar.f225017s = wVar.mo108034c(bVar.f225007f);
            bVar.f225016r = wVar.mo108032a(bVar.f225007f);
            String str = bVar.f225013o;
            boolean z = bVar.f225017s;
            C87412m.m108594g(str, "preShowHeadDisplay");
            if (wVar.f228833u) {
                str = z ? wVar.f228834v : wVar.f228835w;
            }
            C87412m.m108594g(str, "<set-?>");
            bVar.f225013o = str;
        }
        return C13598b0.f38549a;
    }
}
