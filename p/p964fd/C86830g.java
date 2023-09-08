package p964fd;

import android.util.Size;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81824c;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;
import java.util.concurrent.atomic.AtomicBoolean;
import jy3.C88045a;
import p830xc.C91165a;
import p975hd.C87477b;
import p975hd.C87480d;
import po0.C89402b;
import po0.C89421g;

/* renamed from: fd.g */
public class C86830g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86826e f252086d;

    public C86830g(C86826e eVar) {
        this.f252086d = eVar;
    }

    public void run() {
        C87760d dVar;
        C86826e eVar = this.f252086d;
        if (!eVar.f251992C) {
            Log.m105924i(eVar.mo121291y(), "onMediaPlayerPrepared, mp released");
            return;
        }
        Log.m105924i(eVar.mo121291y(), "onPrepared");
        C87477b bVar = eVar.f252047q;
        boolean z = false;
        if (bVar != null) {
            C91165a aVar = eVar.f252049s;
            C87760d dVar2 = eVar.f252033h;
            bVar.mo121946x(aVar, dVar2, (long) (dVar2 != null ? dVar2.getDuration() : 0));
        }
        eVar.f251990A = true;
        eVar.mo121283q(false);
        if (eVar.mo121279N() && (dVar = eVar.f252033h) != null) {
            C87480d dVar3 = eVar.f252035i;
            int videoWidth = dVar != null ? dVar.getVideoWidth() : 0;
            C87760d dVar4 = eVar.f252033h;
            int videoHeight = dVar4 != null ? dVar4.getVideoHeight() : 0;
            C87760d dVar5 = eVar.f252033h;
            ((C89421g) dVar3).mo123744e(videoWidth, videoHeight, dVar5 != null ? dVar5.getDuration() : 0);
        }
        eVar.mo121272G();
        C86815a aVar2 = eVar.f252016V0;
        if (aVar2 != null) {
            C87760d dVar6 = eVar.f252033h;
            int videoWidth2 = dVar6 != null ? dVar6.getVideoWidth() : 0;
            C87760d dVar7 = eVar.f252033h;
            aVar2.mo121260c(new Size(videoWidth2, dVar7 != null ? dVar7.getVideoHeight() : 0));
        }
        long j = eVar.f252056y;
        if (j > 0) {
            eVar.mo121277L(j);
            eVar.f252056y = 0;
        }
        boolean z2 = !eVar.f252011T;
        if (eVar.f252049s.mo62544g() instanceof C83780d1) {
            z2 = C81824c.m100433a(eVar.f252049s);
        } else {
            Log.m105928w(eVar.mo121291y(), "onPrepared, component is not page view");
        }
        if (!z2 && !eVar.f252025a1.mo125355a(eVar.f252049s)) {
            Log.m105924i(eVar.mo121291y(), "onPrepared, stop video auto play when webview in background");
            if (eVar.f252058z || eVar.f252054x) {
                z = true;
            }
            eVar.f252017W = new AtomicBoolean(z);
        } else if (eVar.f252058z || eVar.f252054x) {
            Log.m105925i(eVar.mo121291y(), "onPrepared, start play when prepared, mStartWhenPrepared:%s, mControlStartWhenPrepared:%s", Boolean.valueOf(eVar.f252058z), Boolean.valueOf(eVar.f252054x));
            if (eVar.f252048r != null) {
                C89402b bVar2 = eVar.f252048r;
                if (((Boolean) ((C88045a) bVar2.f257414i).mo122486c(bVar2, C89402b.f257405n[1])).booleanValue()) {
                    Log.m105924i("MicroMsg.SameLayer.VideoPluginHandler", "onMediaPlayerPreparedInternal: castMediaPresent, avoid play when prepared");
                    return;
                }
            }
            eVar.mo121270E(eVar.f252058z, true);
        } else {
            Log.m105924i(eVar.mo121291y(), "onPrepared, not set start play when prepared");
        }
    }
}
