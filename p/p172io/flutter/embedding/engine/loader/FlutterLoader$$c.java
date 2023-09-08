package p172io.flutter.embedding.engine.loader;

import android.content.Context;

/* renamed from: io.flutter.embedding.engine.loader.FlutterLoader$$c */
public final /* synthetic */ class FlutterLoader$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlutterLoader f351108d;

    /* renamed from: e */
    public final /* synthetic */ Context f351109e;

    public /* synthetic */ FlutterLoader$$c(FlutterLoader flutterLoader, Context context) {
        this.f351108d = flutterLoader;
        this.f351109e = context;
    }

    public final void run() {
        this.f351108d.lambda$startInitialization$0(this.f351109e);
    }
}
