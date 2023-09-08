package p1132m5;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import gy3.C87412m;
import java.util.WeakHashMap;
import p1144q5.C110366b;
import p1144q5.C110367c;
import p632o5.C109954f;
import p632o5.C109956h;
import p632o5.C109962k;
import p849e3.C107168a0;
import p849e3.C107207u;
import p864t5.C110902a;
import p864t5.C110906e;
import p864t5.C110908h;

/* renamed from: m5.q */
public final class C109526q {

    /* renamed from: b */
    public static final Bitmap.Config[] f327805b = (Build.VERSION.SDK_INT >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888});

    /* renamed from: a */
    public final C109507g f327806a;

    public C109526q(C110908h hVar) {
        int i = Build.VERSION.SDK_INT;
        this.f327806a = (i < 26 || C109506f.f327747a) ? new C109508h(false) : (i == 26 || i == 27) ? C109513k.f327763a : new C109508h(true);
    }

    /* renamed from: a */
    public final C109954f mo160748a(C109956h hVar, Throwable th) {
        C87412m.m108594g(hVar, "request");
        C87412m.m108594g(th, "throwable");
        return new C109954f(th instanceof C109962k ? C110906e.m151212c(hVar, hVar.f328989F, hVar.f328988E, hVar.f328991H.f328963i) : C110906e.m151212c(hVar, hVar.f328987D, hVar.f328986C, hVar.f328991H.f328962h), hVar, th);
    }

    /* renamed from: b */
    public final boolean mo160749b(C109956h hVar, Bitmap.Config config) {
        C87412m.m108594g(hVar, "request");
        C87412m.m108594g(config, "requestedConfig");
        if (!C110902a.m151200c(config)) {
            return true;
        }
        if (!hVar.f329012u) {
            return false;
        }
        C110366b bVar = hVar.f328994c;
        if (bVar instanceof C110367c) {
            View view = ((C110367c) bVar).getView();
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(view) && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }
}
