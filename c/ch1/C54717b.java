package ch1;

import cj1.C54795n5;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C45684k;
import fj1.C45795b;
import gy3.C87412m;
import nk1.C61791o;
import o40.C61926c;
import qg1.C47826f;
import rl1.C13022d0;
import te3.C48742ao0;
import y50.C66514h;
import y50.C66521k0;
import yg1.C39014a;
import yg1.C66639f;

/* renamed from: ch1.b */
public final class C54717b extends C66639f {

    /* renamed from: a */
    public final C45795b f153357a;

    /* renamed from: b */
    public final String f153358b = "LiveMsgExtFlagInterceptor";

    public C54717b(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f153357a = bVar;
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        C39014a.C39015a aVar2 = aVar;
        C87412m.m108594g(aVar2, "respWrapper");
        C48742ao0 ao02 = aVar2.f105072a;
        if (ao02 != null) {
            C45795b bVar = this.f153357a;
            Class cls = C55001u.class;
            Class cls2 = C54991o.class;
            if (bVar != null) {
                if (((C54991o) bVar.mo71262a(cls2)).f154388y0 != ao02.f130686q) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[heartbeat] checkAnchorAlive isAnchor:");
                    FinderLiveService.f159376d.getClass();
                    sb.append(FinderLiveService.f159380h);
                    sb.append(" localLiveExtFlag:");
                    sb.append(((C54991o) bVar.mo71262a(cls2)).f154388y0);
                    sb.append(" liveExtFlag:");
                    sb.append(ao02.f130686q);
                    sb.append(", filterAnchorExtFlag:");
                    boolean z = FinderLiveService.f159357J;
                    sb.append(z);
                    Log.m105924i("Finder.FinderLiveService", sb.toString());
                    if (!z && !FinderLiveService.f159380h) {
                        if (!mo75609d(((C54991o) bVar.mo71262a(cls2)).f154388y0) && mo75609d(ao02.f130686q)) {
                            Log.m105924i("Finder.FinderLiveService", "[heartbeat] checkAnchorAlive anchor alive expired:true");
                            C66514h hVar = C66521k0.f191361a;
                            if (hVar != null) {
                                hVar.onAnchorConnectionChange(false);
                            }
                        } else if (mo75609d(((C54991o) bVar.mo71262a(cls2)).f154388y0) && !mo75609d(ao02.f130686q)) {
                            Log.m105924i(this.f153358b, "[heartbeat] checkAnchorAlive anchor alive expired:false");
                            C66514h hVar2 = C66521k0.f191361a;
                            if (hVar2 != null) {
                                hVar2.onAnchorConnectionChange(true);
                            }
                        }
                    }
                    Class cls3 = C54963d0.class;
                    Log.m105924i("Finder.FinderLiveService", "[heartbeat] checkLinkMicEnable isAnchor:" + FinderLiveService.f159380h + " localLiveExtFlag:" + ((C54991o) bVar.mo71262a(cls2)).f154388y0 + " liveExtFlag:" + ao02.f130686q + " localEnableLinkMicFun:" + ((C54963d0) bVar.mo71262a(cls3)).f154080w + " localEnableLinkMic:" + ((C54963d0) bVar.mo71262a(cls3)).mo75902I3() + " localEnableLinkMicAntispam:" + ((C54963d0) bVar.mo71262a(cls3)).f154081x);
                    if (FinderLiveService.f159380h) {
                        if (!C61926c.m72696u(ao02.f130686q, 4)) {
                            Log.m105924i("Finder.FinderLiveService", "[heartbeat] checkLinkMicEnable disableLinkMic");
                            ((C54963d0) bVar.mo71262a(cls3)).f154081x = false;
                            ((C54963d0) bVar.mo71262a(cls3)).f154079v = 0;
                            ((C54991o) bVar.mo71262a(cls2)).f154354q &= -65;
                            C61791o.f175673a.mo86722d("checkLinkMicEnable", ((C54991o) bVar.mo71262a(cls2)).f154354q);
                            C54795n5 n5Var = FinderLiveService.f159396y;
                            if (n5Var != null) {
                                C54795n5.C54796a.m61727e(n5Var, ((C55001u) bVar.mo71262a(cls)).f154420q.f182392d, ((C55001u) bVar.mo71262a(cls)).f154416j, ((C54991o) bVar.mo71262a(cls2)).f154354q, 64, 0, (C47826f.C47827a) null, 48, (Object) null);
                            }
                        } else {
                            ((C54963d0) bVar.mo71262a(cls3)).f154081x = true;
                        }
                    } else if (!C61926c.m72696u(ao02.f130686q, 4)) {
                        Log.m105924i("Finder.FinderLiveService", "[heartbeat] checkLinkMicEnable disableLinkMic");
                        ((C54963d0) bVar.mo71262a(cls3)).f154080w = false;
                        ((C54991o) bVar.mo71262a(cls2)).f154354q &= -65;
                        ((C54963d0) bVar.mo71262a(cls3)).f154079v = 0;
                        C61791o.f175673a.mo86722d("checkLinkMicEnable2", ((C54991o) bVar.mo71262a(cls2)).f154354q);
                    }
                    Log.m105924i("Finder.FinderLiveService", "[heartbeat] checkGiftEnable isAnchor:" + FinderLiveService.f159380h + " localLiveExtFlag:" + ((C54991o) bVar.mo71262a(cls2)).f154388y0 + " liveExtFlag:" + ao02.f130686q + " localEnableGiftFun:" + ((C54991o) bVar.mo71262a(cls2)).f154243Q1 + " localEnableGift:" + ((C54991o) bVar.mo71262a(cls2)).mo75963I3() + " localEnableGiftAntispam:" + ((C54991o) bVar.mo71262a(cls2)).f154253S1);
                    if (FinderLiveService.f159380h) {
                        if (!C61926c.m72696u(ao02.f130686q, 2)) {
                            Log.m105924i("Finder.FinderLiveService", "[heartbeat] checkGiftEnable disableGift");
                            ((C54991o) bVar.mo71262a(cls2)).f154253S1 = false;
                            ((C54991o) bVar.mo71262a(cls2)).f154238P1 = 0;
                            ((C54991o) bVar.mo71262a(cls2)).f154354q &= -129;
                            C61791o.f175673a.mo86722d("checkGiftEnable", ((C54991o) bVar.mo71262a(cls2)).f154354q);
                            C54795n5 n5Var2 = FinderLiveService.f159396y;
                            if (n5Var2 != null) {
                                C54795n5.C54796a.m61727e(n5Var2, ((C55001u) bVar.mo71262a(cls)).f154420q.f182392d, ((C55001u) bVar.mo71262a(cls)).f154416j, ((C54991o) bVar.mo71262a(cls2)).f154354q, 128, 0, (C47826f.C47827a) null, 48, (Object) null);
                            }
                        } else {
                            ((C54991o) bVar.mo71262a(cls2)).f154253S1 = true;
                        }
                    } else if (!((C54991o) bVar.mo71262a(cls2)).f154190D && !C61926c.m72696u(ao02.f130686q, 2)) {
                        Log.m105924i("Finder.FinderLiveService", "[heartbeat] checkGiftEnable disableGift");
                        ((C54991o) bVar.mo71262a(cls2)).f154243Q1 = false;
                        ((C54991o) bVar.mo71262a(cls2)).f154354q &= -129;
                        ((C54991o) bVar.mo71262a(cls2)).f154238P1 = 0;
                        C61791o.f175673a.mo86722d("checkGiftEnable", ((C54991o) bVar.mo71262a(cls2)).f154354q);
                    }
                    if (!FinderLiveService.f159380h) {
                        C45684k.f123488a.mo71185f("getlivemsg", ao02.f130686q, bVar);
                    }
                    ((C54991o) bVar.mo71262a(cls2)).mo76002g3("getlivemsg", ao02.f130686q);
                    ((C54991o) bVar.mo71262a(cls2)).mo76005i3("getlivemsg", ao02.f130686q);
                    ((C54991o) bVar.mo71262a(cls2)).mo76000f3("getlivemsg", ao02.f130686q);
                    C54991o oVar = (C54991o) bVar.mo71262a(cls2);
                    C61926c.m72696u(ao02.f130686q, 8);
                    ((C54991o) bVar.mo71262a(cls2)).f154388y0 = ao02.f130686q;
                    ((C13022d0) bVar.mo71262a(C13022d0.class)).mo12536K3();
                }
                ((C54991o) bVar.mo71262a(cls2)).mo76006j3(ao02.f130686q);
            }
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo75609d(int i) {
        return i != -1 && C61926c.m72696u(i, 1);
    }
}
