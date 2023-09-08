package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import sx3.C110818d0;
import te3.C48749aq0;
import te3.C48893bq0;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: je1.r0 */
public final class C9369r0 extends C89132b<C48893bq0> {

    /* renamed from: i */
    public final String f29260i = "Finder.CgiFinderGetUser";

    public C9369r0(List<String> list) {
        C87412m.m108594g(list, "nicknameList");
        C48749aq0 aq02 = new C48749aq0();
        aq02.f130722f.addAll(list);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = aq02;
        C48893bq0 bq02 = new C48893bq0();
        bq02.setBaseResponse(new C49966ja());
        bq02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = bq02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetuser";
        bVar.f127069d = 3512;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("init nickname:");
        String str = (String) C110818d0.m150916N(list);
        sb.append(str == null ? "" : str);
        Log.m105924i("Finder.CgiFinderGetUser", sb.toString());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C48893bq0) eu32, "resp");
        String str2 = this.f29260i;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
