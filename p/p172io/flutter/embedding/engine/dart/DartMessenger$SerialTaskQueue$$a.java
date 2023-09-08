package p172io.flutter.embedding.engine.dart;

import p172io.flutter.embedding.engine.dart.DartMessenger;

/* renamed from: io.flutter.embedding.engine.dart.DartMessenger$SerialTaskQueue$$a */
public final /* synthetic */ class DartMessenger$SerialTaskQueue$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DartMessenger.SerialTaskQueue f351101d;

    public /* synthetic */ DartMessenger$SerialTaskQueue$$a(DartMessenger.SerialTaskQueue serialTaskQueue) {
        this.f351101d = serialTaskQueue;
    }

    public final void run() {
        this.f351101d.lambda$flush$1();
    }
}
