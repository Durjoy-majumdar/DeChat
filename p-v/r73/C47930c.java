package r73;

import android.webkit.ValueCallback;

/* renamed from: r73.c */
public interface C47930c extends C47929b {

    /* renamed from: r73.c$a */
    public static final class C47931a {
        /* renamed from: a */
        public static /* synthetic */ void m53253a(C47930c cVar, String str, String str2, ValueCallback valueCallback, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "{}";
                }
                if ((i & 4) != 0) {
                    valueCallback = null;
                }
                cVar.mo60865I0(str, str2, valueCallback);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatch");
        }
    }

    /* renamed from: I0 */
    void mo60865I0(String str, String str2, ValueCallback<String> valueCallback);
}
