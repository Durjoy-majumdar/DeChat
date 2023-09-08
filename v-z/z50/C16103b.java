package z50;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49317ep2;
import te3.C51334t22;
import te3.C51484u22;

/* renamed from: z50.b */
public final class C16103b extends C117747y implements C1311n {

    /* renamed from: d */
    public final boolean f43256d;

    /* renamed from: e */
    public C47350c f43257e;

    /* renamed from: f */
    public C51484u22 f43258f;

    /* renamed from: g */
    public C11385n f43259g;

    public C16103b(long j, String str, boolean z) {
        C87412m.m108594g(str, "roomId");
        this.f43256d = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51334t22();
        bVar.f127067b = new C51484u22();
        bVar.f127069d = 3806;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getliveinfo";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f43257e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveInfoRequest");
        C51334t22 t222 = (C51334t22) aVar;
        t222.f141908d = j;
        t222.f141909e = str;
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneGetLiveInfo", "get live info liveId:" + j + ", roomId:" + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.LiveNetScene.NetSceneGetLiveInfo", "doScene");
        this.f43259g = nVar;
        return dispatch(gVar, this.f43257e, this);
    }

    public int getType() {
        return 3806;
    }

    /* renamed from: j1 */
    public final C49317ep2 mo14699j1() {
        C51484u22 u222 = this.f43258f;
        if (u222 != null) {
            return u222.f142566d;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if ((c50.C54655b.f153178f1 != null) != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r7, int r8, int r9, java.lang.String r10, com.tencent.p014mm.network.C114799u r11, byte[] r12) {
        /*
            r6 = this;
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "onGYNetEnd, errType:"
            r7.append(r12)
            r7.append(r8)
            java.lang.String r12 = ", errCode:"
            r7.append(r12)
            r7.append(r9)
            java.lang.String r12 = ", isForCheck:"
            r7.append(r12)
            boolean r12 = r6.f43256d
            r7.append(r12)
            java.lang.String r12 = ", LiveAnchorTRTCCore.hasInstance:"
            r7.append(r12)
            c50.b r12 = c50.C54655b.f153178f1
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x002c
            r12 = 1
            goto L_0x002d
        L_0x002c:
            r12 = 0
        L_0x002d:
            r7.append(r12)
            java.lang.String r12 = " LiveVisitorTRTCCore.hasInstance:"
            r7.append(r12)
            p50.e r12 = p50.C62197e.f176819i1
            if (r12 == 0) goto L_0x003b
            r12 = 1
            goto L_0x003c
        L_0x003b:
            r12 = 0
        L_0x003c:
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            java.lang.String r12 = "MicroMsg.LiveNetScene.NetSceneGetLiveInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp"
            gy3.C87412m.m108592e(r11, r7)
            ob0.c r11 = (ob0.C47350c) r11
            ob0.c$d r7 = r11.f127056b
            pe3.a r7 = r7.f127083a
            java.lang.String r11 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLiveInfoResponse"
            gy3.C87412m.m108592e(r7, r11)
            te3.u22 r7 = (te3.C51484u22) r7
            r6.f43258f = r7
            if (r8 != 0) goto L_0x00eb
            if (r9 == 0) goto L_0x0062
            goto L_0x00eb
        L_0x0062:
            boolean r7 = r6.f43256d
            if (r7 != 0) goto L_0x00f0
            p50.e r7 = p50.C62197e.f176819i1
            if (r7 == 0) goto L_0x006c
            r7 = 1
            goto L_0x006d
        L_0x006c:
            r7 = 0
        L_0x006d:
            if (r7 != 0) goto L_0x0078
            c50.b r7 = c50.C54655b.f153178f1
            if (r7 == 0) goto L_0x0075
            r7 = 1
            goto L_0x0076
        L_0x0075:
            r7 = 0
        L_0x0076:
            if (r7 == 0) goto L_0x00f0
        L_0x0078:
            te3.ep2 r7 = r6.mo14699j1()
            if (r7 == 0) goto L_0x00f0
            java.util.LinkedList<java.lang.String> r11 = r7.f133059p
            if (r11 == 0) goto L_0x008a
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "roomList"
            gy3.C87412m.m108593f(r11, r0)
            java.util.Iterator r0 = r11.iterator()
        L_0x0096:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d1
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class<wo.b> r2 = p740wo.C53193b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            wo.b r2 = (p740wo.C53193b) r2
            int r2 = r2.mo73729p1(r1)
            com.tencent.mm.live.model.RoomLiveService r3 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            java.util.HashMap<java.lang.String, rx3.l<java.util.ArrayList<java.lang.String>, java.lang.Integer>> r3 = com.tencent.p014mm.live.model.RoomLiveService.f157194e
            java.lang.Object r3 = r3.get(r1)
            if (r3 != 0) goto L_0x0096
            java.util.HashMap<java.lang.String, rx3.l<java.util.ArrayList<java.lang.String>, java.lang.Integer>> r3 = com.tencent.p014mm.live.model.RoomLiveService.f157194e
            java.lang.String r4 = "it"
            gy3.C87412m.m108593f(r1, r4)
            rx3.l r4 = new rx3.l
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.<init>(r5, r2)
            r3.put(r1, r4)
            goto L_0x0096
        L_0x00d1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "roomList:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            com.tencent.mm.live.model.RoomLiveService r11 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.p014mm.live.model.RoomLiveService.f157197h = r7
            goto L_0x00f0
        L_0x00eb:
            java.lang.String r7 = "onGYNetEnd error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r7)
        L_0x00f0:
            ob0.n r7 = r6.f43259g
            if (r7 == 0) goto L_0x00f7
            r7.onSceneEnd(r8, r9, r10, r6)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z50.C16103b.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
