package h23;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import n80.C109697b;
import rx3.C13598b0;

/* renamed from: h23.j */
public final class C108031j extends C87413o implements C32227p<Long, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108038q f323510d;

    /* renamed from: e */
    public final /* synthetic */ C109697b f323511e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108031j(C108038q qVar, C109697b bVar) {
        super(2);
        this.f323510d = qVar;
        this.f323511e = bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        int intValue = ((Number) obj2).intValue();
        Log.m105924i("MicroMsg.VLogRemuxer", "on frame decode, pts:" + longValue + ", frameCount:" + intValue + ", remuxForThumb:" + this.f323510d.f323537t);
        if (intValue != 0) {
            this.f323511e.mo160917a(longValue);
        }
        return C13598b0.f38549a;
    }
}
