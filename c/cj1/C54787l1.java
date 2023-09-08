package cj1;

import android.os.Bundle;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58110d;
import d50.C58113g;
import d50.C58114h;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32231t;
import fy3.C32232u;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49291ej0;
import te3.C52005xq0;
import te3.C64273c21;
import tf0.C64916p1;

/* renamed from: cj1.l1 */
public final class C54787l1 extends C87413o implements C32232u<Boolean, Integer, Integer, String, C58113g, TRTCCloudDef.TRTCParams, C52005xq0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32231t<Boolean, Integer, Integer, String, Bundle, C49291ej0, C13598b0> f153575d;

    /* renamed from: e */
    public final /* synthetic */ C54806r1 f153576e;

    /* renamed from: f */
    public final /* synthetic */ C45795b f153577f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54787l1(C32231t<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, ? super C49291ej0, C13598b0> tVar, C54806r1 r1Var, C45795b bVar) {
        super(7);
        this.f153575d = tVar;
        this.f153576e = r1Var;
        this.f153577f = bVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        String str = (String) obj4;
        C58113g gVar = (C58113g) obj5;
        TRTCCloudDef.TRTCParams tRTCParams = (TRTCCloudDef.TRTCParams) obj6;
        C52005xq0 xq02 = (C52005xq0) obj7;
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(str, "errMsg");
        C87412m.m108594g(gVar, "liveRoomInfo");
        C87412m.m108594g(tRTCParams, "trtcParams");
        C87412m.m108594g(xq02, "resp");
        Log.m105924i("FinderLiveExternalHelper", "joinLive success:" + booleanValue + ", errCode:" + intValue + " cliBuff:" + xq02.f144868w);
        Bundle bundle = new Bundle();
        C32231t<Boolean, Integer, Integer, String, Bundle, C49291ej0, C13598b0> tVar = this.f153575d;
        C54806r1 r1Var = this.f153576e;
        C45795b bVar = this.f153577f;
        tVar.mo14122L(Boolean.valueOf(booleanValue), Integer.valueOf(intValue), Integer.valueOf(intValue2), str, bundle, null);
        if (booleanValue) {
            r1Var.getClass();
            Class cls3 = C54979h1.class;
            if (C62042e.f176370a.mo87027N0()) {
                boolean z = xq02.f144806C != 1;
                boolean z2 = ((C54979h1) bVar.mo71262a(cls3)).f154134f;
                Log.m105924i("FinderLiveExternalHelper", "handleJoinLiveWxshopResponse haveBindShop:" + z2 + ", shopping_not_available:" + xq02.f144806C + ", canShowShopEntrance:" + z);
                if (z && !z2) {
                    ((C54979h1) bVar.mo71262a(cls3)).mo75943j3(true);
                }
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                C64916p1.C64917a.m76437d((C64916p1) c, 14, (C32226l) null, 2, (Object) null);
            }
            ((C54991o) bVar.mo71262a(cls)).f154376v2.f513a.clear();
            ((C54991o) bVar.mo71262a(cls)).f154376v2.f513a.addAll(xq02.f144869x);
            ((C54991o) bVar.mo71262a(cls)).f154376v2.f514b = xq02.f144868w;
            ((C54991o) bVar.mo71262a(cls)).mo76022t4(true);
            if (((C55001u) bVar.mo71262a(cls2)).f154421r == null) {
                ((C55001u) bVar.mo71262a(cls2)).mo76043n3(new C58114h(tRTCParams, gVar, new C58110d("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI")));
            } else {
                C58114h hVar = ((C55001u) bVar.mo71262a(cls2)).f154421r;
                if (hVar != null) {
                    hVar.f166250a = tRTCParams;
                }
                C58114h hVar2 = ((C55001u) bVar.mo71262a(cls2)).f154421r;
                if (hVar2 != null) {
                    hVar2.f166251b = gVar;
                }
                C58114h hVar3 = ((C55001u) bVar.mo71262a(cls2)).f154421r;
                if (hVar3 != null) {
                    hVar3.f166252c = new C58110d("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI");
                }
            }
            r1Var.f153637b.f183045d = ((C55001u) bVar.mo71262a(cls2)).f154420q.f182396h;
            r1Var.f153637b.f183046e = ((C55001u) bVar.mo71262a(cls2)).f154420q.f182392d;
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.mo77647u();
            C64273c21 c212 = xq02.f144846f;
            finderLiveService.mo77639m(0, c212 != null ? c212.f182392d : 0);
        }
        return C13598b0.f38549a;
    }
}
