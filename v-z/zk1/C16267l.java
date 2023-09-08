package zk1;

import android.webkit.ValueCallback;

/* renamed from: zk1.l */
public final class C16267l<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ ValueCallback<String> f43554a;

    public C16267l(ValueCallback<String> valueCallback) {
        this.f43554a = valueCallback;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        ValueCallback<String> valueCallback = this.f43554a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(str);
        }
    }
}
