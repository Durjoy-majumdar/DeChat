package y50;

import a60.C53979a;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82965h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import java.util.regex.Pattern;
import o40.C61926c;
import ob0.C11385n;
import ob0.C89137b0;
import te3.C50710oo2;
import z50.C16102a;
import z50.C16103b;
import z50.C16112u;
import z50.C53739g;
import z50.C53741k;
import z50.C53743m;
import z50.C53744o;
import z50.C53745q;
import z50.C53747t;

/* renamed from: y50.j0 */
public final class C66519j0 implements C11385n {

    /* renamed from: d */
    public static final C66519j0 f191358d = new C66519j0();

    /* renamed from: e */
    public static boolean f191359e = true;

    /* renamed from: y50.j0$a */
    public static final class C53494a implements Runnable {

        /* renamed from: d */
        public static final C53494a f150434d = new C53494a();

        public final void run() {
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            b0Var.mo123460f(new C53743m(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, false));
        }
    }

    /* renamed from: y50.j0$b */
    public static final class C53495b implements Runnable {

        /* renamed from: d */
        public static final C53495b f150435d = new C53495b();

        public final void run() {
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            b0Var.mo123460f(new C53744o(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, RoomLiveService.f157196g));
        }
    }

    /* renamed from: y50.j0$c */
    public static final class C66520c implements Runnable {

        /* renamed from: d */
        public static final C66520c f191360d = new C66520c();

        public final void run() {
            String str;
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            long j = RoomLiveService.f157197h.f133050d;
            String str2 = RoomLiveService.f157192c;
            C53979a.C53980a aVar = RoomLiveService.f157185Q.f151234i;
            if (aVar == null || (str = aVar.f151237b) == null) {
                str = "";
            }
            b0Var.mo123460f(new C53747t(j, str2, str));
        }
    }

    /* renamed from: a */
    public final void mo90597a(boolean z) {
        C86709a0.m107529k().f251779b.mo123460f(new C16102a(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, z));
    }

    /* renamed from: b */
    public final void mo90598b(String str, String str2) {
        C87412m.m108594g(str, "micId");
        C87412m.m108594g(str2, "sdkUid");
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        b0Var.mo123460f(new C53741k(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, String.valueOf(System.currentTimeMillis()), str, str2));
    }

    /* renamed from: c */
    public final void mo90599c() {
        C86709a0.m107529k().f251779b.mo123460f(new C16103b(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, false));
    }

    /* renamed from: d */
    public final void mo90600d(long j) {
        Log.m105924i("MicroMsg.LiveRoomOperation", "doKeepAlive delay:" + j);
        C86709a0.m107529k().f251779b.mo123455a(3797, this);
        C53495b bVar = C53495b.f150435d;
        Pattern pattern = C61926c.f176038a;
        MMHandlerThread.removeRunnable(bVar);
        MMHandlerThread.postToMainThreadDelayed(bVar, j);
    }

    /* renamed from: e */
    public final void mo90601e(int i) {
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        b0Var.mo123460f(new C53745q(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, i));
    }

    /* renamed from: f */
    public final void mo90602f(long j) {
        Log.m105924i("MicroMsg.LiveRoomOperation", "doMicKeepLive delay:" + j);
        C86709a0.m107529k().f251779b.mo123455a(760, this);
        C66520c cVar = C66520c.f191360d;
        Pattern pattern = C61926c.f176038a;
        MMHandlerThread.removeRunnable(cVar);
        MMHandlerThread.postToMainThreadDelayed(cVar, j);
    }

    /* renamed from: g */
    public final void mo90603g(int i) {
        C50710oo2 oo22 = new C50710oo2();
        oo22.f139284e = (long) i;
        oo22.f139283d = C31543z5.m39453c();
        C86709a0.m107529k().f251779b.mo123460f(new C53739g(RoomLiveService.f157197h.f133050d, oo22));
    }

    /* renamed from: h */
    public final void mo90604h(String str) {
        C87412m.m108594g(str, "wechatRoomId");
        C86709a0.m107529k().f251779b.mo123460f(new C16112u(RoomLiveService.f157197h.f133050d, str));
    }

    /* renamed from: i */
    public final void mo90605i() {
        C86709a0.m107529k().f251779b.mo123460f(new C53743m(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, true));
    }

    /* renamed from: j */
    public final void mo90606j() {
        C53495b bVar = C53495b.f150435d;
        Pattern pattern = C61926c.f176038a;
        MMHandlerThread.removeRunnable(bVar);
        MMHandlerThread.removeRunnable(C53494a.f150434d);
        MMHandlerThread.removeRunnable(C66520c.f191360d);
        C86709a0.m107529k().f251779b.mo123470p(3767, this);
        C86709a0.m107529k().f251779b.mo123470p(3797, this);
        C86709a0.m107529k().f251779b.mo123470p(760, this);
        C86709a0.m107529k().f251779b.mo123470p(C82965h.CTRL_INDEX, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.tencent.trtc.TRTCCloudDef$TRTCParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.tencent.trtc.TRTCCloudDef$TRTCParams} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r16, int r17, java.lang.String r18, ob0.C117747y r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r19
            boolean r2 = r1 instanceof z50.C53743m
            r3 = 0
            r4 = 0
            java.lang.String r6 = "MicroMsg.LiveRoomOperation"
            if (r2 == 0) goto L_0x0055
            z50.m r1 = (z50.C53743m) r1
            long r7 = r1.f150873f
            r9 = 5000(0x1388, double:2.4703E-320)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r4 = r9
        L_0x0018:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "NetSceneLiveGetLiveMessage duration:"
            r2.append(r7)
            long r7 = r1.f150873f
            r2.append(r7)
            java.lang.String r1 = ", delay:"
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            y50.j0$a r1 = y50.C66519j0.C53494a.f150434d
            java.util.regex.Pattern r2 = o40.C61926c.f176038a
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r1)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r1, r4)
            com.tencent.mm.live.model.RoomLiveService r1 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            te3.ep2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r1 = r1.f133055i
            int r2 = com.tencent.p014mm.live.model.RoomLiveService.f157171C
            if (r2 >= r1) goto L_0x004e
            com.tencent.p014mm.live.model.RoomLiveService.f157171C = r1
            goto L_0x01b4
        L_0x004e:
            r2 = -1
            if (r1 != r2) goto L_0x01b4
            com.tencent.p014mm.live.model.RoomLiveService.f157171C = r3
            goto L_0x01b4
        L_0x0055:
            boolean r2 = r1 instanceof z50.C53744o
            r7 = 60000(0xea60, double:2.9644E-319)
            r9 = 1000(0x3e8, float:1.401E-42)
            r10 = 60
            r12 = 0
            if (r2 == 0) goto L_0x00e0
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r3 = 3797(0xed5, float:5.321E-42)
            r2.mo123470p(r3, r15)
            if (r16 != 0) goto L_0x01b4
            if (r17 != 0) goto L_0x01b4
            z50.o r1 = (z50.C53744o) r1
            te3.tk2 r1 = r1.f150875e
            if (r1 == 0) goto L_0x0079
            te3.bq2 r1 = r1.f142257e
            goto L_0x007a
        L_0x0079:
            r1 = r12
        L_0x007a:
            if (r1 == 0) goto L_0x01b4
            com.tencent.p014mm.live.model.RoomLiveService.f157198i = r1
            java.lang.String r2 = "doKeepAlive updatePrivateMapKey"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            boolean r2 = f191359e
            if (r2 == 0) goto L_0x00a1
            c50.b r2 = c50.C54655b.f153178f1
            if (r2 != 0) goto L_0x0092
            c50.b r2 = new c50.b
            r2.<init>()
            c50.C54655b.f153178f1 = r2
        L_0x0092:
            c50.b r2 = c50.C54655b.f153178f1
            gy3.C87412m.m108591d(r2)
            pe3.b r3 = r1.f182317i
            java.lang.String r3 = r3.mo123705h()
            r2.mo85237y0(r3)
            goto L_0x00ba
        L_0x00a1:
            p50.e r2 = p50.C62197e.f176819i1
            if (r2 != 0) goto L_0x00ac
            p50.e r2 = new p50.e
            r2.<init>()
            p50.C62197e.f176819i1 = r2
        L_0x00ac:
            p50.e r2 = p50.C62197e.f176819i1
            gy3.C87412m.m108591d(r2)
            pe3.b r3 = r1.f182317i
            java.lang.String r3 = r3.mo123705h()
            r2.mo85237y0(r3)
        L_0x00ba:
            d50.h r2 = com.tencent.p014mm.live.model.RoomLiveService.f157201l
            if (r2 == 0) goto L_0x00c0
            com.tencent.trtc.TRTCCloudDef$TRTCParams r12 = r2.f166250a
        L_0x00c0:
            if (r12 != 0) goto L_0x00c3
            goto L_0x00cb
        L_0x00c3:
            pe3.b r1 = r1.f182317i
            java.lang.String r1 = r1.mo123705h()
            r12.privateMapKey = r1
        L_0x00cb:
            te3.bq2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157198i
            if (r1 == 0) goto L_0x00d1
            long r4 = r1.f182321p
        L_0x00d1:
            long r4 = r4 - r10
            long r1 = (long) r9
            long r4 = r4 * r1
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r7 = r4
        L_0x00db:
            r15.mo90600d(r7)
            goto L_0x01b4
        L_0x00e0:
            boolean r2 = r1 instanceof z50.C53747t
            if (r2 == 0) goto L_0x0140
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r3 = 760(0x2f8, float:1.065E-42)
            r2.mo123470p(r3, r15)
            if (r16 != 0) goto L_0x01b4
            if (r17 != 0) goto L_0x01b4
            z50.t r1 = (z50.C53747t) r1
            te3.cq3 r1 = r1.f150884e
            if (r1 == 0) goto L_0x00fc
            te3.bq2 r1 = r1.f131901d
            goto L_0x00fd
        L_0x00fc:
            r1 = r12
        L_0x00fd:
            if (r1 == 0) goto L_0x01b4
            com.tencent.p014mm.live.model.RoomLiveService.f157198i = r1
            java.lang.String r2 = "doMicKeepAlive updatePrivateMapKey"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            p50.e r2 = p50.C62197e.f176819i1
            if (r2 != 0) goto L_0x0111
            p50.e r2 = new p50.e
            r2.<init>()
            p50.C62197e.f176819i1 = r2
        L_0x0111:
            p50.e r2 = p50.C62197e.f176819i1
            gy3.C87412m.m108591d(r2)
            pe3.b r3 = r1.f182317i
            java.lang.String r3 = r3.mo123705h()
            r2.mo85237y0(r3)
            d50.h r2 = com.tencent.p014mm.live.model.RoomLiveService.f157201l
            if (r2 == 0) goto L_0x0125
            com.tencent.trtc.TRTCCloudDef$TRTCParams r12 = r2.f166250a
        L_0x0125:
            if (r12 != 0) goto L_0x0128
            goto L_0x0130
        L_0x0128:
            pe3.b r1 = r1.f182317i
            java.lang.String r1 = r1.mo123705h()
            r12.privateMapKey = r1
        L_0x0130:
            long r1 = com.tencent.p014mm.live.model.RoomLiveService.f157202m
            long r1 = r1 - r10
            long r3 = (long) r9
            long r1 = r1 * r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r7 = r1
        L_0x013c:
            r15.mo90602f(r7)
            goto L_0x01b4
        L_0x0140:
            boolean r2 = r1 instanceof z50.C16106e
            if (r2 == 0) goto L_0x01b4
            z50.e r1 = (z50.C16106e) r1
            te3.y22 r1 = r1.f43268e
            if (r1 == 0) goto L_0x014c
            java.util.LinkedList<te3.kp2> r12 = r1.f145087d
        L_0x014c:
            r1 = 1
            if (r12 == 0) goto L_0x0157
            boolean r2 = r12.isEmpty()
            r2 = r2 ^ r1
            if (r2 != r1) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r1 = 0
        L_0x0158:
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r1 = r12.get(r3)
            te3.kp2 r1 = (te3.C50161kp2) r1
            if (r1 == 0) goto L_0x01b4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "update live mic audienceInfo:["
            r2.append(r3)
            java.lang.String r3 = r1.f136967d
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            java.lang.String r3 = r1.f136968e
            r2.append(r3)
            r3 = 93
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            a60.a r7 = com.tencent.p014mm.live.model.RoomLiveService.f157185Q
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r8 = r2.f133050d
            java.lang.String r10 = r1.f136971h
            java.lang.String r2 = "it.live_mic_id"
            gy3.C87412m.m108593f(r10, r2)
            java.lang.String r11 = r1.f136967d
            java.lang.String r2 = "it.identity_id"
            gy3.C87412m.m108593f(r11, r2)
            java.lang.String r12 = r1.f136969f
            java.lang.String r2 = "it.head_img_url"
            gy3.C87412m.m108593f(r12, r2)
            java.lang.String r13 = r1.f136968e
            java.lang.String r2 = "it.nickname"
            gy3.C87412m.m108593f(r13, r2)
            java.lang.String r14 = r1.f136970g
            java.lang.String r1 = "it.sdk_user_id"
            gy3.C87412m.m108593f(r14, r1)
            r7.mo74653c(r8, r10, r11, r12, r13, r14)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y50.C66519j0.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
