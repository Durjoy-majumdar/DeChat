package ig3;

import com.tencent.p014mm.autogen.mmdata.rpt.VideoSendReporterStruct;

/* renamed from: ig3.l */
public final class C98690l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f289402d;

    public C98690l(String str) {
        this.f289402d = str;
    }

    public final void run() {
        C98692n nVar = C98692n.f289404a;
        VideoSendReporterStruct a = C98692n.m128463a(nVar, C98692n.m128464b(nVar, this.f289402d));
        a.f266532k = 5;
        a.mo86054n();
    }
}
