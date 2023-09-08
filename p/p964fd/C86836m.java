package p964fd;

import co0.C80127b;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82731k;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;
import java.util.concurrent.atomic.AtomicBoolean;
import p830xc.C91165a;

/* renamed from: fd.m */
public class C86836m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f252097d;

    /* renamed from: e */
    public final /* synthetic */ C86826e f252098e;

    public C86836m(C86826e eVar, int i) {
        this.f252098e = eVar;
        this.f252097d = i;
    }

    public void run() {
        Log.m105925i(this.f252098e.mo121291y(), "handleWebViewBackground, type:%s, autoPauseIfNative:%s, autoPauseIfNavigate:%s, isRuntimeInBackground:%s, isPlayingWhenEnterBackground:%s", Integer.valueOf(this.f252097d), Boolean.valueOf(this.f252098e.f252007R), Boolean.valueOf(this.f252098e.f252005Q), Boolean.valueOf(this.f252098e.f252015V), this.f252098e.f252017W);
        C82731k kVar = C82731k.f242051e;
        C86826e eVar = this.f252098e;
        C82732k0 RV = kVar.mo115008RV(eVar.f252005Q, eVar.f252007R);
        Log.m105925i(this.f252098e.mo121291y(), "handleWebViewBackground, autoPauseStrategy: %s", RV);
        C91165a aVar = this.f252098e.f252049s;
        if (!RV.mo114992a(aVar == null ? null : aVar.mo62544g(), C80127b.m97437c(this.f252097d))) {
            AtomicBoolean atomicBoolean = this.f252098e.f252017W;
            if (atomicBoolean != null && atomicBoolean.get()) {
                Log.m105925i(this.f252098e.mo121291y(), "handleWebViewBackground, video not auto pause, try resume, type:%s", Integer.valueOf(this.f252097d));
                this.f252098e.mo121270E(false, true);
                return;
            }
            Log.m105925i(this.f252098e.mo121291y(), "handleWebViewBackground, video not auto pause, ignore resume, type:%s", Integer.valueOf(this.f252097d));
            C86826e eVar2 = this.f252098e;
            C87760d dVar = eVar2.f252033h;
            if (dVar != null && eVar2.f251990A && eVar2.f252017W == null) {
                boolean isPlaying = dVar.isPlaying();
                this.f252098e.f252017W = new AtomicBoolean(isPlaying);
                Log.m105925i(this.f252098e.mo121291y(), "handleWebViewBackground runnable, video playing state when enter background:%s", Boolean.valueOf(isPlaying));
                return;
            }
            return;
        }
        C86826e eVar3 = this.f252098e;
        C87760d dVar2 = eVar3.f252033h;
        if (dVar2 != null && eVar3.f251990A && eVar3.f252017W == null) {
            boolean isPlaying2 = dVar2.isPlaying();
            this.f252098e.f252017W = new AtomicBoolean(isPlaying2);
            Log.m105925i(this.f252098e.mo121291y(), "handleWebViewBackground runnable, video playing state when enter background:%s", Boolean.valueOf(isPlaying2));
            C86826e eVar4 = this.f252098e;
            if (!eVar4.f252034h1 || 1 == this.f252097d || !eVar4.mo121284r()) {
                C86826e eVar5 = this.f252098e;
                if (eVar5.f252025a1.mo125355a(eVar5.f252049s)) {
                    Log.m105924i(this.f252098e.mo121291y(), "handleWebViewBackground runnable, i am pip player, do not pause");
                } else {
                    this.f252098e.mo121269D(false);
                }
            } else {
                Log.m105924i(this.f252098e.mo121291y(), "handleWebViewBackground runnable, background play audio is enabled, do not pause");
            }
        }
    }
}
