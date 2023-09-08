package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import in0.C87760d;
import org.json.JSONException;
import p975hd.C87477b;
import po0.C89421g;
import po0.C89422h;
import po0.C89423i;
import po0.g$$c;

/* renamed from: fd.f */
public class C86829f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86826e f252085d;

    public C86829f(C86826e eVar) {
        this.f252085d = eVar;
    }

    public void run() {
        C86826e eVar = this.f252085d;
        if (!eVar.f251992C) {
            Log.m105924i(eVar.mo121291y(), "onMediaPlayerCompletion, mp released");
            return;
        }
        Log.m105924i(eVar.mo121291y(), "onCompletion");
        if (eVar.mo121279N()) {
            C89421g gVar = (C89421g) eVar.f252035i;
            gVar.getClass();
            try {
                gVar.mo123740a(new g$$c((C89422h) null), gVar.mo123741b());
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoEnded fail", e);
            }
            gVar.mo123750k();
            MMHandlerThread.postToMainThread(new C89423i(gVar));
            gVar.mo123742c();
        }
        C87477b bVar = eVar.f252047q;
        if (bVar != null) {
            bVar.mo121947y(eVar.f252049s, eVar.f252033h);
        }
        if (eVar.f251993D) {
            Log.m105924i(eVar.mo121291y(), "onCompletion, video loop playing");
            eVar.f252051u = true;
            eVar.mo121277L(0);
            return;
        }
        Log.m105924i(eVar.mo121291y(), "onCompletion, video end playing");
        eVar.f252009S = true;
        C87760d dVar = eVar.f252033h;
        if (dVar != null) {
            dVar.pause();
        }
        Log.m105924i(eVar.mo121291y(), "onCompletion, abandonFocus");
        eVar.f252018W0.mo115002L();
    }
}
