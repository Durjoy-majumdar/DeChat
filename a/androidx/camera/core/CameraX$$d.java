package androidx.camera.core;

import android.content.Context;
import java.util.concurrent.Executor;
import p202m2.C117512b;

public final /* synthetic */ class CameraX$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraX f44193d;

    /* renamed from: e */
    public final /* synthetic */ Context f44194e;

    /* renamed from: f */
    public final /* synthetic */ Executor f44195f;

    /* renamed from: g */
    public final /* synthetic */ C117512b.C117513a f44196g;

    /* renamed from: h */
    public final /* synthetic */ long f44197h;

    public /* synthetic */ CameraX$$d(CameraX cameraX, Context context, Executor executor, C117512b.C117513a aVar, long j) {
        this.f44193d = cameraX;
        this.f44194e = context;
        this.f44195f = executor;
        this.f44196g = aVar;
        this.f44197h = j;
    }

    public final void run() {
        this.f44193d.lambda$initAndRetryRecursively$2(this.f44194e, this.f44195f, this.f44196g, this.f44197h);
    }
}
