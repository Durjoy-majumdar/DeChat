package iw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import ew2.C97757a;
import ew2.C97758b;
import fy3.C32224a;
import gw2.C98261f;
import gw2.C98266k;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: iw2.d0 */
public final class C98816d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98880x f289678d;

    /* renamed from: iw2.d0$a */
    public static final class C98817a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98261f f289679d;

        /* renamed from: e */
        public final /* synthetic */ C98880x f289680e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98817a(C98261f fVar, C98880x xVar) {
            super(0);
            this.f289679d = fVar;
            this.f289680e = xVar;
        }

        public Object invoke() {
            C98261f fVar = this.f289679d;
            fVar.f288072e = false;
            for (C97757a aVar : fVar.f288077j) {
                aVar.f286813f = false;
            }
            this.f289680e.f289856f.mo134397e();
            return C13598b0.f38549a;
        }
    }

    public C98816d0(C98880x xVar) {
        this.f289678d = xVar;
    }

    public final void run() {
        C98880x xVar = this.f289678d;
        C98266k kVar = (C98266k) C110818d0.m150917O(xVar.f289859i, xVar.f289863p);
        Boolean bool = null;
        C98261f fVar = kVar != null ? kVar.f288083f : null;
        StringBuilder sb = new StringBuilder();
        sb.append("setSelectedRead ");
        sb.append(this.f289678d.f289863p);
        sb.append(", ");
        if (fVar != null) {
            bool = Boolean.valueOf(fVar.f288072e);
        }
        sb.append(bool);
        Log.m105924i("MicroMsg.SelfGalleryPresenter", sb.toString());
        if (fVar != null && fVar.f288077j.size() > 0) {
            C97758b bVar = C97758b.f286820d;
            long j = fVar.f288069b;
            C97757a last = fVar.f288077j.getLast();
            C87412m.m108593f(last, "comment.visitorList.last");
            bVar.mo137097l(j, last);
            C61926c.m72668M(new C98817a(fVar, this.f289678d));
        }
    }
}
