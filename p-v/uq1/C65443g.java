package uq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: uq1.g */
public final class C65443g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65437f f188313d;

    /* renamed from: e */
    public final /* synthetic */ long f188314e;

    /* renamed from: f */
    public final /* synthetic */ boolean f188315f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65443g(C65437f fVar, long j, boolean z) {
        super(0);
        this.f188313d = fVar;
        this.f188314e = j;
        this.f188315f = z;
    }

    public Object invoke() {
        if (!C86709a0.m107522a()) {
            Log.m105920e(this.f188313d.f188301d, "is invalid to notifyPostError");
        } else {
            C65437f fVar = this.f188313d;
            HashSet<C65463v> hashSet = fVar.f188304g;
            long j = this.f188314e;
            boolean z = this.f188315f;
            Iterator<C65463v> it = hashSet.iterator();
            while (it.hasNext()) {
                String str = fVar.f188301d;
                Log.m105924i(str, "notifyPostError " + j + " isOk " + z);
                it.next().onPostEnd(j, z);
            }
        }
        return C13598b0.f38549a;
    }
}
