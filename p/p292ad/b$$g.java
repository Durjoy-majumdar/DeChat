package p292ad;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ad.b$$g */
public final /* synthetic */ class b$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233121d;

    public /* synthetic */ b$$g(C79502b bVar) {
        this.f233121d = bVar;
    }

    public final void run() {
        AtomicBoolean atomicBoolean;
        C79502b bVar = this.f233121d;
        boolean z = false;
        bVar.f233077C = false;
        Log.m105925i(bVar.mo109516v(), "onRuntimeEnterForeground, mIsWebViewInBackground: %b, mPassiveMute: %b", Boolean.valueOf(bVar.f233078D), Boolean.valueOf(bVar.f233112z));
        if (!bVar.f233078D && (bVar.f233112z || !bVar.mo109517w())) {
            if (bVar.f233112z) {
                Log.m105924i(bVar.mo109516v(), "onRuntimeEnterForeground, passiveMute, unMute");
                bVar.mo109505F();
            }
            C79501a aVar = bVar.f233097h;
            if (aVar != null && ((C79513m) aVar).isPlaying()) {
                z = true;
            }
            if (z) {
                Log.m105924i(bVar.mo109516v(), "onRuntimeEnterForeground, isPlaying, requestFocus");
                bVar.f233111y.requestFocus();
            }
        }
        if (!bVar.f233078D && (atomicBoolean = bVar.f233079E) != null) {
            boolean z2 = atomicBoolean.get();
            bVar.f233079E = null;
            if (z2) {
                Log.m105924i("MicroMsg.SameLayer.LivePlayerPluginHandler", "onRuntimeEnterForeground, isPlayingWhenEnterBackground, try resume");
                C79501a aVar2 = bVar.f233097h;
                if (aVar2 == null) {
                    Log.m105928w(bVar.mo109516v(), "onRuntimeEnterForeground, adapter is null");
                } else {
                    ((C79513m) aVar2).mo14922b();
                }
            }
        }
    }
}
