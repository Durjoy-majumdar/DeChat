package p292ad;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import ml0.C21511u;

/* renamed from: ad.b$$b */
public final /* synthetic */ class b$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233115d;

    public /* synthetic */ b$$b(C79502b bVar) {
        this.f233115d = bVar;
    }

    public final void run() {
        AtomicBoolean atomicBoolean;
        C79502b bVar = this.f233115d;
        Log.m105925i(bVar.mo109516v(), "*** handler(%s) handleWebViewForeground", bVar.mo122122p());
        bVar.f233078D = false;
        Log.m105925i(bVar.mo109516v(), "handleWebViewForeground, isRuntimeInBackground: %b, passiveMute: %b", Boolean.valueOf(bVar.f233077C), Boolean.valueOf(bVar.f233112z));
        if (!bVar.f233077C && (bVar.f233112z || !bVar.mo109517w())) {
            if (bVar.f233112z) {
                Log.m105924i(bVar.mo109516v(), "handleWebViewForeground, passiveMute, unMute");
                bVar.mo109505F();
            }
            C79501a aVar = bVar.f233097h;
            if (aVar != null && ((C79513m) aVar).isPlaying()) {
                Log.m105924i(bVar.mo109516v(), "handleWebViewForeground, isPlaying, requestFocus");
                bVar.f233111y.requestFocus();
            }
        }
        if (!bVar.f233077C && bVar.f233097h != null && (atomicBoolean = bVar.f233079E) != null) {
            boolean z = atomicBoolean.get();
            bVar.f233079E = null;
            if (z) {
                C21511u b = ((C79513m) bVar.f233097h).mo14922b();
                Log.m105925i(bVar.mo109516v(), "handleWebViewForeground, code:%d info:%s", Integer.valueOf(b.f60905a), b.f60906b);
            }
        }
    }
}
