package x02;

import a12.C79450b;
import a70.C79471a;
import com.tencent.p014mm.autogen.mmdata.rpt.ErrorMsgInfoStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.File;
import p271xn.C91299o;
import zt3.C119157j;

public final /* synthetic */ class n$$a implements C91299o {

    /* renamed from: a */
    public final /* synthetic */ C91124n f261332a;

    /* renamed from: b */
    public final /* synthetic */ long f261333b;

    /* renamed from: c */
    public final /* synthetic */ C86009m1 f261334c;

    public /* synthetic */ n$$a(C91124n nVar, long j, C86009m1 m1Var) {
        this.f261332a = nVar;
        this.f261333b = j;
        this.f261334c = m1Var;
    }

    /* renamed from: a */
    public final void mo123278a(int i) {
        C91124n nVar = this.f261332a;
        long j = this.f261333b;
        C86009m1 m1Var = this.f261334c;
        nVar.getClass();
        if (i == 0) {
            new C79450b(C79471a.f233015c, nVar.f261324d.f248349r).mo109426d(System.currentTimeMillis() - j);
            nVar.mo125184b(new File(m1Var.mo119971i()));
        } else {
            ErrorMsgInfoStruct errorMsgInfoStruct = new ErrorMsgInfoStruct();
            errorMsgInfoStruct.f194200e = 99;
            errorMsgInfoStruct.f194202g = -1;
            errorMsgInfoStruct.f194199d = -1;
            errorMsgInfoStruct.mo86054n();
            Log.m105920e("Tinker.SyncResponseProcessor", "TCPFile Fail:$resultCode");
        }
        ((C119157j) C119157j.f356862d).mo183875f(new n$$b());
    }
}
