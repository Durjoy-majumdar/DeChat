package uk1;

import b50.C54421g;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import f50.C58924d;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87413o;
import j50.C60735a;
import ok1.C62042e;
import p50.C11827h;
import p50.C62197e;
import rx3.C13598b0;
import u62.C22597f;

/* renamed from: uk1.d */
public final class C65407d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45795b f188219d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65407d(C45795b bVar) {
        super(0);
        this.f188219d = bVar;
    }

    public Object invoke() {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
        if (eVar != null) {
            eVar.mo87275R0(((C54991o) this.f188219d.mo71262a(C54991o.class)).f154254S2, Util.currentTicks(), false, (MMVideoFrameLayout<C22597f>) null);
        }
        C62042e eVar2 = C62042e.f176370a;
        int w0 = C62042e.m72810w0(eVar2, this.f188219d, false, false, 4, (Object) null);
        C60735a aVar2 = FinderLiveService.f159378f;
        C62197e eVar3 = aVar2 instanceof C62197e ? (C62197e) aVar2 : null;
        if (eVar3 != null) {
            eVar2.mo87034Q();
            C14197c cVar = C14197c.f39650d;
            if (eVar3.f173000L == 0) {
                C58924d dVar = eVar3.f176822Y0.f152627a;
                if (dVar != null) {
                    dVar.setRenderMode(1);
                }
            } else {
                C58924d dVar2 = eVar3.f176822Y0.f152627a;
                if (dVar2 != null) {
                    dVar2.setRenderMode(w0);
                }
            }
            eVar3.mo87273O0(eVar3.f176828e1);
            boolean c = eVar3.f176822Y0.mo75229c();
            Log.m105924i("MicroMsg.LiveCoreVisitor", "switchToCdnMode renderMode:" + w0 + ", getScene():" + eVar3.f173000L + ", cacheMute:" + eVar3.f176828e1 + ", playerView:" + null + ", isPlaying:" + c);
            if (!c) {
                C54421g gVar = eVar3.f176822Y0;
                gVar.f152627a = gVar.f152627a;
                Log.m105924i("MicroMsg.LiveCdnPlayerManager", "setTXLivePlayer: " + gVar.f152627a);
            }
            eVar3.mo87255B0(eVar3.f176824a1, (TXCloudVideoView) null, new C11827h(cVar));
        }
        return C13598b0.f38549a;
    }
}
