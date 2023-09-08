package fn1;

import gy3.C87412m;
import it1.C60625c;
import java.util.List;
import ln1.C21445b;
import nr3.C89059e;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49208e00;
import te3.C49548ge1;
import te3.C64414h71;

/* renamed from: fn1.a */
public final class C8166a extends C60625c<C49548ge1> {

    /* renamed from: s */
    public final C8167a f27046s;

    /* renamed from: fn1.a$a */
    public static final class C8167a {

        /* renamed from: a */
        public final int f27047a;

        /* renamed from: b */
        public final int f27048b;

        /* renamed from: c */
        public C89349b f27049c;

        /* renamed from: d */
        public final int f27050d;

        /* renamed from: e */
        public final List<C49208e00> f27051e;

        /* renamed from: f */
        public final int f27052f;

        /* renamed from: g */
        public final long f27053g;

        /* renamed from: h */
        public final C64414h71 f27054h;

        public C8167a(int i, int i2, C89349b bVar, int i3, List<? extends C49208e00> list, int i4, long j, C64414h71 h712) {
            C87412m.m108594g(list, "containerContextList");
            this.f27047a = i;
            this.f27048b = i2;
            this.f27049c = bVar;
            this.f27050d = i3;
            this.f27051e = list;
            this.f27052f = i4;
            this.f27053g = j;
            this.f27054h = h712;
        }

        public String toString() {
            return "LiveEntranceRequest(pullType=" + this.f27047a + ", containerId=" + this.f27048b + ", lastBuffer=" + this.f27049c + ", fromScene=" + this.f27050d + ", containerContextList.size=" + this.f27051e.size() + ", commentScene=" + this.f27052f + ", relatedObjectId=" + this.f27053g + ')';
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8166a(fn1.C8166a.C8167a r11, te3.C49712hj1 r12, jp3.C9487b r13, int r14, gy3.C8480h r15) {
        /*
            r10 = this;
            r15 = r14 & 2
            r0 = 0
            if (r15 == 0) goto L_0x0006
            r12 = r0
        L_0x0006:
            r14 = r14 & 4
            if (r14 == 0) goto L_0x000b
            r13 = r0
        L_0x000b:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r14 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r15 = "userRequest"
            gy3.C87412m.m108594g(r11, r15)
            r10.<init>(r12, r13)
            r10.f27046s = r11
            ob0.c$b r12 = new ob0.c$b
            r12.<init>()
            te3.fe1 r13 = new te3.fe1
            r13.<init>()
            je1.h2 r15 = je1.C46523h2.f125330a
            r1 = 7312(0x1c90, float:1.0246E-41)
            te3.ig0 r2 = r15.mo71859a(r1)
            int r3 = r11.f27052f
            r2.f135313e = r3
            r13.f133444d = r2
            pe3.b r2 = r11.f27049c
            r13.f133445e = r2
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r14)
            java.lang.Class<os1.d> r3 = os1.C62153d.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            os1.d r2 = (os1.C62153d) r2
            rx3.l r2 = r2.mo9104X0()
            A r3 = r2.f38555d
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r13.f133446f = r3
            B r2 = r2.f38556e
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r13.f133447g = r2
            te3.hh0 r15 = r15.mo71867j()
            r13.f133448h = r15
            int r15 = r11.f27047a
            r13.f133450j = r15
            java.lang.String r15 = ""
            r13.f133458u = r15
            er1.j4 r15 = er1.C58739j4.f168176a
            te3.kw0 r2 = r15.mo83698a()
            r13.f133459v = r2
            int r2 = r11.f27052f
            r3 = 9500001(0x90f561, float:1.3312337E-38)
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x008b
            r3 = 9500002(0x90f562, float:1.3312338E-38)
            if (r2 == r3) goto L_0x008b
            r3 = 9500004(0x90f564, float:1.3312341E-38)
            if (r2 == r3) goto L_0x008b
            r3 = 9500003(0x90f563, float:1.331234E-38)
            if (r2 != r3) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r2 = 0
            goto L_0x008c
        L_0x008b:
            r2 = 1
        L_0x008c:
            r3 = 3
            java.lang.String r6 = "Finder.CgiFinderNavLiveStream"
            if (r2 == 0) goto L_0x0098
            java.lang.String r14 = "buildRedDotRequest return for in operation game."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r14)
            goto L_0x0137
        L_0x0098:
            int r2 = r11.f27047a
            if (r2 == r5) goto L_0x00b4
            if (r2 == 0) goto L_0x00b4
            if (r2 == r3) goto L_0x00b4
            r7 = 11
            if (r2 == r7) goto L_0x00b4
            r7 = 12
            if (r2 == r7) goto L_0x00b4
            r7 = 14
            if (r2 == r7) goto L_0x00b4
            r7 = 15
            if (r2 == r7) goto L_0x00b4
            r7 = 21
            if (r2 != r7) goto L_0x0137
        L_0x00b4:
            di3.d r14 = di3.C86312j.m106911c(r14)
            com.tencent.mm.plugin.FinderCommonFeatureService r14 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r14
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r14 = r14.Nt0()
            java.lang.String r2 = "NearbyLiveTab"
            te3.yi1 r14 = r14.mo77279s(r2)
            if (r14 == 0) goto L_0x00c8
            r2 = 1
            goto L_0x00c9
        L_0x00c8:
            r2 = 0
        L_0x00c9:
            te3.kr0 r7 = new te3.kr0
            r7.<init>()
            r13.f133455r = r7
            if (r14 == 0) goto L_0x00ef
            long r8 = r14.f186549g
            r7.f136997d = r8
            java.lang.String r8 = r14.f186554o
            r7.f136998e = r8
            pe3.b r14 = r14.f186553n
            r7.f136999f = r14
            vc1.b r14 = vc1.C37715b.f99914a
            boolean r14 = r14.mo61298a()
            if (r14 == 0) goto L_0x00eb
            java.lang.String r14 = "FinderLiveEntrance"
            r7.f137000g = r14
            goto L_0x00ef
        L_0x00eb:
            java.lang.String r14 = "NearbyEntrance"
            r7.f137000g = r14
        L_0x00ef:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r8 = "[buildRedDotRequest] pullType:"
            r14.append(r8)
            int r8 = r11.f27047a
            r14.append(r8)
            java.lang.String r8 = " isEnterRequest="
            r14.append(r8)
            r14.append(r2)
            java.lang.String r2 = " tab_tips_path="
            r14.append(r2)
            java.lang.String r2 = r7.f137000g
            r14.append(r2)
            java.lang.String r2 = "  tabTipsByPassInfo="
            r14.append(r2)
            pe3.b r2 = r7.f136999f
            if (r2 == 0) goto L_0x011a
            r4 = 1
        L_0x011a:
            r14.append(r4)
            java.lang.String r2 = " objectId="
            r14.append(r2)
            long r4 = r7.f136997d
            java.lang.String r2 = o40.C61926c.m72691p(r4)
            r14.append(r2)
            r2 = 32
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r14)
        L_0x0137:
            int r14 = r11.f27050d
            r13.f133454q = r14
            long r4 = r11.f27053g
            r13.f133461x = r4
            int r14 = r11.f27048b
            r13.f133460w = r14
            java.util.LinkedList<te3.e00> r14 = r13.f133462y
            java.util.List<te3.e00> r2 = r11.f27051e
            r14.addAll(r2)
            te3.xw0 r14 = er1.C58739j4.m68251e(r15, r0, r0, r3, r0)
            r13.f133449i = r14
            te3.h71 r14 = r11.f27054h
            r13.f133443A = r14
            r12.f127066a = r13
            te3.ge1 r14 = new te3.ge1
            r14.<init>()
            te3.ja r15 = new te3.ja
            r15.<init>()
            r14.setBaseResponse(r15)
            te3.ja r15 = r14.getBaseResponse()
            te3.rv3 r2 = new te3.rv3
            r2.<init>()
            r15.f135956e = r2
            r12.f127067b = r14
            java.lang.String r14 = "/cgi-bin/micromsg-bin/findernavlivestream"
            r12.f127068c = r14
            r12.f127069d = r1
            ob0.c r12 = r12.mo72403a()
            r10.mo123453j(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "[CgiFetchFinderTimeline#init] commentScene:"
            r12.append(r14)
            int r14 = r11.f27052f
            r12.append(r14)
            java.lang.String r14 = ", pullType="
            r12.append(r14)
            int r11 = r11.f27047a
            r12.append(r11)
            java.lang.String r11 = ", longitude="
            r12.append(r11)
            float r11 = r13.f133446f
            r12.append(r11)
            java.lang.String r11 = " latitude="
            r12.append(r11)
            float r11 = r13.f133447g
            r12.append(r11)
            java.lang.String r11 = " lastBuffer:"
            r12.append(r11)
            pe3.b r11 = r13.f133445e
            r12.append(r11)
            java.lang.String r11 = ",liveReportInfo: "
            r12.append(r11)
            te3.h71 r11 = r13.f133443A
            r12.append(r11)
            java.lang.String r11 = ",speed="
            r12.append(r11)
            te3.kw0 r11 = r13.f133459v
            if (r11 == 0) goto L_0x01d1
            te3.jw0 r11 = r11.f137066d
            if (r11 == 0) goto L_0x01d1
            int r11 = r11.f136359d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
        L_0x01d1:
            r12.append(r0)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fn1.C8166a.<init>(fn1.a$a, te3.hj1, jp3.b, int, gy3.h):void");
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C49548ge1>> mo9225i() {
        C21445b.f60694a.mo33621j(this.f27046s.f27047a, 10000);
        return super.mo9225i();
    }

    /* renamed from: n */
    public String getKey() {
        int i = this.f27046s.f27047a;
        if (i == 3) {
            i = 1;
        }
        return super.getKey() + '+' + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0032, code lost:
        r8 = (r8 = r8.getReqResp()).getRespObj();
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo332r(int r4, int r5, java.lang.String r6, te3.C49335eu3 r7, ob0.C117747y r8) {
        /*
            r3 = this;
            te3.ge1 r7 = (te3.C49548ge1) r7
            java.lang.String r6 = "resp"
            gy3.C87412m.m108594g(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "onCgiEnd: errType"
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = ", errCode="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "Finder.CgiFinderNavLiveStream"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            ln1.b r6 = ln1.C21445b.f60694a
            pe3.b r0 = r7.f133997g
            r1 = 0
            if (r8 == 0) goto L_0x003d
            com.tencent.mm.network.u r8 = r8.getReqResp()
            if (r8 == 0) goto L_0x003d
            qe3.w$e r8 = r8.getRespObj()
            if (r8 == 0) goto L_0x003d
            te3.iq r8 = r8.getProfile()
            goto L_0x003e
        L_0x003d:
            r8 = r1
        L_0x003e:
            r2 = 10000(0x2710, float:1.4013E-41)
            r6.mo33616e(r2, r0, r8)
            if (r4 != 0) goto L_0x00a0
            if (r5 != 0) goto L_0x00a0
            java.util.LinkedList<te3.a91> r4 = r7.f133994d
            if (r4 == 0) goto L_0x00a0
            java.util.Iterator r4 = r4.iterator()
        L_0x004f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a0
            java.lang.Object r5 = r4.next()
            te3.a91 r5 = (te3.C48682a91) r5
            java.util.LinkedList<te3.z81> r5 = r5.f130381h
            if (r5 == 0) goto L_0x004f
            java.util.Iterator r5 = r5.iterator()
        L_0x0063:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r5.next()
            te3.z81 r6 = (te3.C52231z81) r6
            te3.d91 r6 = r6.f145758h
            if (r6 == 0) goto L_0x0063
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r6.f132197e
            if (r7 == 0) goto L_0x0063
            java.lang.String r7 = r7.username
            if (r7 == 0) goto L_0x0063
            int r8 = r7.length()
            if (r8 <= 0) goto L_0x0083
            r8 = 1
            goto L_0x0084
        L_0x0083:
            r8 = 0
        L_0x0084:
            if (r8 == 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r7 = r1
        L_0x0088:
            if (r7 == 0) goto L_0x0063
            te3.d51 r6 = r6.f132196d
            if (r6 == 0) goto L_0x0063
            java.lang.Class<tf0.q1> r8 = tf0.C13887q1.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            tf0.q1 r8 = (tf0.C13887q1) r8
            java.lang.String r0 = r6.f132122h
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = ""
        L_0x009c:
            r8.mo13325QY(r7, r0, r6)
            goto L_0x0063
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fn1.C8166a.mo332r(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }
}
