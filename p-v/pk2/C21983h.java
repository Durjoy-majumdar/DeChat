package pk2;

import android.app.ProgressDialog;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;

/* renamed from: pk2.h */
public final class C21983h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62237d;

    public C21983h(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62237d = rtosWatchLoginUI;
    }

    public final void run() {
        ProgressDialog progressDialog = this.f62237d.f53363r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f62237d.f53363r = null;
    }
}
