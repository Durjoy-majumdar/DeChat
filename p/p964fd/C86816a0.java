package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import in0.C87760d;
import org.json.JSONException;
import org.json.JSONObject;
import p975hd.C87480d;
import po0.C89421g;
import po0.C89422h;
import po0.g$$j;

/* renamed from: fd.a0 */
public class C86816a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86826e f251973d;

    public C86816a0(C86826e eVar) {
        this.f251973d = eVar;
    }

    public void run() {
        C86826e eVar = this.f251973d;
        if (!eVar.f251992C) {
            Log.m105924i(eVar.mo121291y(), "onMediaPlayerSeekComplete, mp released");
            return;
        }
        Log.m105924i(eVar.mo121291y(), "onSeekComplete");
        if (eVar.mo121279N()) {
            C87480d dVar = eVar.f252035i;
            C87760d dVar2 = eVar.f252033h;
            int currentPosition = dVar2 != null ? dVar2.getCurrentPosition() : 0;
            C89421g gVar = (C89421g) dVar;
            gVar.f257450g = false;
            MTimerHandler mTimerHandler = gVar.f257448e;
            if ((mTimerHandler == null || mTimerHandler.stopped()) && gVar.f257444a != null) {
                Log.m105924i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onVideoSeekComplete, dispatch onVideoTimeUpdate");
                C87760d dVar3 = gVar.f257444a.f252033h;
                gVar.mo123747h(dVar3 != null ? dVar3.getCurrentPosition() : 0, (int) (gVar.f257446c * 1000.0d));
            }
            try {
                JSONObject b = gVar.mo123741b();
                b.put("position", currentPosition);
                gVar.mo123740a(new g$$j((C89422h) null), b);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoSeekComplete fail", e);
            }
        }
        if (eVar.f252051u) {
            Log.m105924i(eVar.mo121291y(), "onSeekComplete, start when seek complete");
            eVar.f252051u = false;
            eVar.mo121270E(false, true);
            return;
        }
        boolean isPlaying = eVar.f252033h.isPlaying();
        if (eVar.f252052v) {
            long duration = (long) eVar.f252033h.getDuration();
            long currentPosition2 = (long) eVar.f252033h.getCurrentPosition();
            Log.m105925i(eVar.mo121291y(), "onSeekComplete, video playing before seeking, isCurrentPlaying:%b, position:%s, duration:%s", Boolean.valueOf(isPlaying), Long.valueOf(currentPosition2), Long.valueOf(duration));
            eVar.f252052v = false;
            if (currentPosition2 / 1000 < duration / 1000) {
                Log.m105924i(eVar.mo121291y(), "onSeekComplete, video not end");
                if (isPlaying && eVar.mo121279N()) {
                    Log.m105924i(eVar.mo121291y(), "onSeekComplete, dispatch play again");
                    ((C89421g) eVar.f252035i).mo123746g(false);
                    return;
                }
                return;
            }
            Log.m105924i(eVar.mo121291y(), "onSeekComplete, video ends");
            eVar.f252033h.pause();
            eVar.f252033h.start();
            return;
        }
        Log.m105925i(eVar.mo121291y(), "onSeekComplete, video not playing before seeking, isCurrentPlaying:%b", Boolean.valueOf(isPlaying));
        if (!isPlaying && eVar.mo121279N()) {
            Log.m105924i(eVar.mo121291y(), "onSeekComplete, dispatch pause again");
            ((C89421g) eVar.f252035i).mo123745f(false);
        }
    }
}
