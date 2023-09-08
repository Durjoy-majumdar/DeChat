package p822sa;

import android.content.Context;
import android.webkit.ValueCallback;

/* renamed from: sa.t */
public interface C48323t {
    void addJavascriptInterface(Object obj, String str);

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    Context getContext();

    String getUserAgent();
}
