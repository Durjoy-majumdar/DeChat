package d81;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.WeSportFinderStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: d81.c */
public final class C20448c {

    /* renamed from: a */
    public static final C20448c f57466a = new C20448c();

    /* renamed from: a */
    public final void mo31991a(int i, int i2, String str, int i3, int i4, String str2) {
        C87412m.m108594g(str, "infoSourceName");
        C87412m.m108594g(str2, "viewedUser");
        WeSportFinderStruct weSportFinderStruct = new WeSportFinderStruct();
        weSportFinderStruct.f48678h = (long) i4;
        weSportFinderStruct.f48677g = (long) i3;
        weSportFinderStruct.f48675e = (long) i2;
        weSportFinderStruct.f48676f = weSportFinderStruct.mo86045b("infoSourceName", str, true);
        weSportFinderStruct.f48674d = (long) i;
        weSportFinderStruct.f48679i = weSportFinderStruct.mo86045b("viewedUser", str2, true);
        weSportFinderStruct.mo86054n();
        String q = weSportFinderStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("MicroMsg.SportReporter", "report%s %s", Integer.valueOf(weSportFinderStruct.mo1004j()), C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
