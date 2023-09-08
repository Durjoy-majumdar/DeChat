package ev1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C48918bw3;
import te3.C49058cw3;
import te3.C49335eu3;

/* renamed from: ev1.b */
public final class C31723b extends C89132b<C49058cw3> {

    /* renamed from: i */
    public final String f84710i = "MicroMsg.CgiAcceptForceNotify";

    public C31723b(String str) {
        C87412m.m108594g(str, "data");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C48918bw3 bw32 = new C48918bw3();
        bw32.f131354d = str;
        bVar.f127066a = bw32;
        bVar.f127067b = new C49058cw3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/subappforcepush";
        bVar.f127069d = 3743;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49058cw3) eu32, "resp");
        if (!C86709a0.m107522a()) {
            Log.m105920e(this.f84710i, "account nor ready");
            return;
        }
        Log.m105925i(this.f84710i, "CgiAcceptForceNotify errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            Log.m105920e(this.f84710i, "report fail");
        }
    }
}
