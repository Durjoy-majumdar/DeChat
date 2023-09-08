package je1;

import cm1.C0740i2;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import it1.C60628i;
import java.util.ArrayList;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C49721hl1;
import te3.C49864il1;

/* renamed from: je1.l4 */
public final class C9334l4 extends C60628i {

    /* renamed from: g */
    public C47350c f29157g;

    /* renamed from: h */
    public C11385n f29158h;

    /* renamed from: i */
    public final String f29159i = "Finder.NetSceneFinderSnsGetLiveObjectList";

    /* renamed from: j */
    public final ArrayList<C0740i2> f29160j = new ArrayList<>();

    public C9334l4(C89349b bVar, C49712hj1 hj12) {
        super(hj12);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6847;
        C49721hl1 hl12 = new C49721hl1();
        hl12.f134717e = bVar;
        hl12.f134716d = C46523h2.f125330a.mo71860b(6847, hj12);
        bVar2.f127066a = hl12;
        bVar2.f127067b = new C49864il1();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findersnsgetliveobjectlist";
        this.f29157g = bVar2.mo72403a();
        StringBuilder sb = new StringBuilder();
        sb.append("NetSceneFinderSnsGetLiveObjectList pullType:");
        sb.append(0);
        sb.append(" lastBuffer:");
        sb.append(bVar == null ? "null" : MD5Util.getMD5String(bVar.f257327a));
        Log.m105924i("Finder.NetSceneFinderSnsGetLiveObjectList", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29158h = nVar;
        return dispatch(gVar, this.f29157g, this);
    }

    public int getType() {
        return 6847;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6 A[LOOP:2: B:24:0x008b->B:38:0x00b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00bb A[EDGE_INSN: B:80:0x00bb->B:40:0x00bb ?: BREAK  , SYNTHETIC] */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8516k1(int r19, int r20, int r21, java.lang.String r22, com.tencent.p014mm.network.C114799u r23, byte[] r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = r0.f29159i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "errType "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ", errCode "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", errMsg "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            if (r1 != 0) goto L_0x019c
            if (r2 != 0) goto L_0x019c
            ob0.c r4 = r0.f29157g
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSnsGetLiveObjectListResponse"
            gy3.C87412m.m108592e(r4, r5)
            te3.il1 r4 = (te3.C49864il1) r4
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r5 = r4.f135463d
            java.util.LinkedList<te3.fl1> r6 = r4.f135467h
            te3.gl1 r7 = r4.f135466g
            if (r7 == 0) goto L_0x0119
            java.util.LinkedList<java.lang.Long> r7 = r7.f134118d
            if (r7 == 0) goto L_0x0119
            java.util.Iterator r7 = r7.iterator()
        L_0x004f:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0119
            java.lang.Object r10 = r7.next()
            java.lang.Long r10 = (java.lang.Long) r10
            if (r5 == 0) goto L_0x00ed
            java.util.Iterator r11 = r5.iterator()
        L_0x0061:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00ed
            java.lang.Object r12 = r11.next()
            com.tencent.mm.protocal.protobuf.FinderObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r12
            long r13 = r12.f164794id
            if (r10 != 0) goto L_0x0072
            goto L_0x0061
        L_0x0072:
            long r15 = r10.longValue()
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x0061
            te3.c21 r13 = r12.liveInfo
            if (r13 == 0) goto L_0x0081
            long r13 = r13.f182392d
            goto L_0x0083
        L_0x0081:
            r13 = 0
        L_0x0083:
            java.util.ArrayList<cm1.i2> r15 = r0.f29160j
            java.util.Iterator r15 = r15.iterator()
            r16 = 0
        L_0x008b:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x00b9
            java.lang.Object r17 = r15.next()
            r9 = r17
            cm1.i2 r9 = (cm1.C0740i2) r9
            boolean r8 = r9 instanceof cm1.C0712b0
            if (r8 == 0) goto L_0x00b2
            cm1.b0 r9 = (cm1.C0712b0) r9
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r9.f1709d
            te3.c21 r8 = r8.liveInfo
            if (r8 == 0) goto L_0x00ad
            long r8 = r8.f182392d
            int r17 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r17 != 0) goto L_0x00ad
            r8 = 1
            goto L_0x00ae
        L_0x00ad:
            r8 = 0
        L_0x00ae:
            if (r8 == 0) goto L_0x00b2
            r8 = 1
            goto L_0x00b3
        L_0x00b2:
            r8 = 0
        L_0x00b3:
            if (r8 == 0) goto L_0x00b6
            goto L_0x00bb
        L_0x00b6:
            int r16 = r16 + 1
            goto L_0x008b
        L_0x00b9:
            r16 = -1
        L_0x00bb:
            if (r16 < 0) goto L_0x00e1
            java.lang.String r8 = r0.f29159i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "exist: "
            r9.append(r12)
            r9.append(r10)
            java.lang.String r12 = ", "
            r9.append(r12)
            r9.append(r13)
            java.lang.String r12 = ", filter"
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            goto L_0x0061
        L_0x00e1:
            java.util.ArrayList<cm1.i2> r8 = r0.f29160j
            cm1.b0 r9 = new cm1.b0
            r9.<init>(r12)
            r8.add(r9)
            goto L_0x0061
        L_0x00ed:
            if (r6 == 0) goto L_0x004f
            java.util.Iterator r8 = r6.iterator()
        L_0x00f3:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x004f
            java.lang.Object r9 = r8.next()
            te3.fl1 r9 = (te3.C49439fl1) r9
            long r11 = r9.f133577d
            if (r10 != 0) goto L_0x0104
            goto L_0x00f3
        L_0x0104:
            long r13 = r10.longValue()
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x00f3
            java.util.ArrayList<cm1.i2> r11 = r0.f29160j
            cm1.r0 r12 = new cm1.r0
            long r13 = r9.f133577d
            r12.<init>(r13)
            r11.add(r12)
            goto L_0x00f3
        L_0x0119:
            java.util.ArrayList<cm1.i2> r6 = r0.f29160j
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0163
            if (r5 == 0) goto L_0x012d
            boolean r6 = r5.isEmpty()
            r7 = 1
            r6 = r6 ^ r7
            if (r6 != r7) goto L_0x012d
            r8 = 1
            goto L_0x012e
        L_0x012d:
            r8 = 0
        L_0x012e:
            if (r8 == 0) goto L_0x0163
            java.util.ArrayList<cm1.i2> r6 = r0.f29160j
            java.lang.String r7 = "liveObjects"
            gy3.C87412m.m108593f(r5, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r5, r8)
            r7.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x0146:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0160
            java.lang.Object r8 = r5.next()
            com.tencent.mm.protocal.protobuf.FinderObject r8 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r8
            cm1.b0 r9 = new cm1.b0
            java.lang.String r10 = "it"
            gy3.C87412m.m108593f(r8, r10)
            r9.<init>(r8)
            r7.add(r9)
            goto L_0x0146
        L_0x0160:
            r6.addAll(r7)
        L_0x0163:
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_SNS_LIVE_LIST_SETTING_ENABLE_INT_SYNC
            boolean r7 = r4.f135468i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.mo119677K(r6, r7)
            java.lang.String r5 = r0.f29159i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "responseList size:"
            r6.append(r7)
            java.util.ArrayList<cm1.i2> r7 = r0.f29160j
            int r7 = r7.size()
            r6.append(r7)
            java.lang.String r7 = ", resp.enableSetting:"
            r6.append(r7)
            boolean r4 = r4.f135468i
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
        L_0x019c:
            ob0.n r4 = r0.f29158h
            if (r4 == 0) goto L_0x01a3
            r4.onSceneEnd(r1, r2, r3, r0)
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9334l4.mo8516k1(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
