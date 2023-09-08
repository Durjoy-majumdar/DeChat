package o73;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: o73.d */
public abstract class C47336d implements Runnable {
    public C47336d() {
        Log.m105925i("MicroMsg.WearBaseWorkerTask", "Create %s", mo67621b());
    }

    /* renamed from: a */
    public abstract void mo67620a();

    /* renamed from: b */
    public abstract String mo67621b();

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            mo67620a();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WearBaseWorkerTask", e, "run task %s occur exception: %s", mo67621b(), e.getMessage());
        }
        Log.m105925i("MicroMsg.WearBaseWorkerTask", "execute %s | use time %d", mo67621b(), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
