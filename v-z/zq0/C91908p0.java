package zq0;

import android.app.ProgressDialog;

/* renamed from: zq0.p0 */
public final class C91908p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f263159d;

    public C91908p0(ProgressDialog progressDialog) {
        this.f263159d = progressDialog;
    }

    public final void run() {
        this.f263159d.dismiss();
    }
}
