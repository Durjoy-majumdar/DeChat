package je1;

import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import it1.C60625c;
import te3.C49335eu3;
import te3.C52133yl1;
import te3.C52280zl1;

/* renamed from: je1.p1 */
public final class C9360p1 extends C60625c<C52280zl1> {

    /* renamed from: s */
    public final C9361a f29232s;

    /* renamed from: t */
    public final int f29233t;

    /* renamed from: u */
    public final int f29234u;

    /* renamed from: v */
    public final C9362b f29235v;

    /* renamed from: w */
    public final boolean f29236w;

    /* renamed from: x */
    public final C52133yl1 f29237x;

    /* renamed from: je1.p1$a */
    public interface C9361a {
        /* renamed from: a */
        void mo2805a(C2781d dVar, int i);
    }

    /* renamed from: je1.p1$b */
    public interface C9362b {
        /* renamed from: a */
        boolean mo2804a(int i, int i2, String str, C49335eu3 eu32);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9360p1(je1.C9360p1.C9361a r19, int r20, int r21, je1.C9360p1.C9362b r22, pe3.C89349b r23, boolean r24, te3.C49712hj1 r25) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r25
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r6 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r7 = "callback"
            gy3.C87412m.m108594g(r1, r7)
            r7 = 0
            r8 = 2
            r0.<init>(r5, r7, r8, r7)
            r0.f29232s = r1
            r0.f29233t = r2
            r0.f29234u = r3
            r1 = r22
            r0.f29235v = r1
            r0.f29236w = r4
            te3.yl1 r1 = new te3.yl1
            r1.<init>()
            r0.f29237x = r1
            if (r2 != 0) goto L_0x0040
            if (r4 == 0) goto L_0x0040
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            er1.w3 r9 = er1.C58784w3.f168295a
            com.tencent.mm.storage.y1$a r9 = r9.mo83914a0(r3)
            r8.mo119677K(r9, r7)
        L_0x0040:
            ob0.c$b r8 = new ob0.c$b
            r8.<init>()
            java.lang.String r9 = ""
            if (r4 == 0) goto L_0x006d
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            er1.w3 r10 = er1.C58784w3.f168295a
            com.tencent.mm.storage.y1$a r10 = r10.mo83914a0(r3)
            java.lang.Object r4 = r4.mo119685f(r10, r9)
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r4, r10)
            java.lang.String r4 = (java.lang.String) r4
            byte[] r4 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r4)
            pe3.b r4 = pe3.C89349b.m111674a(r4)
            r1.f145369d = r4
            goto L_0x0071
        L_0x006d:
            r4 = r23
            r1.f145369d = r4
        L_0x0071:
            r1.f145371f = r2
            r1.f145379q = r3
            r4 = 3
            java.lang.String r10 = "[request] tabType="
            java.lang.String r11 = " h:"
            java.lang.String r12 = "Finder.CgiFinderTimelineStream"
            r15 = 1
            if (r2 != r15) goto L_0x00cb
            if (r3 == r15) goto L_0x0086
            if (r3 == r4) goto L_0x0086
            r15 = 4
            if (r3 != r15) goto L_0x00cb
        L_0x0086:
            java.util.HashMap<java.lang.Integer, java.lang.Long> r15 = rs1.C63580na.f180295g
            java.util.HashMap<java.lang.Integer, java.lang.Long> r15 = rs1.C63580na.f180295g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            java.lang.Object r4 = r15.remove(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x009b
            r17 = r8
            r7 = 0
            goto L_0x00a2
        L_0x009b:
            long r15 = r4.longValue()
            r17 = r8
            r7 = r15
        L_0x00a2:
            r1.f145383u = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            r7.append(r3)
            java.lang.String r8 = " partialExposedObjectId="
            r7.append(r8)
            long r13 = r1.f145383u
            r7.append(r13)
            r7.append(r11)
            int r8 = r18.hashCode()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            goto L_0x00cd
        L_0x00cb:
            r17 = r8
        L_0x00cd:
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r7 = r7.mo62446e(r6)
            java.lang.Class<os1.d> r8 = os1.C62153d.class
            androidx.lifecycle.i0 r7 = r7.mo75002a(r8)
            os1.d r7 = (os1.C62153d) r7
            rx3.l r7 = r7.mo9104X0()
            A r8 = r7.f38555d
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            r1.f145373h = r8
            B r7 = r7.f38556e
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            r1.f145374i = r7
            je1.h2 r7 = je1.C46523h2.f125330a
            r8 = 3901(0xf3d, float:5.466E-42)
            te3.ig0 r5 = r7.mo71860b(r8, r5)
            r1.f145372g = r5
            java.lang.Class<h81.i> r5 = h81.C59774i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.i r5 = (h81.C59774i) r5
            java.lang.String r5 = r5.mo84751Wb()
            if (r5 != 0) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r9 = r5
        L_0x010d:
            r1.f145375j = r9
            di3.d r5 = di3.C86312j.m106911c(r6)
            com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r5 = r5.Nt0()
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r5 = r5.mo77284x(r3)
            long r13 = r5.object_id
            r15 = 0
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x0155
            r1.f145380r = r13
            java.lang.String r5 = r5.object_nonce_id
            r1.f145381s = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            r5.append(r3)
            java.lang.String r6 = " request with showInfo. objectId="
            r5.append(r6)
            long r9 = r1.f145380r
            java.lang.String r6 = o40.C61926c.m72691p(r9)
            r5.append(r6)
            r5.append(r11)
            int r6 = r18.hashCode()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
        L_0x0155:
            te3.hh0 r5 = r7.mo71867j()
            cm1.e1 r6 = cm1.C55012e1.f154468d
            java.util.LinkedList r6 = r6.mo76063g(r3)
            r1.f145377o = r6
            r1.f145376n = r5
            er1.j4 r5 = er1.C58739j4.f168176a
            r4 = 3
            r6 = 0
            te3.xw0 r4 = er1.C58739j4.m68251e(r5, r6, r6, r4, r6)
            r1.f145355A = r4
            dp1.c0$a r4 = dp1.C7422c0.f25598H
            java.util.LinkedList r4 = r4.mo8560a(r3)
            if (r4 == 0) goto L_0x0177
            r1.f145382t = r4
        L_0x0177:
            r4 = r17
            r4.f127066a = r1
            te3.zl1 r5 = new te3.zl1
            r5.<init>()
            te3.ja r6 = new te3.ja
            r6.<init>()
            r5.setBaseResponse(r6)
            te3.ja r6 = r5.getBaseResponse()
            te3.rv3 r7 = new te3.rv3
            r7.<init>()
            r6.f135956e = r7
            r4.f127067b = r5
            java.lang.String r5 = "/cgi-bin/micromsg-bin/finderstream"
            r4.f127068c = r5
            r4.f127069d = r8
            ob0.c r4 = r4.mo72403a()
            r0.mo123453j(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "lxl CgiFetchFinderTimeline  tabType="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " init "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = " lastBuffer "
            r4.append(r2)
            pe3.b r2 = r1.f145369d
            if (r2 != 0) goto L_0x01c2
            r15 = 1
            goto L_0x01c3
        L_0x01c2:
            r15 = 0
        L_0x01c3:
            r4.append(r15)
            java.lang.String r2 = ", "
            r4.append(r2)
            pe3.b r2 = r1.f145369d
            if (r2 != 0) goto L_0x01d6
            r2 = 49
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            goto L_0x01dc
        L_0x01d6:
            byte[] r2 = r2.f257327a
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r2)
        L_0x01dc:
            r4.append(r2)
            java.lang.String r2 = " longitude="
            r4.append(r2)
            float r2 = r1.f145373h
            r4.append(r2)
            java.lang.String r2 = " latitude="
            r4.append(r2)
            float r1 = r1.f145374i
            r4.append(r1)
            r4.append(r11)
            int r1 = r18.hashCode()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9360p1.<init>(je1.p1$a, int, int, je1.p1$b, pe3.b, boolean, te3.hj1):void");
    }

    /* renamed from: q */
    public boolean mo10087q() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02b8, code lost:
        if ((!r7.isEmpty()) == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02c6, code lost:
        if ((r7.isEmpty() ^ r2) != false) goto L_0x02c8;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo332r(int r22, int r23, java.lang.String r24, te3.C49335eu3 r25, ob0.C117747y r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            te3.zl1 r4 = (te3.C52280zl1) r4
            java.lang.String r5 = "resp"
            gy3.C87412m.m108594g(r4, r5)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[onCgiBack] tabType="
            r7.append(r8)
            int r9 = r0.f29234u
            r7.append(r9)
            java.lang.String r9 = " pullType="
            r7.append(r9)
            int r10 = r0.f29233t
            r7.append(r10)
            java.lang.String r10 = " errType="
            r7.append(r10)
            r7.append(r1)
            java.lang.String r10 = " errCode="
            r7.append(r10)
            r7.append(r2)
            java.lang.String r10 = " errMsg="
            r7.append(r10)
            r7.append(r3)
            java.lang.String r10 = " h:"
            r7.append(r10)
            int r11 = r21.hashCode()
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            java.lang.String r11 = "Finder.CgiFinderTimelineStream"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            je1.p1$b r7 = r0.f29235v
            r13 = 1
            if (r7 == 0) goto L_0x0068
            boolean r7 = r7.mo2804a(r1, r2, r3, r4)
            if (r7 != r13) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = 0
        L_0x0069:
            if (r7 == 0) goto L_0x0085
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "has consume. h:"
            r1.append(r2)
            int r2 = r21.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r1)
            goto L_0x039b
        L_0x0085:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r4.f146069d
            gy3.C87412m.m108591d(r7)
            if (r1 != 0) goto L_0x02f8
            if (r2 != 0) goto L_0x02f8
            int r12 = r0.f29233t
            java.lang.String r13 = "tabType="
            if (r12 != 0) goto L_0x013c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r13)
            int r14 = r0.f29234u
            r12.append(r14)
            java.lang.String r14 = " history_head_wording="
            r12.append(r14)
            java.lang.String r14 = r4.f146071f
            r12.append(r14)
            java.lang.String r14 = " history_end_wording="
            r12.append(r14)
            java.lang.String r14 = r4.f146072g
            r12.append(r14)
            java.lang.String r14 = "  prefetch_last_feed_count="
            r12.append(r14)
            int r14 = r4.f146076n
            r12.append(r14)
            r12.append(r10)
            int r14 = r21.hashCode()
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            java.lang.String r12 = r4.f146071f
            if (r12 == 0) goto L_0x00de
            int r12 = r12.length()
            if (r12 != 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r12 = 0
            goto L_0x00df
        L_0x00de:
            r12 = 1
        L_0x00df:
            if (r12 == 0) goto L_0x00ee
            android.content.res.Resources r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r14 = 2131830022(0x7f112506, float:1.929303E38)
            java.lang.String r12 = r12.getString(r14)
            r4.f146071f = r12
        L_0x00ee:
            java.lang.String r12 = r4.f146072g
            if (r12 == 0) goto L_0x00fb
            int r12 = r12.length()
            if (r12 != 0) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            r12 = 0
            goto L_0x00fc
        L_0x00fb:
            r12 = 1
        L_0x00fc:
            if (r12 == 0) goto L_0x010b
            android.content.res.Resources r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r14 = 2131830021(0x7f112505, float:1.9293028E38)
            java.lang.String r12 = r12.getString(r14)
            r4.f146072g = r12
        L_0x010b:
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC
            java.lang.String r15 = r4.f146071f
            r12.mo119677K(r14, r15)
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC
            java.lang.String r15 = r4.f146072g
            r12.mo119677K(r14, r15)
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC
            int r15 = r4.f146076n
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r12.mo119677K(r14, r15)
        L_0x013c:
            int r12 = r4.f146074i
            if (r12 == 0) goto L_0x0142
            r12 = 1
            goto L_0x0143
        L_0x0142:
            r12 = 0
        L_0x0143:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r7.iterator()
        L_0x014c:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0174
            r16 = r5
            java.lang.Object r5 = r15.next()
            r6 = r5
            com.tencent.mm.protocal.protobuf.FinderObject r6 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r6
            r18 = r15
            er1.w3 r15 = er1.C58784w3.f168295a
            java.lang.String r1 = "it"
            gy3.C87412m.m108593f(r6, r1)
            boolean r1 = r15.mo83866E0(r6)
            if (r1 == 0) goto L_0x016d
            r14.add(r5)
        L_0x016d:
            r1 = r22
            r5 = r16
            r15 = r18
            goto L_0x014c
        L_0x0174:
            r16 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            int r5 = r0.f29234u
            r1.append(r5)
            java.lang.String r5 = ", tabTipsObjectId="
            r1.append(r5)
            te3.yl1 r5 = r0.f29237x
            long r5 = r5.f145380r
            r1.append(r5)
            java.lang.String r5 = " firstObjectId="
            r1.append(r5)
            java.lang.Object r5 = sx3.C110818d0.m150916N(r14)
            com.tencent.mm.protocal.protobuf.FinderObject r5 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r5
            if (r5 == 0) goto L_0x019f
            long r5 = r5.f164794id
            goto L_0x01a1
        L_0x019f:
            r5 = 0
        L_0x01a1:
            java.lang.String r5 = o40.C61926c.m72691p(r5)
            r1.append(r5)
            r5 = 32
            r1.append(r5)
            je1.g2 r5 = je1.C9311g2.f29093a
            java.lang.String r5 = r5.mo10062a(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            int r1 = r4.f146075j
            if (r1 == 0) goto L_0x01c3
            r1 = 1
            goto L_0x01c4
        L_0x01c3:
            r1 = 0
        L_0x01c4:
            int r5 = r0.f29233t
            r6 = 128(0x80, float:1.794E-43)
            r13 = 3
            r15 = 4
            if (r5 == r13) goto L_0x01e0
            if (r5 == r15) goto L_0x01e0
            wp1.f$a r5 = wp1.C15585f.f42211a
            er1.w3 r15 = er1.C58784w3.f168295a
            int r13 = r0.f29234u
            int r13 = r15.mo83887M1(r13)
            te3.hj1 r15 = r0.f172731j
            java.util.List r5 = r5.mo14343f(r14, r13, r15)
            r13 = 0
            goto L_0x01e7
        L_0x01e0:
            wp1.f$a r5 = wp1.C15585f.f42211a
            r13 = 0
            java.util.List r5 = r5.mo14343f(r14, r6, r13)
        L_0x01e7:
            int r15 = r0.f29233t
            java.lang.String r13 = ""
            r6 = 3
            if (r15 == r6) goto L_0x022b
            r6 = 4
            if (r15 == r6) goto L_0x022b
            r6 = 2
            if (r15 == r6) goto L_0x025b
            wp1.f$a r6 = wp1.C15585f.f42211a
            java.util.ArrayList r15 = new java.util.ArrayList
            r2 = 10
            int r3 = sx3.C36907w.m41090l(r5, r2)
            r15.<init>(r3)
            java.util.Iterator r2 = r5.iterator()
        L_0x0205:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x021f
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r3
            r19 = r2
            wp1.f$a r2 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r2.mo14348k(r3)
            r15.add(r2)
            r2 = r19
            goto L_0x0205
        L_0x021f:
            er1.w3 r2 = er1.C58784w3.f168295a
            int r3 = r0.f29234u
            int r2 = r2.mo83887M1(r3)
            r6.mo14346i(r15, r2, r13, r12)
            goto L_0x025b
        L_0x022b:
            wp1.f$a r2 = wp1.C15585f.f42211a
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r15 = sx3.C36907w.m41090l(r5, r6)
            r3.<init>(r15)
            java.util.Iterator r6 = r5.iterator()
        L_0x023c:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L_0x0256
            java.lang.Object r15 = r6.next()
            com.tencent.mm.plugin.finder.storage.FinderItem r15 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r15
            r20 = r6
            wp1.f$a r6 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r6.mo14348k(r15)
            r3.add(r6)
            r6 = r20
            goto L_0x023c
        L_0x0256:
            r6 = 128(0x80, float:1.794E-43)
            r2.mo14346i(r3, r6, r13, r12)
        L_0x025b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            int r3 = r0.f29234u
            r2.append(r3)
            java.lang.String r3 = " list "
            r2.append(r3)
            int r3 = r5.size()
            r2.append(r3)
            r2.append(r9)
            int r3 = r0.f29233t
            r2.append(r3)
            java.lang.String r3 = " lastBuffer="
            r2.append(r3)
            pe3.b r3 = r4.f146070e
            r2.append(r3)
            java.lang.String r3 = " isNeedClear="
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = " isFetchHistoryNow="
            r2.append(r3)
            r2.append(r1)
            r2.append(r10)
            int r1 = r21.hashCode()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            boolean r1 = r0.f29236w
            if (r1 == 0) goto L_0x02e9
            int r1 = r0.f29233t
            r2 = 3
            if (r1 != r2) goto L_0x02c8
            if (r1 != r2) goto L_0x02bb
            boolean r1 = r7.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x02c8
            goto L_0x02bc
        L_0x02bb:
            r2 = 1
        L_0x02bc:
            int r1 = r0.f29233t
            r3 = 4
            if (r1 != r3) goto L_0x02e9
            boolean r1 = r7.isEmpty()
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x02e9
        L_0x02c8:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            er1.w3 r2 = er1.C58784w3.f168295a
            int r3 = r0.f29234u
            com.tencent.mm.storage.y1$a r2 = r2.mo83914a0(r3)
            pe3.b r3 = r4.f146070e
            if (r3 != 0) goto L_0x02de
            r3 = 0
            goto L_0x02e6
        L_0x02de:
            byte[] r3 = r3.mo123703f()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r3)
        L_0x02e6:
            r1.mo119677K(r2, r3)
        L_0x02e9:
            int r1 = r0.f29233t
            r2 = 1
            if (r1 == 0) goto L_0x02f0
            if (r1 != r2) goto L_0x02fc
        L_0x02f0:
            cm1.e1 r1 = cm1.C55012e1.f154468d
            int r3 = r0.f29234u
            r1.mo76065i(r3, r14)
            goto L_0x02fc
        L_0x02f8:
            r16 = r5
            r2 = 1
            r5 = 0
        L_0x02fc:
            if (r5 == 0) goto L_0x0323
            java.util.ArrayList r15 = new java.util.ArrayList
            r1 = 10
            int r1 = sx3.C36907w.m41090l(r5, r1)
            r15.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
        L_0x030d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0324
            java.lang.Object r3 = r1.next()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r3
            wp1.f$a r5 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r5.mo14348k(r3)
            r15.add(r3)
            goto L_0x030d
        L_0x0323:
            r15 = 0
        L_0x0324:
            com.tencent.mm.plugin.finder.feed.model.d r1 = new com.tencent.mm.plugin.finder.feed.model.d
            r3 = r22
            r5 = r23
            r6 = r24
            r1.<init>(r15, r3, r5, r6)
            int r3 = r4.f146073h
            r1.f13970g = r3
            int r3 = r4.f146074i
            if (r3 == 0) goto L_0x0339
            r3 = 1
            goto L_0x033a
        L_0x0339:
            r3 = 0
        L_0x033a:
            r1.f13972i = r3
            int r3 = r4.f146075j
            if (r3 == 0) goto L_0x0342
            r12 = 1
            goto L_0x0343
        L_0x0342:
            r12 = 0
        L_0x0343:
            r1.f13973j = r12
            r1.f13969f = r7
            te3.yg0 r2 = r4.f146082t
            r1.f13976m = r2
            pe3.b r2 = r4.f146070e
            r1.f13977n = r2
            int r2 = r0.f29233t
            je1.p1$a r3 = r0.f29232s
            r3.mo2805a(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            int r3 = r0.f29234u
            r2.append(r3)
            java.lang.String r3 = " Cost="
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r16
            r2.append(r3)
            java.lang.String r3 = "ms, lxl lastBuffer:"
            r2.append(r3)
            pe3.b r1 = r1.f13977n
            if (r1 != 0) goto L_0x0381
            r1 = 49
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            goto L_0x0387
        L_0x0381:
            byte[] r1 = r1.f257327a
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r1)
        L_0x0387:
            r2.append(r1)
            r2.append(r10)
            int r1 = r21.hashCode()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
        L_0x039b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9360p1.mo332r(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }
}
