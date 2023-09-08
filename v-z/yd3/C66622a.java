package yd3;

import ck3.C67391b;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.FullScreenInputStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: yd3.a */
public final class C66622a {

    /* renamed from: a */
    public static final C66622a f191567a = new C66622a();

    /* renamed from: a */
    public final void mo90685a(int i, C67391b bVar) {
        C87412m.m108594g(bVar, "chattingContext");
        int i2 = bVar.mo91583x() ? 2 : 1;
        FullScreenInputStruct fullScreenInputStruct = new FullScreenInputStruct();
        fullScreenInputStruct.f156274d = (long) i;
        fullScreenInputStruct.f156275e = (long) i2;
        fullScreenInputStruct.mo86054n();
        String q = fullScreenInputStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("FSInputReporter", "report%s %s", Integer.valueOf(fullScreenInputStruct.mo1004j()), C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
