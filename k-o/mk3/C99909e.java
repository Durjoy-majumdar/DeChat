package mk3;

import com.tencent.p014mm.autogen.mmdata.rpt.VideoDownloadReporterStruct;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import hd0.C98408n0;
import hd0.C98442x0;
import p682rz.C101491u;
import p740wo.C53193b;
import sf0.C77702q0;

/* renamed from: mk3.e */
public final class C99909e {

    /* renamed from: a */
    public static final C99909e f292754a = new C99909e();

    /* renamed from: a */
    public final void mo139263a(C72963f4 f4Var, String str, boolean z, long j) {
        C98408n0 Zd;
        if (f4Var != null && str != null && (Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(str)) != null) {
            C98442x0 b = C98442x0.f288734i.mo137781b(Zd.mo137705i());
            VideoDownloadReporterStruct videoDownloadReporterStruct = new VideoDownloadReporterStruct();
            if (b != null) {
                videoDownloadReporterStruct.f266498g = b.f288737a;
                videoDownloadReporterStruct.f266497f = videoDownloadReporterStruct.mo86045b("FildID", z ? b.f288740d : b.f288741e, true);
                videoDownloadReporterStruct.f266502k = (long) (z ? b.f288743g : Zd.f288559f);
                videoDownloadReporterStruct.f266495d = C77702q0.m93719b(b.f288740d) ^ true ? 1 : 0;
            }
            boolean K5 = C72996z1.m85807K5(f4Var.mo108768t());
            videoDownloadReporterStruct.f266500i = videoDownloadReporterStruct.mo86045b("ChatName", ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(f4Var.mo108768t()).mo62898f(), true);
            videoDownloadReporterStruct.f266499h = K5 ? 1 : 0;
            if (K5) {
                videoDownloadReporterStruct.f266501j = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(f4Var.mo108768t());
            }
            videoDownloadReporterStruct.f266496e = z ? 1 : 0;
            videoDownloadReporterStruct.f266503l = j;
            videoDownloadReporterStruct.mo86054n();
        }
    }
}
