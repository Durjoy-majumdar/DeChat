package uk1;

import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Util;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87413o;
import j50.C60735a;
import p50.C62197e;
import rx3.C13598b0;
import u62.C22597f;

/* renamed from: uk1.e */
public final class C65408e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45795b f188220d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65408e(C45795b bVar) {
        super(0);
        this.f188220d = bVar;
    }

    public Object invoke() {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
        if (eVar != null) {
            eVar.mo87275R0(((C54991o) this.f188220d.mo71262a(C54991o.class)).f154254S2, Util.currentTicks(), false, (MMVideoFrameLayout<C22597f>) null);
        }
        return C13598b0.f38549a;
    }
}
