package iw2;

import ew2.C97757a;
import fy3.C32224a;
import gw2.C98261f;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: iw2.k */
public final class C98847k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98820f f289770d;

    /* renamed from: iw2.k$a */
    public static final class C98848a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98261f f289771d;

        /* renamed from: e */
        public final /* synthetic */ C98820f f289772e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98848a(C98261f fVar, C98820f fVar2) {
            super(0);
            this.f289771d = fVar;
            this.f289772e = fVar2;
        }

        public Object invoke() {
            C98261f fVar = this.f289771d;
            fVar.f288072e = false;
            for (C97757a aVar : fVar.f288077j) {
                aVar.f286813f = false;
            }
            this.f289772e.f289689g.mo134397e();
            return C13598b0.f38549a;
        }
    }

    public C98847k(C98820f fVar) {
        this.f289770d = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r6.f289770d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            iw2.f r0 = r6.f289770d
            int r1 = r0.f289696q
            if (r1 < 0) goto L_0x0091
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r0 = r0.f289691i
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0091
            iw2.f r0 = r6.f289770d
            int r1 = r0.f289697r
            if (r1 < 0) goto L_0x0091
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r2 = r0.f289691i
            int r0 = r0.f289696q
            java.lang.Object r0 = r2.get(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0091
            iw2.f r0 = r6.f289770d
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r1 = r0.f289691i
            int r0 = r0.f289696q
            java.lang.Object r0 = r1.get(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            iw2.f r1 = r6.f289770d
            int r1 = r1.f289697r
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r1 = "dateGalleryMap[selectedRow][selectedCol]"
            gy3.C87412m.m108593f(r0, r1)
            gw2.k r0 = (gw2.C98266k) r0
            gw2.f r0 = r0.f288083f
            iw2.f r1 = r6.f289770d
            java.lang.String r1 = r1.f289690h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "setSelectedRead "
            r2.append(r3)
            iw2.f r3 = r6.f289770d
            int r3 = r3.f289697r
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            boolean r3 = r0.f288072e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.util.LinkedList<ew2.a> r1 = r0.f288077j
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0091
            ew2.b r1 = ew2.C97758b.f286820d
            long r2 = r0.f288069b
            java.util.LinkedList<ew2.a> r4 = r0.f288077j
            java.lang.Object r4 = r4.getLast()
            java.lang.String r5 = "comment.visitorList.last"
            gy3.C87412m.m108593f(r4, r5)
            ew2.a r4 = (ew2.C97757a) r4
            boolean r1 = r1.mo137097l(r2, r4)
            if (r1 == 0) goto L_0x0091
            iw2.k$a r1 = new iw2.k$a
            iw2.f r2 = r6.f289770d
            r1.<init>(r0, r2)
            o40.C61926c.m72668M(r1)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iw2.C98847k.run():void");
    }
}
