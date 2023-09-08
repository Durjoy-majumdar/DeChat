package uc1;

import ak1.C54116w;
import b50.C54408d;
import c50.C54655b;
import cj1.C0628v3;
import cj1.C0639y1;
import cj1.C28595x4;
import cj1.C54781k2;
import cl1.C39981t0;
import cl1.C54951d;
import cl1.C54963d0;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import cp1.C57941h;
import d50.C58114h;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fh1.C59062p2;
import fj1.C45795b;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import gk1.C59522a;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import java.util.LinkedList;
import n50.C61620c;
import nk1.C61781k;
import nk1.C61788m;
import o40.C11348f;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p50.C62197e;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C48701ae3;
import tf0.C64918r1;
import vo1.C65770a0;
import zj1.C16217b;

@C86522b
/* renamed from: uc1.p */
public final class C65323p extends C86301e implements C64918r1 {

    /* renamed from: uc1.p$a */
    public static final class C14151a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C2458a f39581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14151a(C2458a aVar) {
            super(0);
            this.f39581d = aVar;
        }

        public Object invoke() {
            C16217b bVar = C16217b.f43438a;
            C2458a aVar = this.f39581d;
            C87412m.m108594g(aVar, "result");
            Log.m105924i("FinderLiveRedDotNotifier", "notify path " + aVar.f12912e + ", show = " + aVar.f12908a);
            bVar.mo14748e(aVar.f12912e).setValue(aVar);
            return C13598b0.f38549a;
        }
    }

    public void E00(C54951d.C54953c cVar) {
        C59062p2 p2Var;
        C59522a F3;
        FinderLiveService.f159376d.getClass();
        LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
        if (liveRoomControllerStore != null && (p2Var = (C59062p2) liveRoomControllerStore.controller(C59062p2.class)) != null && (F3 = p2Var.mo84269F3()) != null) {
            F3.mo84593a(cVar);
        }
    }

    /* renamed from: GD */
    public boolean mo89039GD() {
        FinderLiveService.f159376d.getClass();
        return FinderLiveService.f159380h;
    }

    public void Jd0(LinkedList<C48701ae3> linkedList) {
        FinderLiveService.f159376d.getClass();
        if (linkedList != null) {
            for (C48701ae3 ae32 : linkedList) {
                Log.m105924i("Finder.FinderLiveService", "[Battle] player:[" + ae32.f130472d + ", " + ae32.f130473e + ']');
            }
        }
    }

    public void Ju0(long j, String str) {
        FinderLiveService.f159376d.getClass();
        Log.m105924i("Finder.FinderLiveService", "startBattleEndDelayTimer delay:" + j + " battleId:" + str);
        MMHandlerThread.removeRunnable(FinderLiveService.f159360M);
        FinderLiveService.C55919a aVar = new FinderLiveService.C55919a(str);
        FinderLiveService.f159360M = aVar;
        MMHandlerThread.postToMainThreadDelayed(aVar, j);
    }

    /* renamed from: Nu */
    public void mo89042Nu(C2458a aVar) {
        C87412m.m108594g(aVar, "result");
        C61926c.m72668M(new C14151a(aVar));
    }

    /* renamed from: Pa */
    public void mo89043Pa() {
        FinderLiveService.f159376d.getClass();
        Log.m105924i("Finder.FinderLiveService", "removeBattleEndDelayTimer");
        MMHandlerThread.removeRunnable(FinderLiveService.f159360M);
    }

    /* renamed from: Rq */
    public void mo89044Rq() {
        C65770a0 a0Var;
        C57941h hVar;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        if (bVar != null) {
            C56032b.notifyAudienceMicUserChange$default(bVar, false, 1, (Object) null);
        }
        FinderLiveService.m63769b0(finderLiveService, 2, (JSONObject) null, false, 6, (Object) null);
        C65770a0.C65771b bVar2 = C65770a0.f189184r;
        if (C65770a0.f189185s != null && (a0Var = C65770a0.f189185s) != null && (hVar = a0Var.f189192f) != null) {
            hVar.mo82737b(2, (JSONObject) null, true);
        }
    }

    public void Su0() {
        FinderLiveService.f159376d.mo77619V();
    }

    public void U50(long j) {
        FinderLiveService.f159376d.mo77605F(j);
    }

    public boolean Vj0(String str, int i, boolean z, String str2) {
        C87412m.m108594g(str, "sdkUserId");
        return C62042e.f176370a.mo87058Y1(str, i, z, str2);
    }

    /* renamed from: Z8 */
    public void mo89048Z8(boolean z) {
        C65770a0 a0Var;
        C57941h hVar;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        JSONObject jSONObject = null;
        if (bVar != null) {
            C60735a iV = mo89057iV();
            C56032b.notifySEIMicUserChange$default(bVar, iV != null ? iV.mo85677T() : null, true, (C13604l) null, 4, (Object) null);
        }
        C60735a iV2 = mo89057iV();
        finderLiveService.mo77625a0(3, iV2 != null ? iV2.mo85677T() : null, false);
        C65770a0.C65771b bVar2 = C65770a0.f189184r;
        C60735a iV3 = mo89057iV();
        if (iV3 != null) {
            jSONObject = iV3.mo85677T();
        }
        if (C65770a0.f189185s != null && (a0Var = C65770a0.f189185s) != null && (hVar = a0Var.f189192f) != null) {
            hVar.mo82737b(3, jSONObject, false);
        }
    }

    /* renamed from: b5 */
    public boolean mo89049b5() {
        return C62042e.f176370a.mo87030O0();
    }

    /* renamed from: dl */
    public void mo89050dl(long j) {
        FinderLiveService.f159376d.mo77624a(j);
    }

    /* renamed from: eE */
    public void mo89051eE() {
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.mo77619V();
        C39981t0 t0Var = (C39981t0) finderLiveService.mo77630e(C39981t0.class);
        if (t0Var != null) {
            t0Var.f107203r = true;
        }
    }

    /* renamed from: eF */
    public void mo89052eF() {
        FinderLiveService.f159376d.mo77610M();
    }

    /* renamed from: fQ */
    public void mo89053fQ(int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onVisitorEnterRoomMicFail errCode: ");
        int i2 = i;
        sb.append(i);
        sb.append(" roomId: ");
        sb.append(j);
        sb.append(" liveId: ");
        long j3 = j2;
        sb.append(j3);
        Log.m105924i("FinderLiveMicWatcher", sb.toString());
        C11348f.C11349a.m11178b(C59319a.f169618b, "mic_visitorEnterRoomFail", false, (C11348f.C11352b) null, false, false, new C0628v3(i, j, j3), 28, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051 A[Catch:{ Exception -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i70(y50.C66505a r8) {
        /*
            r7 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r8, r0)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            java.lang.String r1 = "Finder.FinderLiveService"
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r0.mo77630e(r2)     // Catch:{ Exception -> 0x00d3 }
            cl1.u r0 = (cl1.C55001u) r0     // Catch:{ Exception -> 0x00d3 }
            if (r0 == 0) goto L_0x00ed
            d50.h r2 = r0.f154421r     // Catch:{ Exception -> 0x00d3 }
            r3 = 0
            if (r2 == 0) goto L_0x001e
            com.tencent.trtc.TRTCCloudDef$TRTCParams r2 = r2.f166250a     // Catch:{ Exception -> 0x00d3 }
            goto L_0x001f
        L_0x001e:
            r2 = r3
        L_0x001f:
            if (r2 != 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            java.lang.String r4 = r8.f191315h     // Catch:{ Exception -> 0x00d3 }
            r2.privateMapKey = r4     // Catch:{ Exception -> 0x00d3 }
        L_0x0026:
            j50.a r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x0034
            java.lang.String r5 = r8.f191315h     // Catch:{ Exception -> 0x00d3 }
            if (r5 != 0) goto L_0x0031
            r5 = r4
        L_0x0031:
            r2.mo85237y0(r5)     // Catch:{ Exception -> 0x00d3 }
        L_0x0034:
            te3.cq2 r2 = new te3.cq2     // Catch:{ Exception -> 0x00d3 }
            r2.<init>()     // Catch:{ Exception -> 0x00d3 }
            byte[] r8 = r8.f191317j     // Catch:{ Exception -> 0x00d3 }
            if (r8 != 0) goto L_0x003e
            goto L_0x004e
        L_0x003e:
            r2.parseFrom(r8)     // Catch:{ Exception -> 0x0042 }
            goto L_0x004f
        L_0x0042:
            r8 = move-exception
            java.lang.String r2 = "safeParser"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00d3 }
            r6 = 0
            r5[r6] = r8     // Catch:{ Exception -> 0x00d3 }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r4, r5)     // Catch:{ Exception -> 0x00d3 }
        L_0x004e:
            r2 = r3
        L_0x004f:
            if (r2 == 0) goto L_0x00ed
            te3.zp2 r8 = r2.f182556f     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r2 = r8.f186807e     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r4 = r8.f186806d     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r8 = r8.f186796Q     // Catch:{ Exception -> 0x00d3 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d3 }
            r5.<init>()     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r6 = "streamId:"
            r5.append(r6)     // Catch:{ Exception -> 0x00d3 }
            r5.append(r2)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r6 = ", recordId:"
            r5.append(r6)     // Catch:{ Exception -> 0x00d3 }
            r5.append(r4)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r6 = ", pushArg:"
            r5.append(r6)     // Catch:{ Exception -> 0x00d3 }
            r5.append(r8)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00d3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)     // Catch:{ Exception -> 0x00d3 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x00d3 }
            if (r5 == 0) goto L_0x0090
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x00d3 }
            if (r5 == 0) goto L_0x0090
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x00d3 }
            if (r5 != 0) goto L_0x00ed
        L_0x0090:
            c30.d r5 = new c30.d     // Catch:{ Exception -> 0x00d3 }
            r5.<init>()     // Catch:{ Exception -> 0x00d3 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x00d3 }
            if (r6 != 0) goto L_0x00a1
            java.lang.String r6 = "userdefine_streamid_main"
            r5.mo110094b(r6, r2)     // Catch:{ Exception -> 0x00d3 }
        L_0x00a1:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x00d3 }
            if (r2 != 0) goto L_0x00ad
            java.lang.String r2 = "userdefine_record_id"
            r5.mo110094b(r2, r4)     // Catch:{ Exception -> 0x00d3 }
        L_0x00ad:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x00d3 }
            if (r2 != 0) goto L_0x00b9
            java.lang.String r2 = "userdefine_push_args"
            r5.mo110094b(r2, r8)     // Catch:{ Exception -> 0x00d3 }
        L_0x00b9:
            c30.g r8 = new c30.g     // Catch:{ Exception -> 0x00d3 }
            r8.<init>()     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r2 = "Str_uc_params"
            r8.mo145967r(r2, r5)     // Catch:{ Exception -> 0x00d3 }
            d50.h r0 = r0.f154421r     // Catch:{ Exception -> 0x00d3 }
            if (r0 == 0) goto L_0x00c9
            com.tencent.trtc.TRTCCloudDef$TRTCParams r3 = r0.f166250a     // Catch:{ Exception -> 0x00d3 }
        L_0x00c9:
            if (r3 != 0) goto L_0x00cc
            goto L_0x00ed
        L_0x00cc:
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00d3 }
            r3.businessInfo = r8     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00ed
        L_0x00d3:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "setupSdkParam fail:"
            r0.append(r2)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r8)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uc1.C65323p.i70(y50.a):void");
    }

    public void i80() {
        FinderLiveService.f159376d.mo77620W();
    }

    /* renamed from: iQ */
    public void mo89056iQ() {
        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
        wVar.f151902F++;
        Log.m105918d("HABBYGE-MALI.HellLiveVisitorReoprter", "HABBYGE-MALI, setForbidden: " + wVar.f151902F);
    }

    /* renamed from: iV */
    public C60735a mo89057iV() {
        FinderLiveService.f159376d.getClass();
        return FinderLiveService.f159378f;
    }

    /* renamed from: ig */
    public void mo89058ig(LivePreviewView livePreviewView, C58114h hVar, C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(hVar, "liveRoomModel");
        C87412m.m108594g(lVar, "action");
        FinderLiveService.f159376d.getClass();
        Log.m105924i("Finder.FinderLiveService", "trtc enterRoom liveCore: " + FinderLiveService.f159378f);
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar instanceof C62197e) {
            if (aVar != null) {
                C54408d.C54409a.m61122b(aVar, hVar, false, false, 6, (Object) null);
            }
            C62042e.f176370a.mo87038R1(FinderLiveService.f159378f);
            C60735a aVar2 = FinderLiveService.f159378f;
            C62197e eVar = aVar2 instanceof C62197e ? (C62197e) aVar2 : null;
            if (eVar != null) {
                C28595x4 x4Var = new C28595x4(lVar);
                if (livePreviewView != null) {
                    eVar.f173033s = livePreviewView;
                }
                eVar.mo75218i(x4Var);
            }
        }
    }

    public C61788m jq0() {
        return new C61781k();
    }

    /* renamed from: mm */
    public boolean mo89060mm(String str) {
        return C0639y1.f1510a.mo613e(str);
    }

    public void na0(C45795b bVar, int i) {
        C87412m.m108594g(bVar, "liveData");
        FinderLiveService.f159376d.getClass();
        Log.m105924i("Finder.FinderLiveService", "checkAcceptMicType micType:" + i);
        ((C54963d0) bVar.mo71262a(C54963d0.class)).f154078u = i != 1 ? i != 2 ? 0 : 4 : 3;
    }

    public void nh0() {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        boolean z = aVar instanceof C54655b;
        if (z) {
            if ((z ? (C54655b) aVar : null) != null) {
                C61620c cVar = C61620c.C61622b.f175234a;
                cVar.getClass();
                Log.m105924i("MicroMsg.RemoteUserConfigHelper", "clear mRemoteUserConfigList size: " + cVar.f175229a.size());
                cVar.f175229a.clear();
            }
        }
    }

    /* renamed from: oH */
    public void mo89063oH(long j, String str) {
        FinderLiveService.f159376d.getClass();
        Log.m105924i("Finder.FinderLiveService", "startBattleStartDelayTimer delay:" + j + " battleId:" + str);
        if (str != null) {
            MMHandlerThread.removeRunnable(FinderLiveService.f159361N);
            FinderLiveService.C55920b bVar = new FinderLiveService.C55920b(str);
            FinderLiveService.f159361N = bVar;
            MMHandlerThread.postToMainThreadDelayed(bVar, j);
        }
    }

    /* renamed from: ra */
    public void mo89064ra() {
        FinderLiveService.f159376d.getClass();
        Log.m105924i("Finder.FinderLiveService", "removeBattleStartDelayTimer");
        MMHandlerThread.removeRunnable(FinderLiveService.f159361N);
    }

    /* renamed from: rc */
    public void mo89065rc() {
        FinderLiveService.f159376d.mo77609L();
    }

    /* renamed from: t9 */
    public void mo89066t9(int i) {
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75800f(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = r1.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w90() {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0017
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.mo82881c()
            if (r1 != r3) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 == 0) goto L_0x0039
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo77630e(r1)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x002b
            int r0 = r0.mo75996d3()
            if (r0 != r3) goto L_0x002b
            r2 = 1
        L_0x002b:
            if (r2 == 0) goto L_0x0039
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r0 == 0) goto L_0x0039
            cj1.p4 r1 = new cj1.p4
            r1.<init>()
            r0.mo85676R(r1)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uc1.C65323p.w90():void");
    }

    /* renamed from: xA */
    public boolean mo89068xA() {
        return C54781k2.f153552a.mo75682c();
    }

    /* renamed from: zq */
    public void mo89069zq() {
        FinderLiveService.f159376d.mo77621X();
    }
}
