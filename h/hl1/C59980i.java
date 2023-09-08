package hl1;

import b50.C54408d;
import b50.C54421g;
import cj1.C28574j6;
import cj1.C54820t;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58107a;
import d50.C58110d;
import d50.C58113g;
import d50.C58114h;
import di3.C86312j;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import gy3.C8480h;
import hp3.C87581a;
import java.util.HashMap;
import ob0.C89132b;
import ok1.C62042e;
import p50.C62197e;
import p565ir.C60606n;
import qj1.C63170ze;
import rx3.C13598b0;
import sk1.C63947a;
import te3.C52005xq0;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64890zp2;
import vk1.C65762c;

/* renamed from: hl1.i */
public final class C59980i<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C59988k f171133a;

    public C59980i(C59988k kVar) {
        this.f171133a = kVar;
    }

    public Object call(Object obj) {
        C65762c cVar;
        C62197e C;
        C28574j6 j6Var;
        C54421g gVar;
        C89132b.C89134c cVar2 = (C89132b.C89134c) obj;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C52005xq0 xq02 = (C52005xq0) cVar2.f256796d;
        C64273c21 c212 = xq02.f144846f;
        C64265bq2 bq22 = xq02.f144844e;
        String str = this.f171133a.f171222i;
        StringBuilder sb = new StringBuilder();
        sb.append("JoinLiveCallback2 errType:");
        sb.append(cVar2.f256793a);
        sb.append(" errCode:");
        sb.append(cVar2.f256794b);
        sb.append(" errMsg:");
        sb.append(cVar2.f256795c);
        sb.append(",respLiveInfo:");
        sb.append(c212 != null ? c212.hashCode() : 0);
        sb.append(',');
        sb.append(C63947a.f181274a.mo88736v(c212));
        sb.append(",respLiveSdkInfo is null:");
        sb.append(bq22 == null);
        sb.append('!');
        Log.m105924i(str, sb.toString());
        if (cVar2.f256793a == 0 && cVar2.f256794b == 0 && c212 != null && bq22 != null) {
            C59988k kVar = this.f171133a;
            ((C55001u) kVar.mo83051g(cls)).mo76039j3(bq22, c212, xq02.f144842d);
            C54991o oVar = (C54991o) kVar.mo83051g(cls2);
            C64273c21 c213 = xq02.f144846f;
            oVar.f154354q = c213 != null ? (int) c213.f182367M : 0;
            ((C54991o) kVar.mo83051g(cls2)).f154388y0 = xq02.f144870x0;
            C54991o oVar2 = (C54991o) kVar.mo83051g(cls2);
            C59988k kVar2 = this.f171133a;
            TRTCCloudDef.TRTCParams tRTCParams = new TRTCCloudDef.TRTCParams();
            C58969q b = C58961d.f168673a.mo84155b(((C54991o) kVar2.mo83051g(cls2)).f154345o);
            String nickname = b != null ? b.getNickname() : "";
            C58113g gVar2 = new C58113g(nickname, ((C55001u) kVar2.mo83051g(cls)).f154420q.f182392d, 0, (String) null, 0, 0, (C58107a) null, 0, 0, 0, (HashMap) null, 0, 0, (C64890zp2) null, (String) null, 0, 0, 131068, (C8480h) null);
            C54820t.f153690f.mo75784a(nickname, bq22, c212, tRTCParams, gVar2, 2, kVar2.f166851d);
            C55001u uVar = (C55001u) kVar2.mo83051g(cls);
            C58114h hVar = new C58114h(tRTCParams, gVar2, new C58110d(kVar2.f166847e.getClass().getName()));
            C62197e C2 = kVar2.mo84868C();
            if (!(C2 == null || (gVar = C2.f176822Y0) == null)) {
                gVar.mo75234j(hVar.f166251b, ((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(((C55001u) kVar2.mo83051g(cls)).f154420q), C62042e.f176370a.mo87034Q());
            }
            uVar.mo76043n3(hVar);
            C59988k kVar3 = this.f171133a;
            boolean e4 = ((C54991o) kVar3.mo83051g(cls2)).mo75999e4();
            String str2 = kVar3.f171222i;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("JoinLiveCallback2 isDestroyed:");
            C65762c cVar3 = kVar3.f166848f;
            sb4.append(cVar3 != null ? Boolean.valueOf(cVar3.isDestroyed()) : null);
            sb4.append(",isLiveStart:");
            sb4.append(e4);
            sb4.append(",liveRoomModel:");
            sb4.append(((C55001u) kVar3.mo83051g(cls)).f154421r);
            sb4.append(", liveExtFlag:");
            sb4.append(((C54991o) kVar3.mo83051g(cls2)).f154388y0);
            Log.m105924i(str2, sb4.toString());
            C63170ze zeVar = kVar3.f171224j;
            if (zeVar != null) {
                zeVar.mo88095h1(true);
            }
            C63170ze zeVar2 = kVar3.f171224j;
            if (zeVar2 != null) {
                zeVar2.mo10792g(0);
            }
            C63170ze zeVar3 = kVar3.f171224j;
            if (zeVar3 != null) {
                C62042e eVar = C62042e.f176370a;
                TXLivePlayConfig Q = eVar.mo87034Q();
                C45795b bVar = kVar3.f166851d;
                C65762c cVar4 = kVar3.f166848f;
                C63170ze.m74522g1(zeVar3, 0, Q, C62042e.m72810w0(eVar, bVar, cVar4 != null ? cVar4.isLandscape() : false, false, 4, (Object) null), false, false, C8558j.f27637d, 9, (Object) null);
            }
            if (e4) {
                C59977h.f171128a.mo84861b(kVar3);
            } else {
                kVar3.mo84879N(false);
            }
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            long j = ((C55001u) kVar3.mo83051g(cls)).f154420q.f182392d;
            finderLiveService.getClass();
            C28574j6 j6Var2 = FinderLiveService.f159386p0;
            boolean z = j6Var2 != null && j6Var2.f78440b;
            if (!z && (j6Var = FinderLiveService.f159386p0) != null) {
                j6Var.mo56065a();
            }
            Log.m105924i("Finder.FinderLiveService", "resetHeartBeat liveId:" + j + " delay:" + 0 + " heartBeatFinish:" + z + '!');
            finderLiveService.mo77639m(0, j);
            C65762c cVar5 = kVar3.f166848f;
            if (cVar5 != null) {
                C62042e.f176370a.mo87055X1(kVar3.f166851d, cVar5, false);
            }
            C58114h hVar2 = ((C55001u) kVar3.mo83051g(cls)).f154421r;
            if (!(hVar2 == null || (C = kVar3.mo84868C()) == null)) {
                C54408d.C54409a.m61122b(C, hVar2, false, false, 4, (Object) null);
            }
            kVar3.mo84897u();
            kVar3.mo84899w(xq02.f144848g);
            C62042e eVar2 = C62042e.f176370a;
            if (!eVar2.mo87070c1(kVar3.f166851d) && !eVar2.mo87094l1(kVar3.f166851d) && (cVar = kVar3.f166848f) != null) {
                eVar2.mo87124v1(kVar3.f166851d, cVar);
            }
            C65762c cVar6 = kVar3.f166848f;
            if (cVar6 != null) {
                C64273c21 c214 = xq02.f144846f;
                cVar6.processFinderLiveLayerShowInfo(c214 != null ? c214.f182360F : null);
            }
            C65762c cVar7 = this.f171133a.f166848f;
            if (cVar7 != null) {
                C56032b.hideLoadingLayer$default(cVar7, false, 1, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
