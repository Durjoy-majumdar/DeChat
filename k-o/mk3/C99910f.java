package mk3;

import com.tencent.p014mm.autogen.mmdata.rpt.VideoPlayReportStruct;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import hd0.C98442x0;
import p682rz.C101488s;
import p682rz.C101491u;
import p740wo.C53193b;

/* renamed from: mk3.f */
public final class C99910f {

    /* renamed from: a */
    public final C72963f4 f292755a;

    /* renamed from: b */
    public final String f292756b;

    /* renamed from: c */
    public final boolean f292757c;

    /* renamed from: d */
    public final int f292758d;

    /* renamed from: e */
    public long f292759e;

    /* renamed from: f */
    public long f292760f;

    /* renamed from: g */
    public final VideoPlayReportStruct f292761g = new VideoPlayReportStruct();

    public C99910f(C72963f4 f4Var, String str, boolean z, int i) {
        this.f292755a = f4Var;
        this.f292756b = str;
        this.f292757c = z;
        this.f292758d = i;
    }

    /* renamed from: a */
    public final void mo139264a() {
        C98408n0 Zd;
        if (this.f292755a != null && this.f292756b != null && (Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f292756b)) != null) {
            C98442x0 b = C98442x0.f288734i.mo137781b(Zd.mo137705i());
            boolean z = false;
            boolean z2 = this.f292755a.mo108769t2() == 1;
            boolean K5 = C72996z1.m85807K5(this.f292755a.mo108768t());
            VideoPlayReportStruct videoPlayReportStruct = this.f292761g;
            videoPlayReportStruct.f266508h = videoPlayReportStruct.mo86045b("ChatName", this.f292755a.mo108768t(), true);
            VideoPlayReportStruct videoPlayReportStruct2 = this.f292761g;
            long j = 1;
            long j2 = 0;
            videoPlayReportStruct2.f266507g = K5 ? 1 : 0;
            videoPlayReportStruct2.f266514n = (long) Zd.f288566m;
            videoPlayReportStruct2.f266506f = C86013q1.m106451l(((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137728q(this.f292756b));
            if (b != null) {
                VideoPlayReportStruct videoPlayReportStruct3 = this.f292761g;
                if (!b.f288738b) {
                    j2 = (long) b.f288743g;
                }
                videoPlayReportStruct3.f266505e = j2;
                videoPlayReportStruct3.f266515o = b.f288737a;
                videoPlayReportStruct3.f266504d = videoPlayReportStruct3.mo86045b("FileId", this.f292757c ? b.f288740d : b.f288741e, true);
            }
            int i = this.f292758d;
            long j3 = 3;
            if (i == 1) {
                if (Zd.f288547O == 1) {
                    z = true;
                }
                boolean z3 = !z;
                VideoPlayReportStruct videoPlayReportStruct4 = this.f292761g;
                if (!z3) {
                    j = 3;
                }
                videoPlayReportStruct4.f266511k = j;
                if (z3) {
                    Zd.f288547O = 1;
                    Zd.f288553U = true;
                }
            } else if (i == 2) {
                if (Zd.f288547O == 1) {
                    z = true;
                }
                boolean z4 = !z;
                VideoPlayReportStruct videoPlayReportStruct5 = this.f292761g;
                if (z4) {
                    j3 = 2;
                }
                videoPlayReportStruct5.f266511k = j3;
                if (z4) {
                    Zd.f288547O = 1;
                    Zd.f288553U = true;
                }
            } else if (i == 3) {
                this.f292761g.f266511k = 4;
            } else if (i == 4) {
                this.f292761g.f266511k = 5;
            } else if (i == 5) {
                this.f292761g.f266511k = 6;
            }
            if (K5) {
                this.f292761g.f266509i = (long) ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(this.f292755a.mo108768t());
            }
            VideoPlayReportStruct videoPlayReportStruct6 = this.f292761g;
            videoPlayReportStruct6.f266510j = videoPlayReportStruct6.mo86045b("SenderUserName", z2 ? C75592q0.m90789s() : Zd.mo137701e(), true);
            this.f292761g.mo86054n();
            C98429r0.m127808N(Zd);
        }
    }
}
