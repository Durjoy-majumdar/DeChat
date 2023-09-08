package p172io.flutter.embedding.engine.loader;

import android.content.Context;
import p172io.flutter.embedding.engine.loader.FlutterLoader;

/* renamed from: io.flutter.embedding.engine.loader.FlutterLoader$1$$a */
public final /* synthetic */ class FlutterLoader$1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlutterLoader.C1172351 f351110d;

    /* renamed from: e */
    public final /* synthetic */ Context f351111e;

    public /* synthetic */ FlutterLoader$1$$a(FlutterLoader.C1172351 r1, Context context) {
        this.f351110d = r1;
        this.f351111e = context;
    }

    public final void run() {
        this.f351110d.lambda$call$0(this.f351111e);
    }
}
