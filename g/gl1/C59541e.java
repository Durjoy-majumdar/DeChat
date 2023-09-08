package gl1;

import al1.C0079b;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: gl1.e */
public final class C59541e extends C87413o implements C32230s<Boolean, Integer, Integer, String, C0079b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59547g f170174d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59541e(C59547g gVar) {
        super(5);
        this.f170174d = gVar;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        C0079b bVar = (C0079b) obj5;
        C87412m.m108594g((String) obj4, "errMsg");
        C61926c.m72668M(new C59539d(booleanValue, bVar, this.f170174d));
        String str = this.f170174d.f170180j;
        Log.m105924i(str, "finish live result:" + booleanValue + ',' + bVar);
        return C13598b0.f38549a;
    }
}
