package zg1;

import android.os.Bundle;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57941h;
import d60.C58124b;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import o40.C61937h;
import ok1.C62042e;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49756hv0;
import te3.C52013xs0;
import te3.C64756up2;
import vo1.C65770a0;
import yg1.C16006g;

/* renamed from: zg1.i */
public final class C66811i extends C16006g {

    /* renamed from: c */
    public final String f191935c = "LiveAudioBgInfoInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66811i(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        Class cls = C54991o.class;
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150916N(linkedList);
        C49756hv0 hv02 = new C49756hv0();
        boolean z = false;
        C13598b0 b0Var = null;
        if (xs02 != null) {
            if (!(xs02.f144906h != null)) {
                xs02 = null;
            }
            if (xs02 != null) {
                C89349b bVar = xs02.f144906h;
                hv02.parseFrom(bVar != null ? bVar.mo123703f() : null);
            }
        }
        C64756up2 up22 = hv02.f134895d;
        if (((C54991o) this.f43066a.mo71262a(cls)).mo75960G3()) {
            z = true;
        }
        boolean N0 = C62042e.f176370a.mo87027N0();
        String str = this.f191935c;
        StringBuilder sb = new StringBuilder();
        sb.append("receive audio bg info = ");
        sb.append(up22 != null ? C61937h.m72709h(up22) : null);
        sb.append(", isAudioModeNow = ");
        sb.append(z);
        sb.append(", isAnchor = ");
        sb.append(N0);
        Log.m105924i(str, sb.toString());
        ((C54991o) this.f43066a.mo71262a(cls)).f154230N = up22;
        ((C54991o) this.f43066a.mo71262a(cls)).f154254S2 = null;
        if (!N0 && z) {
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.mo77606G();
            C57941h hVar = C65770a0.f189184r.mo89819a().f189192f;
            if (hVar != null) {
                hVar.mo82740n();
            }
            finderLiveService.getClass();
            C56032b bVar2 = FinderLiveService.f159379g;
            if (bVar2 != null) {
                C58124b.C58125b bVar3 = C58124b.C58125b.FINDER_LIVE_MODE_SWITCH;
                Bundle bundle = new Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
                C13598b0 b0Var2 = C13598b0.f38549a;
                bVar2.statusChange(bVar3, bundle);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                ((C54991o) this.f43066a.mo71262a(cls)).f154237P.postValue(up22);
            }
        }
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20071};
    }
}
