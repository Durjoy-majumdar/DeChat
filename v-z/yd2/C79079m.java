package yd2;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.mmdata.rpt.PatSuffixActionReportStruct;
import eb0.C31543z5;

/* renamed from: yd2.m */
public final class C79079m implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public static final C79079m f232220d = new C79079m();

    public final void onCancel(DialogInterface dialogInterface) {
        PatSuffixActionReportStruct patSuffixActionReportStruct = new PatSuffixActionReportStruct();
        patSuffixActionReportStruct.f194323d = patSuffixActionReportStruct.mo86045b("SessionId", String.valueOf(C31543z5.m39453c()), true);
        patSuffixActionReportStruct.f194324e = 3;
        patSuffixActionReportStruct.f194326g = 3;
        patSuffixActionReportStruct.f194325f = 0;
        patSuffixActionReportStruct.mo86054n();
        patSuffixActionReportStruct.mo86056r();
    }
}
