package ye3;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;

/* renamed from: ye3.p */
public final class C15995p implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C1302b0 f43045d;

    /* renamed from: e */
    public final /* synthetic */ C79087l f43046e;

    public C15995p(C1302b0 b0Var, C79087l lVar) {
        this.f43045d = b0Var;
        this.f43046e = lVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f43045d);
        C86709a0.m107524d().mo123470p(255, this.f43046e.f232232c);
        C79087l lVar = this.f43046e;
        lVar.f232232c = null;
        MTimerHandler mTimerHandler = lVar.f232233d;
        if (mTimerHandler != null) {
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            this.f43046e.f232233d = null;
        }
        ProgressDialog progressDialog = this.f43046e.f232235f;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
