package je1;

import bl3.C39818r;
import bo1.C0344g;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58417y0;
import er1.C58739j4;
import f40.C86709a0;
import gr1.C59686x0;
import gy3.C8480h;
import gy3.C87412m;
import it1.C9251d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jp3.C9487b;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import os1.C62153d;
import p156gj.C87200o;
import p682rz.C36594q;
import pe3.C47465a;
import pe3.C89349b;
import qe3.C89625d;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49203dy1;
import te3.C49335eu3;
import te3.C49704hh0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50045jw0;
import te3.C50159kp0;
import te3.C50185kw0;
import te3.C50294lp0;
import te3.C51796w72;
import te3.C51935x72;
import te3.C51969xg0;
import te3.C51974xh1;
import te3.C52079y72;
import te3.db4;
import te3.vd4;
import tf0.C64916p1;

/* renamed from: je1.c0 */
public final class C46511c0 extends C9251d<C50294lp0> {

    /* renamed from: s */
    public final long f125303s;

    /* renamed from: t */
    public final int f125304t;

    /* renamed from: u */
    public String f125305u;

    /* renamed from: v */
    public int f125306v;

    /* renamed from: w */
    public final String f125307w;

    /* renamed from: x */
    public int f125308x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46511c0(long r20, java.lang.String r22, int r23, pe3.C89349b r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, pe3.C89349b r30, te3.C49712hj1 r31, float r32, float r33, int r34, int r35, java.lang.Integer r36, int r37, gy3.C8480h r38) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r26
            r7 = r31
            r8 = r37
            r9 = r8 & 16
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x0018
            r9 = r10
            goto L_0x001a
        L_0x0018:
            r9 = r25
        L_0x001a:
            r11 = r8 & 64
            if (r11 == 0) goto L_0x0020
            r11 = r10
            goto L_0x0022
        L_0x0020:
            r11 = r27
        L_0x0022:
            r12 = r8 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0028
            r12 = r10
            goto L_0x002a
        L_0x0028:
            r12 = r28
        L_0x002a:
            r13 = r8 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r10 = r29
        L_0x0031:
            r13 = r8 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0037
            r13 = 0
            goto L_0x0039
        L_0x0037:
            r13 = r30
        L_0x0039:
            r15 = r8 & 2048(0x800, float:2.87E-42)
            r16 = 0
            if (r15 == 0) goto L_0x0041
            r15 = 0
            goto L_0x0043
        L_0x0041:
            r15 = r32
        L_0x0043:
            r14 = r8 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0049
            r14 = 0
            goto L_0x004b
        L_0x0049:
            r14 = r33
        L_0x004b:
            r27 = r13
            r13 = r8 & 8192(0x2000, float:1.14794E-41)
            r17 = 0
            if (r13 == 0) goto L_0x0055
            r13 = 0
            goto L_0x0057
        L_0x0055:
            r13 = r34
        L_0x0057:
            r28 = r13
            r13 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x005f
            r13 = 0
            goto L_0x0061
        L_0x005f:
            r13 = r35
        L_0x0061:
            r18 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 & r18
            if (r8 == 0) goto L_0x006b
            r29 = 0
            goto L_0x006d
        L_0x006b:
            r29 = r36
        L_0x006d:
            java.lang.String r8 = "nonceId"
            gy3.C87412m.m108594g(r3, r8)
            r8 = 2
            r18 = r13
            r13 = 0
            r0.<init>(r7, r13, r8, r13)
            java.lang.String r8 = "Finder.CgiFinderGetFeedRelList"
            r0.f125307w = r8
            r0.f125303s = r1
            r0.f125304t = r4
            r0.f125305u = r9
            r0.f125306v = r6
            ob0.c$b r13 = new ob0.c$b
            r13.<init>()
            r30 = r8
            r8 = 3688(0xe68, float:5.168E-42)
            r13.f127069d = r8
            te3.kp0 r8 = new te3.kp0
            r8.<init>()
            r8.f136937f = r1
            r8.f136941j = r3
            r8.f136938g = r4
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r1 = r1.mo62446e(r2)
            java.lang.Class<os1.d> r2 = os1.C62153d.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            os1.d r1 = (os1.C62153d) r1
            rx3.l r1 = r1.mo9104X0()
            A r2 = r1.f38555d
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r8.f136939h = r2
            B r1 = r1.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r8.f136940i = r1
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x00c9
            r2 = 1
            goto L_0x00ca
        L_0x00c9:
            r2 = 0
        L_0x00ca:
            if (r2 != 0) goto L_0x00ce
            r8.f136939h = r14
        L_0x00ce:
            int r2 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x00d4
            r2 = 1
            goto L_0x00d5
        L_0x00d4:
            r2 = 0
        L_0x00d5:
            if (r2 != 0) goto L_0x00d9
            r8.f136940i = r15
        L_0x00d9:
            r8.f136936e = r5
            je1.h2 r2 = je1.C46523h2.f125330a
            r14 = 3688(0xe68, float:5.168E-42)
            te3.ig0 r14 = r2.mo71860b(r14, r7)
            r8.f136935d = r14
            te3.xg0 r14 = new te3.xg0
            r14.<init>()
            r14.f144637d = r9
            r8.f136946r = r14
            r8.f136949u = r11
            r8.f136950v = r12
            r8.f136943o = r6
            r14 = 0
            r8.f136951w = r14
            r8.f136952x = r10
            r14 = r27
            r8.f136953y = r14
            r15 = r28
            r8.f136930F = r15
            r15 = r18
            r8.f136934J = r15
            if (r29 == 0) goto L_0x010d
            int r1 = r29.intValue()
            r0.f125308x = r1
        L_0x010d:
            int r1 = r0.f125308x
            r8.f136932H = r1
            r0.mo71858u(r8)
            te3.ig0 r1 = r8.f136935d
            r16 = r14
            rx3.l r14 = new rx3.l
            r18 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r26)
            java.lang.Long r6 = java.lang.Long.valueOf(r20)
            r14.<init>(r10, r6)
            java.util.List r6 = sx3.C26236u.m33719b(r14)
            r10 = 0
            r2.mo71865g(r1, r6, r10)
            r13.f127066a = r8
            te3.lp0 r1 = new te3.lp0
            r1.<init>()
            r13.f127067b = r1
            java.lang.String r1 = "/cgi-bin/micromsg-bin/findergetrelatedlist"
            r13.f127068c = r1
            ob0.c r1 = r13.mo72403a()
            r0.mo123453j(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[init] fromUserName="
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ",toUserName="
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = " feedId="
            r1.append(r2)
            java.lang.String r2 = o40.C61926c.m72691p(r20)
            r1.append(r2)
            java.lang.String r2 = " tabType="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " commentScene="
            r1.append(r2)
            if (r7 == 0) goto L_0x0176
            int r2 = r7.f134675i
            goto L_0x0177
        L_0x0176:
            r2 = 0
        L_0x0177:
            r1.append(r2)
            java.lang.String r2 = " category="
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = " nonceId="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " prefetchType="
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " lastBuffer="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " scene="
            r1.append(r2)
            r2 = r26
            r1.append(r2)
            java.lang.String r2 = " sessionId="
            r1.append(r2)
            r2 = r18
            r1.append(r2)
            java.lang.String r2 = " sessionBuffer="
            r1.append(r2)
            if (r16 == 0) goto L_0x01b7
            r2 = 1
            goto L_0x01b8
        L_0x01b7:
            r2 = 0
        L_0x01b8:
            r1.append(r2)
            java.lang.String r2 = ",speed="
            r1.append(r2)
            te3.kw0 r2 = r8.f136929E
            if (r2 == 0) goto L_0x01cf
            te3.jw0 r2 = r2.f137066d
            if (r2 == 0) goto L_0x01cf
            int r2 = r2.f136359d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            goto L_0x01d0
        L_0x01cf:
            r14 = r10
        L_0x01d0:
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r2 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46511c0.<init>(long, java.lang.String, int, pe3.b, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, pe3.b, te3.hj1, float, float, int, int, java.lang.Integer, int, gy3.h):void");
    }

    /* renamed from: n */
    public String getKey() {
        return "3688+" + C61926c.m72691p(this.f125303s) + '+' + this.f125308x + '+' + this.f125306v;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C13598b0 b0Var;
        C50294lp0 lp02 = (C50294lp0) eu32;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_MP_PREFETCH_TYPE_INT_SYNC;
        C87412m.m108594g(lp02, "resp");
        super.mo332r(i, i2, str, lp02, yVar);
        C20480e0 e0Var = C20480e0.f57583a;
        e0Var.mo32039l(this.f125304t, false);
        e0Var.mo32034g(this.f125304t, false);
        Log.m105924i(this.f125307w, "errType " + i + ", errCode " + i2 + ", errMsg " + str);
        if (i == 0 && i2 == 0) {
            Log.m105924i(this.f125307w, "feedId " + this.f125303s + " tabType=" + this.f125304t + ", " + C9311g2.f29093a.mo10062a(lp02.f137560d));
            C0344g gVar = C0344g.f929a;
            C51974xh1 xh12 = lp02.f137564h;
            LinkedList<FinderObject> linkedList = lp02.f137560d;
            C87412m.m108593f(linkedList, "resp.`object`");
            gVar.mo386b(xh12, linkedList, 3688);
            e0Var.mo32028a(this.f125304t, lp02.f137560d.size());
            LinkedList<FinderObject> linkedList2 = lp02.f137560d;
            C87412m.m108593f(linkedList2, "resp.`object`");
            for (FinderObject finderObject : linkedList2) {
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83329dv(finderObject, this.f172731j);
            }
            C52079y72 y722 = lp02.f137573t;
            if (y722 != null) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_MP_PREFETCH_INTERVAL_SEC_INT_SYNC, Integer.valueOf(y722.f145154d));
                C51935x72 x722 = y722.f145155e;
                Integer num = null;
                if (x722 != null) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(x722.f144505e));
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                }
                if (y722.f145156f >= 0) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SHARE_PREFETCH_LAST_FEED_OUNT_INT_SYNC, Integer.valueOf(y722.f145156f));
                }
                String str2 = this.f125307w;
                StringBuilder sb = new StringBuilder();
                sb.append("onCgiEnd: save prefetch config, prefetch_last_feed_count=");
                sb.append(y722.f145156f);
                sb.append(", mp_prefetch_valid_time=");
                sb.append(y722.f145154d);
                sb.append(", prefetch_type=");
                C51935x72 x723 = y722.f145155e;
                if (x723 != null) {
                    num = Integer.valueOf(x723.f144505e);
                }
                sb.append(num);
                Log.m105924i(str2, sb.toString());
            }
        }
    }

    /* renamed from: s */
    public List mo10027s(C49335eu3 eu32) {
        C50294lp0 lp02 = (C50294lp0) eu32;
        C87412m.m108594g(lp02, "resp");
        LinkedList<FinderObject> linkedList = lp02.f137560d;
        C87412m.m108593f(linkedList, "resp.`object`");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject finderObject : linkedList) {
            FinderItem.C56324a aVar = FinderItem.Companion;
            C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
            arrayList.add(aVar.mo79056a(finderObject, 0));
        }
        return arrayList;
    }

    /* renamed from: t */
    public long mo10028t() {
        C47465a aVar = this.f256789f.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListReq");
        C49842ig0 ig02 = ((C50159kp0) aVar).f136935d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    /* renamed from: u */
    public final void mo71858u(C50159kp0 kp02) {
        C49704hh0 hh02 = new C49704hh0();
        hh02.f134640j = C89625d.f257839e;
        hh02.f134641n = C87200o.f252873f;
        hh02.f134639i = C89625d.f257836b;
        hh02.f134638h = C89625d.f257837c;
        hh02.f134635e = NetStatusUtil.getNetTypeString(MMApplicationContext.getContext());
        hh02.f134634d = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83336jw();
        hh02.f134636f = CdnLogic.getRecentAverageSpeed(2);
        hh02.f134637g.addAll(((C64916p1) C86312j.m106911c(C64916p1.class)).Z20());
        hh02.f134642o.add("h264");
        if (((C36594q) C86312j.m106911c(C36594q.class)).mo60733UY(4)) {
            hh02.f134642o.add("h265");
        }
        if (C59686x0.f170506a) {
            hh02.f134642o.add("h266");
        }
        kp02.f136948t = hh02;
        kp02.f136929E = C58739j4.f168176a.mo83698a();
        C20480e0.f57583a.mo32039l(this.f125304t, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46511c0(db4 db4, C49712hj1 hj12, C50159kp0 kp02) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C50045jw0 jw02;
        C49712hj1 hj13 = hj12;
        C50159kp0 kp03 = kp02;
        C87412m.m108594g(kp03, "request");
        this.f125307w = "Finder.CgiFinderGetFeedRelList";
        long j = kp03.f136937f;
        this.f125303s = j;
        String str = kp03.f136941j;
        int i = kp03.f136938g;
        this.f125304t = i;
        C51969xg0 xg02 = kp03.f136946r;
        this.f125305u = xg02 != null ? xg02.f144637d : null;
        this.f125306v = kp03.f136943o;
        String str2 = kp03.f136949u;
        String str3 = kp03.f136950v;
        String str4 = kp03.f136952x;
        C89349b bVar = kp03.f136953y;
        C50159kp0 kp04 = new C50159kp0();
        kp04.f136936e = kp03.f136936e;
        kp04.f136937f = kp03.f136937f;
        kp04.f136938g = kp03.f136938g;
        kp04.f136941j = kp03.f136941j;
        kp04.f136942n = kp03.f136942n;
        kp04.f136943o = kp03.f136943o;
        kp04.f136944p = kp03.f136944p;
        kp04.f136945q = kp03.f136945q;
        kp04.f136946r = kp03.f136946r;
        kp04.f136947s = kp03.f136947s;
        kp04.f136949u = kp03.f136949u;
        kp04.f136950v = kp03.f136950v;
        kp04.f136951w = kp03.f136951w;
        kp04.f136952x = kp03.f136952x;
        kp04.f136953y = kp03.f136953y;
        kp04.f136954z = kp03.f136954z;
        kp04.f136925A = kp03.f136925A;
        kp04.f136926B = kp03.f136926B;
        kp04.f136927C = kp03.f136927C;
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        kp04.f136939h = ((Number) X0.f38555d).floatValue();
        C46523h2 h2Var = C46523h2.f125330a;
        String str5 = "Finder.CgiFinderGetFeedRelList";
        kp04.f136935d = h2Var.mo71860b(3688, hj13);
        C89349b bVar2 = bVar;
        Integer num = null;
        h2Var.mo71865g(kp03.f136935d, C26236u.m33719b(new C13604l(Integer.valueOf(this.f125306v), Long.valueOf(j))), (C49712hj1) null);
        kp04.f136940i = ((Number) X0.f38556e).floatValue();
        kp04.f136926B.add(db4);
        mo71858u(kp04);
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127069d = 3688;
        bVar3.f127066a = kp04;
        bVar3.f127067b = new C50294lp0();
        bVar3.f127068c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        mo123453j(bVar3.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("[init1] fromUserName=");
        sb.append(str2);
        sb.append(",toUserName=");
        sb.append(str3);
        sb.append(" feedId=");
        sb.append(C61926c.m72691p(j));
        sb.append(" tabType=");
        sb.append(i);
        sb.append(" commentScene=");
        boolean z = false;
        sb.append(hj13 != null ? hj13.f134675i : 0);
        sb.append(" category=");
        sb.append(this.f125305u);
        sb.append(" nonceId=");
        sb.append(str);
        sb.append(" lastBuffer=");
        sb.append(kp04.f136936e);
        sb.append(" scene=");
        sb.append(this.f125306v);
        sb.append(" sessionId=");
        sb.append(str4);
        sb.append(" sessionBuffer=");
        sb.append(bVar2 != null ? true : z);
        sb.append(" get_column_feed_info=");
        C49203dy1 dy12 = kp04.f136925A;
        long j2 = 0;
        sb.append(C61926c.m72691p(dy12 != null ? dy12.f132565d : 0));
        sb.append(", switch_column_info=");
        vd4 vd4 = kp04.f136954z;
        sb.append(C61926c.m72691p(vd4 != null ? vd4.f143446d : 0));
        sb.append(" get_related_column_topic_info=");
        C51796w72 w722 = kp04.f136927C;
        sb.append(C61926c.m72691p(w722 != null ? w722.f143910d : j2));
        sb.append(",speed=");
        C50185kw0 kw02 = kp02.f136929E;
        if (!(kw02 == null || (jw02 = kw02.f137066d) == null)) {
            num = Integer.valueOf(jw02.f136359d);
        }
        sb.append(num);
        Log.m105924i(str5, sb.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46511c0(C89349b bVar, int i, List<? extends db4> list, C49203dy1 dy12, C49712hj1 hj12) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C50045jw0 jw02;
        C89349b bVar2 = bVar;
        int i2 = i;
        List<? extends db4> list2 = list;
        C49712hj1 hj13 = hj12;
        this.f125307w = "Finder.CgiFinderGetFeedRelList";
        C50159kp0 kp02 = new C50159kp0();
        long j = kp02.f136937f;
        this.f125303s = j;
        String str = kp02.f136941j;
        int i3 = kp02.f136938g;
        this.f125304t = i3;
        C51969xg0 xg02 = kp02.f136946r;
        this.f125305u = xg02 != null ? xg02.f144637d : null;
        String str2 = kp02.f136949u;
        String str3 = kp02.f136950v;
        String str4 = kp02.f136952x;
        C89349b bVar3 = kp02.f136953y;
        this.f125306v = i2;
        kp02.f136943o = i2;
        if (list2 != null) {
            kp02.f136926B.addAll(list2);
        }
        kp02.f136936e = bVar2;
        kp02.f136925A = dy12;
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        kp02.f136939h = ((Number) X0.f38555d).floatValue();
        C46523h2 h2Var = C46523h2.f125330a;
        String str5 = "Finder.CgiFinderGetFeedRelList";
        kp02.f136935d = h2Var.mo71860b(3688, hj13);
        kp02.f136940i = ((Number) X0.f38556e).floatValue();
        mo71858u(kp02);
        C89349b bVar4 = bVar3;
        h2Var.mo71865g(kp02.f136935d, C26236u.m33719b(new C13604l(Integer.valueOf(i), Long.valueOf(j))), (C49712hj1) null);
        C47350c.C47352b bVar5 = new C47350c.C47352b();
        bVar5.f127069d = 3688;
        bVar5.f127066a = kp02;
        bVar5.f127067b = new C50294lp0();
        bVar5.f127068c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        mo123453j(bVar5.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("[init2] fromUserName=");
        sb.append(str2);
        sb.append(", toUserName=");
        sb.append(str3);
        sb.append(" feedId=");
        sb.append(C61926c.m72691p(j));
        sb.append(" tabType=");
        sb.append(i3);
        sb.append(" commentScene=");
        boolean z = false;
        sb.append(hj13 != null ? hj13.f134675i : 0);
        sb.append(" category=");
        sb.append(this.f125305u);
        sb.append(" nonceId=");
        sb.append(str);
        sb.append(" lastBuffer=");
        sb.append(kp02.f136936e);
        sb.append(" scene=");
        sb.append(i2);
        sb.append(" sessionId=");
        sb.append(str4);
        sb.append(" sessionBuffer=");
        sb.append(bVar4 != null ? true : z);
        sb.append(" get_column_feed_info=");
        C49203dy1 dy13 = kp02.f136925A;
        sb.append(dy13 != null ? Long.valueOf(dy13.f132565d) : null);
        sb.append(", switch_column_info=");
        vd4 vd4 = kp02.f136954z;
        sb.append(vd4 != null ? Long.valueOf(vd4.f143446d) : null);
        sb.append(" cardBuffer=");
        sb.append(bVar);
        sb.append("get_related_column_topic_info=");
        C51796w72 w722 = kp02.f136927C;
        sb.append(w722 != null ? Long.valueOf(w722.f143910d) : null);
        sb.append(" stats=");
        sb.append(kp02.f136926B.size());
        sb.append(",speed=");
        C50185kw0 kw02 = kp02.f136929E;
        sb.append((kw02 == null || (jw02 = kw02.f137066d) == null) ? null : Integer.valueOf(jw02.f136359d));
        Log.m105924i(str5, sb.toString());
    }
}
