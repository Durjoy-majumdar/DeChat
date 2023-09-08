package p824tc;

import android.content.Context;
import android.view.View;
import android.webkit.ValueCallback;
import java.util.Map;
import p822sa.C48323t;
import p828wa.C53133t;

/* renamed from: tc.a */
public interface C48619a extends C48323t {

    /* renamed from: tc.a$a */
    public interface C48620a {
    }

    /* renamed from: A */
    void mo21039A(C48620a aVar);

    boolean canGoBack();

    void destroy();

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    View getView();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    void setContext(Context context);

    void setWebCore(C53133t tVar);

    void stopLoading();
}
