package hl1;

import al1.C54127h;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C45681e1;
import er1.C58713e5;
import er1.C58730g5;
import fy3.C32224a;
import gy3.C87413o;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C48924by0;
import te3.C64265bq2;
import te3.C64273c21;
import vk1.C65762c;

/* renamed from: hl1.y3 */
public final class C60049y3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60044x3 f171373d;

    /* renamed from: e */
    public final /* synthetic */ FinderObject f171374e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60049y3(C60044x3 x3Var, FinderObject finderObject) {
        super(0);
        this.f171373d = x3Var;
        this.f171374e = finderObject;
    }

    public Object invoke() {
        C60044x3 x3Var;
        C65762c cVar;
        C54127h data;
        LiveRoomControllerStore liveRoomControllerStore;
        C64273c21 c212;
        LiveConfig liveConfig;
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        long j = ((C55001u) this.f171373d.mo83051g(cls2)).f154416j;
        String str = this.f171373d.f171363i;
        Log.m105924i(str, "localId:" + j + " fetchId:" + this.f171374e.f164794id);
        if (j != 0) {
            FinderObject finderObject = this.f171374e;
            if (finderObject.f164794id == j && (cVar = x3Var.f166848f) != null) {
                ((C54991o) (x3Var = this.f171373d).mo83051g(cls)).mo76026x4(finderObject);
                C55001u uVar = (C55001u) x3Var.mo83051g(cls2);
                String str2 = finderObject.sessionBuffer;
                if (str2 == null) {
                    str2 = "";
                }
                uVar.f154424u = str2;
                C64273c21 c213 = finderObject.liveInfo;
                boolean z = true;
                if (c213 != null) {
                    ((C55001u) x3Var.mo83051g(cls2)).mo76042m3(c213);
                    C48924by0 by02 = c213.f182402p0;
                    if (by02 != null) {
                        C45681e1.f123485a.mo71179a((C54991o) x3Var.mo83051g(cls), "handleOnGetFeedObject", by02);
                    }
                    C64265bq2 bq22 = c213.f182358D;
                    if (bq22 != null) {
                        ((C55001u) x3Var.mo83051g(cls2)).f154419p = bq22;
                    }
                    C54127h hVar = x3Var.f166849g;
                    LiveConfig liveConfig2 = hVar != null ? hVar.f151977d : null;
                    if (liveConfig2 != null) {
                        liveConfig2.f157064e = c213.f182392d;
                    }
                    if ((hVar == null || (liveConfig = hVar.f151977d) == null || !liveConfig.f157048F) ? false : true) {
                        C54991o oVar = (C54991o) x3Var.mo83051g(cls);
                        C54127h hVar2 = x3Var.f166849g;
                        oVar.f154344n3 = hVar2 != null ? hVar2.f151981h : null;
                    }
                    C54127h hVar3 = x3Var.f166849g;
                    LiveConfig liveConfig3 = hVar3 != null ? hVar3.f151977d : null;
                    if (liveConfig3 != null) {
                        liveConfig3.f157048F = false;
                    }
                    Log.m105924i(x3Var.f171363i, "reset staticConfig forceFetchObject!");
                }
                FinderObject finderObject2 = ((C54991o) x3Var.mo83051g(cls)).f154341n;
                if (finderObject2 == null || (c212 = finderObject2.liveInfo) == null || c212.f182410x != 1) {
                    z = false;
                }
                if (z) {
                    C56032b.fillBlurBg$default(cVar, ((C54991o) x3Var.mo83051g(cls)).f154345o, false, 2, (Object) null);
                }
                C65762c cVar2 = x3Var.f166848f;
                if (!(cVar2 == null || (data = cVar2.getData()) == null || (liveRoomControllerStore = data.f151979f) == null)) {
                    FinderLiveService.m63770d(FinderLiveService.f159376d, x3Var.f166851d, liveRoomControllerStore, cVar, 0, x3Var.f166850h, 8, (Object) null);
                }
                C58730g5 g5Var = C58730g5.f168158a;
                C58730g5.m68220e(g5Var, "RV_VISITOR_" + ((C55001u) x3Var.mo83051g(cls2)).f154420q.f182392d, C58713e5.f168089q.f168101b, (C89349b) null, false, false, false, 60, (Object) null);
                cVar.showProgress();
                cVar.showBlurBg();
                C65762c cVar3 = x3Var.f166848f;
                if (cVar3 != null) {
                    cVar3.prepareToStart(false);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
