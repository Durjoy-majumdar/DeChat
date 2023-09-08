package vl2;

import com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI;
import com.tencent.p014mm.plugin.scanner.view.C94528d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.TimerTask;

/* renamed from: vl2.s */
public final class C22769s extends TimerTask {

    /* renamed from: d */
    public boolean f65492d;

    /* renamed from: e */
    public C94528d.C94529a f65493e;

    /* renamed from: f */
    public C94528d f65494f;

    /* renamed from: g */
    public C22770a f65495g;

    /* renamed from: vl2.s$a */
    public interface C22770a {
        void onDismiss();

        void onShow();
    }

    /* renamed from: vl2.s$b */
    public static final class C22771b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C22769s f65496d;

        public C22771b(C22769s sVar) {
            this.f65496d = sVar;
        }

        public final void run() {
            Log.m105927v("MicroMsg.ScanShowLoadingTimerTask", "alvinluo initLoadingTimer showLoading isCancelled: %b", Boolean.valueOf(this.f65496d.f65492d));
            C22769s sVar = this.f65496d;
            if (!sVar.f65492d) {
                C94528d dVar = sVar.f65494f;
                if (dVar != null) {
                    ((BaseScanUI) dVar).mo24310k8(true, true, sVar.f65493e);
                }
                C22770a aVar = this.f65496d.f65495g;
                if (aVar != null) {
                    aVar.onShow();
                }
            }
        }
    }

    public C22769s(C94528d dVar, C22770a aVar, C94528d.C94529a aVar2) {
        this.f65494f = dVar;
        this.f65495g = aVar;
        this.f65493e = aVar2;
    }

    public boolean cancel() {
        boolean cancel = super.cancel();
        this.f65492d = true;
        C22770a aVar = this.f65495g;
        if (aVar != null) {
            aVar.onDismiss();
        }
        return cancel;
    }

    public void run() {
        MMHandlerThread.postToMainThread(new C22771b(this));
    }
}
