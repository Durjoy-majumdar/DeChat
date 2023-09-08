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
import kw2.C99268i;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;
import zv2.C103109c;

/* renamed from: iw2.c0 */
public final class C98812c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98880x f289673d;

    /* renamed from: iw2.c0$a */
    public static final class C98813a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98880x f289674d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98813a(C98880x xVar) {
            super(0);
            this.f289674d = xVar;
        }

        public Object invoke() {
            this.f289674d.f289856f.mo134397e();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.c0$b */
    public static final class C98814b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98261f f289675d;

        /* renamed from: e */
        public final /* synthetic */ C98880x f289676e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98814b(C98261f fVar, C98880x xVar) {
            super(0);
            this.f289675d = fVar;
            this.f289676e = xVar;
        }

        public Object invoke() {
            C98261f fVar = this.f289675d;
            fVar.f288072e = false;
            fVar.f288073f = false;
            fVar.f288071d = false;
            for (C97757a aVar : fVar.f288074g) {
                aVar.f286813f = false;
            }
            for (C97757a aVar2 : this.f289675d.f288075h) {
                aVar2.f286813f = false;
            }
            for (C97757a aVar3 : this.f289675d.f288077j) {
                aVar3.f286813f = false;
            }
            this.f289676e.mo138234n();
            this.f289676e.f289856f.mo134397e();
            return C13598b0.f38549a;
        }
    }

    public C98812c0(C98880x xVar) {
        this.f289673d = xVar;
    }

    public final void run() {
        C98880x xVar = this.f289673d;
        C98266k kVar = (C98266k) C110818d0.m150917O(xVar.f289859i, xVar.f289863p);
        Boolean bool = null;
        C98261f fVar = kVar != null ? kVar.f288083f : null;
        C98880x xVar2 = this.f289673d;
        C98266k kVar2 = (C98266k) C110818d0.m150917O(xVar2.f289859i, xVar2.f289863p);
        C99268i iVar = kVar2 != null ? kVar2.f288078a : null;
        StringBuilder sb = new StringBuilder();
        sb.append("setSelectedRead ");
        sb.append(this.f289673d.f289863p);
        sb.append(", ");
        if (fVar != null) {
            bool = Boolean.valueOf(fVar.f288071d);
        }
        sb.append(bool);
        Log.m105924i("MicroMsg.SelfGalleryPresenter", sb.toString());
        if (!C103109c.f304232b.mo108963a()) {
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
                    C61926c.m72668M(new C98814b(fVar, this.f289673d));
                }
            }
        } else if (iVar != null && iVar.mo138656o2()) {
            iVar.mo138661t2(false);
            C97393p.f285894a.mo136665i(iVar.field_storyID, iVar.field_localFlag);
            C61926c.m72668M(new C98813a(this.f289673d));
        }
    }
}
