package p172io.flutter.embedding.engine.dart;

import p172io.flutter.embedding.engine.dart.DartMessenger;

/* renamed from: io.flutter.embedding.engine.dart.DartMessenger$SerialTaskQueue$$b */
public final /* synthetic */ class DartMessenger$SerialTaskQueue$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DartMessenger.SerialTaskQueue f351102d;

    public /* synthetic */ DartMessenger$SerialTaskQueue$$b(DartMessenger.SerialTaskQueue serialTaskQueue) {
        this.f351102d = serialTaskQueue;
    }

    public final void run() {
        this.f351102d.lambda$dispatch$0();
    }
}
