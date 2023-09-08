package cj1;

import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C45983e0;
import gy3.C87413o;
import lu3.C34379c;
import rx3.C13598b0;
import te3.C64273c21;
import zt3.C119157j;

/* renamed from: cj1.u4 */
public final class C54840u4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45983e0 f153742d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54840u4(C45983e0 e0Var) {
        super(0);
        this.f153742d = e0Var;
    }

    public Object invoke() {
        long j = this.f153742d.f124000d;
        Class cls = C54991o.class;
        C45795b bVar = C45795b.f123698n;
        if (bVar != null) {
            C55001u uVar = (C55001u) bVar.mo71262a(C55001u.class);
            StringBuilder sb = new StringBuilder();
            sb.append("keepAliveGuard it.isLiveStarted():");
            sb.append(((C54991o) uVar.business(cls)).mo75999e4());
            sb.append(" heartbeatGuardEnable:");
            sb.append(C54749e2.f153457a > 0);
            sb.append(" liveId:");
            C64273c21 c212 = uVar.f154420q;
            sb.append(c212 != null ? Long.valueOf(c212.f182392d) : null);
            sb.append(" HEART_BEAT_GUARD_INTERVAL:");
            sb.append(C54749e2.f153457a);
            Log.m105924i("FinderLiveGuard", sb.toString());
            if (C54749e2.f153459c) {
                if (((C54991o) uVar.business(cls)).mo75999e4()) {
                    FinderLiveService.C29962d dVar = new FinderLiveService.C29962d(uVar.f154420q.f182392d);
                    C34379c<?> cVar = C54749e2.f153460d;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    C119157j jVar = (C119157j) C119157j.f356862d;
                    jVar.getClass();
                    C54749e2.f153460d = jVar.mo183892w(dVar, j + ((long) CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL), false);
                } else {
                    C34379c<?> cVar2 = C54749e2.f153460d;
                    if (cVar2 != null) {
                        cVar2.cancel(false);
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
