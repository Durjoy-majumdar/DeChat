package nz3;

import fy3.C32226l;
import gy3.C87413o;
import java.util.Map;
import sx3.C110823p;

/* renamed from: nz3.b */
public final class C25260b extends C87413o implements C32226l<Integer, C25267g> {

    /* renamed from: d */
    public final /* synthetic */ C25309w f71731d;

    /* renamed from: e */
    public final /* synthetic */ C25267g[] f71732e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25260b(C25309w wVar, C25267g[] gVarArr) {
        super(1);
        this.f71731d = wVar;
        this.f71732e = gVarArr;
    }

    public Object invoke(Object obj) {
        Map<Integer, C25267g> map;
        C25267g gVar;
        int intValue = ((Number) obj).intValue();
        C25309w wVar = this.f71731d;
        if (wVar != null && (map = wVar.f71809a) != null && (gVar = map.get(Integer.valueOf(intValue))) != null) {
            return gVar;
        }
        C25267g[] gVarArr = this.f71732e;
        return (intValue < 0 || intValue > C110823p.m150979E(gVarArr)) ? C25267g.f71742e : gVarArr[intValue];
    }
}
