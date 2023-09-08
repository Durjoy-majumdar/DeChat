package p364n4;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* renamed from: n4.g */
public class C21603g implements C21602f {

    /* renamed from: a */
    public WebViewProviderFactoryBoundaryInterface f61176a;

    public C21603g(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f61176a = webViewProviderFactoryBoundaryInterface;
    }

    /* renamed from: a */
    public String[] mo33857a() {
        return this.f61176a.getSupportedFeatures();
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebkitToCompatConverterBoundaryInterface.class, this.f61176a.getWebkitToCompatConverter());
    }
}
