package t83;

import android.webkit.ValueCallback;

/* renamed from: t83.w0 */
public class C48613w0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f130133d;

    /* renamed from: e */
    public final /* synthetic */ ValueCallback f130134e;

    /* renamed from: f */
    public final /* synthetic */ C48590l f130135f;

    public C48613w0(C48590l lVar, String str, ValueCallback valueCallback) {
        this.f130135f = lVar;
        this.f130133d = str;
        this.f130134e = valueCallback;
    }

    public void run() {
        this.f130135f.f129996a.evaluateJavascript(this.f130133d, this.f130134e);
    }
}
