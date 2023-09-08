package ge3;

import android.app.ProgressDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import ge3.C59409a;

/* renamed from: ge3.d */
public final class C59416d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59409a f169821d;

    public C59416d(C59409a aVar) {
        this.f169821d = aVar;
    }

    public final void run() {
        ProgressDialog progressDialog;
        Log.m105918d("FS.AlbumFileUIC", "onCreate, post delay, dialog show.");
        if (C59409a.C59410a.SKIP != this.f169821d.f169805x && (progressDialog = this.f169821d.f169792h) != null) {
            progressDialog.show();
        }
    }
}
