package ja0;

import com.tencent.p014mm.autogen.mmdata.rpt.MaasSdkResStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: ja0.g */
public final class C33530g {
    /* renamed from: a */
    public static final void m40106a(MaasSdkResStruct maasSdkResStruct, boolean z) {
        C87412m.m108594g(maasSdkResStruct, "<this>");
        maasSdkResStruct.f79123f = z ? 1 : 0;
        Log.m105924i("MicroMsg.MaasSdkResReport", "reportResult: " + maasSdkResStruct.mo1006q());
        maasSdkResStruct.mo86054n();
    }
}
