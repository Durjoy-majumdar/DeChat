package yd3;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.FullScreenSeqAutoCompleteStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: yd3.b */
public final class C79080b {

    /* renamed from: a */
    public static final C79080b f232221a = new C79080b();

    /* renamed from: a */
    public final void mo109023a(int i, String str, boolean z) {
        C87412m.m108594g(str, "completeSeq");
        FullScreenSeqAutoCompleteStruct fullScreenSeqAutoCompleteStruct = new FullScreenSeqAutoCompleteStruct();
        fullScreenSeqAutoCompleteStruct.f194208d = i;
        fullScreenSeqAutoCompleteStruct.f194209e = fullScreenSeqAutoCompleteStruct.mo86045b("CompleteSeq", str, true);
        fullScreenSeqAutoCompleteStruct.f194210f = z ? 1 : 0;
        String q = fullScreenSeqAutoCompleteStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("SAInputReporter", "report%s %s", Integer.valueOf(fullScreenSeqAutoCompleteStruct.mo1004j()), C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
        fullScreenSeqAutoCompleteStruct.mo86054n();
    }
}
