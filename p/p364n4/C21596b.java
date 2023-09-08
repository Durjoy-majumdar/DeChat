package p364n4;

import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import org.chromium.support_lib_boundary.util.Features;
import p359m4.C21482a;
import p364n4.C88902e;

/* renamed from: n4.b */
public class C21596b extends C21482a {

    /* renamed from: a */
    public SafeBrowsingResponse f61166a;

    /* renamed from: b */
    public SafeBrowsingResponseBoundaryInterface f61167b;

    public C21596b(InvocationHandler invocationHandler) {
        this.f61167b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: a */
    public void mo33648a(boolean z) {
        C21598d a = C21598d.m24511a(Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL);
        if (Build.VERSION.SDK_INT >= a.f61172e) {
            if (this.f61166a == null) {
                this.f61166a = (SafeBrowsingResponse) C88902e.C21600a.f61174a.f61177a.convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.f61167b));
            }
            this.f61166a.showInterstitial(z);
        } else if (a.mo33859b()) {
            if (this.f61167b == null) {
                this.f61167b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, C88902e.C21600a.f61174a.f61177a.convertSafeBrowsingResponse((Object) this.f61166a));
            }
            this.f61167b.showInterstitial(z);
        } else {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    public C21596b(SafeBrowsingResponse safeBrowsingResponse) {
        this.f61166a = safeBrowsingResponse;
    }
}
