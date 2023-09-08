package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import java.util.ArrayList;
import java.util.LinkedList;
import kt1.C46744d;
import ob0.C47350c;
import org.json.JSONObject;
import qr3.C110470e;
import te3.C48863bj0;
import te3.C48928bz0;
import te3.C49007cj0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51163rv3;
import wg1.C15320l4;
import xh1.C15685d;

/* renamed from: dj1.t0 */
public final class C7347t0 extends C58286q<C49007cj0> {

    /* renamed from: t */
    public final long f25469t;

    /* renamed from: u */
    public final String f25470u;

    /* renamed from: v */
    public C48863bj0 f25471v;

    /* renamed from: w */
    public final JSONObject f25472w;

    /* renamed from: x */
    public final JSONObject f25473x;

    /* renamed from: dj1.t0$a */
    public interface C7348a {
        /* renamed from: a */
        void mo8520a(int i, int i2, String str, long j, C49007cj0 cj02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7347t0(C49842ig0 ig02, String str, String str2, long j, long j2, int i, long j3, C7348a aVar, int i2, C8480h hVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        j = (i2 & 8) != 0 ? 0 : j;
        j2 = (i2 & 16) != 0 ? 0 : j2;
        j3 = (i2 & 64) != 0 ? 0 : j3;
        this.f25469t = j3;
        this.f25470u = "Finder.CgiFinderLivePrepare";
        this.f25471v = new C48863bj0();
        JSONObject jSONObject = new JSONObject();
        this.f25472w = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.f25473x = jSONObject2;
        C48863bj0 bj02 = this.f25471v;
        bj02.f131140d = ig02;
        bj02.f131141e = str;
        bj02.f131142f = str2;
        bj02.f131143g = j;
        bj02.f131144h = j2;
        LinkedList<C48928bz0> linkedList = new LinkedList<>();
        C15685d dVar = C15685d.f42379a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C15685d.f42381c);
        linkedList.addAll(arrayList);
        bj02.f131146j = linkedList;
        C48863bj0 bj03 = this.f25471v;
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        bj03.f131147n = (long) C110470e.f330363a;
        bj03.f131148o = C15320l4.f41640b;
        jSONObject2.put("mic_live_id", j2);
        jSONObject2.put("mic_object_id", j);
        jSONObject.put("username", str2);
        Log.m105924i("Finder.CgiFinderLivePrepare", "CgiFinderLivePrepare finderUsername " + str + " micFinderUsername " + str2 + " micObjectId " + j + " micLiveId " + j2);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f25471v;
        C49007cj0 cj02 = new C49007cj0();
        cj02.setBaseResponse(new C49966ja());
        cj02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = cj02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercreateliveprepare";
        bVar.f127069d = 5874;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f25473x;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f25472w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ff  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo332r(int r8, int r9, java.lang.String r10, te3.C49335eu3 r11, ob0.C117747y r12) {
        /*
            r7 = this;
            te3.cj0 r11 = (te3.C49007cj0) r11
            java.lang.String r12 = "resp"
            gy3.C87412m.m108594g(r11, r12)
            java.lang.String r12 = r7.f25470u
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[onCgiBack] errType="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = " errCode="
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = " errMsg="
            r0.append(r8)
            r0.append(r10)
            java.lang.String r8 = ", maxUserCount:"
            r0.append(r8)
            int r8 = r11.f131766s
            r0.append(r8)
            java.lang.String r8 = " thread="
            r0.append(r8)
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            er1.j4 r8 = er1.C58739j4.f168176a
            boolean r8 = r8.mo83692U()
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L_0x00b5
            java.util.LinkedList<te3.vv0> r8 = r11.f131762o
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00a1
            pe1.c<java.lang.Integer> r8 = gg1.C32444a.f86202u0
            java.lang.Object r8 = r8.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r10) goto L_0x00a1
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            r12 = 0
        L_0x0069:
            r0 = 50
            if (r12 >= r0) goto L_0x009f
            te3.vv0 r0 = new te3.vv0
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "finder_debug_audien_file_"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.f143709d = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "测试列表"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.f143710e = r1
            r8.add(r0)
            int r12 = r12 + 1
            goto L_0x0069
        L_0x009f:
            r11.f131762o = r8
        L_0x00a1:
            te3.ca4 r8 = r11.f131767t
            if (r8 != 0) goto L_0x00b5
            te3.ca4 r8 = new te3.ca4
            r8.<init>()
            r11.f131767t = r8
            java.lang.String r12 = "测试"
            r8.f131605e = r12
            java.lang.String r12 = "https://weixin110.qq.com/security/newreadtemplate?t=roomlive/verify"
            r8.f131604d = r12
        L_0x00b5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "[user_flag:"
            r12.append(r0)
            int r0 = r11.f131756f
            r12.append(r0)
            java.lang.String r0 = ", live_global_flag:"
            r12.append(r0)
            int r0 = r11.f131757g
            r12.append(r0)
            java.lang.String r0 = "], shopping_not_available:"
            r12.append(r0)
            int r0 = r11.f131770w
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r8.append(r12)
            te3.ui1 r12 = r11.f131758h
            r0 = 93
            if (r12 == 0) goto L_0x010d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[FinderRecoverLiveInfo.object_id:"
            r1.append(r2)
            long r2 = r12.f142865d
            r1.append(r2)
            java.lang.String r2 = ", FinderRecoverLiveInfo.live_id:"
            r1.append(r2)
            long r2 = r12.f142866e
            r1.append(r2)
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            r8.append(r12)
        L_0x010d:
            com.tencent.mm.protocal.protobuf.FinderObject r12 = r11.f131759i
            if (r12 == 0) goto L_0x014c
            te3.c21 r12 = r12.liveInfo
            if (r12 == 0) goto L_0x014c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[finderObject.liveInfo.liveId:"
            r1.append(r2)
            long r2 = r12.f182392d
            r1.append(r2)
            java.lang.String r2 = ", finderObject.liveInfo.liveStatus:"
            r1.append(r2)
            int r2 = r12.f182394f
            r1.append(r2)
            java.lang.String r2 = ", finderObject.liveInfo.startTime:"
            r1.append(r2)
            int r2 = r12.f182396h
            r1.append(r2)
            java.lang.String r2 = ", finderObject.liveInfo.endTime:"
            r1.append(r2)
            int r12 = r12.f182398j
            r1.append(r12)
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            r8.append(r12)
        L_0x014c:
            java.util.LinkedList<te3.vv0> r12 = r11.f131762o
            java.lang.String r1 = "VisibilityFileList:"
            r8.append(r1)     // Catch:{ Exception -> 0x0189 }
            if (r12 == 0) goto L_0x01a2
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x0189 }
        L_0x0159:
            boolean r1 = r12.hasNext()     // Catch:{ Exception -> 0x0189 }
            if (r1 == 0) goto L_0x01a2
            java.lang.Object r1 = r12.next()     // Catch:{ Exception -> 0x0189 }
            te3.vv0 r1 = (te3.C51745vv0) r1     // Catch:{ Exception -> 0x0189 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0189 }
            r2.<init>()     // Catch:{ Exception -> 0x0189 }
            r3 = 91
            r2.append(r3)     // Catch:{ Exception -> 0x0189 }
            java.lang.String r3 = r1.f143710e     // Catch:{ Exception -> 0x0189 }
            r2.append(r3)     // Catch:{ Exception -> 0x0189 }
            r3 = 58
            r2.append(r3)     // Catch:{ Exception -> 0x0189 }
            java.lang.String r1 = r1.f143709d     // Catch:{ Exception -> 0x0189 }
            r2.append(r1)     // Catch:{ Exception -> 0x0189 }
            r2.append(r0)     // Catch:{ Exception -> 0x0189 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0189 }
            r8.append(r1)     // Catch:{ Exception -> 0x0189 }
            goto L_0x0159
        L_0x0189:
            r12 = move-exception
            er1.j4 r0 = er1.C58739j4.f168176a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.f25470u
            r1.append(r2)
            java.lang.String r2 = ",dumpVisibilityFileList"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo83712h0(r12, r1)
        L_0x01a2:
            te3.ca4 r12 = r11.f131767t
            java.lang.String r0 = "\nspamRisk:"
            r8.append(r0)
            java.lang.String r0 = ""
            if (r12 != 0) goto L_0x01ae
            r12 = r0
        L_0x01ae:
            org.json.JSONObject r12 = o40.C61937h.m72709h(r12)
            r8.append(r12)
            java.lang.String r12 = r7.f25470u
            java.lang.String r8 = java.lang.String.valueOf(r8)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            java.lang.Class<pl1.s0> r8 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r12 = ht1.C60200t1.class
            te3.m61 r1 = r11.f131769v
            if (r1 == 0) goto L_0x01d7
            java.lang.String r1 = r1.f137875e
            if (r1 == 0) goto L_0x01d7
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x01d2
            r1 = 1
            goto L_0x01d3
        L_0x01d2:
            r1 = 0
        L_0x01d3:
            if (r1 != r10) goto L_0x01d7
            r1 = 1
            goto L_0x01d8
        L_0x01d7:
            r1 = 0
        L_0x01d8:
            r2 = 0
            if (r1 == 0) goto L_0x020d
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r3 = r1.mo62446e(r12)
            bl3.c r3 = r3.mo62447c(r8)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11871f2()
            pl1.n0 r4 = new pl1.n0
            te3.m61 r5 = r11.f131769v
            if (r5 == 0) goto L_0x01f4
            java.lang.String r5 = r5.f137875e
            goto L_0x01f5
        L_0x01f4:
            r5 = r2
        L_0x01f5:
            up1.y r6 = up1.C27696y.RAW_IMAGE
            r4.<init>(r5, r6)
            pl1.e0$a r5 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r12 = r1.mo62446e(r12)
            bl3.c r8 = r12.mo62447c(r8)
            pl1.s0 r8 = (pl1.C11990s0) r8
            n60.f r8 = r8.mo11867O2(r5)
            r3.mo85956b(r4, r8)
        L_0x020d:
            java.lang.String r8 = r7.f25470u
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "[saveFuncSwitchFlag] flags = "
            r12.append(r1)
            long r3 = r11.f131740C
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC
            long r3 = r11.f131740C
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r8.mo119677K(r12, r1)
            java.lang.String r8 = r7.f25470u
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "[saveAnchorTopicHintWording] flags = "
            r12.append(r1)
            te3.c61 r1 = r11.f131746I
            if (r1 == 0) goto L_0x024b
            java.lang.String r1 = r1.f131544d
            goto L_0x024c
        L_0x024b:
            r1 = r2
        L_0x024c:
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
            te3.c61 r8 = r11.f131746I
            if (r8 == 0) goto L_0x027b
            java.lang.String r8 = r8.f131544d
            if (r8 == 0) goto L_0x027b
            int r12 = r8.length()
            if (r12 != 0) goto L_0x0266
            r12 = 1
            goto L_0x0267
        L_0x0266:
            r12 = 0
        L_0x0267:
            r12 = r12 ^ r10
            if (r12 == 0) goto L_0x026b
            goto L_0x026c
        L_0x026b:
            r8 = r2
        L_0x026c:
            if (r8 == 0) goto L_0x027b
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_TOPIC_HINT_STRING_SYNC
            r12.mo119677K(r1, r8)
        L_0x027b:
            java.util.LinkedList<te3.bz0> r8 = r11.f131747J
            if (r8 == 0) goto L_0x0284
            xh1.d r12 = xh1.C15685d.f42379a
            r12.mo14431b(r8, r10)
        L_0x0284:
            java.util.LinkedList<java.lang.Integer> r8 = r11.f131749L
            if (r8 == 0) goto L_0x02f4
            xh1.d r12 = xh1.C15685d.f42379a
            boolean r12 = r8.isEmpty()
            r12 = r12 ^ r10
            if (r12 != r10) goto L_0x0293
            r12 = 1
            goto L_0x0294
        L_0x0293:
            r12 = 0
        L_0x0294:
            java.lang.String r1 = "MMKV_KEY_DEFAULT_TURN_ON_TAG_ID"
            java.lang.String r3 = "FinderGesturesResManager"
            if (r12 == 0) goto L_0x02e2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x02a3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02bc
            java.lang.Object r0 = r8.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r12.append(r0)
            java.lang.String r0 = ","
            r12.append(r0)
            goto L_0x02a3
        L_0x02bc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "#putDefaultTurnOnTagIds ids="
            r8.append(r0)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            rx3.g r8 = xh1.C15685d.f42380b
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r8
            java.lang.String r12 = r12.toString()
            r8.putString(r1, r12)
            goto L_0x02f4
        L_0x02e2:
            java.lang.String r8 = "#putDefaultTurnOnTagIds ids empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            rx3.g r8 = xh1.C15685d.f42380b
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r8
            r8.putString(r1, r0)
        L_0x02f4:
            te3.b91 r8 = r11.f131753Q
            if (r8 == 0) goto L_0x02fd
            boolean r12 = r8.f131012d
            if (r12 != r10) goto L_0x02fd
            r9 = 1
        L_0x02fd:
            if (r9 == 0) goto L_0x0308
            ei1.a r9 = ei1.C58602a.f167787a
            if (r8 == 0) goto L_0x0305
            java.util.LinkedList<te3.wo2> r2 = r8.f131013e
        L_0x0305:
            r9.mo83493a(r2)
        L_0x0308:
            te3.m93 r8 = r11.f131748K
            if (r8 == 0) goto L_0x031b
            te3.g61 r8 = r8.f137921e
            if (r8 == 0) goto L_0x031b
            wg1.l4 r9 = wg1.C15320l4.f41639a
            int r10 = r8.f133890f
            boolean r12 = r8.f133889e
            java.util.LinkedList<te3.f61> r8 = r8.f133888d
            r9.mo14172c(r10, r12, r8)
        L_0x031b:
            java.lang.String r8 = r7.f25470u
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[saveLiveGlobalFlag] flags = "
            r9.append(r10)
            int r10 = r11.f131757g
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_GLOBAL_FLAG_INT_SYNC
            int r10 = r11.f131757g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.mo119677K(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj1.C7347t0.mo332r(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }
}
