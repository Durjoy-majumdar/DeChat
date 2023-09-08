package pk2;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import nj3.C76879j;

/* renamed from: pk2.m */
public final class C21986m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62240d;

    /* renamed from: pk2.m$a */
    public static final class C21987a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ RtosWatchLoginUI f62241d;

        public C21987a(RtosWatchLoginUI rtosWatchLoginUI) {
            this.f62241d = rtosWatchLoginUI;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            ProgressDialog progressDialog = this.f62241d.f53363r;
            if (progressDialog != null) {
                progressDialog.cancel();
            }
        }
    }

    public C21986m(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62240d = rtosWatchLoginUI;
    }

    public final void run() {
        RtosWatchLoginUI rtosWatchLoginUI = this.f62240d;
        rtosWatchLoginUI.f53363r = C76879j.m92723Q(rtosWatchLoginUI, (String) null, rtosWatchLoginUI.getString(C0966R.string.gda), true, true, new C21987a(this.f62240d));
    }
}
