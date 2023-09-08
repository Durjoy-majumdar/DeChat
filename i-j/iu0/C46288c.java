package iu0;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Map;

/* renamed from: iu0.c */
public final class C46288c implements WebResourceRequest {

    /* renamed from: a */
    public final com.tencent.xweb.WebResourceRequest f124737a;

    public C46288c(com.tencent.xweb.WebResourceRequest webResourceRequest) {
        this.f124737a = webResourceRequest;
    }

    public String getMethod() {
        return this.f124737a.getMethod();
    }

    public Map<String, String> getRequestHeaders() {
        return this.f124737a.getRequestHeaders();
    }

    public Uri getUrl() {
        return this.f124737a.getUrl();
    }

    public boolean hasGesture() {
        return this.f124737a.hasGesture();
    }

    public boolean isForMainFrame() {
        return this.f124737a.isForMainFrame();
    }

    public boolean isRedirect() {
        return this.f124737a.isRedirect();
    }
}
