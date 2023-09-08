package iw2;

import ew2.C97757a;
import fy3.C32224a;
import gw2.C98261f;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: iw2.t */
public final class C98872t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98864r f289839d;

    /* renamed from: iw2.t$a */
    public static final class C98873a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98261f f289840d;

        /* renamed from: e */
        public final /* synthetic */ C98864r f289841e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98873a(C98261f fVar, C98864r rVar) {
            super(0);
            this.f289840d = fVar;
            this.f289841e = rVar;
        }

        public Object invoke() {
            C98261f fVar = this.f289840d;
            fVar.f288073f = false;
            for (C97757a aVar : fVar.f288075h) {
                aVar.f286813f = false;
            }
            this.f289841e.f289802e.mo134397e();
            return C13598b0.f38549a;
        }
    }

    public C98872t(C98864r rVar) {
        this.f289839d = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = r7.f289839d;
        r1 = r0.f289811q;
        r0 = r0.f289814t;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            iw2.r r0 = r7.f289839d
            int r1 = r0.f289811q
            r2 = -1
            if (r1 < 0) goto L_0x001b
            java.util.List<iw2.r$a> r0 = r0.f289808n
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x001b
            iw2.r r0 = r7.f289839d
            int r1 = r0.f289811q
            int r0 = r0.f289814t
            if (r1 == r0) goto L_0x0019
            if (r0 != r2) goto L_0x001b
        L_0x0019:
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x0099
            iw2.r r0 = r7.f289839d
            java.util.List<iw2.r$a> r1 = r0.f289808n
            int r0 = r0.f289811q
            java.lang.Object r0 = r1.get(r0)
            iw2.r$a r0 = (iw2.C98864r.C98865a) r0
            java.util.ArrayList<gw2.k> r0 = r0.f289822c
            iw2.r r1 = r7.f289839d
            int r1 = r1.f289812r
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r1)
            gw2.k r0 = (gw2.C98266k) r0
            r1 = 0
            if (r0 == 0) goto L_0x003c
            gw2.f r0 = r0.f288083f
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            iw2.r r3 = r7.f289839d
            java.lang.String r3 = r3.f289805h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setSelectedRead "
            r4.append(r5)
            iw2.r r5 = r7.f289839d
            int r5 = r5.f289812r
            r4.append(r5)
            java.lang.String r5 = ", "
            r4.append(r5)
            if (r0 == 0) goto L_0x0060
            boolean r1 = r0.f288073f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x0060:
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r0 == 0) goto L_0x0095
            java.util.LinkedList<ew2.a> r1 = r0.f288075h
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0095
            ew2.b r1 = ew2.C97758b.f286820d
            long r3 = r0.f288069b
            java.util.LinkedList<ew2.a> r5 = r0.f288075h
            java.lang.Object r5 = r5.getLast()
            java.lang.String r6 = "comment.msgList.last"
            gy3.C87412m.m108593f(r5, r6)
            ew2.a r5 = (ew2.C97757a) r5
            boolean r1 = r1.mo137097l(r3, r5)
            if (r1 == 0) goto L_0x0095
            iw2.t$a r1 = new iw2.t$a
            iw2.r r3 = r7.f289839d
            r1.<init>(r0, r3)
            o40.C61926c.m72668M(r1)
        L_0x0095:
            iw2.r r0 = r7.f289839d
            r0.f289814t = r2
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iw2.C98872t.run():void");
    }
}
