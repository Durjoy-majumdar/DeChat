package ml3;

import android.app.ProgressDialog;
import eb0.z3$$g;

/* renamed from: ml3.k */
public class C47075k implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f126508d;

    /* renamed from: e */
    public final /* synthetic */ C47077m f126509e;

    public C47075k(C47077m mVar, ProgressDialog progressDialog) {
        this.f126509e = mVar;
        this.f126508d = progressDialog;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return this.f126509e.f126514g;
    }

    /* renamed from: c */
    public void mo24604c() {
        ProgressDialog progressDialog = this.f126508d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
