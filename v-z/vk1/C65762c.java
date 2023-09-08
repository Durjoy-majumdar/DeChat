package vk1;

import ak1.C54116w;
import al1.C54127h;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import b50.C54421g;
import bl3.C39818r;
import cj1.C0639y1;
import cj1.C28578k5;
import cj1.C54795n5;
import cl1.C54951d;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.tencent.p014mm.live.core.trtc.TRTCVideoRatioLayout;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C86312j;
import er1.C58713e5;
import er1.C58730g5;
import gh1.C59447j;
import gh1.C8322n;
import gy3.C87412m;
import hl1.C59954b3;
import hl1.C59974g;
import hl1.C59977h;
import hl1.C59978h1;
import hl1.C59982i1;
import hl1.C59988k;
import hl1.C60044x3;
import ht1.C60172g4;
import java.lang.ref.SoftReference;
import java.util.Map;
import o40.C61926c;
import ok1.C62042e;
import p50.C62193a;
import p50.C62197e;
import pe3.C89349b;
import qj1.C12475jc;
import qj1.C62979sf;
import qj1.C62983sh;
import qj1.C63118y3;
import qj1.C63170ze;
import qt1.C63329b;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36570n;
import tf0.C64919s1;
import wg1.C66093v1;
import yg1.C66636e;
import yk1.C66662a;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: vk1.c */
public abstract class C65762c extends C56032b {
    private C62197e liveCore;
    private C59974g liveEndUIC;
    private C60044x3 livePrepareUIC;
    private C59988k livingUIC;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65762c(Context context, Fragment fragment, AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        C87412m.m108594g(context, "context");
        MMActivity mMActivity = (MMActivity) context;
        this.livePrepareUIC = new C60044x3(mMActivity);
        this.livingUIC = new C59988k(mMActivity);
        this.liveEndUIC = new C59974g(mMActivity);
    }

    public final C62197e getLiveCore() {
        return C62193a.f176816k1.mo87262c(getData().f151977d.f157064e);
    }

    public final C59974g getLiveEndUIC() {
        return this.liveEndUIC;
    }

    public final C60044x3 getLivePrepareUIC() {
        return this.livePrepareUIC;
    }

    public abstract /* synthetic */ int getLiveRole();

    public final C59988k getLivingUIC() {
        return this.livingUIC;
    }

    public final C60044x3 getPrepareUIC() {
        return this.livePrepareUIC;
    }

    public final C59988k getStartUIC() {
        return this.livingUIC;
    }

    public void prepareToStart(boolean z) {
        C66662a aVar;
        C54421g gVar;
        C54127h data;
        LiveRoomControllerStore liveRoomControllerStore;
        TRTCVideoRatioLayout renderRatioLayout;
        C54795n5 k;
        boolean z2 = z;
        C59988k kVar = this.livingUIC;
        if (kVar != null) {
            Class cls = C54991o.class;
            C63329b bVar = C63329b.f179694a;
            bVar.mo88233d(kVar.f171222i, "startLive " + z2);
            Long l = null;
            long j = 0;
            if (z2) {
                Class cls2 = C54979h1.class;
                C62042e eVar = C62042e.f176370a;
                if (eVar.mo87095m() && (k = kVar.mo83048k()) != null) {
                    k.mo75703G((Intent) null);
                }
                C65762c cVar = kVar.f166848f;
                if (cVar != null) {
                    C56032b.hideLoadingLayer$default(cVar, false, 1, (Object) null);
                }
                C12475jc jcVar = kVar.f171256z;
                if (jcVar != null) {
                    jcVar.mo12133c1();
                }
                C59988k.m69862z(kVar, true, false, 2, (Object) null);
                if (((C54991o) kVar.mo83051g(cls)).mo75999e4()) {
                    C59988k.m69861q(kVar, (C13604l) null, false, 3, (Object) null);
                }
                C54979h1 h1Var = (C54979h1) kVar.mo83051g(cls2);
                C0740i2 i2Var = ((C54979h1) kVar.f166851d.mo71262a(cls2)).f154147v;
                C64919s1 s1Var = i2Var instanceof C64919s1 ? (C64919s1) i2Var : null;
                if (s1Var != null) {
                    j = s1Var.mo13074d();
                }
                h1Var.f154148w = j;
                C65762c cVar2 = kVar.f166848f;
                if (cVar2 != null) {
                    eVar.mo87124v1(kVar.f166851d, cVar2);
                }
                C62983sh shVar = kVar.f171229n;
                if (!(shVar == null || (renderRatioLayout = shVar.f178711r.getRenderRatioLayout()) == null)) {
                    renderRatioLayout.post(new C59978h1(kVar));
                }
                C63118y3 y3Var = kVar.f171156E1;
                if (y3Var != null) {
                    y3Var.mo88047d1();
                }
                C62979sf sfVar = kVar.f171179Q0;
                if (sfVar != null) {
                    sfVar.mo87915d1(((C54991o) kVar.mo83051g(cls)).mo75966J4());
                }
                C65762c cVar3 = kVar.f166848f;
                if (cVar3 != null) {
                    C58124b.C7172a.m7372a(cVar3, C58124b.C58125b.MAXI_WINDOW, (Bundle) null, 2, (Object) null);
                }
                C59977h.f171128a.mo84861b(kVar);
                C61926c.m72666K(200, new C59982i1(kVar));
                ((C66636e) kVar.mo83051g(C66636e.class)).mo90686c3();
                C61926c.m72668M(new C59954b3(kVar));
                Log.m105924i(kVar.f171222i, "joinLiveByMiniWin audienceMode:" + ((C54991o) kVar.mo83051g(cls)).mo75996d3());
                kVar.mo84879N(true);
                C65762c cVar4 = kVar.f166848f;
                if (cVar4 != null && (data = cVar4.getData()) != null && (liveRoomControllerStore = data.f151979f) != null) {
                    C59447j.f169870a.mo84557i(liveRoomControllerStore, new C8322n(liveRoomControllerStore));
                    return;
                }
                return;
            }
            Class cls3 = C55001u.class;
            String str = "joinLive " + ((C55001u) kVar.mo83051g(cls3)).mo76038i3() + ",liveMode:" + ((C54991o) kVar.mo83051g(cls)).f154287Z0;
            Log.m105924i(kVar.f171222i, str);
            bVar.mo88233d(kVar.f171222i, str);
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("FINDER_LIVE_MMKV");
            if (mmkv != null) {
                l = Long.valueOf(mmkv.getLong("VISITOR_GIFT_EFFECT_OFF_LIVE_ID", 0));
            }
            long j2 = ((C55001u) kVar.mo83051g(cls3)).f154420q.f182392d;
            ((C54991o) kVar.mo83051g(cls)).f154391y3 = (j2 == 0 || l == null || j2 != l.longValue()) ? false : true;
            Log.m105924i(kVar.f171222i, "initGiftEffectEnable giftEffectOffLiveId:" + l + " curLiveId:" + j2);
            C62197e C = kVar.mo84868C();
            if ((C == null || (gVar = C.f176822Y0) == null) ? false : gVar.mo75229c()) {
                boolean e3 = ((C54951d) kVar.mo83051g(C54951d.class)).mo75869e3();
                C63170ze zeVar = kVar.f171224j;
                if (zeVar != null) {
                    zeVar.mo88094f1(e3);
                }
            }
            C58730g5.m68220e(C58730g5.f168158a, "RV_VISITOR_" + ((C55001u) kVar.mo83051g(cls3)).f154420q.f182392d, C58713e5.f168078f.f168101b, (C89349b) null, false, false, ((C54991o) kVar.mo83051g(cls)).f154364s2, 28, (Object) null);
            C0639y1.f1510a.mo617i();
            C13601g gVar2 = C28578k5.f78446a;
            String str2 = ((C54991o) kVar.mo83051g(cls)).f154345o;
            C87412m.m108594g(str2, "anchorUserName");
            if (Util.isNullOrNil(str2)) {
                Log.m105920e("FinderLive.FinderLiveWatchTimeMgr", "joinLive anchorUserName nil");
            } else {
                ((Map) ((C36570n) C28578k5.f78446a).getValue()).put(str2, Long.valueOf(Util.nowSecond()));
            }
            C66093v1.f189992n.mo61526a(((C55001u) kVar.mo83051g(cls3)).f154420q.f182392d);
            Class cls4 = C60172g4.class;
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            C39818r rVar = C39818r.f106831a;
            String z3 = ((C60172g4) rVar.mo62444c(kVar.f166847e).mo62447c(cls4)).mo12868z3();
            String str3 = "";
            if (z3 == null) {
                z3 = str3;
            }
            String E3 = ((C60172g4) rVar.mo62444c(kVar.f166847e).mo62447c(cls4)).mo12839E3();
            if (E3 != null) {
                str3 = E3;
            }
            wVar.getClass();
            if (C112550d0.m153801u(z3, ",", false)) {
                z3 = C112551y.m153814n(z3, ",", ";", false);
            }
            wVar.f151907K = z3;
            wVar.f151955t = str3;
            long longExtra = kVar.f166847e.getIntent().getLongExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", 0);
            kVar.f166847e.getIntent().removeExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID");
            if (((C55001u) kVar.mo83051g(cls3)).f154415i == null) {
                ((C55001u) kVar.mo83051g(cls3)).f154415i = Integer.valueOf(kVar.f166847e.getIntent().getIntExtra("key_ad_flag", 0));
                kVar.f166847e.getIntent().removeExtra("key_ad_flag");
            }
            if (longExtra != 0) {
                ((C55001u) kVar.mo83051g(cls3)).f154414h = longExtra;
                Log.m105924i(kVar.f171222i, "get fromObjectId:" + C61926c.m72691p(longExtra));
            }
            C54795n5 k2 = kVar.mo83048k();
            if (k2 != null) {
                k2.mo75734f0(kVar.f166847e, ((C55001u) kVar.mo83051g(cls3)).f154420q.f182392d, 2, new C59988k.C59990b(new SoftReference(kVar), kVar.f171222i));
            }
            C65762c cVar5 = kVar.f166848f;
            if (cVar5 != null && (aVar = (C66662a) cVar5.business(C66662a.class)) != null) {
                Log.m105924i("Finder.LiveReportSlice", "markJoinStatusWaitResp");
                aVar.f191682f = 1;
            }
        }
    }

    public final void setLiveCore(C62197e eVar) {
        this.liveCore = eVar;
    }

    public final void setLiveEndUIC(C59974g gVar) {
        this.liveEndUIC = gVar;
    }

    public final void setLivePrepareUIC(C60044x3 x3Var) {
        this.livePrepareUIC = x3Var;
    }

    public final void setLivingUIC(C59988k kVar) {
        this.livingUIC = kVar;
    }

    public void startToEnd() {
    }
}
