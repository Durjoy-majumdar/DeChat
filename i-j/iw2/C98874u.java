package iw2;

import ew2.C97757a;
import fy3.C32224a;
import gw2.C98261f;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: iw2.u */
public final class C98874u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98864r f289842d;

    /* renamed from: iw2.u$a */
    public static final class C98875a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98864r f289843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98875a(C98864r rVar) {
            super(0);
            this.f289843d = rVar;
        }

        public Object invoke() {
            this.f289843d.f289802e.mo134397e();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.u$b */
    public static final class C98876b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98261f f289844d;

        /* renamed from: e */
        public final /* synthetic */ C98864r f289845e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98876b(C98261f fVar, C98864r rVar) {
            super(0);
            this.f289844d = fVar;
            this.f289845e = rVar;
        }

        public Object invoke() {
            C98261f fVar = this.f289844d;
            fVar.f288072e = false;
            fVar.f288073f = false;
            fVar.f288071d = false;
            for (C97757a aVar : fVar.f288074g) {
                aVar.f286813f = false;
            }
            this.f289845e.f289802e.mo134397e();
            return C13598b0.f38549a;
        }
    }

    public C98874u(C98864r rVar) {
        this.f289842d = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r8.f289842d;
        r1 = r0.f289811q;
        r0 = r0.f289814t;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            iw2.r r0 = r8.f289842d
            int r1 = r0.f289811q
            r2 = -1
            r3 = 0
            if (r1 < 0) goto L_0x001c
            java.util.List<iw2.r$a> r0 = r0.f289808n
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x001c
            iw2.r r0 = r8.f289842d
            int r1 = r0.f289811q
            int r0 = r0.f289814t
            if (r1 == r0) goto L_0x001a
            if (r0 != r2) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x00e5
            iw2.r r0 = r8.f289842d
            java.util.List<iw2.r$a> r1 = r0.f289808n
            int r0 = r0.f289811q
            java.lang.Object r0 = r1.get(r0)
            iw2.r$a r0 = (iw2.C98864r.C98865a) r0
            java.util.ArrayList<gw2.k> r1 = r0.f289822c
            iw2.r r4 = r8.f289842d
            int r4 = r4.f289812r
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r4)
            gw2.k r1 = (gw2.C98266k) r1
            r4 = 0
            if (r1 == 0) goto L_0x003d
            gw2.f r1 = r1.f288083f
            goto L_0x003e
        L_0x003d:
            r1 = r4
        L_0x003e:
            java.util.ArrayList<gw2.k> r0 = r0.f289822c
            iw2.r r5 = r8.f289842d
            int r5 = r5.f289812r
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r5)
            gw2.k r0 = (gw2.C98266k) r0
            if (r0 == 0) goto L_0x004f
            kw2.i r0 = r0.f288078a
            goto L_0x0050
        L_0x004f:
            r0 = r4
        L_0x0050:
            iw2.r r5 = r8.f289842d
            java.lang.String r5 = r5.f289805h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "setSelectedRead "
            r6.append(r7)
            iw2.r r7 = r8.f289842d
            int r7 = r7.f289812r
            r6.append(r7)
            java.lang.String r7 = ", "
            r6.append(r7)
            if (r1 == 0) goto L_0x0073
            boolean r4 = r1.f288071d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x0073:
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            iw2.r r4 = r8.f289842d
            boolean r4 = r4.f289818x
            if (r4 == 0) goto L_0x00a2
            if (r0 == 0) goto L_0x00e1
            boolean r1 = r0.mo138656o2()
            if (r1 == 0) goto L_0x00e1
            r0.mo138661t2(r3)
            cw2.p$a r1 = cw2.C97393p.f285894a
            long r3 = r0.field_storyID
            int r0 = r0.field_localFlag
            r1.mo136665i(r3, r0)
            iw2.u$a r0 = new iw2.u$a
            iw2.r r1 = r8.f289842d
            r0.<init>(r1)
            o40.C61926c.m72668M(r0)
            goto L_0x00e1
        L_0x00a2:
            if (r0 == 0) goto L_0x00b6
            boolean r4 = r0.mo138656o2()
            if (r4 == 0) goto L_0x00b6
            r0.mo138661t2(r3)
            cw2.p$a r3 = cw2.C97393p.f285894a
            long r4 = r0.field_storyID
            int r0 = r0.field_localFlag
            r3.mo136665i(r4, r0)
        L_0x00b6:
            if (r1 == 0) goto L_0x00e1
            java.util.LinkedList<ew2.a> r0 = r1.f288074g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00e1
            ew2.b r0 = ew2.C97758b.f286820d
            long r3 = r1.f288069b
            java.util.LinkedList<ew2.a> r5 = r1.f288074g
            java.lang.Object r5 = r5.getLast()
            java.lang.String r6 = "comment.commentList.last"
            gy3.C87412m.m108593f(r5, r6)
            ew2.a r5 = (ew2.C97757a) r5
            boolean r0 = r0.mo137097l(r3, r5)
            if (r0 == 0) goto L_0x00e1
            iw2.u$b r0 = new iw2.u$b
            iw2.r r3 = r8.f289842d
            r0.<init>(r1, r3)
            o40.C61926c.m72668M(r0)
        L_0x00e1:
            iw2.r r0 = r8.f289842d
            r0.f289814t = r2
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iw2.C98874u.run():void");
    }
}
