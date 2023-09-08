package p172io.flutter.embedding.engine.dart;

import android.os.Handler;
import android.os.Looper;
import p172io.flutter.embedding.engine.dart.DartMessenger;

/* renamed from: io.flutter.embedding.engine.dart.PlatformTaskQueue */
public class PlatformTaskQueue implements DartMessenger.DartMessengerTaskQueue {
    private final Handler handler = new Handler(Looper.getMainLooper());

    public void dispatch(Runnable runnable) {
        this.handler.post(runnable);
    }
}
