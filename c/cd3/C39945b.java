package cd3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: cd3.b */
public class C39945b {

    /* renamed from: a */
    public CountDownLatch f107086a = null;

    /* renamed from: a */
    public void mo62559a() {
        CountDownLatch countDownLatch = this.f107086a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f107086a = null;
        }
    }

    /* renamed from: b */
    public void mo62560b(long j, Runnable runnable) {
        Log.m105924i("MicroMsg.SyncJob", "doAsSyncJob");
        if (this.f107086a == null) {
            this.f107086a = new CountDownLatch(1);
        }
        MMHandlerThread.postToMainThread(runnable);
        Log.m105924i("MicroMsg.SyncJob", "doAsSyncJob postToMainThread");
        CountDownLatch countDownLatch = this.f107086a;
        if (countDownLatch != null) {
            try {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Log.m105928w("MicroMsg.SyncJob", e.getMessage());
                Log.printErrStackTrace("MicroMsg.SyncJob", e, "", new Object[0]);
            }
        }
    }
}
