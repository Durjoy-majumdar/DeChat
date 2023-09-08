package rz2;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: rz2.a */
public final class C48198a {

    /* renamed from: a */
    public static final C48198a f129173a = new C48198a();

    /* renamed from: b */
    public static final C13601g f129174b = C36568h.m40985a(C48199a.f129175d);

    /* renamed from: rz2.a$a */
    public static final class C48199a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C48199a f129175d = new C48199a();

        public C48199a() {
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e6, code lost:
            r0 = 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r9 = this;
                bp3.p r0 = bp3.C79758p.f233760a
                bp3.f r1 = bp3.C104160f.RepairerConfig_TextStatus_ForceUseNewClusterId_Int
                r2 = 0
                int r0 = r0.mo109882e(r1, r2)
                java.lang.String r1 = "MicroMsg.TextStatus.TextStatusClusterHelper"
                if (r0 <= 0) goto L_0x0018
                java.lang.String r2 = "isClusterOpen init true by force"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x00f8
            L_0x0018:
                java.text.SimpleDateFormat r0 = qy2.C77448f0.f225876a
                java.lang.Class<h81.h> r0 = h81.C32735h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r3 = h81.C32735h.C32737c.clicfg_text_state_square_new_cluster_and
                r4 = 1
                int r0 = r0.mo58779Qe(r3, r4)
                if (r0 != r4) goto L_0x002d
                r0 = 1
                goto L_0x002e
            L_0x002d:
                r0 = 0
            L_0x002e:
                if (r0 != 0) goto L_0x003b
                java.lang.String r0 = "isClusterOpen init false by xswitch closed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                goto L_0x00f8
            L_0x003b:
                az2.e r0 = az2.C39674e.f106452d
                rz2.h r0 = r0.mo62255t0()
                java.util.concurrent.ConcurrentHashMap r3 = r0.mo72966Yt()
                java.util.Collection r3 = r3.values()
                java.lang.String r5 = "ALL_CACHE.values"
                gy3.C87412m.m108593f(r3, r5)
                java.util.Iterator r3 = r3.iterator()
            L_0x0052:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x00e6
                java.lang.Object r6 = r3.next()
                rz2.c r6 = (rz2.C48201c) r6
                java.lang.String r7 = "it"
                gy3.C87412m.m108593f(r6, r7)
                r7 = 0
                uz2.e0 r7 = p773yy.C66710j.C53637a.m60171a(r6, r2, r4, r7)
                java.util.LinkedList<uz2.q> r7 = r7.f147100t
                if (r7 == 0) goto L_0x0075
                boolean r8 = r7.isEmpty()
                if (r8 == 0) goto L_0x0073
                goto L_0x0075
            L_0x0073:
                r8 = 0
                goto L_0x0076
            L_0x0075:
                r8 = 1
            L_0x0076:
                if (r8 != 0) goto L_0x00a1
                if (r7 == 0) goto L_0x0083
                boolean r8 = r7.isEmpty()
                if (r8 == 0) goto L_0x0081
                goto L_0x0083
            L_0x0081:
                r8 = 0
                goto L_0x0084
            L_0x0083:
                r8 = 1
            L_0x0084:
                if (r8 != 0) goto L_0x0052
                int r8 = r7.size()
                int r8 = r8 - r4
                java.lang.Object r7 = r7.get(r8)
                uz2.q r7 = (uz2.C52708q) r7
                java.lang.String r7 = r7.f147182g
                if (r7 == 0) goto L_0x009e
                int r7 = r7.length()
                if (r7 != 0) goto L_0x009c
                goto L_0x009e
            L_0x009c:
                r7 = 0
                goto L_0x009f
            L_0x009e:
                r7 = 1
            L_0x009f:
                if (r7 == 0) goto L_0x0052
            L_0x00a1:
                java.lang.Object[] r3 = new java.lang.Object[r4]
                java.lang.String r6 = r6.field_UserName
                r3[r2] = r6
                java.lang.String r6 = "MicroMsg.TextStatus.TextStatusStorage"
                java.lang.String r7 = "NewClusterId invalid %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r3)
                java.util.concurrent.ConcurrentHashMap r0 = r0.mo72966Yt()
                java.util.Collection r0 = r0.values()
                gy3.C87412m.m108593f(r0, r5)
                java.util.Iterator r0 = r0.iterator()
            L_0x00bd:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x00e6
                java.lang.Object r3 = r0.next()
                rz2.c r3 = (rz2.C48201c) r3
                java.lang.String r5 = r3.field_ClusterId
                if (r5 == 0) goto L_0x00d6
                boolean r5 = z04.C112551y.m153811k(r5)
                if (r5 == 0) goto L_0x00d4
                goto L_0x00d6
            L_0x00d4:
                r5 = 0
                goto L_0x00d7
            L_0x00d6:
                r5 = 1
            L_0x00d7:
                if (r5 == 0) goto L_0x00bd
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.String r3 = r3.field_UserName
                r0[r2] = r3
                java.lang.String r3 = "cluster invalid %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r0)
                r0 = 0
                goto L_0x00e7
            L_0x00e6:
                r0 = 1
            L_0x00e7:
                java.lang.Object[] r3 = new java.lang.Object[r4]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                r3[r2] = r4
                java.lang.String r2 = "isClusterValid init: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            L_0x00f8:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rz2.C48198a.C48199a.invoke():java.lang.Object");
        }
    }

    /* renamed from: a */
    public final int mo72932a() {
        return ((Number) ((C36570n) f129174b).getValue()).intValue();
    }
}
