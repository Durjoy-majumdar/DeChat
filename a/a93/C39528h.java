package a93;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Map;

/* renamed from: a93.h */
public class C39528h implements WebResourceRequest {

    /* renamed from: a */
    public Uri f106124a;

    /* renamed from: b */
    public boolean f106125b;

    /* renamed from: c */
    public boolean f106126c;

    /* renamed from: d */
    public String f106127d;

    /* renamed from: e */
    public Map<String, String> f106128e;

    public C39528h(Uri uri, boolean z, boolean z2, boolean z3, String str, Map<String, String> map) {
        this.f106124a = uri;
        this.f106125b = z;
        this.f106126c = z3;
        this.f106127d = str;
        this.f106128e = map;
    }

    public String getMethod() {
        return this.f106127d;
    }

    public Map<String, String> getRequestHeaders() {
        return this.f106128e;
    }

    public Uri getUrl() {
        return this.f106124a;
    }

    public boolean hasGesture() {
        return this.f106126c;
    }

    public boolean isForMainFrame() {
        return this.f106125b;
    }

    public boolean isRedirect() {
        return false;
    }
}
