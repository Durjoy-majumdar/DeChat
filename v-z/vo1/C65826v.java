package vo1;

import androidx.lifecycle.C39622i0;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50008jm0;

/* renamed from: vo1.v */
public final class C65826v {

    /* renamed from: a */
    public final FinderLiveReplayPluginLayout f189296a;

    /* renamed from: b */
    public final String f189297b = "FinderLiveReplayPluginLayoutHelper";

    /* renamed from: c */
    public C45795b f189298c;

    /* renamed from: vo1.v$a */
    public static final class C65827a implements C32226l<C89132b.C89134c<C50008jm0>, C13598b0> {

        /* renamed from: d */
        public final WeakReference<C65826v> f189299d;

        /* renamed from: e */
        public final String f189300e;

        /* renamed from: f */
        public final boolean f189301f;

        /* renamed from: g */
        public final boolean f189302g;

        public C65827a(WeakReference<C65826v> weakReference, String str, boolean z, boolean z2) {
            C87412m.m108594g(weakReference, "rHelper");
            C87412m.m108594g(str, "tag");
            this.f189299d = weakReference;
            this.f189300e = str;
            this.f189301f = z;
            this.f189302g = z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0079, code lost:
            r5 = r5.f182388Z;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r12) {
            /*
                r11 = this;
                ob0.b$c r12 = (ob0.C89132b.C89134c) r12
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                java.lang.String r1 = "result"
                gy3.C87412m.m108594g(r12, r1)
                java.lang.StringBuffer r1 = new java.lang.StringBuffer
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "checkFinderObject(forRestar:"
                r2.append(r3)
                boolean r3 = r11.f189301f
                r2.append(r3)
                java.lang.String r3 = ") result "
                r2.append(r3)
                int r3 = r12.f256793a
                r2.append(r3)
                r3 = 32
                r2.append(r3)
                int r3 = r12.f256794b
                r2.append(r3)
                java.lang.String r3 = ",playTransition:"
                r2.append(r3)
                boolean r3 = r11.f189302g
                r2.append(r3)
                r3 = 33
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                int r2 = r12.f256793a
                if (r2 != 0) goto L_0x0137
                int r2 = r12.f256794b
                if (r2 != 0) goto L_0x0137
                T r12 = r12.f256796d
                te3.jm0 r12 = (te3.C50008jm0) r12
                com.tencent.mm.protocal.protobuf.FinderObject r12 = r12.f136184e
                if (r12 == 0) goto L_0x0148
                java.lang.String r2 = r11.f189300e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "newFeed "
                r4.append(r5)
                java.lang.String r5 = r12.nickname
                r4.append(r5)
                java.lang.String r5 = " id:"
                r4.append(r5)
                long r5 = r12.f164794id
                r4.append(r5)
                java.lang.String r5 = ",replay info:["
                r4.append(r5)
                te3.c21 r5 = r12.liveInfo
                r6 = 0
                if (r5 == 0) goto L_0x0084
                te3.e71 r5 = r5.f182388Z
                if (r5 == 0) goto L_0x0084
                int r5 = r5.f182928d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x0085
            L_0x0084:
                r5 = r6
            L_0x0085:
                r4.append(r5)
                r5 = 44
                r4.append(r5)
                te3.c21 r5 = r12.liveInfo
                if (r5 == 0) goto L_0x009c
                te3.e71 r5 = r5.f182388Z
                if (r5 == 0) goto L_0x009c
                long r7 = r5.f182929e
                java.lang.Long r5 = java.lang.Long.valueOf(r7)
                goto L_0x009d
            L_0x009c:
                r5 = r6
            L_0x009d:
                r4.append(r5)
                r5 = 93
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                java.lang.ref.WeakReference<vo1.v> r1 = r11.f189299d
                java.lang.Object r1 = r1.get()
                vo1.v r1 = (vo1.C65826v) r1
                if (r1 == 0) goto L_0x0148
                androidx.lifecycle.i0 r2 = r1.mo89861b(r0)
                cl1.u r2 = (cl1.C55001u) r2
                r4 = 0
                if (r2 == 0) goto L_0x00cf
                long r7 = r12.f164794id
                long r9 = r2.f154416j
                int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r2 != 0) goto L_0x00cf
                r4 = 1
            L_0x00cf:
                if (r4 != 0) goto L_0x00f9
                java.lang.String r12 = r11.f189300e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "resp id different with local objectId:"
                r2.append(r4)
                androidx.lifecycle.i0 r0 = r1.mo89861b(r0)
                cl1.u r0 = (cl1.C55001u) r0
                if (r0 == 0) goto L_0x00eb
                long r0 = r0.f154416j
                java.lang.Long r6 = java.lang.Long.valueOf(r0)
            L_0x00eb:
                r2.append(r6)
                r2.append(r3)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                goto L_0x0148
            L_0x00f9:
                com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r0 = r1.f189296a
                al1.h r0 = r0.getData()
                if (r0 == 0) goto L_0x012f
                er1.d1 r4 = er1.C58708d1.f168058a
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r5 = r12
                com.tencent.mm.live.api.LiveConfig r2 = er1.C58708d1.m68188b(r4, r5, r6, r7, r8, r9)
                r0.f151977d = r2
                sk1.a r2 = sk1.C63947a.f181274a
                r3 = 2
                r2.mo88734t(r0, r12, r3)
                te3.c21 r12 = r12.liveInfo
                if (r12 == 0) goto L_0x012f
                te3.e71 r12 = r12.f182388Z
                if (r12 == 0) goto L_0x012f
                int r12 = r12.f182930f
                if (r12 <= 0) goto L_0x012f
                fj1.b r0 = r0.f151978e
                java.lang.Class<bp1.d> r2 = bp1.C54519d.class
                androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
                bp1.d r0 = (bp1.C54519d) r0
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r0.mo75363I3(r12, r2)
            L_0x012f:
                boolean r12 = r11.f189301f
                boolean r0 = r11.f189302g
                vo1.C65826v.m77543a(r1, r12, r0)
                goto L_0x0148
            L_0x0137:
                java.lang.ref.WeakReference<vo1.v> r12 = r11.f189299d
                java.lang.Object r12 = r12.get()
                vo1.v r12 = (vo1.C65826v) r12
                if (r12 == 0) goto L_0x0148
                boolean r0 = r11.f189301f
                boolean r1 = r11.f189302g
                vo1.C65826v.m77543a(r12, r0, r1)
            L_0x0148:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: vo1.C65826v.C65827a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C65826v(FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
        C87412m.m108594g(finderLiveReplayPluginLayout, "layout");
        this.f189296a = finderLiveReplayPluginLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m77543a(vo1.C65826v r25, boolean r26, boolean r27) {
        /*
            r0 = r25
            java.lang.Class<cl1.l> r1 = cl1.C0668l.class
            java.lang.Class<qj1.t4> r2 = qj1.C12669t4.class
            java.lang.Class<zo1.j0> r3 = zo1.C66925j0.class
            java.lang.Class<bp1.d> r4 = bp1.C54519d.class
            androidx.lifecycle.i0 r5 = r0.mo89861b(r4)
            bp1.d r5 = (bp1.C54519d) r5
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x001c
            boolean r5 = r5.mo75376j3()
            if (r5 != r6) goto L_0x001c
            r5 = 1
            goto L_0x001d
        L_0x001c:
            r5 = 0
        L_0x001d:
            r8 = 8
            r9 = 0
            if (r5 == 0) goto L_0x0031
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r3 = r0.f189296a
            qj1.c r2 = r3.getPlugin(r2)
            qj1.t4 r2 = (qj1.C12669t4) r2
            if (r2 == 0) goto L_0x0278
            r2.mo10792g(r8)
            goto L_0x0278
        L_0x0031:
            androidx.lifecycle.i0 r5 = r0.mo89861b(r4)
            bp1.d r5 = (bp1.C54519d) r5
            if (r5 == 0) goto L_0x0049
            te3.c21 r5 = r5.mo75372e3()
            int r5 = r5.f182366L
            r10 = 4
            if (r5 != r10) goto L_0x0044
            r5 = 1
            goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            if (r5 != r6) goto L_0x0049
            r5 = 1
            goto L_0x004a
        L_0x0049:
            r5 = 0
        L_0x004a:
            if (r5 == 0) goto L_0x0065
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r2 = r0.f189296a
            qj1.c r2 = r2.getPlugin(r3)
            zo1.j0 r2 = (zo1.C66925j0) r2
            if (r2 == 0) goto L_0x0059
            r2.mo90918d1()
        L_0x0059:
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r10 = r0.f189296a
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 7
            r15 = 0
            com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout.m64391m(r10, r11, r12, r13, r14, r15)
            goto L_0x0278
        L_0x0065:
            androidx.lifecycle.i0 r5 = r0.mo89861b(r4)
            bp1.d r5 = (bp1.C54519d) r5
            if (r5 == 0) goto L_0x007d
            te3.c21 r5 = r5.mo75372e3()
            int r5 = r5.f182366L
            r10 = 2
            if (r5 != r10) goto L_0x0078
            r5 = 1
            goto L_0x0079
        L_0x0078:
            r5 = 0
        L_0x0079:
            if (r5 != r6) goto L_0x007d
            r5 = 1
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            if (r5 == 0) goto L_0x0099
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r2 = r0.f189296a
            qj1.c r2 = r2.getPlugin(r3)
            zo1.j0 r2 = (zo1.C66925j0) r2
            if (r2 == 0) goto L_0x008d
            r2.mo90918d1()
        L_0x008d:
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r10 = r0.f189296a
            r11 = 1
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout.m64391m(r10, r11, r12, r13, r14, r15)
            goto L_0x0278
        L_0x0099:
            androidx.lifecycle.i0 r5 = r0.mo89861b(r4)
            bp1.d r5 = (bp1.C54519d) r5
            if (r5 == 0) goto L_0x00b1
            te3.c21 r5 = r5.mo75372e3()
            int r5 = r5.f182366L
            r10 = 6
            if (r5 != r10) goto L_0x00ac
            r5 = 1
            goto L_0x00ad
        L_0x00ac:
            r5 = 0
        L_0x00ad:
            if (r5 != r6) goto L_0x00b1
            r5 = 1
            goto L_0x00b2
        L_0x00b1:
            r5 = 0
        L_0x00b2:
            if (r5 == 0) goto L_0x00cd
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r2 = r0.f189296a
            qj1.c r2 = r2.getPlugin(r3)
            zo1.j0 r2 = (zo1.C66925j0) r2
            if (r2 == 0) goto L_0x00c1
            r2.mo90918d1()
        L_0x00c1:
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r10 = r0.f189296a
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 5
            r15 = 0
            com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout.m64391m(r10, r11, r12, r13, r14, r15)
            goto L_0x0278
        L_0x00cd:
            androidx.lifecycle.i0 r5 = r0.mo89861b(r1)
            cl1.l r5 = (cl1.C0668l) r5
            if (r5 == 0) goto L_0x00e6
            te3.e61 r5 = r5.mo630d3()
            if (r5 == 0) goto L_0x00e1
            boolean r5 = r5.f182921e
            if (r5 != r6) goto L_0x00e1
            r5 = 1
            goto L_0x00e2
        L_0x00e1:
            r5 = 0
        L_0x00e2:
            if (r5 != r6) goto L_0x00e6
            r5 = 1
            goto L_0x00e7
        L_0x00e6:
            r5 = 0
        L_0x00e7:
            if (r5 == 0) goto L_0x0224
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r5 = r0.f189296a
            qj1.c r2 = r5.getPlugin(r2)
            qj1.t4 r2 = (qj1.C12669t4) r2
            if (r2 == 0) goto L_0x00f6
            r2.mo10792g(r8)
        L_0x00f6:
            androidx.lifecycle.i0 r2 = r0.mo89861b(r4)
            bp1.d r2 = (bp1.C54519d) r2
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x0125
            te3.c21 r13 = r2.mo75372e3()
            if (r13 == 0) goto L_0x0125
            sk1.a r12 = sk1.C63947a.f181274a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r14 = r0.f189297b
            r2.append(r14)
            java.lang.String r14 = "-updateChargeStatus"
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r15 = 0
            r16 = 2
            r17 = 0
            java.lang.String r2 = sk1.C63947a.m75194h(r12, r13, r14, r15, r16, r17)
            goto L_0x0126
        L_0x0125:
            r2 = r5
        L_0x0126:
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r12 = r0.f189296a
            qj1.c r12 = r12.getPlugin(r3)
            zo1.j0 r12 = (zo1.C66925j0) r12
            if (r12 == 0) goto L_0x013f
            cp1.m r12 = r12.f192301r
            if (r12 == 0) goto L_0x013f
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r12 = r12.f165852a
            gr1.q2 r12 = r12.getVideoMediaInfo()
            if (r12 == 0) goto L_0x013f
            java.lang.String r12 = r12.f170492b
            goto L_0x0140
        L_0x013f:
            r12 = r9
        L_0x0140:
            if (r26 == 0) goto L_0x0278
            int r13 = r2.length()
            if (r13 <= 0) goto L_0x014a
            r13 = 1
            goto L_0x014b
        L_0x014a:
            r13 = 0
        L_0x014b:
            if (r13 == 0) goto L_0x0278
            boolean r13 = gy3.C87412m.m108589b(r2, r12)
            if (r13 != 0) goto L_0x0278
            androidx.lifecycle.i0 r13 = r0.mo89861b(r4)
            bp1.d r13 = (bp1.C54519d) r13
            if (r13 == 0) goto L_0x015f
            int r13 = r13.f152854q
            r15 = r13
            goto L_0x0160
        L_0x015f:
            r15 = 0
        L_0x0160:
            java.lang.String r13 = r0.f189297b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r10 = "checkChargeStatus replace url:"
            r14.append(r10)
            r14.append(r12)
            java.lang.String r10 = " to "
            r14.append(r10)
            r14.append(r2)
            java.lang.String r2 = ", offset:"
            r14.append(r2)
            r14.append(r15)
            java.lang.String r2 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            pe1.c<java.lang.Integer> r2 = gg1.C32444a.f86223z1
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x01bb
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = new com.tencent.mm.autogen.events.FeedUpdateEvent
            r2.<init>()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r2.f9173d
            java.lang.Class<cl1.u> r5 = cl1.C55001u.class
            androidx.lifecycle.i0 r5 = r0.mo89861b(r5)
            cl1.u r5 = (cl1.C55001u) r5
            if (r5 == 0) goto L_0x01ac
            te3.c21 r5 = r5.f154420q
            if (r5 == 0) goto L_0x01ac
            long r10 = r5.f182392d
            goto L_0x01ae
        L_0x01ac:
            r10 = 0
        L_0x01ae:
            r3.f9174a = r10
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r2.f9173d
            r5 = 14
            r3.f9175b = r5
            r2.publish()
            goto L_0x0278
        L_0x01bb:
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r2 = r0.f189296a
            qj1.c r2 = r2.getPlugin(r3)
            zo1.j0 r2 = (zo1.C66925j0) r2
            if (r2 == 0) goto L_0x01c8
            r2.mo90918d1()
        L_0x01c8:
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r2 = r0.f189296a
            androidx.lifecycle.i0 r3 = r0.mo89861b(r4)
            bp1.d r3 = (bp1.C54519d) r3
            if (r3 == 0) goto L_0x01e4
            sk1.a r16 = sk1.C63947a.f181274a
            te3.c21 r17 = r3.mo75372e3()
            r19 = 0
            r20 = 2
            r21 = 0
            java.lang.String r18 = "MMFinder.LiveReplaySlice"
            java.lang.String r5 = sk1.C63947a.m75194h(r16, r17, r18, r19, r20, r21)
        L_0x01e4:
            te3.rq2 r3 = new te3.rq2
            r3.<init>()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r10 == 0) goto L_0x01f5
            java.lang.String r10 = "https"
            java.lang.String r11 = "http"
            java.lang.String r5 = z04.C112551y.m153814n(r5, r10, r11, r7)
        L_0x01f5:
            r3.f185266d = r5
            java.lang.String r5 = p823sg.C90193h.m112876d(r5)
            r3.f185275p = r5
            up1.y r18 = up1.C27696y.V0_VIDEO
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 56
            r24 = 0
            pl1.r0 r5 = new pl1.r0
            java.lang.String r19 = "xV0"
            r16 = r5
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r17 = 0
            r18 = 0
            r19 = 2
            r2.getClass()
            vo1.h r14 = r2.f160712d
            r14.mo89845m(r15, r16, r17, r18, r19)
            goto L_0x0278
        L_0x0224:
            if (r27 != 0) goto L_0x0278
            androidx.lifecycle.i0 r3 = r0.mo89861b(r1)
            cl1.l r3 = (cl1.C0668l) r3
            if (r3 == 0) goto L_0x0236
            boolean r3 = r3.mo631g3()
            if (r3 != r6) goto L_0x0236
            r3 = 1
            goto L_0x0237
        L_0x0236:
            r3 = 0
        L_0x0237:
            if (r3 == 0) goto L_0x0278
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r3 = r0.f189296a
            qj1.c r2 = r3.getPlugin(r2)
            qj1.t4 r2 = (qj1.C12669t4) r2
            if (r2 == 0) goto L_0x0278
            sg1.i r18 = sg1.C63889i.f181100a
            androidx.lifecycle.i0 r3 = r0.mo89861b(r4)
            bp1.d r3 = (bp1.C54519d) r3
            if (r3 == 0) goto L_0x0254
            long r10 = r3.mo75371d3()
            r19 = r10
            goto L_0x0256
        L_0x0254:
            r19 = 0
        L_0x0256:
            androidx.lifecycle.i0 r3 = r0.mo89861b(r4)
            bp1.d r3 = (bp1.C54519d) r3
            if (r3 == 0) goto L_0x0269
            te3.c21 r3 = r3.mo75372e3()
            if (r3 == 0) goto L_0x0269
            te3.ga1 r3 = r3.f182362H
            r21 = r3
            goto L_0x026b
        L_0x0269:
            r21 = r9
        L_0x026b:
            r22 = 0
            r23 = 4
            r24 = 0
            te3.dp2 r3 = sg1.C63889i.m75110b(r18, r19, r21, r22, r23, r24)
            r2.mo12252f1(r3, r6)
        L_0x0278:
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r2 = r0.f189296a
            java.lang.Class<xo1.a> r3 = xo1.C66378a.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r2 = r2.getController(r3)
            xo1.a r2 = (xo1.C66378a) r2
            if (r2 == 0) goto L_0x028b
            gh1.p r2 = r2.f191089j
            if (r2 == 0) goto L_0x028b
            android.view.View r2 = r2.f169882a
            goto L_0x028c
        L_0x028b:
            r2 = r9
        L_0x028c:
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r3 = r0.f189296a
            java.lang.Class<zo1.o0> r5 = zo1.C66939o0.class
            qj1.c r3 = r3.getPlugin(r5)
            zo1.o0 r3 = (zo1.C66939o0) r3
            if (r3 == 0) goto L_0x02b6
            android.view.ViewGroup r3 = r3.f166287d
            if (r3 == 0) goto L_0x02b6
            if (r27 == 0) goto L_0x02ae
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r2 = r0.f189296a
            java.lang.Class<zo1.a> r3 = zo1.C66911a.class
            qj1.c r2 = r2.getPlugin(r3)
            zo1.a r2 = (zo1.C66911a) r2
            if (r2 == 0) goto L_0x02b6
            r2.mo10792g(r8)
            goto L_0x02b6
        L_0x02ae:
            vo1.w r5 = new vo1.w
            r5.<init>(r3, r2, r0)
            r3.post(r5)
        L_0x02b6:
            vo1.x r2 = new vo1.x
            r2.<init>(r0)
            com.tencent.p014mm.sdk.p134kt.CommonKt.uiThread(r2)
            pe1.c<java.lang.Integer> r2 = gg1.C32444a.f86111W1
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r6) goto L_0x0306
            androidx.lifecycle.i0 r1 = r0.mo89861b(r1)
            cl1.l r1 = (cl1.C0668l) r1
            if (r1 == 0) goto L_0x02e0
            boolean r1 = cl1.C0668l.m589e3(r1, r9, r6, r9)
            if (r1 != r6) goto L_0x02e0
            r1 = 1
            goto L_0x02e1
        L_0x02e0:
            r1 = 0
        L_0x02e1:
            if (r1 == 0) goto L_0x0306
            androidx.lifecycle.i0 r1 = r0.mo89861b(r4)
            bp1.d r1 = (bp1.C54519d) r1
            if (r1 == 0) goto L_0x02f2
            boolean r1 = r1.mo75376j3()
            if (r1 != r6) goto L_0x02f2
            goto L_0x02f3
        L_0x02f2:
            r6 = 0
        L_0x02f3:
            if (r6 != 0) goto L_0x0306
            ok1.e r1 = ok1.C62042e.f176370a
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r0 = r0.f189296a
            android.content.Context r0 = r0.getContext()
            gy3.C87412m.m108592e(r0, r3)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            r1.mo87022L1(r0, r5, r5)
            goto L_0x0316
        L_0x0306:
            ok1.e r1 = ok1.C62042e.f176370a
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r0 = r0.f189296a
            android.content.Context r0 = r0.getContext()
            gy3.C87412m.m108592e(r0, r3)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            r1.mo87127x(r0, r5)
        L_0x0316:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65826v.m77543a(vo1.v, boolean, boolean):void");
    }

    /* renamed from: b */
    public final <T extends C39622i0> T mo89861b(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        C45795b bVar = this.f189298c;
        if (bVar != null) {
            return bVar.mo71262a(cls);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r7 = r7.f151988c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89862c(fj1.C45795b r32, boolean r33, boolean r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            java.lang.Class<bp1.d> r4 = bp1.C54519d.class
            java.lang.String r5 = "liveBuContext"
            gy3.C87412m.m108594g(r1, r5)
            r0.f189298c = r1
            te3.hj1 r5 = new te3.hj1
            r5.<init>()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r6.getClass()
            al1.i r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            r8 = 0
            if (r7 == 0) goto L_0x0027
            al1.l r7 = r7.f151988c
            if (r7 == 0) goto L_0x0027
            int r7 = r7.f152031k
            goto L_0x0028
        L_0x0027:
            r7 = 0
        L_0x0028:
            r5.f134677n = r7
            r6.getClass()
            al1.i r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r6 == 0) goto L_0x0037
            al1.l r6 = r6.f151988c
            if (r6 == 0) goto L_0x0037
            int r8 = r6.f152031k
        L_0x0037:
            r5.f134675i = r8
            ok1.e r6 = ok1.C62042e.f176370a
            java.lang.String r7 = r0.f189297b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "checkFinderObject liveBuContext:"
            r8.append(r9)
            int r1 = r32.hashCode()
            r8.append(r1)
            java.lang.String r1 = ",objectId:"
            r8.append(r1)
            androidx.lifecycle.i0 r1 = r0.mo89861b(r4)
            bp1.d r1 = (bp1.C54519d) r1
            r9 = 0
            if (r1 == 0) goto L_0x0065
            long r10 = r1.mo75373f3()
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            goto L_0x0066
        L_0x0065:
            r1 = r9
        L_0x0066:
            r8.append(r1)
            java.lang.String r1 = ",forRestar:"
            r8.append(r1)
            r8.append(r2)
            java.lang.String r1 = ",playTransition:"
            r8.append(r1)
            r8.append(r3)
            java.lang.String r1 = r8.toString()
            r6.mo86998D1(r7, r1)
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r6 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r6)
            r6 = r1
            tf0.p1 r6 = (tf0.C64916p1) r6
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r1 = r0.f189296a
            android.content.Context r1 = r1.getContext()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r1, r7)
            r7 = r1
            com.tencent.mm.ui.MMActivity r7 = (com.tencent.p014mm.p136ui.MMActivity) r7
            androidx.lifecycle.i0 r1 = r0.mo89861b(r4)
            bp1.d r1 = (bp1.C54519d) r1
            if (r1 == 0) goto L_0x00a9
            long r10 = r1.mo75373f3()
            goto L_0x00ab
        L_0x00a9:
            r10 = 0
        L_0x00ab:
            r29 = r10
            androidx.lifecycle.i0 r1 = r0.mo89861b(r4)
            bp1.d r1 = (bp1.C54519d) r1
            java.lang.String r4 = ""
            if (r1 == 0) goto L_0x00c9
            java.lang.Class<cl1.o> r8 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r1.business(r8)
            cl1.o r1 = (cl1.C54991o) r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f154341n
            if (r1 == 0) goto L_0x00c5
            java.lang.String r9 = r1.objectNonceId
        L_0x00c5:
            if (r9 != 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r4 = r9
        L_0x00c9:
            r10 = r4
            r11 = 0
            r12 = 2
            r14 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            vo1.v$a r1 = new vo1.v$a
            r26 = r1
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r0)
            java.lang.String r8 = r0.f189297b
            r1.<init>(r4, r8, r2, r3)
            r27 = 114560(0x1bf80, float:1.60533E-40)
            r28 = 0
            java.lang.String r13 = ""
            r8 = r29
            r23 = r5
            tf0.C64916p1.C64917a.m76436c(r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65826v.mo89862c(fj1.b, boolean, boolean):void");
    }
}
