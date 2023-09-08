package je1;

import bo1.C0344g;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50141kk1;
import te3.C50862pq3;
import te3.C51270sn1;
import te3.C51863wp0;
import te3.C51974xh1;
import te3.C52002xp0;
import te3.ai4;
import z04.C119027c;

/* renamed from: je1.s3 */
public final class C9376s3 extends C60628i {

    /* renamed from: g */
    public C47350c f29271g;

    /* renamed from: h */
    public C11385n f29272h;

    /* renamed from: i */
    public final String f29273i;

    /* renamed from: j */
    public int f29274j;

    /* renamed from: n */
    public String f29275n;

    /* renamed from: o */
    public int f29276o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9376s3(java.lang.String r16, long r17, pe3.C89349b r19, java.lang.Long r20, int r21, pe3.C89349b r22, te3.C49712hj1 r23, java.lang.String r24, int r25, gy3.C8480h r26) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r20
            r5 = r21
            r6 = r23
            r7 = r25
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0013
            r7 = 0
            goto L_0x0015
        L_0x0013:
            r7 = r24
        L_0x0015:
            java.lang.String r9 = "topic"
            gy3.C87412m.m108594g(r1, r9)
            r15.<init>(r6)
            java.lang.String r9 = "Finder.NetSceneFinderGetTopicFeed"
            r0.f29273i = r9
            ob0.c$b r10 = new ob0.c$b
            r10.<init>()
            r11 = 817(0x331, float:1.145E-42)
            r10.f127069d = r11
            te3.wp0 r12 = new te3.wp0
            r12.<init>()
            r12.f144192f = r5
            r12.f144193g = r1
            r12.f144202s = r2
            r13 = r22
            r12.f144191e = r13
            r13 = r19
            r12.f144203t = r13
            if (r4 == 0) goto L_0x0049
            r20.longValue()
            long r13 = r20.longValue()
            r12.f144196j = r13
        L_0x0049:
            r13 = 1
            r12.f144207x = r13
            je1.h2 r13 = je1.C46523h2.f125330a
            te3.ig0 r14 = r13.mo71860b(r11, r6)
            r12.f144190d = r14
            r15.mo10095l1(r12, r7)
            te3.ig0 r7 = r12.f144190d
            rx3.l r14 = new rx3.l
            if (r6 == 0) goto L_0x0060
            int r6 = r6.f134677n
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r24 = r9
            long r8 = r12.f144196j
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r14.<init>(r6, r8)
            java.util.List r6 = sx3.C26236u.m33719b(r14)
            r8 = 0
            r13.mo71865g(r7, r6, r8)
            r10.f127066a = r12
            r10.f127069d = r11
            te3.xp0 r6 = new te3.xp0
            r6.<init>()
            r10.f127067b = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/findergettopiclist"
            r10.f127068c = r6
            ob0.c r6 = r10.mo72403a()
            r0.f29271g = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "NetSceneFinderGetTopicFeed get word init: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = ", "
            r6.append(r1)
            r6.append(r5)
            r6.append(r1)
            r6.append(r2)
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = r6.toString()
            r2 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r0.f29276o = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9376s3.<init>(java.lang.String, long, pe3.b, java.lang.Long, int, pe3.b, te3.hj1, java.lang.String, int, gy3.h):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        C49712hj1 hj12 = this.f172736d;
        y0Var.f167356j.put(hj12 != null ? hj12.f134675i : 0, Long.valueOf(C31543z5.m39453c()));
        this.f29272h = nVar;
        return dispatch(gVar, this.f29271g, this);
    }

    public int getType() {
        return 817;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f29273i;
        Log.m105924i(str2, "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            String str3 = this.f29273i;
            Log.m105924i(str3, "pullType " + this.f29274j + " selectedTag" + this.f29275n + ' ' + C9311g2.f29093a.mo10062a(mo10096m1()));
            C47465a aVar = this.f29271g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
            C52002xp0 xp02 = (C52002xp0) aVar;
            C0344g gVar = C0344g.f929a;
            C51974xh1 xh12 = xp02.f144793o;
            LinkedList<FinderObject> linkedList = xp02.f144785d;
            C87412m.m108593f(linkedList, "resp.`object`");
            gVar.mo386b(xh12, linkedList, 817);
        }
        C11385n nVar = this.f29272h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C49712hj1 hj12 = this.f172736d;
        if (hj12 != null) {
            for (FinderObject j802 : mo10096m1()) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(j802, hj12.f134675i);
            }
        }
    }

    /* renamed from: l1 */
    public final void mo10095l1(C51863wp0 wp02, String str) {
        if (str != null) {
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            wp02.f144206w = new C89349b(bytes, 0, bytes.length);
        }
    }

    /* renamed from: m1 */
    public final LinkedList<FinderObject> mo10096m1() {
        C47465a aVar = this.f29271g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
        LinkedList<FinderObject> linkedList = ((C52002xp0) aVar).f144785d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…picListResponse).`object`");
        return linkedList;
    }

    /* renamed from: n1 */
    public final int mo10097n1() {
        C47465a aVar = this.f29271g.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
        return ((C51863wp0) aVar).f144192f;
    }

    /* renamed from: o1 */
    public final int mo10098o1() {
        C47465a aVar = this.f29271g.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
        return ((C51863wp0) aVar).f144205v;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9376s3(String str, long j, C89349b bVar, Long l, C89349b bVar2, C50141kk1 kk12, C49712hj1 hj12, String str2, int i, C8480h hVar) {
        super(hj12);
        str2 = (i & 128) != 0 ? null : str2;
        C87412m.m108594g(str, "topic");
        this.f29273i = "Finder.NetSceneFinderGetTopicFeed";
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127069d = 817;
        C51863wp0 wp02 = new C51863wp0();
        wp02.f144192f = 5;
        wp02.f144193g = str;
        wp02.f144202s = j;
        wp02.f144191e = bVar2;
        wp02.f144203t = bVar;
        if (l != null) {
            l.longValue();
            wp02.f144196j = l.longValue();
        }
        wp02.f144199p = kk12;
        C46523h2 h2Var = C46523h2.f125330a;
        wp02.f144190d = h2Var.mo71860b(817, hj12);
        wp02.f144207x = 1;
        mo10095l1(wp02, str2);
        h2Var.mo71865g(wp02.f144190d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : 0), Long.valueOf(wp02.f144196j))), (C49712hj1) null);
        bVar3.f127066a = wp02;
        bVar3.f127069d = 817;
        bVar3.f127067b = new C52002xp0();
        bVar3.f127068c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f29271g = bVar3.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + str + ", " + l);
        this.f29276o = this.f29276o;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9376s3(String str, int i, Long l, C89349b bVar, C50141kk1 kk12, C49712hj1 hj12, String str2) {
        super(hj12);
        C87412m.m108594g(str, "topic");
        this.f29273i = "Finder.NetSceneFinderGetTopicFeed";
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 817;
        C51863wp0 wp02 = new C51863wp0();
        wp02.f144192f = i;
        wp02.f144193g = str;
        wp02.f144191e = bVar;
        if (l != null) {
            l.longValue();
            wp02.f144196j = l.longValue();
        }
        wp02.f144199p = kk12;
        C46523h2 h2Var = C46523h2.f125330a;
        wp02.f144190d = h2Var.mo71860b(817, hj12);
        wp02.f144207x = 1;
        mo10095l1(wp02, str2);
        h2Var.mo71865g(wp02.f144190d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : 0), Long.valueOf(wp02.f144196j))), (C49712hj1) null);
        bVar2.f127066a = wp02;
        bVar2.f127069d = 817;
        bVar2.f127067b = new C52002xp0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f29271g = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + str + ", " + l);
        this.f29276o = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9376s3(int r16, long r17, java.lang.Long r19, java.lang.String r20, int r21, pe3.C89349b r22, te3.C49712hj1 r23, java.lang.String r24) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r23
            r15.<init>(r7)
            java.lang.String r8 = "Finder.NetSceneFinderGetTopicFeed"
            r0.f29273i = r8
            ob0.c$b r9 = new ob0.c$b
            r9.<init>()
            r10 = 817(0x331, float:1.145E-42)
            r9.f127069d = r10
            te3.wp0 r11 = new te3.wp0
            r11.<init>()
            r11.f144192f = r1
            r11.f144202s = r2
            if (r4 == 0) goto L_0x0031
            r19.longValue()
            long r12 = r19.longValue()
            r11.f144196j = r12
        L_0x0031:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
            if (r12 != 0) goto L_0x003a
            r12 = 4
            r11.f144200q = r12
        L_0x003a:
            if (r5 != 0) goto L_0x003f
            java.lang.String r12 = ""
            goto L_0x0040
        L_0x003f:
            r12 = r5
        L_0x0040:
            r11.f144204u = r12
            r12 = r22
            r11.f144191e = r12
            r11.f144205v = r6
            je1.h2 r12 = je1.C46523h2.f125330a
            te3.ig0 r13 = r12.mo71860b(r10, r7)
            r11.f144190d = r13
            r13 = 1
            r11.f144207x = r13
            r13 = r24
            r15.mo10095l1(r11, r13)
            te3.ig0 r13 = r11.f144190d
            rx3.l r14 = new rx3.l
            if (r7 == 0) goto L_0x0061
            int r7 = r7.f134677n
            goto L_0x0062
        L_0x0061:
            r7 = 0
        L_0x0062:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            long r5 = r11.f144196j
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r14.<init>(r7, r5)
            java.util.List r5 = sx3.C26236u.m33719b(r14)
            r6 = 0
            r12.mo71865g(r13, r5, r6)
            r9.f127066a = r11
            r9.f127069d = r10
            te3.xp0 r5 = new te3.xp0
            r5.<init>()
            r9.f127067b = r5
            java.lang.String r5 = "/cgi-bin/micromsg-bin/findergettopiclist"
            r9.f127068c = r5
            ob0.c r5 = r9.mo72403a()
            r0.f29271g = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "NetSceneFinderGetTopicFeed get eventTopic init eventTopicId:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = ", "
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = " encryptedTopicId:"
            r5.append(r2)
            r2 = r20
            r5.append(r2)
            java.lang.String r2 = " innerTabType:"
            r5.append(r2)
            r2 = r21
            r5.append(r2)
            java.lang.String r2 = " pullType:"
            r5.append(r2)
            int r2 = r0.f29274j
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            r0.f29276o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9376s3.<init>(int, long, java.lang.Long, java.lang.String, int, pe3.b, te3.hj1, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9376s3(String str, Long l, C89349b bVar, C50141kk1 kk12, C49712hj1 hj12, int i, String str2) {
        super(hj12);
        C87412m.m108594g(str, "topic");
        this.f29273i = "Finder.NetSceneFinderGetTopicFeed";
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 817;
        C51863wp0 wp02 = new C51863wp0();
        wp02.f144192f = 1;
        wp02.f144193g = str;
        wp02.f144191e = bVar;
        if (l != null) {
            l.longValue();
            wp02.f144196j = l.longValue();
        }
        wp02.f144207x = 1;
        wp02.f144199p = kk12;
        wp02.f144205v = i;
        C46523h2 h2Var = C46523h2.f125330a;
        wp02.f144190d = h2Var.mo71860b(817, hj12);
        mo10095l1(wp02, str2);
        h2Var.mo71865g(wp02.f144190d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : 0), Long.valueOf(wp02.f144196j))), (C49712hj1) null);
        bVar2.f127066a = wp02;
        bVar2.f127069d = 817;
        bVar2.f127067b = new C52002xp0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f29271g = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + str + ", " + l);
        this.f29276o = this.f29276o;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9376s3(String str, long j, Long l, int i, C89349b bVar, C49712hj1 hj12, String str2, String str3) {
        super(hj12);
        C87412m.m108594g(str, "topic");
        this.f29273i = "Finder.NetSceneFinderGetTopicFeed";
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 817;
        C51863wp0 wp02 = new C51863wp0();
        wp02.f144192f = i;
        wp02.f144193g = str;
        wp02.f144202s = j;
        wp02.f144191e = bVar;
        if (l != null) {
            l.longValue();
            wp02.f144196j = l.longValue();
        }
        if (str3 != null) {
            wp02.f144208y = str3;
        }
        wp02.f144207x = 1;
        C46523h2 h2Var = C46523h2.f125330a;
        wp02.f144190d = h2Var.mo71860b(817, hj12);
        mo10095l1(wp02, str2);
        h2Var.mo71865g(wp02.f144190d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : 0), Long.valueOf(wp02.f144196j))), (C49712hj1) null);
        bVar2.f127066a = wp02;
        bVar2.f127069d = 817;
        bVar2.f127067b = new C52002xp0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f29271g = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + str + ", " + l + " finderUsername=" + str3);
        this.f29276o = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9376s3(String str, float f, float f2, Long l, C89349b bVar, int i, C50862pq3 pq32, C50141kk1 kk12, C49712hj1 hj12, String str2) {
        super(hj12);
        C87412m.m108594g(str, "poiClassifyId");
        this.f29273i = "Finder.NetSceneFinderGetTopicFeed";
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 817;
        C51863wp0 wp02 = new C51863wp0();
        wp02.f144192f = 2;
        wp02.f144193g = str;
        wp02.f144194h = f;
        wp02.f144195i = f2;
        wp02.f144191e = bVar;
        if (l != null) {
            l.longValue();
            wp02.f144196j = l.longValue();
        }
        wp02.f144199p = kk12;
        wp02.f144200q = 1;
        if (kk12 != null) {
            wp02.f144200q = 2;
        }
        wp02.f144207x = 1;
        wp02.f144197n = i;
        mo10095l1(wp02, str2);
        int i2 = 0;
        if (pq32 != null) {
            ai4 ai4 = new ai4();
            LinkedList<Long> linkedList = new LinkedList<>();
            LinkedList<C51270sn1> linkedList2 = pq32.f139904d;
            C87412m.m108593f(linkedList2, "topicRecommend.topic_list");
            for (C51270sn1 sn12 : linkedList2) {
                linkedList.add(Long.valueOf(sn12.f141618e));
            }
            ai4.f130559d = linkedList;
            wp02.f144198o = ai4;
            this.f29275n = pq32.f139904d.get(0).f141617d;
        }
        C46523h2 h2Var = C46523h2.f125330a;
        C49842ig0 b = h2Var.mo71860b(817, hj12);
        wp02.f144190d = b;
        h2Var.mo71865g(b, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : i2), Long.valueOf(wp02.f144196j))), (C49712hj1) null);
        bVar2.f127066a = wp02;
        bVar2.f127069d = 817;
        bVar2.f127067b = new C52002xp0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f29271g = bVar2.mo72403a();
        String str3 = this.f29273i;
        Log.m105924i(str3, "NetSceneFinderGetTopicFeed get poi init: " + str + ' ' + l);
        this.f29276o = this.f29276o;
    }
}
