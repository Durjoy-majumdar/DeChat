package ye3;

import android.app.ProgressDialog;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;

/* renamed from: ye3.j */
public final class C79085j implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C79087l f232228d;

    public C79085j(C79087l lVar) {
        this.f232228d = lVar;
    }

    public final boolean onTimerExpired() {
        C86709a0.m107524d().mo123470p(281, this.f232228d.f232230a);
        C86709a0.m107524d().mo123470p(282, this.f232228d.f232231b);
        C79087l lVar = this.f232228d;
        lVar.f232230a = null;
        lVar.f232231b = null;
        MTimerHandler mTimerHandler = lVar.f232234e;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        ProgressDialog progressDialog = this.f232228d.f232235f;
        if (!(progressDialog == null || progressDialog == null)) {
            progressDialog.cancel();
        }
        this.f232228d.mo109028c();
        return false;
    }
}
