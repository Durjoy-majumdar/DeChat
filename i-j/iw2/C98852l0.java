package iw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import cw2.C97393p;
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

/* renamed from: iw2.l0 */
public final class C98852l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98830g0 f289783d;

    /* renamed from: iw2.l0$a */
    public static final class C98853a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98830g0 f289784d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98853a(C98830g0 g0Var) {
            super(0);
            this.f289784d = g0Var;
        }

        public Object invoke() {
            this.f289784d.f289724g.mo134397e();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.l0$b */
    public static final class C98854b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98261f f289785d;

        /* renamed from: e */
        public final /* synthetic */ C98830g0 f289786e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98854b(C98261f fVar, C98830g0 g0Var) {
            super(0);
            this.f289785d = fVar;
            this.f289786e = g0Var;
        }

        public Object invoke() {
            C98261f fVar = this.f289785d;
            fVar.f288072e = false;
            fVar.f288073f = false;
            fVar.f288071d = false;
            for (C97757a aVar : fVar.f288074g) {
                aVar.f286813f = false;
            }
            this.f289786e.f289724g.mo134397e();
            return C13598b0.f38549a;
        }
    }

    public C98852l0(C98830g0 g0Var) {
        this.f289783d = g0Var;
    }

    public final void run() {
        C98830g0 g0Var = this.f289783d;
        int i = g0Var.f289733s;
        if (i >= 0 && i < g0Var.f289727j.size()) {
            C98830g0 g0Var2 = this.f289783d;
            ArrayList<C98266k> arrayList = g0Var2.f289727j.get(g0Var2.f289733s);
            C87412m.m108593f(arrayList, "dateGalleryMap[selectedRow]");
            ArrayList arrayList2 = arrayList;
            C98266k kVar = (C98266k) C110818d0.m150917O(arrayList2, this.f289783d.f289734t);
            Boolean bool = null;
            C98261f fVar = kVar != null ? kVar.f288083f : null;
            C98266k kVar2 = (C98266k) C110818d0.m150917O(arrayList2, this.f289783d.f289734t);
            C99268i iVar = kVar2 != null ? kVar2.f288078a : null;
            String str = this.f289783d.f289726i;
            StringBuilder sb = new StringBuilder();
            sb.append("setSelectedRead ");
            sb.append(this.f289783d.f289734t);
            sb.append(", ");
            if (fVar != null) {
                bool = Boolean.valueOf(fVar.f288071d);
            }
            sb.append(bool);
            Log.m105924i(str, sb.toString());
            if (!this.f289783d.f289737w) {
                if (iVar != null && iVar.mo138656o2()) {
                    iVar.mo138661t2(false);
                    C97393p.f285894a.mo136665i(iVar.field_storyID, iVar.field_localFlag);
                }
                if (fVar != null && fVar.f288074g.size() > 0) {
                    C97758b bVar = C97758b.f286820d;
                    long j = fVar.f288069b;
                    C97757a last = fVar.f288074g.getLast();
                    C87412m.m108593f(last, "comment.commentList.last");
                    if (bVar.mo137097l(j, last)) {
                        C61926c.m72668M(new C98854b(fVar, this.f289783d));
                    }
                }
            } else if (iVar != null && iVar.mo138656o2()) {
                iVar.mo138661t2(false);
                C97393p.f285894a.mo136665i(iVar.field_storyID, iVar.field_localFlag);
                C61926c.m72668M(new C98853a(this.f289783d));
            }
        }
    }
}
