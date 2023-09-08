package p364n4;

import android.os.Build;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import org.chromium.support_lib_boundary.util.Features;
import p359m4.C21483b;
import p364n4.C88902e;

/* renamed from: n4.c */
public class C21597c extends C21483b {

    /* renamed from: a */
    public WebResourceError f61168a;

    /* renamed from: b */
    public WebResourceErrorBoundaryInterface f61169b;

    public C21597c(InvocationHandler invocationHandler) {
        this.f61169b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: a */
    public CharSequence mo33649a() {
        C21598d a = C21598d.m24511a(Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION);
        if (Build.VERSION.SDK_INT >= a.f61172e) {
            if (this.f61168a == null) {
                this.f61168a = (WebResourceError) C88902e.C21600a.f61174a.f61177a.convertWebResourceError(Proxy.getInvocationHandler(this.f61169b));
            }
            return this.f61168a.getDescription();
        } else if (a.mo33859b()) {
            if (this.f61169b == null) {
                this.f61169b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, C88902e.C21600a.f61174a.f61177a.convertWebResourceError((Object) this.f61168a));
            }
            return this.f61169b.getDescription();
        } else {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    /* renamed from: b */
    public int mo33650b() {
        C21598d a = C21598d.m24511a(Features.WEB_RESOURCE_ERROR_GET_CODE);
        if (Build.VERSION.SDK_INT >= a.f61172e) {
            if (this.f61168a == null) {
                this.f61168a = (WebResourceError) C88902e.C21600a.f61174a.f61177a.convertWebResourceError(Proxy.getInvocationHandler(this.f61169b));
            }
            return this.f61168a.getErrorCode();
        } else if (a.mo33859b()) {
            if (this.f61169b == null) {
                this.f61169b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, C88902e.C21600a.f61174a.f61177a.convertWebResourceError((Object) this.f61168a));
            }
            return this.f61169b.getErrorCode();
        } else {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    public C21597c(WebResourceError webResourceError) {
        this.f61168a = webResourceError;
    }
}
