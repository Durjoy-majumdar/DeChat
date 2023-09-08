package pk2;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import nj3.C76879j;

/* renamed from: pk2.n */
public final class C21988n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62242d;

    /* renamed from: pk2.n$a */
    public static final class C21989a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ RtosWatchLoginUI f62243d;

        public C21989a(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f62243d = rtosWatchLoginUI;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            ProgressDialog progressDialog = this.f62243d.f53363r;
            if (progressDialog != null) {
                progressDialog.cancel();
            }
        }
    }

    public C21988n(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62242d = rtosWatchLoginUI;
    }

    public final void run() {
        RtosWatchLoginUI rtosWatchLoginUI = this.f62242d;
        rtosWatchLoginUI.f53363r = C76879j.m92723Q(rtosWatchLoginUI, (String) null, rtosWatchLoginUI.getString(C0966R.string.gas), true, true, new C21989a(this.f62242d));
    }
}
