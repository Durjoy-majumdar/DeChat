package ob0;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.concurrent.Executor;

public final /* synthetic */ class l0$$b implements Executor {
    public final void execute(Runnable runnable) {
        MMHandlerThread.postToMainThread(runnable);
    }
}
