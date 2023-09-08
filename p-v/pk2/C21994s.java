package pk2;

import com.tencent.p014mm.p136ui.widget.loading.MMProgressLoading;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;

/* renamed from: pk2.s */
public final class C21994s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62248d;

    /* renamed from: e */
    public final /* synthetic */ int f62249e;

    public C21994s(RtosWatchLoginUI rtosWatchLoginUI, int i) {
        this.f62248d = rtosWatchLoginUI;
        this.f62249e = i;
    }

    public final void run() {
        MMProgressLoading mMProgressLoading = this.f62248d.f53359n;
        if (mMProgressLoading != null) {
            mMProgressLoading.setProgress(this.f62249e);
        }
    }
}
