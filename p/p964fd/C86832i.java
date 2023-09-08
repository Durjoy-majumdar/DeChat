package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import p975hd.C87477b;
import po0.C89421g;

/* renamed from: fd.i */
public class C86832i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f252090d;

    /* renamed from: e */
    public final /* synthetic */ int f252091e;

    /* renamed from: f */
    public final /* synthetic */ C86826e f252092f;

    public C86832i(C86826e eVar, int i, int i2) {
        this.f252092f = eVar;
        this.f252090d = i;
        this.f252091e = i2;
    }

    public void run() {
        C86826e eVar = this.f252092f;
        int i = this.f252090d;
        int i2 = this.f252091e;
        if (!eVar.f251992C) {
            Log.m105924i(eVar.mo121291y(), "onMediaPlayerInfo, mp released");
            return;
        }
        Log.m105925i(eVar.mo121291y(), "onInfo, what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 701) {
            eVar.f252053w = eVar.f252033h.isPlaying();
            Log.m105925i(eVar.mo121291y(), "onInfo, buffering start, isPlayingBeforeBuffering:%b", Boolean.valueOf(eVar.f252053w));
            if (eVar.mo121279N()) {
                ((C89421g) eVar.f252035i).mo123748i();
            }
            C87477b bVar = eVar.f252047q;
            if (bVar != null) {
                bVar.mo121944v(eVar.f252049s, eVar.f252033h);
            }
        } else if (i == 702) {
            boolean isPlaying = eVar.f252033h.isPlaying();
            Log.m105925i(eVar.mo121291y(), "onInfo, buffering end, isPlayingBeforeBuffering:%b, isCurrentPlaying:%b", Boolean.valueOf(eVar.f252053w), Boolean.valueOf(isPlaying));
            if (eVar.f252053w) {
                eVar.f252053w = false;
                if (isPlaying && eVar.mo121279N()) {
                    Log.m105924i(eVar.mo121291y(), "onInfo, buffering end, notify video play");
                    ((C89421g) eVar.f252035i).mo123746g(false);
                }
            } else if (!isPlaying && eVar.mo121279N()) {
                Log.m105924i(eVar.mo121291y(), "onInfo, buffering end, notify video pause");
                ((C89421g) eVar.f252035i).mo123745f(false);
            }
            C87477b bVar2 = eVar.f252047q;
            if (bVar2 != null) {
                bVar2.mo121926C(eVar.f252049s, eVar.f252033h);
            }
        } else if (i != 3) {
        } else {
            if (!eVar.f251992C) {
                Log.m105924i(eVar.mo121291y(), "onMediaPlayerVideoFirstFrame, mp released");
                return;
            }
            Log.m105924i(eVar.mo121291y(), "onMediaPlayerVideoFirstFrame");
            C87477b bVar3 = eVar.f252047q;
            if (bVar3 != null) {
                bVar3.mo121941s(eVar.f252049s, eVar.f252033h);
            }
        }
    }
}
