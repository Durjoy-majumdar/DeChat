package p292ad;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import jo0.C87995c;
import ml0.C21511u;
import p932bd.C79687a;

/* renamed from: ad.b$$a */
public final /* synthetic */ class b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233113d;

    /* renamed from: e */
    public final /* synthetic */ int f233114e;

    public /* synthetic */ b$$a(C79502b bVar, int i) {
        this.f233113d = bVar;
        this.f233114e = i;
    }

    public final void run() {
        C79502b bVar = this.f233113d;
        int i = this.f233114e;
        bVar.f233077C = true;
        C79501a aVar = bVar.f233097h;
        if (aVar != null && bVar.f233079E == null) {
            boolean isPlaying = ((C79513m) aVar).isPlaying();
            bVar.f233079E = new AtomicBoolean(isPlaying);
            Log.m105925i("MicroMsg.SameLayer.LivePlayerPluginHandler", "onRuntimeEnterBackground, isPlayingWhenEnterBackground:%s", Boolean.valueOf(isPlaying));
            Log.m105924i(bVar.mo109516v(), "onRuntimeEnterBackground, abandonFocus");
            bVar.f233111y.mo115002L();
            if (!bVar.f233089P || !bVar.mo109513s()) {
                C79687a aVar2 = bVar.f233100n;
                if (aVar2 != null) {
                    if (((C87995c) aVar2).mo122450e(bVar, bVar.f233101o, i)) {
                        Log.m105924i(bVar.mo109516v(), "onRuntimeEnterBackground, should intercept enter background, return");
                        return;
                    }
                }
                C21511u d = ((C79513m) bVar.f233097h).mo14924d();
                if (isPlaying) {
                    bVar.mo109518x("stop", d);
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.SameLayer.LivePlayerPluginHandler", "onRuntimeEnterBackground, background play audio is enabled");
        }
    }
}
