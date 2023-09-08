package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49005ci0;
import te3.C49149di0;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: je1.o */
public final class C46527o extends C89132b<C49149di0> {

    /* renamed from: i */
    public final int f125349i;

    public C46527o(int i, C89349b bVar) {
        this.f125349i = i;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C49005ci0 ci02 = new C49005ci0();
        ci02.f131735f = C46523h2.f125330a.mo71859a(3839);
        ci02.f131733d = i;
        ci02.f131734e = bVar;
        bVar2.f127066a = ci02;
        C49149di0 di02 = new C49149di0();
        di02.setBaseResponse(new C49966ja());
        di02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = di02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderconsumeprefetchreport";
        bVar2.f127069d = 3839;
        mo123453j(bVar2.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("[init] tabType=");
        sb.append(i);
        sb.append(" lastBuff=");
        sb.append(bVar != null ? Integer.valueOf(bVar.f257327a.length) : null);
        Log.m105924i("Cgi.FinderConsumePrefetchReport", sb.toString());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49149di0 di02 = (C49149di0) eu32;
        Log.m105924i("Cgi.FinderConsumePrefetchReport", "onCgiBack errType[" + i + "] errCode[" + i2 + "] errMsg[" + str + "] tabType[" + this.f125349i + ']');
    }
}
