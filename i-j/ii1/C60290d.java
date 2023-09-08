package ii1;

import al1.C54130j;
import android.view.KeyEvent;
import android.view.View;
import fy3.C32224a;
import gi1.C59463a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import li1.C61289a;
import li1.C61294e;
import ok1.C62042e;
import rx3.C13598b0;
import si1.C63903h;
import te3.C49765hx0;
import te3.C64756up2;

/* renamed from: ii1.d */
public final class C60290d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60291e f171911d;

    /* renamed from: e */
    public final /* synthetic */ C49765hx0 f171912e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60290d(C60291e eVar, C49765hx0 hx02) {
        super(0);
        this.f171911d = eVar;
        this.f171912e = hx02;
    }

    public Object invoke() {
        T t;
        C61289a Z0 = this.f171911d.mo85276Z0();
        C63903h hVar = null;
        if (!(Z0 instanceof C61294e)) {
            Z0 = null;
        }
        if (Z0 != null) {
            C49765hx0 hx02 = this.f171912e;
            C87412m.m108594g(hx02, "contact");
            C64756up2 up22 = hx02.f134935w;
            if (up22 != null) {
                if (!C62042e.f176370a.mo87097m1(up22)) {
                    up22 = null;
                }
                if (up22 != null) {
                    Iterator<T> it = Z0.f174401f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        C54130j jVar = ((C59463a) t).f169894a;
                        boolean z = true;
                        if (jVar == null || !jVar.f152004h) {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    C59463a aVar = (C59463a) t;
                    if (aVar != null) {
                        C54130j jVar2 = aVar.f169894a;
                        if (jVar2 != null) {
                            jVar2.f152017u = up22;
                        }
                        KeyEvent.Callback callback = (View) Z0.f174400e.get(Z0.mo86270j(aVar));
                        if (callback != null) {
                            if (callback instanceof C63903h) {
                                hVar = (C63903h) callback;
                            }
                            if (hVar != null) {
                                C54130j curBindLinkMicUser = hVar.getCurBindLinkMicUser();
                                if (curBindLinkMicUser != null) {
                                    curBindLinkMicUser.f152017u = up22;
                                }
                                hVar.mo88689x();
                            }
                        }
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
