package zq0;

import android.app.ProgressDialog;

/* renamed from: zq0.e0 */
public final class C91860e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f263005d;

    public C91860e0(ProgressDialog progressDialog) {
        this.f263005d = progressDialog;
    }

    public final void run() {
        this.f263005d.dismiss();
    }
}
