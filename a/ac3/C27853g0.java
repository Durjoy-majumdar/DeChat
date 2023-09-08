package ac3;

import com.tencent.p014mm.autogen.mmdata.rpt.WevisionSwitchResStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import qr3.C110470e;

/* renamed from: ac3.g0 */
public final class C27853g0 {

    /* renamed from: a */
    public static final C27853g0 f76988a = new C27853g0();

    /* renamed from: a */
    public final void mo55641a(int i, String str) {
        C87412m.m108594g(str, "cgiResult");
        WevisionSwitchResStruct wevisionSwitchResStruct = new WevisionSwitchResStruct();
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        wevisionSwitchResStruct.f79234d = C110470e.f330363a;
        wevisionSwitchResStruct.f79236f = 1;
        wevisionSwitchResStruct.f79235e = i;
        wevisionSwitchResStruct.f79237g = wevisionSwitchResStruct.mo86045b("CgiSwitchRes", str, true);
        Log.m105924i("MicroMsg.WeVisConfigReporter", "reportCgiResult: " + wevisionSwitchResStruct.mo1006q());
        wevisionSwitchResStruct.mo86054n();
    }
}
