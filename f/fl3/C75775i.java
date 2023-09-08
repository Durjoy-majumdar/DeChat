package fl3;

import com.tencent.p014mm.autogen.mmdata.rpt.MvvmOptimizeReportStruct;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;

/* renamed from: fl3.i */
public final class C75775i {

    /* renamed from: a */
    public long f222374a;

    /* renamed from: b */
    public String f222375b = "";

    /* renamed from: c */
    public String f222376c = "";

    /* renamed from: a */
    public final void mo106086a() {
        if (!Util.isNullOrNil(this.f222376c)) {
            MvvmOptimizeReportStruct mvvmOptimizeReportStruct = new MvvmOptimizeReportStruct();
            mvvmOptimizeReportStruct.f194290d = mvvmOptimizeReportStruct.mo86045b("Type", this.f222375b, true);
            mvvmOptimizeReportStruct.f194291e = mvvmOptimizeReportStruct.mo86045b("SessionId", this.f222376c, true);
            mvvmOptimizeReportStruct.f194293g = 0;
            mvvmOptimizeReportStruct.f194292f = C31543z5.m39453c() - this.f222374a;
            mvvmOptimizeReportStruct.mo86054n();
            mvvmOptimizeReportStruct.mo86056r();
            this.f222376c = "";
        }
    }
}
