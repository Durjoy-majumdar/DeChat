package ye3;

import android.app.ProgressDialog;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;

/* renamed from: ye3.o */
public final class C15994o implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C1302b0 f43043d;

    /* renamed from: e */
    public final /* synthetic */ C79087l f43044e;

    public C15994o(C1302b0 b0Var, C79087l lVar) {
        this.f43043d = b0Var;
        this.f43044e = lVar;
    }

    public final boolean onTimerExpired() {
        C86709a0.m107524d().mo123458d(this.f43043d);
        C86709a0.m107524d().mo123470p(255, this.f43044e.f232232c);
        C79087l lVar = this.f43044e;
        lVar.f232232c = null;
        MTimerHandler mTimerHandler = lVar.f232233d;
        if (mTimerHandler != null) {
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            this.f43044e.f232233d = null;
        }
        ProgressDialog progressDialog = this.f43044e.f232235f;
        if (!(progressDialog == null || progressDialog == null)) {
            progressDialog.cancel();
        }
        C79087l.m95638a(this.f43044e);
        return false;
    }
}
