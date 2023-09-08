package xm3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import om3.C77020b;
import rx3.C13598b0;
import tm3.C78069w;

/* renamed from: xm3.c */
public final class C78876c extends C87413o implements C32226l<ArrayList<C77020b>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C78069w f231725d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78876c(C78069w wVar) {
        super(1);
        this.f231725d = wVar;
    }

    public Object invoke(Object obj) {
        ArrayList<C77020b> arrayList = (ArrayList) obj;
        C87412m.m108594g(arrayList, LocaleUtil.ITALIAN);
        C78069w wVar = this.f231725d;
        for (C77020b bVar : arrayList) {
            bVar.f225018t = wVar.mo108033b();
        }
        return C13598b0.f38549a;
    }
}
