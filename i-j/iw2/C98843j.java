package iw2;

import ew2.C97757a;
import fy3.C32224a;
import gw2.C98261f;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: iw2.j */
public final class C98843j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98820f f289764d;

    /* renamed from: iw2.j$a */
    public static final class C98844a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98820f f289765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98844a(C98820f fVar) {
            super(0);
            this.f289765d = fVar;
        }

        public Object invoke() {
            this.f289765d.f289689g.mo134397e();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.j$b */
    public static final class C98845b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98261f f289766d;

        /* renamed from: e */
        public final /* synthetic */ C98820f f289767e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98845b(C98261f fVar, C98820f fVar2) {
            super(0);
            this.f289766d = fVar;
            this.f289767e = fVar2;
        }

        public Object invoke() {
            C98261f fVar = this.f289766d;
            fVar.f288072e = false;
            fVar.f288073f = false;
            fVar.f288071d = false;
            for (C97757a aVar : fVar.f288074g) {
                aVar.f286813f = false;
            }
            this.f289767e.f289689g.mo134397e();
            return C13598b0.f38549a;
        }
    }

    public C98843j(C98820f fVar) {
        this.f289764d = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r6.f289764d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            iw2.f r0 = r6.f289764d
            int r1 = r0.f289696q
            if (r1 < 0) goto L_0x00cd
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r0 = r0.f289691i
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x00cd
            iw2.f r0 = r6.f289764d
            int r1 = r0.f289697r
            if (r1 < 0) goto L_0x00cd
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r2 = r0.f289691i
            int r0 = r0.f289696q
            java.lang.Object r0 = r2.get(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x00cd
            iw2.f r0 = r6.f289764d
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r1 = r0.f289691i
            int r0 = r0.f289696q
            java.lang.Object r0 = r1.get(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            iw2.f r1 = r6.f289764d
            int r1 = r1.f289697r
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r1 = "dateGalleryMap[selectedRow][selectedCol]"
            gy3.C87412m.m108593f(r0, r1)
            gw2.k r0 = (gw2.C98266k) r0
            gw2.f r1 = r0.f288083f
            kw2.i r0 = r0.f288078a
            iw2.f r2 = r6.f289764d
            java.lang.String r2 = r2.f289690h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setSelectedRead "
            r3.append(r4)
            iw2.f r4 = r6.f289764d
            int r4 = r4.f289697r
            r3.append(r4)
            java.lang.String r4 = ", "
            r3.append(r4)
            boolean r4 = r1.f288071d
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            iw2.f r2 = r6.f289764d
            boolean r2 = r2.f289700u
            r3 = 0
            if (r2 == 0) goto L_0x0090
            if (r0 == 0) goto L_0x00cd
            boolean r1 = r0.mo138656o2()
            if (r1 == 0) goto L_0x00cd
            r0.mo138661t2(r3)
            cw2.p$a r1 = cw2.C97393p.f285894a
            long r2 = r0.field_storyID
            int r0 = r0.field_localFlag
            r1.mo136665i(r2, r0)
            iw2.j$a r0 = new iw2.j$a
            iw2.f r1 = r6.f289764d
            r0.<init>(r1)
            o40.C61926c.m72668M(r0)
            goto L_0x00cd
        L_0x0090:
            if (r0 == 0) goto L_0x00a4
            boolean r2 = r0.mo138656o2()
            if (r2 == 0) goto L_0x00a4
            r0.mo138661t2(r3)
            cw2.p$a r2 = cw2.C97393p.f285894a
            long r3 = r0.field_storyID
            int r0 = r0.field_localFlag
            r2.mo136665i(r3, r0)
        L_0x00a4:
            java.util.LinkedList<ew2.a> r0 = r1.f288074g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00cd
            ew2.b r0 = ew2.C97758b.f286820d
            long r2 = r1.f288069b
            java.util.LinkedList<ew2.a> r4 = r1.f288074g
            java.lang.Object r4 = r4.getLast()
            java.lang.String r5 = "comment.commentList.last"
            gy3.C87412m.m108593f(r4, r5)
            ew2.a r4 = (ew2.C97757a) r4
            boolean r0 = r0.mo137097l(r2, r4)
            if (r0 == 0) goto L_0x00cd
            iw2.j$b r0 = new iw2.j$b
            iw2.f r2 = r6.f289764d
            r0.<init>(r1, r2)
            o40.C61926c.m72668M(r0)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iw2.C98843j.run():void");
    }
}
