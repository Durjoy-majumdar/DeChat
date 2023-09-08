package ye3;

import android.app.ProgressDialog;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C89137b0;
import p154fy.C45844i;

/* renamed from: ye3.h */
public final class C79083h implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C45844i f232224d;

    /* renamed from: e */
    public final /* synthetic */ C79087l f232225e;

    public C79083h(C45844i iVar, C79087l lVar) {
        this.f232224d = iVar;
        this.f232225e = lVar;
    }

    public final boolean onTimerExpired() {
        C89137b0 d = C86709a0.m107524d();
        C45844i iVar = this.f232224d;
        C87412m.m108592e(iVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
        d.mo123458d((C117747y) iVar);
        C86709a0.m107524d().mo123470p(281, this.f232225e.f232230a);
        C86709a0.m107524d().mo123470p(282, this.f232225e.f232231b);
        C79087l lVar = this.f232225e;
        lVar.f232230a = null;
        lVar.f232231b = null;
        MTimerHandler mTimerHandler = lVar.f232233d;
        if (mTimerHandler != null) {
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            this.f232225e.f232233d = null;
        }
        ProgressDialog progressDialog = this.f232225e.f232235f;
        if (!(progressDialog == null || progressDialog == null)) {
            progressDialog.cancel();
        }
        this.f232225e.mo109028c();
        return false;
    }
}
