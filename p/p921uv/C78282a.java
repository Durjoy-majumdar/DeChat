package p921uv;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenIMOpenServiceForOtherLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: uv.a */
public final class C78282a {
    /* renamed from: a */
    public static final void m94571a(int i, int i2, int i3) {
        OpenIMOpenServiceForOtherLogStruct openIMOpenServiceForOtherLogStruct = new OpenIMOpenServiceForOtherLogStruct();
        openIMOpenServiceForOtherLogStruct.f194304d = (long) i;
        openIMOpenServiceForOtherLogStruct.f194305e = (long) i2;
        openIMOpenServiceForOtherLogStruct.f194306f = (long) i3;
        openIMOpenServiceForOtherLogStruct.f194307g = 1;
        openIMOpenServiceForOtherLogStruct.mo86054n();
        String q = openIMOpenServiceForOtherLogStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("OpenIMJumpProfileReporter", "report%s %s", Integer.valueOf(openIMOpenServiceForOtherLogStruct.mo1004j()), C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
