package uq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: uq1.k */
public final class C65447k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65437f f188326d;

    /* renamed from: e */
    public final /* synthetic */ long f188327e;

    /* renamed from: f */
    public final /* synthetic */ long f188328f;

    /* renamed from: g */
    public final /* synthetic */ boolean f188329g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65447k(C65437f fVar, long j, long j2, boolean z) {
        super(0);
        this.f188326d = fVar;
        this.f188327e = j;
        this.f188328f = j2;
        this.f188329g = z;
    }

    public Object invoke() {
        if (!C86709a0.m107522a()) {
            Log.m105920e(this.f188326d.f188301d, "is invalid to notifyPostError");
        } else {
            C65437f fVar = this.f188326d;
            HashSet<C65464w> hashSet = fVar.f188303f;
            long j = this.f188327e;
            long j2 = this.f188328f;
            boolean z = this.f188329g;
            Iterator<C65464w> it = hashSet.iterator();
            while (it.hasNext()) {
                String str = fVar.f188301d;
                Log.m105924i(str, "notifyPostOk " + j + " svrId " + j2 + " isOk " + z);
                it.next().onPostOk(j, j2);
            }
        }
        return C13598b0.f38549a;
    }
}
