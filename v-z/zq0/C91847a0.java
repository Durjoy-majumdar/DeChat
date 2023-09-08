package zq0;

import android.app.ProgressDialog;

/* renamed from: zq0.a0 */
public final class C91847a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f262982d;

    public C91847a0(ProgressDialog progressDialog) {
        this.f262982d = progressDialog;
    }

    public final void run() {
        this.f262982d.dismiss();
    }
}
