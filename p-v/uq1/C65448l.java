package uq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: uq1.l */
public final class C65448l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65437f f188330d;

    /* renamed from: e */
    public final /* synthetic */ long f188331e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65448l(C65437f fVar, long j) {
        super(0);
        this.f188330d = fVar;
        this.f188331e = j;
    }

    public Object invoke() {
        if (!C86709a0.m107522a()) {
            Log.m105920e(this.f188330d.f188301d, "is invalid to notifyStartPost");
        } else {
            HashSet<C65464w> hashSet = this.f188330d.f188303f;
            long j = this.f188331e;
            Iterator<C65464w> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().onPostStart(j);
            }
        }
        return C13598b0.f38549a;
    }
}
