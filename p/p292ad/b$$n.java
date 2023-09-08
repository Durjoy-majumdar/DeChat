package p292ad;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: ad.b$$n */
public final /* synthetic */ class b$$n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233130d;

    /* renamed from: e */
    public final /* synthetic */ String f233131e;

    /* renamed from: f */
    public final /* synthetic */ Runnable f233132f;

    public /* synthetic */ b$$n(C79502b bVar, String str, Runnable runnable) {
        this.f233130d = bVar;
        this.f233131e = str;
        this.f233132f = runnable;
    }

    public final void run() {
        C79502b bVar = this.f233130d;
        String str = this.f233131e;
        Runnable runnable = this.f233132f;
        C79501a aVar = bVar.f233097h;
        if (aVar == null) {
            Log.m105928w(bVar.mo109516v(), "run#operate, adapter is null");
            return;
        }
        bVar.mo109518x(str, aVar.mo33727m(str, (JSONObject) null));
        if (runnable != null) {
            runnable.run();
        }
    }
}
