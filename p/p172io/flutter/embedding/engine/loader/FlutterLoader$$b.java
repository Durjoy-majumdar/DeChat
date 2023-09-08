package p172io.flutter.embedding.engine.loader;

import android.content.Context;

/* renamed from: io.flutter.embedding.engine.loader.FlutterLoader$$b */
public final /* synthetic */ class FlutterLoader$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlutterLoader f351104d;

    /* renamed from: e */
    public final /* synthetic */ Context f351105e;

    /* renamed from: f */
    public final /* synthetic */ String[] f351106f;

    /* renamed from: g */
    public final /* synthetic */ Runnable f351107g;

    public /* synthetic */ FlutterLoader$$b(FlutterLoader flutterLoader, Context context, String[] strArr, Runnable runnable) {
        this.f351104d = flutterLoader;
        this.f351105e = context;
        this.f351106f = strArr;
        this.f351107g = runnable;
    }

    public final void run() {
        this.f351104d.lambda$ensureInitializationCompleteAsync$2(this.f351105e, this.f351106f, this.f351107g);
    }
}
