package ye3;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;

/* renamed from: ye3.k */
public final class C79086k implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C79087l f232229d;

    public C79086k(C79087l lVar) {
        this.f232229d = lVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123470p(281, this.f232229d.f232230a);
        C86709a0.m107524d().mo123470p(282, this.f232229d.f232231b);
        C79087l lVar = this.f232229d;
        lVar.f232230a = null;
        lVar.f232231b = null;
        MTimerHandler mTimerHandler = lVar.f232233d;
        if (mTimerHandler != null) {
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            this.f232229d.f232233d = null;
        }
        ProgressDialog progressDialog = this.f232229d.f232235f;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
