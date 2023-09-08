package gu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.concurrent.Executor;

/* renamed from: gu1.j */
public final class C8458j implements Executor {

    /* renamed from: d */
    public final /* synthetic */ MMHandler f27468d;

    public C8458j(MMHandler mMHandler) {
        this.f27468d = mMHandler;
    }

    public final void execute(Runnable runnable) {
        Log.printInfoStack("MicroMsg.CachedFlutterEngines", "post background task:" + runnable.hashCode(), new Object[0]);
        this.f27468d.post(runnable);
    }
}
