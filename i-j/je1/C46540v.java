package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51704vk0;
import te3.C51843wk0;
import zc1.C66785b;

/* renamed from: je1.v */
public final class C46540v extends C89132b<C51843wk0> {

    /* renamed from: i */
    public final String f125400i = "Finder.CgiFinderFileDump";

    /* renamed from: j */
    public C51704vk0 f125401j;

    public C46540v(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, ClientInfoTable.Columns.CLIENTID);
        C87412m.m108594g(str2, "remoteUrl");
        C87412m.m108594g(str3, "appId");
        C87412m.m108594g(str4, "paramsJson");
        C51704vk0 vk02 = new C51704vk0();
        vk02.f143536d = C66785b.f191882e.mo90662O5();
        vk02.f143537e = str;
        vk02.f143538f = str2;
        vk02.f143539g = str3;
        vk02.f143540h = str4;
        this.f125401j = vk02;
        Log.m105924i("Finder.CgiFinderFileDump", "CgiFinderFileDump clientId:" + str);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f125401j;
        C51843wk0 wk02 = new C51843wk0();
        wk02.setBaseResponse(new C49966ja());
        wk02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = wk02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderfiledump";
        bVar.f127069d = 4659;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51843wk0) eu32, "resp");
        String str2 = this.f125400i;
        Log.m105924i(str2, "onCgiBack errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
    }
}
