package uq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: uq1.i */
public final class C65445i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65437f f188320d;

    /* renamed from: e */
    public final /* synthetic */ long f188321e;

    /* renamed from: f */
    public final /* synthetic */ boolean f188322f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65445i(C65437f fVar, long j, boolean z) {
        super(0);
        this.f188320d = fVar;
        this.f188321e = j;
        this.f188322f = z;
    }

    public Object invoke() {
        if (!C86709a0.m107522a()) {
            Log.m105920e(this.f188320d.f188301d, "is invalid to notifyEventPost");
        } else {
            HashSet<C65464w> hashSet = this.f188320d.f188303f;
            long j = this.f188321e;
            boolean z = this.f188322f;
            Iterator<C65464w> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().onPostNotify(j, z);
            }
        }
        return C13598b0.f38549a;
    }
}
