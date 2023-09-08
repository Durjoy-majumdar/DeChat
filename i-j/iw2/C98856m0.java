package iw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import ew2.C97757a;
import ew2.C97758b;
import fy3.C32224a;
import gw2.C98261f;
import gw2.C98266k;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kw2.C99268i;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: iw2.m0 */
public final class C98856m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98830g0 f289788d;

    /* renamed from: iw2.m0$a */
    public static final class C98857a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99268i f289789d;

        /* renamed from: e */
        public final /* synthetic */ C98261f f289790e;

        /* renamed from: f */
        public final /* synthetic */ C98830g0 f289791f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98857a(C99268i iVar, C98261f fVar, C98830g0 g0Var) {
            super(0);
            this.f289789d = iVar;
            this.f289790e = fVar;
            this.f289791f = g0Var;
        }

        public Object invoke() {
            C99268i iVar = this.f289789d;
            if (iVar != null && !iVar.mo138658q2()) {
                C97758b.f286820d.mo137099n(false, false);
            }
            C98261f fVar = this.f289790e;
            fVar.f288072e = false;
            for (C97757a aVar : fVar.f288077j) {
                aVar.f286813f = false;
            }
            this.f289791f.f289724g.mo134397e();
            return C13598b0.f38549a;
        }
    }

    public C98856m0(C98830g0 g0Var) {
        this.f289788d = g0Var;
    }

    public final void run() {
        C98830g0 g0Var = this.f289788d;
        int i = g0Var.f289733s;
        if (i >= 0 && i < g0Var.f289727j.size()) {
            C98830g0 g0Var2 = this.f289788d;
            ArrayList<C98266k> arrayList = g0Var2.f289727j.get(g0Var2.f289733s);
            C87412m.m108593f(arrayList, "dateGalleryMap[selectedRow]");
            ArrayList arrayList2 = arrayList;
            C98266k kVar = (C98266k) C110818d0.m150917O(arrayList2, this.f289788d.f289734t);
            Boolean bool = null;
            C98261f fVar = kVar != null ? kVar.f288083f : null;
            C98266k kVar2 = (C98266k) C110818d0.m150917O(arrayList2, this.f289788d.f289734t);
            C99268i iVar = kVar2 != null ? kVar2.f288078a : null;
            String str = this.f289788d.f289726i;
            StringBuilder sb = new StringBuilder();
            sb.append("setSelectedRead ");
            sb.append(this.f289788d.f289734t);
            sb.append(", ");
            if (fVar != null) {
                bool = Boolean.valueOf(fVar.f288072e);
            }
            sb.append(bool);
            Log.m105924i(str, sb.toString());
            if (fVar != null && fVar.f288077j.size() > 0) {
                C97758b bVar = C97758b.f286820d;
                long j = fVar.f288069b;
                C97757a last = fVar.f288077j.getLast();
                C87412m.m108593f(last, "comment.visitorList.last");
                if (bVar.mo137097l(j, last)) {
                    C61926c.m72668M(new C98857a(iVar, fVar, this.f289788d));
                }
            }
        }
    }
}
