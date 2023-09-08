package e33;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: e33.a */
public final class C97603a {

    /* renamed from: a */
    public static final C97603a f286333a = new C97603a();

    /* renamed from: a */
    public final void mo136866a(int i, String str, int i2, int i3) {
        C87412m.m108594g(str, "workTagId");
        Log.m105924i("MicroMsg.FakeVideoTecReporter", "reportUploadAction >> workTagId: " + str + ", action: " + i + ", lastWorkType: " + i2 + ", currentWorkType: " + i3);
        SnsFakeVideoLogStruct snsFakeVideoLogStruct = new SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.f266022e = snsFakeVideoLogStruct.mo86045b("WorkId", str, true);
        snsFakeVideoLogStruct.f266021d = i;
        snsFakeVideoLogStruct.f266024g = i2;
        snsFakeVideoLogStruct.f266025h = i3;
        snsFakeVideoLogStruct.mo86054n();
    }
}
