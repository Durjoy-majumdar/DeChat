package p774zg;

import android.webkit.ValueCallback;
import com.eclipsesource.mmv8.C80135V8;
import com.tencent.p014mm.appbrand.p942v8.C80669j;

/* renamed from: zg.s */
public class C91744s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f262785d;

    /* renamed from: e */
    public final /* synthetic */ ValueCallback f262786e;

    /* renamed from: f */
    public final /* synthetic */ C80669j f262787f;

    public C91744s(C80669j jVar, String str, ValueCallback valueCallback) {
        this.f262787f = jVar;
        this.f262785d = str;
        this.f262786e = valueCallback;
    }

    public void run() {
        Object object = this.f262787f.mo112501e().getObject(this.f262785d);
        if (object == null) {
            object = C80135V8.getUndefined();
        }
        this.f262786e.onReceiveValue(object);
    }
}
